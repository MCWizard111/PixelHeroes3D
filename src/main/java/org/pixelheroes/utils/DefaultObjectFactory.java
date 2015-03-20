package org.pixelheroes.utils;

public class DefaultObjectFactory<T> extends ObjectFactory<T> {
	@Override
	public T createNew(Class<T> typeClass) {
		try {
			return typeClass.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
