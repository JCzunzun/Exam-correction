package com.iesam.ryanair.features.vuelo.data;

import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.vuelo.data.local.VueloLocalDataSource;
import com.iesam.ryanair.features.vuelo.domain.Vuelo;
import com.iesam.ryanair.features.vuelo.domain.VueloRepository;

public class VueloDataRepository implements VueloRepository {
    private VueloLocalDataSource vueloLocalDataSource;
    public VueloDataRepository(){
        vueloLocalDataSource=new VueloLocalDataSource();
    }
    @Override
    public void saveVuelo(Vuelo vuelo) {
        vueloLocalDataSource.save(vuelo);
    }

    @Override
    public Vuelo obtainVuelo(String cod) {
        return vueloLocalDataSource.obtain(cod);
    }

    @Override
    public boolean verifyAvion(Avion avion, String id) {
        return vueloLocalDataSource.verify(avion);
    }
}
