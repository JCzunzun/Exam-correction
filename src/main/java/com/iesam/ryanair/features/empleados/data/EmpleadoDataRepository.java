package com.iesam.ryanair.features.empleados.data;

import com.iesam.ryanair.features.empleados.data.local.EmpleadoLocalDataRepository;
import com.iesam.ryanair.features.empleados.data.local.EmpleadoFileLocalDataSource;
import com.iesam.ryanair.features.empleados.data.local.EmpleadoMemLocalDataSource;
import com.iesam.ryanair.features.empleados.domain.Empleado;
import com.iesam.ryanair.features.empleados.domain.EmpleadoRepository;

public class EmpleadoDataRepository implements EmpleadoRepository {
    private EmpleadoLocalDataRepository instance;
    public void instanceFile(){
        instance=new EmpleadoFileLocalDataSource();
    }
    public void instanceMem(){
        instance= new EmpleadoMemLocalDataSource().newInstance();
    }
    private EmpleadoMemLocalDataSource instancia= new EmpleadoMemLocalDataSource().newInstance();
    @Override
    public void saveEmpleado(Empleado empleado) {
        instancia.saveEmpleado(empleado);
    }

    @Override
    public Empleado obtainEmpleado(String dni) {
        return instancia.obtainEmpleado(dni);
    }
}
