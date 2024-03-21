package com.iesam.ryanair.features.vuelo.domain;

import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.vuelo.data.Stub1VueloDataRepository;
import com.iesam.ryanair.features.vuelo.data.Stub2VueloDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerifyAvionForVueloUseCaseTest {
    private VerifyAvionForVueloUseCase verifyAvionForVueloUseCase;

    @BeforeEach
    void setup() {
    }
    @AfterEach
    void tearDown(){
        verifyAvionForVueloUseCase=null;
    }
    @Test
    public void cuandoUnAvionSeEncuentraEnUnVueloDevuelveTrue(){
        //Given
        verifyAvionForVueloUseCase= new VerifyAvionForVueloUseCase(
                new Stub1VueloDataRepository()
        );
        Avion avion= new Avion("100001", "Pajarito", "Boing701", "200");

        //When
        boolean veriricar= verifyAvionForVueloUseCase.verify(avion);

        //Then
        Assertions.assertTrue(veriricar);

    }
    @Test
    public void cuandoUnAvionNoSeEncuentraEnUnVueloDevuelveFalse(){
        //Given
        verifyAvionForVueloUseCase= new VerifyAvionForVueloUseCase(
                new Stub2VueloDataRepository()
        );
        Avion avion= new Avion("100002", "Nube", "Boing705", "250");

        //When
        boolean veriricar= verifyAvionForVueloUseCase.verify(avion);

        //Then
        Assertions.assertFalse(veriricar);

    }
}