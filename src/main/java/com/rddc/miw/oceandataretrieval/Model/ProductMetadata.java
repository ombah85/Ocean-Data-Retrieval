package com.rddc.miw.oceandataretrieval.Model;

import java.time.LocalDate;

public class ProductMetadata {

    private final String extent;
    private final String resolution;
    private final String productionDate;
    private final String size;

    public ProductMetadata(String extent, String resolution, String productionDate, String size) {
        this.extent = extent;
        this.resolution = resolution;
        this.productionDate = productionDate;
        this.size = size;
    }

    public String getExtent() { return extent; }
    public String getResolution() {
        return resolution;
    }
    public String getProductionDate() {
        return productionDate;
    }
    public String getSize() {
        return size;
    }
}
