import java.util.ArrayList;
import java.util.Scanner;
public class ListaEmpleados {

    ArrayList <Empleado> lista_trabajadores = new ArrayList<Empleado> ();

    //Metodo para añadir un empleado a la lista
    public void agregarEmpleado(Empleado empleado){
        lista_trabajadores.add(empleado);
    }
    //Metodo que imprime toda la lista de empleados
    public void mostrar_lista(){
        for (Empleado empleado : lista_trabajadores) {
            System.out.println(empleado);
            System.out.println("--------------------------------");
            
        }
    }
    
    public void eliminarEmpleado(String nombreEmpleadoBuscar) {

        int i = 0;
        boolean empleadoEncontrado = false;
    
        while (!empleadoEncontrado && i < lista_trabajadores.size()) {
            Empleado empleadoActual = lista_trabajadores.get(i);
            if (empleadoActual.getNombre().equals(nombreEmpleadoBuscar)) {
                empleadoEncontrado = true;
                lista_trabajadores.remove(i);
                System.out.println("Empleado encontrado: " + empleadoActual);
                System.out.println(empleadoActual + " fue eliminado correctamente de la lista");
                
            }
            i++;
        }
        System.out.println("Empleado no encontrado");
    }


    public void buscarEmpleadoPorNombre(String nombreEmpleadoBuscar) {
        int i = 0;
        boolean empleadoEncontrado = false;
    
        while (!empleadoEncontrado && i < lista_trabajadores.size()) {
            Empleado empleadoActual = lista_trabajadores.get(i);
            if (empleadoActual.getNombre().equals(nombreEmpleadoBuscar)) {
                empleadoEncontrado = true;
                System.out.println("Empleado encontrado: " + empleadoActual);
            }
            i++;
        }
        System.out.println("Empleado no encontrado");
        
    }

    public void actualizarInfoEmpleado(String nombre) {
        boolean opcionValida = false;
        Empleado empleadoEncontrado = obtenerEmpleadoPorNombre(nombre);
        Scanner sc = new Scanner(System.in);
        System.out.println("Para cambiar la información de un empleado, ingrese el nombre del empleado");
        System.out.println("Ingrese la letra correspondiente al campo que quiere modificar: /nA)Salario /nB)Puesto /nC)Nombre /nD)Salir");

        char opcionElegida = sc.nextLine().charAt(0);
        opcionElegida = Character.toLowerCase(opcionElegida);
        do {
            if(opcionElegida == 'a' || opcionElegida == 'b' || opcionElegida == 'c' || opcionElegida == 'd'){
                System.out.println("Opcion valida");

                if (opcionElegida == 'a'){
                    System.out.println("Porfavor,ingrese el salario actualizado para el empleado: ");
                    double salarioActualizado = sc.nextDouble();
                    empleadoEncontrado.setSalario(salarioActualizado);
                    System.out.println("Salario actualizado a " + salarioActualizado + "$");
                }else if (opcionElegida == 'b'){
                    System.out.println("Porfavor ingrese el puesto que el empleado debera ocupar ahora: ");
                    String puestoActualizado = sc.nextLine();
                    empleadoEncontrado.setPuesto(puestoActualizado);
                    System.out.println("Puesto actualizado a " + puestoActualizado);
                }else if (opcionElegida == 'c'){
                    System.out.println("Porfavor, inserte el nuevo nombre para este empleado: ");
                    String nombreActualizado = sc.nextLine();
                    empleadoEncontrado.setNombre(nombreActualizado);
                    System.out.println("Cambio de nombre realizado con exito a: " + nombreActualizado);
                }else if (opcionElegida == 'd'){
                    System.out.println("Saliendo....");
                }
            }
            else {System.out.println("Opcion no valida");
                     opcionValida = false;}
        } while (opcionElegida != 'd' && opcionValida);
        sc.close();
    }
    
    
    //Metodo privada para poder obtener la referencia a un objeto de la lista que sea empleado, de esta forma no se llena todo de bucles
    private Empleado obtenerEmpleadoPorNombre(String nombreEmpleado){
        int i = 0;
        boolean empleadoEncontrado = false;
    
        while (!empleadoEncontrado && i < lista_trabajadores.size()) {
            Empleado empleadoActual = lista_trabajadores.get(i);
            if (empleadoActual.getNombre().equals(nombreEmpleado)) {
                empleadoEncontrado = true;
                System.out.println("Empleado encontrado: " + empleadoActual);
            return empleadoActual;}
            i++;
        }
        System.out.println("Empleado no encontrado");
    return null; }


    public void informeSalarialTotal(){
        double salarioTotalEmpresa = 0.0;
        for (Empleado empleado : lista_trabajadores) {
            salarioTotalEmpresa += empleado.getSalario();
            System.out.println(salarioTotalEmpresa); 
        }
    }

}
