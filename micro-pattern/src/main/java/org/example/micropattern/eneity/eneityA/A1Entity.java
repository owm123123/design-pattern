package org.example.micropattern.eneity.eneityA;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class A1Entity {
    private String id;
    private String name;
    private String description;
    private String type;
    private String status;
    private String createdAt;
    private String updatedAt;
    private String createdBy;
    private String updatedBy;
}
