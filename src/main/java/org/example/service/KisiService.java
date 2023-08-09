package org.example.service;

import org.example.repository.model.Kisi;
import org.example.repository.KisiRepository;

public class KisiService {

    private KisiRepository kisiRepository;

    public KisiService() {
        this.kisiRepository = new KisiRepository();
    }

    public Kisi kisiOlustur(Kisi kisi) {
        return kisiRepository.kisiOlustur(kisi);
    }

    public Kisi kisiAraById(Long id) {
        return kisiRepository.kisiAraById(id);
    }
}
