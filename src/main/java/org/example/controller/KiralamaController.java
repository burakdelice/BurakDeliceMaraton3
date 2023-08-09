package org.example.controller;

import org.example.repository.model.Arac;
import org.example.repository.model.Kiralama;
import org.example.service.KiralamaService;

import java.util.List;

public class KiralamaController {

    private KiralamaService kiralamaService;
    public KiralamaController() {
        this.kiralamaService = new KiralamaService();
    }
    public Kiralama kiralamaOlustur(Kiralama kiralama) {
        return kiralamaService.kiralamaOlustur(kiralama);
    }

    public List<Arac> kiralanmisArabalar(Long id) {
        return kiralamaService.kiralananAraclarByKisiId(id);
    }
    public List<Kiralama> kiradaOlanlarTumu(){
        return kiralamaService.kiradaOlanlarTumu();
    }
}
