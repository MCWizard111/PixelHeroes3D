package org.pixelheroes.modding;

import org.pixelheroes.blocks.Block;
import org.pixelheroes.items.Item;

import java.lang.annotation.Annotation;
import java.util.List;

public abstract class AddonContainer<T extends Annotation> {
	private T addonAnnot;
	private Object addonInstance;
	private List<Block> addonBlocks;
	private List<Item> addonItems;
	private AddonData data;
}
