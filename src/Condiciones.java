/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Condiciones {

    private int edad;
    private String nombre;

    public Condiciones() {
    }

    public Condiciones(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void pruebaCondiciones() {
        if (this.edad >= 18) 
        {
            System.out.println("Ud es mayor de edad.");
        } 
        else 
        {
            if (this.edad <= 12 && this.getEdad() >= 17){
                System.out.println("Ud es un adolecente.");
            }
            System.out.println("Ud es menor de edad");
        }
    }

}

