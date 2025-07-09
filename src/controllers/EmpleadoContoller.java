package controllers;

import models.Empleado;

public class EmpleadoContoller {

    private EmpleadoDAO dao;

    public EmpleadoContoller(EmpleadoDAO dao) {
        this.dao = dao;
    }

    public void agregarEmpleado(Empleado emp) {
        dao.add(emp);
    }

    public void mostrarEmpleados() {
        dao.list();
    }

    public void eliminarEmpleado(int id) {
        dao.remove(id);
    }
}