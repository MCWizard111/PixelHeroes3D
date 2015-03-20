package org.pixelheroes.utils;

import com.google.common.collect.Lists;

/**
 * Created by MCWizard111 on 3/19/2015.
 */
public final class ArraysUtils {
	public static String[] trim(String[] split) {
		java.util.List<String> strings = Lists.newArrayList();

		for (String s : split)
			if (s != null && !s.trim().equals("")) strings.add(s);
		return strings.toArray(new String[0]);
	}

	public static String sum(String[] tokens, int start, int length, String separator) {
		StringBuffer buffer = new StringBuffer();

		for (int i = start; i < length + start; i++) {
			buffer.append(tokens[i]);

			if (i != length + start - 1) {
				buffer.append(separator);
			}
		}

		return buffer.toString();
	}
}
