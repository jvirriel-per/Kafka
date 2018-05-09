package com.jvirriel;


import com.jvirriel.constants.RestConstans;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static com.jvirriel.constants.RestConstans.*;


/**
 * Created by JVirriel on 05/06/2017.
 */

public class KafkaWrite {


    public static void main(String[] args) throws IOException {

        String name = null;
        Integer replications = 0;
        Integer partitions = 0;

        String ruta = "c:/home/pruebas/CreateTopic.sh";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El Archivo ya fue creado previamente.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(RestConstans.PATH+" "+CREATE+" "+ZOOKEEPER+" "+IP_PORT+" "+REPLICATION_FACTOR+" "+replications+" "+PARTITIONS+" "+partitions+" "+TOPIC+" "+name.toString());
        }
        bw.close();
    }

}
