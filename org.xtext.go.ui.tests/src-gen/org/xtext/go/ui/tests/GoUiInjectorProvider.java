/*
 * generated by Xtext 2.13.0
 */
package org.xtext.go.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.go.ui.internal.GoActivator;

public class GoUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return GoActivator.getInstance().getInjector("org.xtext.go.Go");
	}

}
