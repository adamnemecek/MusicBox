/*
 <This Java Class is part of the jMusic API version 1.5, March 2004.>
 
 Copyright (C) 2000 Andrew Sorensen & Andrew Brown
 
 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or any
 later version.
 
 This program is distributed in the hope that it will be useful, but
 WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 GNU General Public License for more details.
 
 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA. 
 */

/**
 * This class used to parse a Phrase note by note to ral time playback.
 * @author Andrew R. Brown
 */

package jm.music.rt;

import jm.JMC;
import jm.audio.Instrument;
import jm.music.data.Note;
import jm.music.data.Phrase;

public class RTPhrase extends RTLine implements JMC {
	private Note aRest = new Note(REST, 1.0);
	private int noteCounter = 0;
	private Phrase phrase;
	private boolean waitForStartTime = true;

	/**
	 * constructor that takes a phrase and a single instrument as arguments.
	 * 
	 * @param phrase
	 *            The Phrase to stream
	 * @param inst
	 *            The instrument to render the notes with.
	 */
	public RTPhrase(final Phrase phrase, final Instrument inst) {
		this(phrase, new Instrument[] { inst });
	}

	/**
	 * Constructor that takes a phrase and an instrument array as arguments.
	 * Normally the array conatins multiple instances of the same instrument
	 * which are used as required when there are overlapping notes.
	 * 
	 * @param phrase
	 *            The Phrase to stream
	 * @param instArray
	 *            The instruments to render the notes with.
	 */

	public RTPhrase(final Phrase phrase, final Instrument[] instArray) {
		super(instArray);
		this.phrase = phrase;
		if (phrase.getTempo() != Phrase.DEFAULT_TEMPO) {
			this.setTempo(phrase.getTempo());
		}
		if (phrase.getStartTime() == 0.0) {
			waitForStartTime = false;
		}
	}

	/**
	 * Generate the next note when requested.
	 */
	@Override
	public synchronized Note getNote() {
		// wait for start time
		if (waitForStartTime) {
			// System.out.println("RTPhrase padded rest");
			waitForStartTime = false;
			aRest.setRhythmValue(phrase.getStartTime());
			return aRest;
		}
		// stream notes
		while (noteCounter < phrase.getSize()) {
			// System.out.println("RTPhrase note " + noteCounter);
			return phrase.getNote(noteCounter++);
		}
		// append infinite rests
		// System.out.println("RTPhrase ended rest");
		aRest.setRhythmValue(1.0);
		return aRest;
	}

}