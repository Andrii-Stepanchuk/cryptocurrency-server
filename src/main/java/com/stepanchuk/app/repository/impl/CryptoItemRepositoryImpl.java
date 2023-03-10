package com.stepanchuk.app.repository.impl;

import com.stepanchuk.app.model.CryptoItem;
import com.stepanchuk.app.repository.CryptoItemRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CryptoItemRepositoryImpl implements CryptoItemRepository {

    private final HashMap<UUID, CryptoItem> database = new HashMap<>();

    {
        UUID id = UUID.randomUUID();
        database.put(id, new CryptoItem(id, "BTC", "USD", 1535.44));
        id = UUID.randomUUID();
        database.put(id, new CryptoItem(id, "ETH", "USD", 127.85));
        id = UUID.randomUUID();
        database.put(id, new CryptoItem(id, "XRP", "USD", 0.26));
    }

    @Override
    public boolean create(CryptoItem cryptoItem) {
        UUID id = UUID.randomUUID();
        cryptoItem.setId(id);
        database.put(id, cryptoItem);
        return true;
    }

    @Override
    public List<CryptoItem> findAll() {
        return new ArrayList<>(database.values());
    }

    @Override
    public Optional<CryptoItem> findById(String stringId) {
        UUID id = UUID.fromString(stringId);
        return Optional.ofNullable(database.get(id));
    }

    @Override
    public boolean update(CryptoItem cryptoItem) {
        CryptoItem bdItem = database.get(cryptoItem.getId());
        bdItem.setCurr1(cryptoItem.getCurr1());
        bdItem.setCurr2(cryptoItem.getCurr2());
        bdItem.setPrice(cryptoItem.getPrice());
        bdItem.setCreatedAt(cryptoItem.getCreatedAt());
        return true;
    }

    @Override
    public boolean delete(String stringId) {
        UUID id = UUID.fromString(stringId);
        database.remove(id);
        return true;
    }
}
