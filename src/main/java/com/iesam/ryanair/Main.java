package com.iesam.ryanair;

import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.aviones.presentation.AvionPresentation;
import com.iesam.ryanair.features.empleados.domain.Empleado;
import com.iesam.ryanair.features.empleados.presentation.EmpledoPresentation;
import com.iesam.ryanair.features.pasajero.domain.Pasajero;
import com.iesam.ryanair.features.pasajero.presentation.PasajeroPresentation;
import com.iesam.ryanair.features.vuelo.domain.Vuelo;
import com.iesam.ryanair.features.vuelo.presentation.VueloPresentation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creacion empleados
        Empleado empleado1= new Empleado("700001","empleado1","empleadoApellido1","piloto");
        Empleado empleado2= new Empleado("700002","empleado2","empleadoApellido2","piloto");
        Empleado empleado3= new Empleado("700003","empleado3","empleadoApellido3","azafata");
        EmpledoPresentation empledoPresentation= new EmpledoPresentation();
        empledoPresentation.saveEmpleadoMem(empleado1);
        empledoPresentation.saveEmpleadoMem(empleado2);
        empledoPresentation.saveEmpleadoFile(empleado3);
        //creacion pasajeros
        Pasajero pasajero= new Pasajero("800001","Pasajero1","ApellidoPasajero1","Avila","Avila");
        Pasajero pasajero1= new Pasajero("800002","Pasajero2","ApellidoPasajero2","Avila","Avila");
        PasajeroPresentation pasajeroPresentation= new PasajeroPresentation();
        pasajeroPresentation.savePasajero(pasajero);
        pasajeroPresentation.savePasajero(pasajero1);
        //Creacion aviones
        Avion avion=new Avion("100001","Pajarito","Boing701","200");
        Avion avion1=new Avion("100002","Nube","Boing705","250");
        Avion avion2=new Avion("100003","Rayo","Boing710","100");
        AvionPresentation avionPresentation= new AvionPresentation();
        avionPresentation.saveAvion(avion);
        avionPresentation.saveAvion(avion1);
        avionPresentation.saveAvion(avion2);
        //Comprobacion de avion
        VueloPresentation vueloPresentation= new VueloPresentation();
        Avion avionVuelo=avionPresentation.obtainAvion("100001");
        if(vueloPresentation.verify(avionVuelo)){
            ArrayList<Pasajero> pasajeros= new ArrayList<>();
            pasajeros.add(pasajeroPresentation.obtainPasajero("800001"));
            pasajeros.add(pasajeroPresentation.obtainPasajero("800002"));
            ArrayList<Empleado> tripulante=new ArrayList<>();
            tripulante.add(empledoPresentation.obtainEmpleado("700001"));
            tripulante.add(empledoPresentation.obtainEmpleado("700002"));
            Vuelo vuelo= new Vuelo("1",avionVuelo,tripulante,pasajeros,"10/02/2024","10:30H","90e","Madrid","Barcelona");
            vueloPresentation.saveVuelo(vuelo);
        }
        vueloPresentation.obtainVuelo("1");



    }
}