package org.pixelheroes.utils.crash;

import org.pixelheroes.CommonHandler;

public class CrashReport {
	private static String[] comments = new String[]{null, null, "Well, this was a disappointment.", "I'm sorry Dave. I think I can't let you do that", "Here, have a gift http://xkcd.com/953/", "This computer is on fiiiiiiiiiiiiiiiiiiiire!"};
	private Throwable exception;

	public CrashReport(String message) {
		this(new UndefinedException(message).fillInStackTrace());
	}

	public CrashReport(Throwable throwable) {
		this.exception = throwable;

		try {
			if (CommonHandler.getCurrentInstance() != null && comments[0] == null) {

			}
		}
	}

	public static class UndefinedException extends Exception {
		public UndefinedException(String message) {
			super(message);
		}
	}
}
