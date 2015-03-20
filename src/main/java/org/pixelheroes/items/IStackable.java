package org.pixelheroes.items;

import org.pixelheroes.entity.Entity;
import org.pixelheroes.utils.CollisionInfos.CollisionType;
import org.pixelheroes.utils.EnumSide;

/**
 * Created by MCWizard111 on 3/19/2015.
 */
public interface IStackable {
	String getId();

	int getMaxStackQuantity();

	void onUse(Entity user, float x, float y, float z, EnumSide side, CollisionType type);

	String getUnlocalizedID();
}
