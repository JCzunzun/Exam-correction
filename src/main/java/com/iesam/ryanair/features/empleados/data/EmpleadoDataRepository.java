package com.iesam.ryanair.features.empleados.data;

import com.iesam.ryanair.features.empleados.data.local.EmpleadoLocalDataRepository;
import com.iesam.ryanair.features.empleados.data.local.EmpleadoFileLocalDataSource;
import com.iesam.ryanair.features.empleados.data.local.EmpleadoMemLocalDataSource;
import com.iesam.ryanair.features.empleados.domain.Empleado;
import com.iesam.ryanair.features.empleados.domain.EmpleadoRepository;

public class EmpleadoDataRepository implements EmpleadoRepository {
    EmpleadoLocalDataRepository empleadoLocalDataRepository;
    public EmpleadoDataRepository(EmpleadoLocalDataRepository empleadoLocalDataRepository) {
        this.empleadoLocalDataRepository=empleadoLocalDataRepository;
    }

    @Override
    public void saveEmpleado(Empleado empleado) {
        empleadoLocalDataRepository.saveEmpleado(empleado);
    }

    @Override
    public Empleado obtainEmpleado(String dni) {
        return empleadoLocalDataRepository.obtainEmpleado(dni);
    }
}
