package org.allbinary.game.testgamedemo;

import javax.microedition.midlet.MIDlet;

import org.allbinary.logic.system.security.licensing.TestGameDemoClientInformationInterfaceFactory;
import org.allbinary.midlet.AllBinaryMidlet;
import org.allbinary.midlet.MidletFactoryInterface;

public class TestGameDemoMIDletFactory extends MidletFactoryInterface {

    private static MIDlet SINGLETON = AllBinaryMidlet.getNullInstance();

    @Override
    public MIDlet getInstance() {
        if (TestGameDemoMIDletFactory.SINGLETON == AllBinaryMidlet.getNullInstance()) {
            TestGameDemoMIDletFactory.SINGLETON = new TestGameDemoMIDlet(TestGameDemoClientInformationInterfaceFactory.getFactoryInstance());
        }
        return TestGameDemoMIDletFactory.SINGLETON;
    }
}
