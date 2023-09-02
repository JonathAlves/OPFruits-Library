package com.jonathanguerra.opfruitslibrary;

import com.jonathanguerra.opfruitslibrary.config.APIConfiguration;
import com.jonathanguerra.opfruitslibrary.repositorios.AkumaNoMiRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpFruitsLibraryApplication implements ApplicationRunner {
    private final APIConfiguration apiConfiguration = new APIConfiguration();
    @Autowired
    private AkumaNoMiRepositorio akmrepositorio;

    public static void main(String[] args) {
        SpringApplication.run(OpFruitsLibraryApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        apiConfiguration.carregaBase(akmrepositorio);
    }
}
