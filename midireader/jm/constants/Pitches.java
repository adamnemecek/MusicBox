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

package jm.constants;

/**
 * An interface storing pitch constants.
 * 
 * @see jm.music.data.Note
 * @author Andrew Sorensen, Andrew Brown, Andrew Troedson, Adam Kirby
 */
public interface Pitches {

	public static final int G9 = 127, GF9 = 126, FS9 = 126, F9 = 125, FF9 = 124, ES9 = 125, E9 = 124, EF9 = 123, DS9 = 123,
			D9 = 122, DF9 = 121, CS9 = 121, C9 = 120, CF9 = 119, BS8 = 120, B8 = 119, BF8 = 118, AS8 = 118, A8 = 117,
			AF8 = 116, GS8 = 116, G8 = 115, GF8 = 114, FS8 = 114, F8 = 113, FF8 = 112, ES8 = 113, E8 = 112, EF8 = 111,
			DS8 = 111, D8 = 110, DF8 = 109, CS8 = 109, C8 = 108, CF8 = 107, BS7 = 108, B7 = 107, BF7 = 106, AS7 = 106,
			A7 = 105, AF7 = 104, GS7 = 104, G7 = 103, GF7 = 102, FS7 = 102, F7 = 101, FF7 = 100, ES7 = 101, E7 = 100, EF7 = 99,
			DS7 = 99, D7 = 98, DF7 = 97, CS7 = 97, C7 = 96, CF7 = 95, BS6 = 96, B6 = 95, BF6 = 94, AS6 = 94, A6 = 93, AF6 = 92,
			GS6 = 92, G6 = 91, GF6 = 90, FS6 = 90, F6 = 89, FF6 = 88, ES6 = 89, E6 = 88, EF6 = 87, DS6 = 87, D6 = 86, DF6 = 85,
			CS6 = 85, C6 = 84, CF6 = 83, BS5 = 84, B5 = 83, BF5 = 82, AS5 = 82, A5 = 81, AF5 = 80, GS5 = 80, G5 = 79, GF5 = 78,
			FS5 = 78, F5 = 77, FF5 = 76, ES5 = 77, E5 = 76, EF5 = 75, DS5 = 75, D5 = 74, DF5 = 73, CS5 = 73, C5 = 72, CF5 = 71,
			BS4 = 72, B4 = 71, BF4 = 70, AS4 = 70, A4 = 69, AF4 = 68, GS4 = 68, G4 = 67, GF4 = 66, FS4 = 66, F4 = 65, FF4 = 64,
			ES4 = 65, E4 = 64, EF4 = 63, DS4 = 63, D4 = 62, DF4 = 61, CS4 = 61, C4 = 60, CF4 = 59, BS3 = 60, B3 = 59, BF3 = 58,
			AS3 = 58, A3 = 57, AF3 = 56, GS3 = 56, G3 = 55, GF3 = 54, FS3 = 54, F3 = 53, FF3 = 52, ES3 = 53, E3 = 52, EF3 = 51,
			DS3 = 51, D3 = 50, DF3 = 49, CS3 = 49, C3 = 48, CF3 = 47, BS2 = 48, B2 = 47, BF2 = 46, AS2 = 46, A2 = 45, AF2 = 44,
			GS2 = 44, G2 = 43, GF2 = 42, FS2 = 42, F2 = 41, FF2 = 40, ES2 = 41, E2 = 40, EF2 = 39, DS2 = 39, D2 = 38, DF2 = 37,
			CS2 = 37, C2 = 36, CF2 = 35, BS1 = 36, B1 = 35, BF1 = 34, AS1 = 34, A1 = 33, AF1 = 32, GS1 = 32, G1 = 31, GF1 = 30,
			FS1 = 30, F1 = 29, FF1 = 28, ES1 = 29, E1 = 28, EF1 = 27, DS1 = 27, D1 = 26, DF1 = 25, CS1 = 25, C1 = 24, CF1 = 23,
			BS0 = 24, B0 = 23, BF0 = 22, AS0 = 22, A0 = 21, AF0 = 20, GS0 = 20, G0 = 19, GF0 = 18, FS0 = 18, F0 = 17, FF0 = 16,
			ES0 = 17, E0 = 16, EF0 = 15, DS0 = 15, D0 = 14, DF0 = 13, CS0 = 13, C0 = 12, CF0 = 11, BSN1 = 12, BN1 = 11,
			BFN1 = 10, ASN1 = 10, AN1 = 9, AFN1 = 8, GSN1 = 8, GN1 = 7, GFN1 = 6, FSN1 = 6, FN1 = 5, FFN1 = 4, ESN1 = 5,
			EN1 = 4, EFN1 = 3, DSN1 = 3, DN1 = 2, DFN1 = 1, CSN1 = 1, CN1 = 0, g9 = 127, gf9 = 126, fs9 = 126, f9 = 125,
			ff9 = 124, es9 = 125, e9 = 124, ef9 = 123, ds9 = 123, d9 = 122, df9 = 121, cs9 = 121, c9 = 120, cf9 = 119,
			bs8 = 120, b8 = 119, bf8 = 118, as8 = 118, a8 = 117, af8 = 116, gs8 = 116, g8 = 115, gf8 = 114, fs8 = 114,
			f8 = 113, ff8 = 112, es8 = 113, e8 = 112, ef8 = 111, ds8 = 111, d8 = 110, df8 = 109, cs8 = 109, c8 = 108,
			cf8 = 107, bs7 = 108, b7 = 107, bf7 = 106, as7 = 106, a7 = 105, af7 = 104, gs7 = 104, g7 = 103, gf7 = 102,
			fs7 = 102, f7 = 101, ff7 = 100, es7 = 101, e7 = 100, ef7 = 99, ds7 = 99, d7 = 98, df7 = 97, cs7 = 97, c7 = 96,
			cf7 = 95, bs6 = 96, b6 = 95, bf6 = 94, as6 = 94, a6 = 93, af6 = 92, gs6 = 92, g6 = 91, gf6 = 90, fs6 = 90, f6 = 89,
			ff6 = 88, es6 = 89, e6 = 88, ef6 = 87, ds6 = 87, d6 = 86, df6 = 85, cs6 = 85, c6 = 84, cf6 = 83, bs5 = 84, b5 = 83,
			bf5 = 82, as5 = 82, a5 = 81, af5 = 80, gs5 = 80, g5 = 79, gf5 = 78, fs5 = 78, f5 = 77, ff5 = 76, es5 = 77, e5 = 76,
			ef5 = 75, ds5 = 75, d5 = 74, df5 = 73, cs5 = 73, c5 = 72, cf5 = 71, bs4 = 72, b4 = 71, bf4 = 70, as4 = 70, a4 = 69,
			af4 = 68, gs4 = 68, g4 = 67, gf4 = 66, fs4 = 66, f4 = 65, ff4 = 64, es4 = 65, e4 = 64, ef4 = 63, ds4 = 63, d4 = 62,
			df4 = 61, cs4 = 61, c4 = 60, cf4 = 59, bs3 = 60, b3 = 59, bf3 = 58, as3 = 58, a3 = 57, af3 = 56, gs3 = 56, g3 = 55,
			gf3 = 54, fs3 = 54, f3 = 53, ff3 = 52, es3 = 53, e3 = 52, ef3 = 51, ds3 = 51, d3 = 50, df3 = 49, cs3 = 49, c3 = 48,
			cf3 = 47, bs2 = 48, b2 = 47, bf2 = 46, as2 = 46, a2 = 45, af2 = 44, gs2 = 44, g2 = 43, gf2 = 42, fs2 = 42, f2 = 41,
			ff2 = 40, es2 = 41, e2 = 40, ef2 = 39, ds2 = 39, d2 = 38, df2 = 37, cs2 = 37, c2 = 36, cf2 = 35, bs1 = 36, b1 = 35,
			bf1 = 34, as1 = 34, a1 = 33, af1 = 32, gs1 = 32, g1 = 31, gf1 = 30, fs1 = 30, f1 = 29, ff1 = 28, es1 = 29, e1 = 28,
			ef1 = 27, ds1 = 27, d1 = 26, df1 = 25, cs1 = 25, c1 = 24, cf1 = 23, bs0 = 24, b0 = 23, bf0 = 22, as0 = 22, a0 = 21,
			af0 = 20, gs0 = 20, g0 = 19, gf0 = 18, fs0 = 18, f0 = 17, ff0 = 16, es0 = 17, e0 = 16, ef0 = 15, ds0 = 15, d0 = 14,
			df0 = 13, cs0 = 13, c0 = 12, cf0 = 11, bsn1 = 12, bn1 = 11, bfn1 = 10, asn1 = 10, an1 = 9, afn1 = 8, gsn1 = 8,
			gn1 = 7, gfn1 = 6, fsn1 = 6, fn1 = 5, ffn1 = 4, esn1 = 5, en1 = 4, efn1 = 3, dsn1 = 3, dn1 = 2, dfn1 = 1, csn1 = 1,
			cn1 = 0, REST = jm.music.data.Note.REST; // No Note

}