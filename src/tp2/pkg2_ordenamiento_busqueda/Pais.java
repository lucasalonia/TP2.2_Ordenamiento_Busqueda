/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.pkg2_ordenamiento_busqueda;

/**
 *
 * @author salon
 */
public class Pais implements Comparable<Pais>{
    private String nombre;
    private Integer medallasOro;
    private Integer medallasPlata;
    private Integer medallasBronce;
    private int ranking;

    public Pais(String nombre, Integer medallasOro, Integer medallasPlata, Integer medallasBronce) {
        this.nombre = nombre;
        this.medallasOro = medallasOro;
        this.medallasPlata = medallasPlata;
        this.medallasBronce = medallasBronce;

    }

    public String getNombre() {
        return nombre;
    }

    public Integer getMedallasOro() {
        return medallasOro;
    }

    public Integer getMedallasPlata() {
        return medallasPlata;
    }

    public Integer getMedallasBronce() {
        return medallasBronce;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    
    
  
     
    
    @Override
    public int compareTo(Pais otroPais) {
        //Devuelve 0 cuando son iguales. Numero positivo cuando era mayor y negativo si es menor
        int oro = medallasOro.compareTo(otroPais.medallasOro);
        int plata = medallasPlata.compareTo(otroPais.medallasPlata);
        int bronce = medallasBronce.compareTo(otroPais.medallasBronce);
        int pais = this.nombre.compareTo(otroPais.nombre);
        
        if (oro!=0) {
            return oro;
        }
        if (plata!=0) {
            return plata;
        }
        if (bronce!=0) {
            return bronce;
        }
        
       return pais; 
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", medallasOro=" + medallasOro + ", medallasPlata=" + medallasPlata + ", medallasBronce=" + medallasBronce + ", ranking=" + ranking + '}';
    }
    
    
    
    
}
