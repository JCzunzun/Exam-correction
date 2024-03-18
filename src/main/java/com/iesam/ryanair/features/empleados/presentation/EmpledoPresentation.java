package com.iesam.ryanair.features.empleados.presentation;

import com.iesam.ryanair.features.empleados.data.EmpleadoDataRepository;
import com.iesam.ryanair.features.empleados.domain.Empleado;
import com.iesam.ryanair.features.empleados.domain.GetEmpleadoUseCase;
import com.iesam.ryanair.features.empleados.domain.SaveEmpleadoUseCase;

public class EmpledoPresentation {
    public void saveEmpleadoMem(Empleado empleado){
        SaveEmpleadoUseCase saveEmpleadoUseCase= new SaveEmpleadoUseCase(new EmpleadoDataRepository());
        EmpleadoDataRepository empleadoDataRepository= new EmpleadoDataRepository();
        empleadoDataRepository.instanceMem();
        saveEmpleadoUseCase.save(empleado);
    }
    public void saveEmpleadoFile(Empleado empleado){
        SaveEmpleadoUseCase saveEmpleadoUseCase= new SaveEmpleadoUseCase(new EmpleadoDataRepository());
        saveEmpleadoUseCase.save(empleado);
        EmpleadoDataRepository empleadoDataRepository= new EmpleadoDataRepository();
        empleadoDataRepository.instanceFile();
    }
    public Empleado obtainEmpleado(String dni){
        GetEmpleadoUseCase getEmpleadoUseCase= new GetEmpleadoUseCase(new EmpleadoDataRepository());
        return getEmpleadoUseCase.obtain(dni);
    }
}
