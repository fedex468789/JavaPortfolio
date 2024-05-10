public class Testing {
    public static void main(String[] args){
        
        ListaEmpleados nuevaLista = new ListaEmpleados();
        Empleado e1 = new Empleado("Fran", "Boss", 50, 1, 'm', 20);
        Empleado e2 = new Empleado("Juan", "Marketing Boss", 35, 3, 'm', 10);
        Empleado e3 = new Empleado("María", "Marketing Analyst", 28, 2, 'f', 5);
        Empleado e4 = new Empleado("Pablo", "Senior Dev", 30, 3, 'm', 8);
        Empleado e5 = new Empleado("Laura", "Accountant", 40, 2, 'f', 15);
        Empleado e6 = new Empleado("Patricio", "Accountant", 70, 2, 'm', 50);

        nuevaLista.agregarEmpleado(e1);
        nuevaLista.agregarEmpleado(e2);
        nuevaLista.agregarEmpleado(e3);
        nuevaLista.agregarEmpleado(e4);
        nuevaLista.agregarEmpleado(e5);
        nuevaLista.agregarEmpleado(e6);

        System.out.println("---------------------------------------------------------------");
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
        //Ejemplo para cambiar informacion de un empleado por su nombre
        System.out.println("---------------------------------------------------------------");
        nuevaLista.actualizarInfoEmpleado("Juan");
        nuevaLista.mostrar_lista();
        //Ejemplo de cuanto seria el gasto de la empresa total en cuestion de salarios
        nuevaLista.informeSalarialTotal();

    }
}
