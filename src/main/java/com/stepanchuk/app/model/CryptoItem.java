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
    private String cryptocurrency;
    private String currency;
    private double price;
    private LocalDateTime createdAt;

    public CryptoItem(UUID id, String cryptocurrency, String currency, double price) {
        this.id = id;
        this.cryptocurrency = cryptocurrency;
        this.currency = currency;
        this.price = price;
        this.createdAt = LocalDateTime.now();
    }

    public CryptoItem(CryptoItemDTO cryptoItemDTO) {
        this.id = cryptoItemDTO.getId();
        this.cryptocurrency = cryptoItemDTO.getCryptocurrency();
        this.currency = cryptoItemDTO.getCurrency();
        this.price = cryptoItemDTO.getPrice();
        this.createdAt = LocalDateTime.now();
    }
}
