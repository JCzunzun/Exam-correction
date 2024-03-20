package com.iesam.ryanair.features.vuelo.data;

import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.vuelo.domain.Vuelo;
import com.iesam.ryanair.features.vuelo.domain.VueloRepository;

import java.util.Objects;

public class Stub2VueloDataRepository implements VueloRepository {
    @Override
    public void saveVuelo(Vuelo vuelo) {

    }

    @Override
    public Vuelo obtainVuelo(String cod) {
        return null;
    }

    @Override
    public boolean verifyAvion(Avion avion) {
        Vuelo vuelo= new Vuelo("1",new Avion("100001", "Pajarito", "Boing701", "200"),null,null,null,null,null,null,null);

        return Objects.equals(vuelo.getAvion(),avion);
    }
}
