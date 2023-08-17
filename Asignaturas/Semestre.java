public class Semestre{
    private Materia[] asignaturas; //Declarando el arreglo
    private int cantAsig;

    public Semestre(){
        asignaturas = new Materia[5];
        cantAsig = 0;
    }

    /**
     * @description Agrega  a la lista la información de la asignatura
     * @param  nombre nombre de la asignatura
     * @param  nota   la nota hasta el momento
     */
    public void agregarAsignatura(String nombre, double nota){
        if (cantAsig < 5){
            Materia asignatura = new Materia(nombre, nota); //Creo el objeto que voy a meter en el arreglo
            asignaturas[cantAsig] = asignatura; //meto el objeto creado en la posición adecuada
            cantAsig++; //Aumento la cantidad de asignaturas en el arreglo.
        }
    /**
     * @description calcula el promedio de las asignaturas ingresadas
     * @return   return double el promedio
     */
    }
    
    public double calcularPromedio(){
        double suma = 0;
        for(Materia materiaActual:asignaturas){
            if (materiaActual != null)
                suma = suma + materiaActual.getNota();
        }
        return suma/cantAsig;
    }
    
    /**
     * @description mejorClase Obtiene el nombre de la clase en la que mejor le va
     * @return   return el nombre de la clase
     */
    public String mejorClase(){
        Materia mejor = asignaturas[0];
        for (int i = 1; i< asignaturas.length; i++){
            if (mejor != null && asignaturas[i]!=null){
                if (asignaturas[i].getNota()>mejor.getNota())
                    mejor = asignaturas[i];
            }
        }
        if (mejor!=null)
            return mejor.getNombre();
        else   
            return "No hay asignaturas";

    }

    public int getCantAsig(){
        return cantAsig;
    }


    public String toString(){
        String cadena = "Asignaturas: \n";
        for (Materia currentMateria : asignaturas) {
            if (currentMateria != null)
                cadena = cadena + currentMateria.toString()+"\n";
        }
        return cadena;
    }
}