/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package androidbasicoaltice;

/**
 *
 * @author cadames
 */
public class Estudiante {
    
  private String nombre;
  private int edad;

  public Estudiante(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getEdad() {
    return this.edad;
  }

  @Override
  public String toString() {
    return String.format("%s (%d)", this.nombre, this.edad);
  }    
    
}
