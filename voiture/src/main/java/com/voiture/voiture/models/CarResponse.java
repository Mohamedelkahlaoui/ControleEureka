package com.voiture.voiture.models;

import com.voiture.voiture.entities.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CarResponse {
    private Long id;
    private String brand;
    private String model;
    private String matricue;
    private Client client;
}
