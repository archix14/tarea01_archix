package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class Persona {
    public String codigo;
   public String nombres;
   public boolean asistencia;

   public Persona(String codigo, String nombre, boolean asistencia) {
      this.codigo = codigo;
      this.nombres = nombre;
      this.asistencia = asistencia;
   }
}

