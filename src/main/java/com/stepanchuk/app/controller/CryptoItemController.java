package com.stepanchuk.app.controller;

import com.stepanchuk.app.dto.request.CryptoItemDTO;
import com.stepanchuk.app.model.CryptoItem;
import com.stepanchuk.app.service.CryptoItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;


@Validated
@RestController
@RequestMapping("/cryptocurrency")
@RequiredArgsConstructor
public class CryptoItemController {

    private final CryptoItemService cryptoItemService;

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody CryptoItemDTO cryptoItemDTO) {
        return ResponseEntity.ok().body(cryptoItemService.create(cryptoItemDTO));
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> readById(@PathVariable @NotBlank String id) {
        return ResponseEntity.ok().body(cryptoItemService.findById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<?> readAll() {
        return ResponseEntity.ok().body(cryptoItemService.findAll());
    }

    @PutMapping()
    public ResponseEntity<?> update(@RequestBody CryptoItemDTO cryptoItemDTO) {
        return ResponseEntity.ok().body(cryptoItemService.update(cryptoItemDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable @NotBlank String id) {
        return ResponseEntity.ok().body(cryptoItemService.delete(id));
    }
}
