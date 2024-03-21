package com.iesam.ryanair.features.vuelo.domain;

import com.iesam.ryanair.features.vuelo.data.Stub1VueloDataRepository;
import com.iesam.ryanair.features.vuelo.data.Stub2VueloDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetVueloUseCaseTest {
    GetVueloUseCase getVueloUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getVueloUseCase=null;
    }
    @Test
    public void CuandoSeEncuentraUnVueloDevuelveNoNulo(){
        //Given
        getVueloUseCase= new GetVueloUseCase(new Stub1VueloDataRepository());

        //When
        Vuelo vuelo=getVueloUseCase.obtainVuelo("1");

        //Then
        Assertions.assertNotNull(vuelo);

    }
    @Test
    public void CuandoSeEncuentraUnVueloDevuelveNulo(){
        //Given
        getVueloUseCase= new GetVueloUseCase(new Stub2VueloDataRepository());

        //When
        Vuelo vuelo=getVueloUseCase.obtainVuelo("1");

        //Then
        Assertions.assertNull(vuelo);

    }
}