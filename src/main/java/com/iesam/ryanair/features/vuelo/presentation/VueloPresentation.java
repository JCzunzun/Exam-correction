package com.iesam.ryanair.features.vuelo.presentation;

import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.vuelo.data.VueloDataRepository;
import com.iesam.ryanair.features.vuelo.domain.GetVueloUseCase;
import com.iesam.ryanair.features.vuelo.domain.SaveVueloUseCase;
import com.iesam.ryanair.features.vuelo.domain.VerifyAvionForVueloUseCase;
import com.iesam.ryanair.features.vuelo.domain.Vuelo;

public class VueloPresentation {
    public void saveVuelo(Vuelo vuelo){
        SaveVueloUseCase saveVueloUseCase= new SaveVueloUseCase(new VueloDataRepository());
        saveVueloUseCase.saveVuelo(vuelo);
    }
    public void obtainVuelo(String cod){
        GetVueloUseCase getVueloUseCase= new GetVueloUseCase(new VueloDataRepository());
        Vuelo vuelo= getVueloUseCase.obtainVuelo(cod);
        System.out.println(vuelo.toString());
    }
    public boolean verify(Avion avion){
        VerifyAvionForVueloUseCase verifyAvionForVueloUseCase= new VerifyAvionForVueloUseCase(new VueloDataRepository());
        return verifyAvionForVueloUseCase.verify(avion);
    }
}
