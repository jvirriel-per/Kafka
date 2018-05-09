package com.jvirriel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;

@RestController
public class KafkaController {

    public final KafkaServices kafkaServices;

    @Autowired
    public KafkaController(KafkaServices kafkaServices) {
        this.kafkaServices = kafkaServices;
    }

    @PostMapping(value = "/rest/")
    @ResponseBody
    public void createRest(@RequestBody /*Rest rest,*/ UriComponentsBuilder ucBuilder, String name, Integer replications, Integer partitions) {

        try {
            kafkaServices.save(name, replications, partitions);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(ucBuilder.path("/api/rest/{id}").buildAndExpand(rest.getId()).toUri());
//        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/rest")
    @ResponseBody
    public void deleteRest(@PathVariable("name") String name) {

        try {
            kafkaServices.delete(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        return new ResponseEntity<Rest>(HttpStatus.NO_CONTENT);
    }
}
