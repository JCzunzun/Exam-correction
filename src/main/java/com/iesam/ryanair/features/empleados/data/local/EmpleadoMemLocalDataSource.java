package com.iesam.ryanair.features.empleados.data.local;

import com.iesam.ryanair.features.empleados.domain.Empleado;

import java.util.ArrayList;

public class EmpleadoMemLocalDataSource implements EmpleadoLocalDataRepository{

    ArrayList<Empleado> empleados= new ArrayList<>();
    //singleton
    private static EmpleadoMemLocalDataSource instance=null;
    public EmpleadoMemLocalDataSource newInstance(){
        if(instance==null){
            instance=new EmpleadoMemLocalDataSource();
        }
        return instance;
    }
    public void saveEmpleado(Empleado empleado){
        empleados.add(empleado);

    }
    public Empleado obtainEmpleado(String dni){
        for(Empleado emp: empleados){
            if(emp.getDni().equals(dni)){
                return emp;
            }
        }
        return null;
    }
}
