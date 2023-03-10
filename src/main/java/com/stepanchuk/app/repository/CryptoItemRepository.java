package com.stepanchuk.app.repository;


import com.stepanchuk.app.model.CryptoItem;

import java.util.List;
import java.util.Optional;

public interface CryptoItemRepository {

    boolean create(CryptoItem cryptoItem);

    List<CryptoItem> findAll();

    Optional<CryptoItem> findById(String id);

    boolean update(CryptoItem cryptoItem);

    boolean delete(String stringId);
}