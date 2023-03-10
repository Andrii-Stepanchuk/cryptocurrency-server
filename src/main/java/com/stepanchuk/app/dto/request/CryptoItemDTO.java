package com.stepanchuk.app.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CryptoItemDTO {
    private UUID id;
    private String curr1;
    private String curr2;
    private double price;
}
