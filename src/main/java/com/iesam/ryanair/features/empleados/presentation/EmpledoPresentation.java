package com.iesam.ryanair.features.empleados.presentation;

import com.iesam.ryanair.features.empleados.data.EmpleadoDataRepository;
import com.iesam.ryanair.features.empleados.data.local.EmpleadoMemLocalDataSource;
import com.iesam.ryanair.features.empleados.domain.Empleado;
import com.iesam.ryanair.features.empleados.domain.GetEmpleadoUseCase;
import com.iesam.ryanair.features.empleados.domain.SaveEmpleadoUseCase;

public class EmpledoPresentation {
    public void saveEmpleado(Empleado empleado){
        SaveEmpleadoUseCase saveEmpleadoUseCase= new SaveEmpleadoUseCase(new EmpleadoDataRepository(new EmpleadoMemLocalDataSource().newInstance()));
        saveEmpleadoUseCase.save(empleado);
    }

    public Empleado obtainEmpleado(String dni){
        GetEmpleadoUseCase getEmpleadoUseCase= new GetEmpleadoUseCase(new EmpleadoDataRepository(new EmpleadoMemLocalDataSource().newInstance()));
        return getEmpleadoUseCase.obtain(dni);
    }
}
