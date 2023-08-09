package org.example.service;

import org.example.repository.model.Arac;
import org.example.repository.model.Kiralama;
import org.example.repository.KiralamaRepository;

import java.util.List;

public class KiralamaService {

    private KiralamaRepository kiralamaRepository;

    public KiralamaService() {
        this.kiralamaRepository = new KiralamaRepository();
    }

    public Kiralama kiralamaOlustur(Kiralama kiralama) {
        return kiralamaRepository.kiralamaOlustur(kiralama);
    }

    public List<Arac> kiralananAraclarByKisiId(Long id) {
        return kiralamaRepository.kiralananAraclarByKisiId(id);
    }
    public List<Kiralama> kiradaOlanlarTumu() {
        return kiralamaRepository.kiradaOlanlarTumu();
    }
}
