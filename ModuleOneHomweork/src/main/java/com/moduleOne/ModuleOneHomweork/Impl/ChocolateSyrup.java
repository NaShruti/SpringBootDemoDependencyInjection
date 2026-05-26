package com.moduleOne.ModuleOneHomweork.Impl;

import com.moduleOne.ModuleOneHomweork.Syrup;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChocolateSyrup implements Syrup {
    @Override
    public void getSyrupType() {
        System.out.println("Hi i am using chocolate frosting");
    }
}
