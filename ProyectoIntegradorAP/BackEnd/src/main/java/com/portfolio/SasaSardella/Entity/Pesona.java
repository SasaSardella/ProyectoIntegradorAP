package com.portfolio.SasaSardella.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import static org.apache.coyote.http11.Constants.a;
@Getter @Setter
@Entity
public class Pesona {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
   private Long id;
    
    @NotNull
    @Size (min = a, max = 50, message = "No cumple con la longitud")
   private String Nombre;
    
     @NotNull
    @Size (min = a, max = 50, message = "No cumple con la longitud")
   private String Apellido;
     
    @Size (min = a, max = 50, message = "No cumple con la longitud")
   private String img;   

}
