package org.pixelheroes.utils.io;

import java.nio.FloatBuffer;

/**
 * Created by MCWizard111 on 3/19/2015.
 */
public interface IBufferWritable {
	public void write(FloatBuffer buffer);

	public int getSize();
}
