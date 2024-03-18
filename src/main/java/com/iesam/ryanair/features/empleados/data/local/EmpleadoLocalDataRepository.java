package com.iesam.ryanair.features.empleados.data.local;

import com.iesam.ryanair.features.empleados.domain.Empleado;

public interface EmpleadoLocalDataRepository {
    void saveEmpleado(Empleado empleado);
    Empleado obtainEmpleado(String dni);
}
