package com.iesam.ryanair.features.vuelo.domain;

import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.empleados.domain.Empleado;
import com.iesam.ryanair.features.pasajero.domain.Pasajero;

import java.util.ArrayList;

public class Vuelo {
    private final String codVuelo;
    private final Avion avion;
    private final ArrayList<Empleado> tripulantes;
    private final ArrayList<Pasajero> pasajeros;
    private final String fecha;
    private final String horaVuelo;
    private final String precio;
    private final String origen;
    private final String destino;

    public Vuelo(String codVuelo, Avion avion, ArrayList<Empleado> tripulantes, ArrayList<Pasajero> pasajeros, String fecha, String horaVuelo, String precio, String origen, String destino) {
        this.codVuelo = codVuelo;
        this.avion = avion;
        this.tripulantes = tripulantes;
        this.pasajeros = pasajeros;
        this.fecha = fecha;
        this.horaVuelo = horaVuelo;
        this.precio = precio;
        this.origen = origen;
        this.destino = destino;
    }


    public String getCodVuelo() {
        return codVuelo;
    }

    public Avion getAvion() {
        return avion;
    }

    public ArrayList<Empleado> getTripulantes() {
        return tripulantes;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHoraVuelo() {
        return horaVuelo;
    }

    public String getPrecio() {
        return precio;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
}
