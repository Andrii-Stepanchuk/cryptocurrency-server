package com.stepanchuk.app.model;

import com.stepanchuk.app.dto.request.CryptoItemDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CryptoItem {

    private UUID id;
    private String curr1;
    private String curr2;
    private double price;
    private LocalDateTime createdAt;

    public CryptoItem(UUID id, String curr1, String curr2, double price) {
        this.id = id;
        this.curr1 = curr1;
        this.curr2 = curr2;
        this.price = price;
        this.createdAt = LocalDateTime.now();
    }

    public CryptoItem(CryptoItemDTO cryptoItemDTO) {
        this.id = cryptoItemDTO.getId();
        this.curr1 = cryptoItemDTO.getCurr1();
        this.curr2 = cryptoItemDTO.getCurr2();
        this.price = cryptoItemDTO.getPrice();
        this.createdAt = LocalDateTime.now();
    }
}
