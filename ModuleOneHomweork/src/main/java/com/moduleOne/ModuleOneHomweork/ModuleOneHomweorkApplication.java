package com.moduleOne.ModuleOneHomweork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ModuleOneHomweorkApplication implements CommandLineRunner {

	/*final CakeBaker cakeBaker;

	public ModuleOneHomweorkApplication(CakeBaker cakeBaker){
		this.cakeBaker=cakeBaker;
	}*/
	@Autowired
	Map<String,Frosting> frostingMap=new HashMap<>();

	@Autowired
	Map<String,Syrup> SyrupMap=new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(ModuleOneHomweorkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		for (var frostingMapService : frostingMap.entrySet()){

			System.out.println(frostingMapService.getKey());
			frostingMapService.getValue().getFrostingType();
		}


		for (var SyrupMapService : SyrupMap.entrySet()){

			System.out.println(SyrupMapService.getKey());
			SyrupMapService.getValue().getSyrupType();
		}
		//cakeBaker.bakeCake();
	}
}
