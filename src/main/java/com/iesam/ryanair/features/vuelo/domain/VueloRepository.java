package com.iesam.ryanair.features.vuelo.domain;

import com.iesam.ryanair.features.aviones.domain.Avion;

public interface VueloRepository {
    void saveVuelo(Vuelo vuelo);
    Vuelo obtainVuelo(String cod);
    boolean verifyAvion(Avion avion);
}
