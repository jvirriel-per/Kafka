package com.jvirriel;

import com.jvirriel.constants.RestConstans;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static com.jvirriel.constants.RestConstans.*;

@Service
public class KafkaServices {
//
//    private final RestJpaRepository restJpaRepository;
//    private final RestRepository restRepository;
//
//    @Autowired
//    public KafkaServices(RestJpaRepository restJpaRepository, RestRepository restRepository){
//        this.restJpaRepository = restJpaRepository;
//        this.restRepository = restRepository;
//    }

//    public List<Rest> findAll() {
//        return (List<Rest>) restJpaRepository.findAll();
//    }

    public void save(String name, Integer replications, Integer partitions) throws IOException {
        String ruta = "c:/home/pruebas/CreateTopic.sh";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if (archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El Archivo ya fue creado previamente.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(RestConstans.PATH + " " + CREATE + " " + ZOOKEEPER + " " + IP_PORT + " " + REPLICATION_FACTOR + " " + replications + " " + PARTITIONS + " " + partitions + " " + TOPIC + " " + name);
        }
        bw.close();

    }

    public void delete(String name) throws IOException {
        String ruta = "c:/home/pruebas/DeleteTopic.sh";
        File archivo2 = new File(ruta);
        BufferedWriter bw;
        if(archivo2.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo2));
            bw.write("");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo2));
            bw.write(RestConstans.PATH+" "+DELETE+" "+ZOOKEEPER+" "+IP_PORT+" "+TOPIC+" "+ name);
        }
        bw.close();
    }

    public void deleteAll () throws IOException{}


    }


