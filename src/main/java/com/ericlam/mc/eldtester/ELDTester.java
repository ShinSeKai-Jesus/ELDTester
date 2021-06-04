package com.ericlam.mc.eldtester;

import com.ericlam.mc.eld.ELDBukkitPlugin;
import com.ericlam.mc.eld.ManagerProvider;
import com.ericlam.mc.eld.ServiceCollection;
import com.ericlam.mc.eld.annotations.ELDPlugin;
import com.ericlam.mc.eld.exceptions.ArgumentParseException;


@ELDPlugin(
        registry = TesterRegistry.class,
        lifeCycle = TesterLifeCycle.class
)
public class ELDTester extends ELDBukkitPlugin {

    @Override
    protected void bindServices(ServiceCollection serviceCollection) {
        serviceCollection.addConfiguration(TestConfig.class);
        serviceCollection.addGroupConfiguration(BookConfig.class);
        serviceCollection.addSingleton(TesterSingleton.class);
        serviceCollection.addMultipleLanguages(TesterMultiLang.class);
    }

    @Override
    protected void manageProvider(ManagerProvider provider) {

    }
}
