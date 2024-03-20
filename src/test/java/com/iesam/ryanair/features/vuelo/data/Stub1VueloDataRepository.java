package com.iesam.ryanair.features.vuelo.data;

import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.vuelo.domain.Vuelo;
import com.iesam.ryanair.features.vuelo.domain.VueloRepository;

public class Stub1VueloDataRepository implements VueloRepository {
    @Override
    public void saveVuelo(Vuelo vuelo) {

    }

    @Override
    public Vuelo obtainVuelo(String cod) {
        return null;
    }

    @Override
    public boolean verifyAvion(Avion avion) {
        Avion avionVuelo= new Avion("100001", "Pajarito", "Boing701", "200");
        Vuelo vuelo= new Vuelo("1",avionVuelo,null,null,null,null,null,null,null);

        return !vuelo.getAvion().equals(avion);
    }
}
