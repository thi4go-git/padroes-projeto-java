package com.dynns.cloudtecnologia.criacionais.factory_method.simple.factory;

import com.dynns.cloudtecnologia.criacionais.factory_method.simple.model.*;

public abstract class IphoneSimpleFactory {

    private IphoneSimpleFactory() {
    }

    public static IPhone orderIPhone(String generation, String level) {
        IPhone device = null;

        if (generation.equals("X")) {
            if (level.equals("standard")) {
                device = new IPhoneX();
            } else if (level.equals("highEnd")) {
                device = new IPhoneXSMax();
            }
        } else if (generation.equals("11")) {
            if (level.equals("standard")) {
                device = new IPhone11();
            } else if (level.equals("highEnd")) {
                device = new IPhone11Pro();
            }
        }

        if (device != null) {
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }

        return device;
    }
}
