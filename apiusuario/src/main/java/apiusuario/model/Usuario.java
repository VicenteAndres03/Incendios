package apiusuario.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre del usuario no puede estar vacio")
    private String nombre;

    @NotBlank(message = "El correo no puede estar vacio")
    private String correo;

    @Size(min = 8, message = "La contraseña debe ser minimo de 8 caracteres")
    private String password;

    @NotNull(message = "No puede estar vacio")
    @Min(0)
    private Integer telefono;

    @NotBlank(message = "El rol no puede estar vacio")
    private String rol;

    @Column(name = "fecha_registro", updatable = false)
    private LocalDateTime fechaRegistro;

    @PrePersist
    protected void onCreated(){
        this.fechaRegistro = LocalDateTime.now();
    }
    
}