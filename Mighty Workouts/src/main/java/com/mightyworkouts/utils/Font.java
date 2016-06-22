package com.mightyworkouts.utils;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Class for Adding Custom Font
 * 
 * @author Shivani Verma
 *
 */
public class Font {
	
	/**
	 * Get Font from Assets
	 * 
	 * @param context -context of the calling activity 
	 *        {@link Context}
	 * @param fontName -fontname .ttf file from the Assets of Project 
	 *        {@link String}
	 * @return -return the new TypeFace of that Font
	 *        {@link Typeface}
	 */

	public static Typeface getFont ( Context context, String fontName ) {

		Typeface custom_font = Typeface. createFromAsset(context.getAssets(), fontName);
		return custom_font;
	}

}
