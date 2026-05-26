package com.moduleOne.ModuleOneHomweork.Impl;

import com.moduleOne.ModuleOneHomweork.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("StrawberrySyrup")
public class StrawberrySyrup implements Syrup {

    @Override
    public void getSyrupType() {
        System.out.println("I am using starwberry syrup");
    }
}
