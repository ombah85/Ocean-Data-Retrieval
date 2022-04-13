package com.rddc.miw.oceandataretrieval.api;

import com.rddc.miw.oceandataretrieval.Model.Product;
import com.rddc.miw.oceandataretrieval.Model.ProductMetadata;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Value("${productUrl}")
    private String productUrl;

    @Value("${productDescription}")
    private String productDescription;

    @Value("${extent}")
    public String extent;

    @Value("${resolution}")
    public String resolution;

    @Value("${productionDate}")
    public String productionDate;

    @Value("${Size}")
    public String Size;

    @GetMapping("/")
    public String getServiceDescription(){
        return "Ocean Data Retrieval";
    }

    @GetMapping("/productUrl")
    public Product getProductUrl(){
        return new Product(productUrl, productDescription);
    }

    @GetMapping("/productmetadata")
    public ProductMetadata getMetadata() {
        return new ProductMetadata(extent, resolution, productionDate, Size);
    }
}




// /product?id=id
    /*@GetMapping("/product")
    public Product getProduct(@RequestParam(value = "id", defaultValue = "") String id){
        return new Product(new UUID(counter.incrementAndGet(),counter.incrementAndGet()), );
    }*/