import java.util.Random;
/**
 * @author POO-20
 * @description Clase que maneja todo el juego
 * @date 04/08/2023
 */
public class Bingo {
    private int numero1;
    private int numero2;
    private int numero3;
    private int cantVeces;
    private float saldo;
    private Random generador;


    public Bingo() {
        numero1 = 0;
        numero2 = 0;
        numero3 = 0;
        cantVeces = 0;
        saldo = 48;
        generador = new Random();
    }

    public Bingo(int numero1, int numero2, int numero3, int cantVeces, float saldo) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
        this.cantVeces = cantVeces;
        this.saldo = saldo;
        generador = new Random();
    }


    /** 
     * @return int
     */
    public int getNumero1() {
        return this.numero1;
    }


    /**
     * Set the value of numero1.
     *
     * @param numero1 the new value of numero1
     */

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    
    /** 
     * @return int
     */
    public int getNumero2() {
        return this.numero2;
    }

    
    /** 
     * @param numero2
     */
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    
    /** 
     * @return int
     */
    public int getNumero3() {
        return this.numero3;
    }


    
    /** 
     * @param numero3
     */
    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }


    
    /** 
     * @return int
     */
    public int getCantVeces() {
        return this.cantVeces;
    }


    
    /** 
     * @param cantVeces
     */
    public void setCantVeces(int cantVeces) {
        this.cantVeces = cantVeces;
    }

    
    /** 
     * @return float
     */
    public float getSaldo() {
        return this.saldo;
    }

    
    /** 
     * @param saldo
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " numero1: '" + getNumero1() + "'" +
            ", numero2: '" + getNumero2() + "'" +
            ", numero3: '" + getNumero3() + "'" +
            ", cantVeces: '" + getCantVeces() + "'" +
            ", saldo: '" + getSaldo() + "'" +
            "}";
    }


    
    /** 
     * genera un número entero aleatorio entre 100 y 1000
     * @return int
     */
    public int generarNumeroAleatorio(){
        return generador.nextInt(1000-100+1)+100;
    }

    /**
     * @description Modifica el saldo de acuerdo a la generacion de los números aleatorios jugados
     */
    public void jugar(){
        if (puedeJugarOno()){
             cantVeces = cantVeces + 1;
            numero1 = generarNumeroAleatorio();
            numero2 = generarNumeroAleatorio();
            numero3 = generarNumeroAleatorio();
            boolean par1 = numero1 % 2 == 0;
            boolean par2 = numero2 % 2 == 0;
            boolean par3 = numero3 % 2 == 0;
            if (cantVeces > 4){
                saldo = saldo - 48;
            }
            if (par1 && par2){
                if (numero1 >= 700 && numero2 >= 700){
                    saldo = (float)(saldo + 0.1*(numero1+numero2));
                }
                if ((numero1>=500 && numero1<700) && (numero2>=500 && numero2<700)){
                    saldo = (float)(saldo +0.2*(numero1+numero2));
                }
                if (numero1 > 500 || numero2>500){
                    saldo = (float)(saldo +0.15*(numero1+numero2));
                    }
                    if (numero1<500 && numero2<500){
                    saldo = (float)(saldo +0.25*(numero1+numero2));
                }
            }
            else
                if (par2 && par3){
                if (numero2 >= 700 && numero3 >= 700){
                    saldo = (float)(saldo + 0.1*(numero2+numero3));
                }
                if ((numero2>=500 && numero2<700) && (numero3>=500 && numero3<700)){
                    saldo = (float)(saldo +0.2*(numero2+numero3));
                }
                if (numero2 > 500 || numero3>500){
                    saldo = (float)(saldo +0.15*(numero2+numero3));
                    }
                    if (numero2<500 && numero3<500){
                    saldo = (float)(saldo +0.25*(numero2+numero3));
                }
                
            }
                else
                    if (par1 && par3){
                if (numero1 >= 700 && numero3 >= 700){
                    saldo = (float)(saldo + 0.1*(numero1+numero3));
                }
                if ((numero1>=500 && numero1<700) && (numero3>=500 && numero3<700)){
                    saldo = (float)(saldo +0.2*(numero1+numero3));
                }
                if (numero1 > 500 || numero3>500){
                    saldo = (float)(saldo +0.15*(numero1+numero3));
                    }
                if (numero1<500 && numero3<500){
                    saldo = (float)(saldo +0.25*(numero1+numero3));
                }

            }
            saldo = saldo - 12; //Se le descuenta lo que compró
        }
       
    }

    /**
     * @description determina si tiene saldo suficiente para jugar
     * @return   return boolean si puede jugar o no 
     */
    public boolean puedeJugarOno(){
        if (saldo >= 12 )
            return true;
        else 
            return false;
    }

    /**
     * @return boolean si ganó o no
     */
    public boolean gano(){
        boolean par1 = numero1 % 2 == 0;
        boolean par2 = numero2 % 2 == 0;
        boolean par3 = numero3 % 2 == 0;
        if (par1 && par2)
            return true;
        if (par1 && par3)
            return true;
        if (par2 && par3)
            return true;
        return false;
    }

    /**
     * @description Convierte a dolares segun el cambio del día
     * @param  tipoCambio el cambio del día
     * @return return los dolares
     */
    public double convertirAdolares(double tipoCambio) {
		//Devuelve el saldo convertido a d󬡲es
			return saldo/tipoCambio;
	}


}
