package com.moduleOne.ModuleOneHomweork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    final Frosting frosting;

    final Syrup syrup;

    @Autowired
    public CakeBaker( Frosting frosting,  Syrup syrup){
        this.frosting=frosting;
        this.syrup=syrup;
    }

    public void bakeCake(){
        System.out.println("Baking of cake is my hobby");
        frosting.getFrostingType();
        syrup.getSyrupType();
    }
}
