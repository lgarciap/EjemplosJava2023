/*
 * @author: POO seccion 20
 * @date: 13/7/2023
 * Esta clase modela un perro de manera general
 */
public class Perro{
    //Atributos
    private String raza;
    private int edad;
    private String tamanio;
    private String genero;
    private String nombre;
    private String color;

    //Métodos
    public Perro(){
        raza = "chihuahua";
        edad = 0;
        tamanio = "pequeño";
        genero = "macho";
        nombre = "firulais";
        color = "cafe";
    }

    // raza
    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getRaza(){
        return this.raza;
    }
    
    //edad;
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    //tamanio;
    public void setTamanio(String tamanio){
        this.tamanio = tamanio;
    }
    public String getTamanio(){
        return tamanio;
    }

    // genero;
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }

    // nombre;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    //color;
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public String toString(){
        String estado = "El perro se llama "+this.nombre+" es de raza "+this.raza+" tiene "+this.edad+" años, y es de color "+this.color+", su tamaño es "+tamanio+ " y es "+genero;
        return estado;
    }
}