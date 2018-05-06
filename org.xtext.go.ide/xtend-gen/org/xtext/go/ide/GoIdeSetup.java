/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.go.GoRuntimeModule;
import org.xtext.go.GoStandaloneSetup;
import org.xtext.go.ide.GoIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class GoIdeSetup extends GoStandaloneSetup {
  @Override
  public Injector createInjector() {
    GoRuntimeModule _goRuntimeModule = new GoRuntimeModule();
    GoIdeModule _goIdeModule = new GoIdeModule();
    return Guice.createInjector(Modules2.mixin(_goRuntimeModule, _goIdeModule));
  }
}