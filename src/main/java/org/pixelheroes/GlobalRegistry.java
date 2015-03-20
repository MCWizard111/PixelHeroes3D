package org.pixelheroes;

import org.pixelheroes.items.Items;

/**
 * Created by MCWizard111 on 3/19/2015.
 */
public class GlobalRegistry {
	public Block getBlockFromID(String id) {
		return Blocks.get(transformID(id));
	}

	public Item getItemFromID(String id) {
		return Items.get(transformID(id));
	}

	private String transformID(String id) {
		if (!id.contains(":")) {
			id = "pixelheroes:" + id;
		} else if (id.startsWith("minecraft:")) {
			id = id.replace("minecraft:", "pixelheroes:");
		}

		return id;
	}
}
