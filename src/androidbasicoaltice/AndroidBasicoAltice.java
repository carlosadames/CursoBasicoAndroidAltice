/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package androidbasicoaltice;
import androidbasicoaltice.Estudiante;

/**
 *
 * @author cadames
 */
public class AndroidBasicoAltice {
    
    static int totalEstudiantes, indiceArreglo = 0, estudianteMenor, estudianteMayor, estudianteTemporal[];
    static double edadPromedio, sumatoriaTotalEdades;   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante[] estudiantes = {
          new Estudiante("Juan", 24),
          new Estudiante("Erika", 20),
          new Estudiante("Emilio", 23),
          new Estudiante("Karina", 21),
          new Estudiante("Eduardo", 24),
          new Estudiante("Tomas", 25)
        };
        
        totalEstudiantes = estudiantes.length;      
              
        System.out.println(String.format("1 - Total estudiantes: %d", totalEstudiantes));
        System.out.println(String.format("2 - Edad mínima: %d", buscarEdadMinima(estudiantes)));
        System.out.println(String.format("3 - Edad máxima: %d", buscarEdadMaxima(estudiantes)));
        System.out.println(String.format("4 - Edad promedio: %f", calcularEdadPromedio(estudiantes)));
        System.out.println("\n Listado de estudiantes: \n");
        listarTodosLosEstudiantes(estudiantes);
  }


   public static int buscarEdadMinima(Estudiante[] estudiantes) {
       
    Estudiante estudianteMenor = estudiantes[indiceArreglo];

    for(int contadorEstudiantes=0; contadorEstudiantes < totalEstudiantes; contadorEstudiantes++) {
        
      Estudiante estudianteTemporal = estudiantes[contadorEstudiantes];
      
      if(estudianteTemporal.getEdad() < estudianteMenor.getEdad())
          
        estudianteMenor = estudianteTemporal;
    }
    
    return estudianteMenor.getEdad();
  }

   
  public static int buscarEdadMaxima(Estudiante[] estudiantes) {

    Estudiante estudianteMayor = estudiantes[indiceArreglo];

    for(int contadorEstudiantes=0; contadorEstudiantes < totalEstudiantes; contadorEstudiantes++) {
        
      Estudiante estudianteTemporal = estudiantes[contadorEstudiantes];
      
      if(estudianteTemporal.getEdad() > estudianteMayor.getEdad())
          
        estudianteMayor = estudianteTemporal;
    }
    
    return estudianteMayor.getEdad();
  }

  
    public static double calcularEdadPromedio(Estudiante[] estudiantes) {

      for(int contadorEstudiantes=0; contadorEstudiantes < totalEstudiantes; contadorEstudiantes++) {
          
        sumatoriaTotalEdades += estudiantes[contadorEstudiantes].getEdad();
        
      }

      edadPromedio = sumatoriaTotalEdades / totalEstudiantes;
      
      return edadPromedio;
      
    }
    
    

    public static void listarTodosLosEstudiantes(Estudiante[] estudiantes) {

      for(int contadorEstudiantes=0; contadorEstudiantes < totalEstudiantes; contadorEstudiantes++) {
          
        System.out.println(String.format("%s", estudiantes[contadorEstudiantes]));
        
      }
    }
    

}
    


