import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoTreeMap;
import controllers.Mapa;
import controllers.Ejercicios;
import models.Empleado;

public class App {
    static Ejercicios eJ;
    public static void main(String[] args) throws Exception {
        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Mateo Namicela"); /// Cambiar por su nombre

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        // runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();

        // runEmpleadoExample();
        runEjerccios();

    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.runHashMap();
        mapa.runLinkedHashMap();
        mapa.runTreeMap();
        mapa.runHashMapObj();
        mapa.runTreeMapObj();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOTree = new EmpleadoTreeMap(); 
        EmpleadoContoller empleadoContollerTree = new EmpleadoContoller(empleadoDAOTree);
        EmpleadoDAO empleadoDaoHash = new EmpleadoDAOHashMap(); 
        EmpleadoContoller empleadoContollerHashMap = new EmpleadoContoller(empleadoDaoHash);

        Empleado emp1 = new Empleado(4, "Pedro", "DEV");
        Empleado emp2 = new Empleado(2, "Pedro", "DEV");
        Empleado emp3 = new Empleado(5, "Juan", "DEV");
        Empleado emp4 = new Empleado(3, "Maria", "DEV");
        Empleado emp5 = new Empleado(1, "Juan", "DEV");

        // Agregar a ambos DAOs
        System.out.println("== Agregando empleados a TreeMap ==");
        empleadoContollerTree.agregarEmpleado(emp1);
        empleadoContollerTree.agregarEmpleado(emp2);
        empleadoContollerTree.agregarEmpleado(emp3);
        empleadoContollerTree.agregarEmpleado(emp4);
        empleadoContollerTree.agregarEmpleado(emp5);

        System.out.println("\n== Agregando empleados a HashMap ==");
        empleadoContollerHashMap.agregarEmpleado(emp1);
        empleadoContollerHashMap.agregarEmpleado(emp2);
        empleadoContollerHashMap.agregarEmpleado(emp3);
        empleadoContollerHashMap.agregarEmpleado(emp4);
        empleadoContollerHashMap.agregarEmpleado(emp5);

        // Eliminar en ambos
        System.out.println("\n== Eliminando ID 2 en TreeMap ==");
        empleadoContollerTree.eliminarEmpleado(2);

        System.out.println("\n== Eliminando ID 2 en HashMap ==");
        empleadoContollerHashMap.eliminarEmpleado(2);

        // Mostrar listas actualizadas
        System.out.println("\n== TreeMap después de eliminar ==");
        empleadoContollerTree.mostrarEmpleados();

        System.out.println("\n== HashMap después de eliminar ==");
        empleadoContollerHashMap.mostrarEmpleados();
    }

    private static void runEjerccios() {
        eJ = new Ejercicios();
        System.out.println(eJ.areAnagrams("listen", "silent"));    // true
        System.out.println(eJ.areAnagrams("hello", "bello"));      // false
        System.out.println(eJ.areAnagrams("triangle", "integral")); 
    }
}
