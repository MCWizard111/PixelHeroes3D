package org.pixelheroes.utils;

/**
 * Created by MCWizard111 on 3/19/2015.
 */
public final class CollisionInfos {
	public EnumSide side = EnumSide.TOP;
	public CollisionType type;
	public Object value;
	public float x, y, z, distance;

	public CollisionInfos() {
		type = CollisionType.NONE;
	}

	public static enum CollisionType {
		BLOCK, ENTITY, NONE;
	}
}
