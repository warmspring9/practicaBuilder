/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;

import com.cenfotec.persona.withbuilder.Person;

/**
 *
 * @author maguero
 */
public class InformacionComida {
    private String nombre; 
    private int cantidadPorcion;
    private Medida unidadDeMedida;
    private int porciones;
    private int calorias;
    private int grasa;
    private int sodio;
    private int carbohidratos;

    public InformacionComida(String pNombre, int pCantidadPorcion, Medida pMedida, 
                              int pPorciones, int pCalorias, int pGrasa, int pSodio, int pCarbohidratos){
        this.nombre = pNombre;
        this.cantidadPorcion = pCantidadPorcion;
        this.unidadDeMedida = pMedida;
        this.porciones = pPorciones;
        this.calorias = pCalorias;
        this.grasa = pGrasa;
        this.sodio = pSodio;
        this.carbohidratos = pCarbohidratos;
    }
    
    public static class ComidaBuilder {
    	private String nestedNombre; 
        private int nestedCantidadPorcion;
        private Medida nestedUnidadDeMedida;
        private int nestedPorciones;
        private int nestedCalorias;
        private int nestedGrasa;
        private int nestedSodio;
        private int nestedCarbohidratos;

		public ComidaBuilder(final String nombre, final int cantidadPorcion, final Medida unit) {
			this.nestedNombre = nombre;
			this.nestedCantidadPorcion = cantidadPorcion;
			this.nestedUnidadDeMedida = unit;
		}
		
		public ComidaBuilder nombre(String nombre) {
			this.nestedNombre = nombre;
			return this;
		}
		public ComidaBuilder cantidadPorcion(int cant) {
			this.nestedCantidadPorcion = cant;
			return this;
		}
		public ComidaBuilder unidadDeMedida(Medida unit) {
			this.nestedUnidadDeMedida = unit;
			return this;
		}
		public ComidaBuilder porciones(int portion) {
			this.nestedPorciones = portion;
			return this;
		}
		public ComidaBuilder calorias(int calorias) {
			this.nestedCalorias = calorias;
			return this;
		}
		public ComidaBuilder sodio(int sodio) {
			this.nestedSodio = sodio;
			return this;
		}
		public ComidaBuilder carbohidratos(int carbos) {
			this.nestedCarbohidratos = carbos;
			return this;
		}
		public InformacionComida createInformacionComida() {
			return new InformacionComida(nestedNombre, nestedCantidadPorcion, nestedUnidadDeMedida, nestedPorciones, nestedCalorias,
					nestedGrasa, nestedSodio, nestedCarbohidratos);
		}
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the cantidadPorcion
     */
    public int getCantidadPorcion() {
        return cantidadPorcion;
    }

    /**
     * @return the unidadDeMedida
     */
    public Medida getUnidadDeMedida() {
        return unidadDeMedida;
    }

    /**
     * @return the porciones
     */
    public int getPorciones() {
        return porciones;
    }
    /**
     * @return the calorias
     */
    public int getCalorias() {
        return calorias;
    }

    /**
     * @return the grasa
     */
    public int getGrasa() {
        return grasa;
    }
    /**
     * @return the sodio
     */
    public int getSodio() {
        return sodio;
    }

    /**
     * @return the carbohidratos
     */
    public int getCarbohidratos() {
        return carbohidratos;
    }
 
    
    
}
