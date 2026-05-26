package com.moduleOne.ModuleOneHomweork.Impl;

import com.moduleOne.ModuleOneHomweork.Frosting;
import com.moduleOne.ModuleOneHomweork.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ChocolateFrosting")
public class ChocolateFrosting implements Frosting{
    @Override
    public void getFrostingType() {
        System.out.println("Hi i am using chocolate frosting");
    }

}
