package com.moduleOne.ModuleOneHomweork;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuleOneHomweorkApplication implements CommandLineRunner {

	final CakeBaker cakeBaker;

	public ModuleOneHomweorkApplication(CakeBaker cakeBaker){
		this.cakeBaker=cakeBaker;
	}


	public static void main(String[] args) {
		SpringApplication.run(ModuleOneHomweorkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cakeBaker.bakeCake();
	}
}
