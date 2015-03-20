package org.pixelheroes;

/**
 * Created by MCWizard111 on 3/19/2015.
 */
public final class CommonHandler {
	private static PixelInstance instance;
	private static AddonContainer<?> currentContainer;

	private CommonHandler() {
		throw new IllegalAccessError("Why are you trying to access an instance of static-only class?? Plz tel me");
	}

	public static PixelInstance getCurrentInstance() {
		return instance;
	}

	public static void setInstance(PixelInstance instance) {
		CommonHandler.instance = instance;
	}

	public static AddonContainer<?> getCurrentContainer() {
		return currentContainer;
	}

	public static void setCurrentContainer(AddonContainer<?> container) {
		currentContainer = container;
	}
}
