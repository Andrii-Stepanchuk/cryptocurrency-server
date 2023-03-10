package com.stepanchuk.app.service;

import com.stepanchuk.app.dto.request.CryptoItemDTO;
import com.stepanchuk.app.model.CryptoItem;

import java.util.List;

public interface CryptoItemService {

    boolean create(CryptoItemDTO cryptoItemDTO);

    List<CryptoItem> findAll();

    CryptoItem findById(String id);

    boolean update(CryptoItemDTO cryptoItemDTO);

    boolean delete(String stringId);

}
