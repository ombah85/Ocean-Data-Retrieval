package com.rddc.miw.oceandataretrieval;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.rancher.service.ProjectService;
import io.rancher.service.ProjectStacksService;
import io.rancher.type.Project;
import io.rancher.type.Stack;

@SpringBootApplication
public class OceanDataRetrievalApplication {

    public static void main(String[] args) {
        SpringApplication.run(OceanDataRetrievalApplication.class, args);
    }

}
