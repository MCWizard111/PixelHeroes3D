package org.pixelheroes.client.render;

/**
 * Created by MCWizard111 on 3/19/2015.
 */
public enum EnumRenderPass {
	NORMAL(0), ALPHA(1);

	private int id;

	EnumRenderPass(int id) {
		this.id = id;
	}

	public static EnumRenderPass fromID(int id) {
		for (EnumRenderPass pass : values()) {
			if (pass.id == id) return pass;
		}

		return null;
	}

	public int id() {
		return id;
	}
}
