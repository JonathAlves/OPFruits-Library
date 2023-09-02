package com.jonathanguerra.opfruitslibrary.config;

import com.jonathanguerra.opfruitslibrary.entidades.AkumaNoMi;
import com.jonathanguerra.opfruitslibrary.repositorios.AkumaNoMiRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


@Configuration
public class APIConfiguration {


    public void carregaBase(AkumaNoMiRepositorio akmrepositorio){
        List<AkumaNoMi> akmList = akmrepositorio.findAll();
        String pathAkumaNoMis = "D:\\Projetos\\OPFruitsLibrary\\OPFruitsLibrary\\src\\main\\resources\\static\\akumaNoMis.csv";
        //Alimentar base de dados

        try (BufferedReader br = new BufferedReader(new FileReader(pathAkumaNoMis))) {
            String line = br.readLine();
            while(line != null){
                String[] vetor = line.split(",");
                String idAkumaNoMi = vetor[0];
                String nomeAkumaNoMi = vetor[1];
                String descricaoAkumaNoMi = vetor[2];
                String tipoAkumaNoMi = vetor[3];

                if(!akmList.isEmpty()){
                    for(AkumaNoMi akm : akmList){
                        if(!(akm.getId() == Long.parseLong(idAkumaNoMi))){
                            AkumaNoMi am = new AkumaNoMi(Long.parseLong(idAkumaNoMi), nomeAkumaNoMi, descricaoAkumaNoMi, tipoAkumaNoMi);
                            akmrepositorio.save(am);

                        }
                    }
                } else {
                    AkumaNoMi am = new AkumaNoMi(Long.parseLong(idAkumaNoMi), nomeAkumaNoMi, descricaoAkumaNoMi, tipoAkumaNoMi);
                    akmrepositorio.save(am);
                }


                 line = br.readLine();
            }
        } catch(IOException e){
            System.out.println("Erro ao abrir arquivo.");
        }
    }
}
