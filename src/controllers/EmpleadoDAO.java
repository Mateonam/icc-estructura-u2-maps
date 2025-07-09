package controllers;
import models.*;
public interface EmpleadoDAO {
    

    public void list();

    public void remove(int id);

    public void add(Empleado emp);
}
