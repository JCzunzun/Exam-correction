package com.iesam.ryanair.features.vuelo.domain;

import com.iesam.ryanair.features.aviones.domain.Avion;

public class VerifyAvionForVueloUseCase {
    private final VueloRepository vueloRepository;

    public VerifyAvionForVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }
    public boolean verify(Avion avion){
        return vueloRepository.verifyAvion(avion);
    }
}
