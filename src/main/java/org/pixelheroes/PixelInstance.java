package org.pixelheroes;

import org.pixelheroes.utils.crash.CrashReport;

import java.util.HashMap;

/**
 * Created by MCWizard111 on 3/19/2015.
 */
public interface PixelInstance {
	String REGISTRIES_ID = "pixelheroes";

	GlobalRegistry getRegistry();

	void broadcastMessage(String message);

	EventBus getEventBus();

	AddonsLoader getAddonsLoader();

	boolean isClient();

	boolean isServer();

	HashMap<String, GuiDispatcher> getGuiMap();

	void registerGuiHandler(String registry, GuiDispatcher dispatcher);

	void registerBlock(Block block);

	void registerItem(Item item);

	AssetLoader getAssetsLoader();

	void crash(CrashReport crashReport);
}
