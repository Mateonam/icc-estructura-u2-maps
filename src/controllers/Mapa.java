package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap(){
        System.out.println("-----------HashMap-----------");
        Map<String, String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");
        System.out.println(mapa);
        System.out.println(mapa.keySet());
        for(String llave : mapa.keySet()) {
            System.out.println(mapa.get(llave));
        }
    }

    public void runLinkedHashMap(){
        System.out.println();
        System.out.println("--------------Lincked Hash Map-------------");
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(001, "Sebastián");
        mapa.put(002, "Mateo");
        mapa.put(003, "Andrés");
        mapa.put(004, "José");
        mapa.put(005, "José");
        for(Integer numero : mapa.keySet()){
            System.out.println(mapa.get(numero));
        }
    }

    public void runTreeMap(){
        System.out.println("---------Tree Map--------");
        Map<Integer, String> items = new TreeMap<>();
        items.put(3, "Carro");
        items.put(6, "Bicicleta");
        items.put(1, "Moto");
        for(Integer num : items.keySet()) {
            System.out.println(items.get(num));
        }
    }

    public void runHashMapObj() {
        System.out.println("-------Hash Map Obj--------");
        Map<Empleado, Integer> empleados = new HashMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);
        for(Empleado emp : empleados.keySet()){
            System.out.println(empleados.get(emp));
        }
    }

    public void runTreeMapObj() {
        System.out.println("-------Tree Map Obj--------");
        Map<Empleado, Integer> empleados = new TreeMap();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);
        for(Empleado emp : empleados.keySet()){
            System.out.println(empleados.get(emp));
        }
    }
}
