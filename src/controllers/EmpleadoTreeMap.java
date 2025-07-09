package controllers;

import models.Empleado;
import java.util.Map;
import java.util.TreeMap;

public class EmpleadoTreeMap implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados;

    public EmpleadoTreeMap() {
        this.empleados = new TreeMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
        System.out.println("Empleado agregado: " + emp.getName());
    }

    @Override
    public void list() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado emp : empleados.values()) {
                System.out.println(emp);
            }
        }
    }

    @Override
    public void remove(int id) {
        Empleado encontrado = null;
        for (Empleado emp : empleados.keySet()) {
            if (emp.getId() == id) {
                encontrado = emp;
                break;
            }
        }
        if (encontrado != null) {
            empleados.remove(encontrado);
            System.out.println("Empleado eliminado: " + encontrado.getName());
        } else {
            System.out.println("No se encontró un empleado con ID: " + id);
        }
    }
}
