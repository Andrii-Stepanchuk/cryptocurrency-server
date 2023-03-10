package com.stepanchuk.app.service.impl;

import com.stepanchuk.app.dto.request.CryptoItemDTO;
import com.stepanchuk.app.model.CryptoItem;
import com.stepanchuk.app.repository.CryptoItemRepository;
import com.stepanchuk.app.service.CryptoItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class CryptoItemServiceImpl implements CryptoItemService {

    public final CryptoItemRepository cryptoItemRepository;

    @Override
    public boolean create(CryptoItemDTO cryptoItemDTO) {
        return cryptoItemRepository.create(new CryptoItem(cryptoItemDTO));
    }

    @Override
    public List<CryptoItem> findAll() {
        return cryptoItemRepository.findAll();
    }

    @Override
    public CryptoItem findById(String id) {
        return cryptoItemRepository
                .findById(id)
                .orElseThrow(() -> new NoSuchElementException("CryptoCurrency not found with id " + id));
    }

    @Override
    public boolean update(CryptoItemDTO cryptoItemDTO) {
        return cryptoItemRepository.update(new CryptoItem(cryptoItemDTO));
    }

    @Override
    public boolean delete(String stringId) {
        return cryptoItemRepository.delete(stringId);
    }

}
