package org.pixelheroes.utils;

/**
 * Created by MCWizard111 on 3/19/2015.
 */
public interface ObjectFactory<T> {
	T createNew(Class<T> typeClass);
}
