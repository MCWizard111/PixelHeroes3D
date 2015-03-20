import org.pixelheroes.PixelClassLoader;
import org.pixelheroes.utils.crash.CrashReport;

import java.io.IOException;

/**
 * Created by MCWizard111 on 3/19/2015.
 */
public abstract class DevStart {
	public void start(String[] args) throws ReflectiveOperationException, IOException {
		if (!(ClassLoader.getSystemClassLoader() instanceof PixelClassLoader)) {
			new CrashReport("Wrong classloader at launch. Please add -Djava.system.class.loader=org.pixelhero.PixelClassLoader in VM arguments").printStack();
			System.exit(-2);
		}
	}
}
