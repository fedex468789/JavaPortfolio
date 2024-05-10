public class Testing {
    public static void main(String[] args){
        
        ListaEmpleados nuevaLista = new ListaEmpleados();
        Empleado e1 = new Empleado("Fran", "Jefe", 13, 1, 'm', 20);
        Empleado e2 = new Empleado("Juan", "Gerente de Ventas", 35, 3, 'm', 10);
        Empleado e3 = new Empleado("María", "Analista de Marketing", 28, 2, 'f', 5);
        Empleado e4 = new Empleado("Pablo", "Desarrollador Senior", 30, 3, 'm', 8);
        Empleado e5 = new Empleado("Laura", "Contadora", 40, 2, 'f', 15);
        Empleado e6 = new Empleado("Patricio", "Contadora", 40, 2, 'f', 15);

        nuevaLista.agregarEmpleado(e1);
        nuevaLista.agregarEmpleado(e2);
        nuevaLista.agregarEmpleado(e3);
        nuevaLista.agregarEmpleado(e4);
        nuevaLista.agregarEmpleado(e5);
        nuevaLista.agregarEmpleado(e6);

       /*  System.out.println("---------------------------------------------------------------");
        nuevaLista.mostrar_lista();
        //Ejemplo de empleado encontrado
        System.out.println("---------------------------------------------------------------");
        nuevaLista.buscarEmpleadoPorNombre("Pablo");
        //Ejemplo de empleado no encontrado
        System.out.println("---------------------------------------------------------------");
        nuevaLista.buscarEmpleadoPorNombre("Jorge");
        //Ejemplo de eliminar empleado de la lista
        System.out.println("---------------------------------------------------------------");
        nuevaLista.eliminarEmpleado("María");
        nuevaLista.mostrar_lista();
        System.out.println("---------------------------------------------------------------");
        nuevaLista.actualizarInfoEmpleado("Juan");
        System.out.println("---------------------------------------------------------------");
        nuevaLista.mostrar_lista(); */

        nuevaLista.informeSalarialTotal();

    }
}
