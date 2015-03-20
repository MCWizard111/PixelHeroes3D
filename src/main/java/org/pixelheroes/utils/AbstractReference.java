package org.pixelheroes.utils;

/**
 * Created by MCWizard111 on 3/19/2015.
 */
public abstract class AbstractReference {
	private int referenceCounter = 0;
	private boolean disposable = true;

	protected void increaseReferenceCounter() {
		referenceCounter++;
	}

	protected boolean decreaseReferenceCounter() {
		referenceCounter--;
		return referenceCounter == 0;
	}

	public boolean isDisposable() {
		return disposable;
	}

	public void setDisposable(boolean disposable) {
		this.disposable = disposable;
	}
}
