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

public class KafkaDelete {

    public static void main(String[] args) throws IOException {
        String ruta = "c:/home/pruebas/DeleteTopic.sh";
        File archivo2 = new File(ruta);
        BufferedWriter bw;
        if(archivo2.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo2));
            bw.write("El Archivo ya fue creado previamente.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo2));
            bw.write(RestConstans.PATH+" "+DELETE+" "+ZOOKEEPER+" "+IP_PORT+" "+TOPIC+" "+"holaMundo2");
        }
        bw.close();
    }

}
