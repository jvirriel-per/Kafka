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

public class KafkaList {

    public static void main(String[] args) throws IOException {
        String ruta = "c:/home/pruebas/ListTopic.sh";
        File archivo3 = new File(ruta);
        BufferedWriter bw;
        if(archivo3.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo3));
            bw.write("El Archivo ya fue creado previamente.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo3));
            bw.write(RestConstans.PATH+" "+LIST+" "+ZOOKEEPER+" "+IP_PORT);
        }
        bw.close();
    }

}
