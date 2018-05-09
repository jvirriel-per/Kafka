package com.jvirriel.entities;


import javax.persistence.Entity;

/**
 * Created by JVirriel on 02/06/2017.
 */

@Entity
public class Rest {

    private Long id;
    public static String name;
    public static Integer replications;
    public static Integer partitions;

    public Rest() {
    }

//    public Rest(String name, Integer replications, Integer partitions) {
//        this.name = name;
//        this.replications = replications;
//        this.partitions = partitions;
//    }
//
//    public Rest(
//            Long id,
//            String name,
//            Integer replications,
//            Integer partitions
//
//    ) {
//        this.id = id;
//        this.name = name;
//        this.replications = replications;
//        this.partitions = partitions;
//
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReplications() {
        return replications;
    }

    public void setReplications(Integer replications) {
        this.replications = replications;
    }

    public Integer getPartitions() {
        return partitions;
    }

    public void setPartitions(Integer partitions) {
        this.partitions = partitions;
    }
}
