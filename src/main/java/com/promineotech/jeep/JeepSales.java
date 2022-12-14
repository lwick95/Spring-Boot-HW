package com.promineotech.jeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.promineotech.ComponentScanMarker;

@SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class})

public class JeepSales {

  public static void main(String[] args) {
    SpringApplication.run(JeepSales.class, args); 

  }

}


//http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/
// a different link to access the api through the browser