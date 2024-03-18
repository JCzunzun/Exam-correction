package com.iesam.ryanair.features.empleados.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.ryanair.features.demo.domain.Demo;
import com.iesam.ryanair.features.empleados.domain.Empleado;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EmpleadoFileLocalDataSource implements EmpleadoLocalDataRepository{
    private String nameFile = "Empleado.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Demo>>() {
    }.getType();

    public void saveEmpleado(Empleado empleado) {
        List<Empleado> empleados = findAll();
        empleados.add(empleado);
        saveToFile(empleados);
    }

    public void saveList(List<Empleado> empleados) {
        saveToFile(empleados);
    }

    private void saveToFile(List<Empleado> empleados) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(empleados));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }
    public List<Empleado> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }
    public Empleado obtainEmpleado(String id) {
        List<Empleado> empleados = findAll();
        for (Empleado empleado : empleados) {
            if (Objects.equals(empleado.getDni(), id)) {
                return empleado;
            }
        }
        return null;
    }
}
