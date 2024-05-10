public class Empleado {

    String nombre, puesto;
    int edad;
    double salario;
    char genero;
    double antiguedad;

    public Empleado(String nombre, String puesto, int edad, double salario, char genero, double antiguedad) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.edad = edad;
        this.salario = salario;
        this.genero = genero;
        this.antiguedad = antiguedad;
    }

    public Empleado() {

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "El nombre del empleado= " + nombre + ", ocupa el puesto de =" + 
        puesto + ", tiene =" + edad + " años, y tiene un salario de " + salario
                + "$ ,Su genero es " + genero + " y tiene una antiguedad de " + antiguedad +" años";
    }

    
        
}
