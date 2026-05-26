package com.moduleOne.ModuleOneHomweork.Impl;

import com.moduleOne.ModuleOneHomweork.Frosting;
import com.moduleOne.ModuleOneHomweork.Syrup;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class StrawberryFrosting implements Frosting {
    @Override
    public void getFrostingType() {
        System.out.println("I am using starwberry frosting");
    }


}
