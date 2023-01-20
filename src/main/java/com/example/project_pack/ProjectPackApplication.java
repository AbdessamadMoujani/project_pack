package com.example.project_pack;

import com.example.project_pack.entities.Client;
import com.example.project_pack.entities.Voiture;
import com.example.project_pack.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectPackApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProjectPackApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository){
        return args -> {
            Voiture voiture = new Voiture();
            clientRepository.save(new Client("abdessamad","moujani","BW4450","SidiMaarouf","0655142014","abde.mm@gmail.com",));
        };
    }

}
