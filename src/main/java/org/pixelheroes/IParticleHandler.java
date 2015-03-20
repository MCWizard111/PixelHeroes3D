package org.pixelheroes;

import org.pixelheroes.world.ILocatable;
import org.pixelheroes.world.Particle;
import org.pixelheroes.world.World;

/**
 * Created by MCWizard111 on 3/19/2015.
 */
public interface IParticleHandler {
	void spawnParticle(String id, World w, float x, float y, float z);

	void spawnParticle(String id, ILocatable loc);

	void spawnParticle(Particle particle);

	void updateAllParticles();
}
