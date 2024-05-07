package application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "livros")
public class Livro {
    @Id
    private long id;
    @Column(nullable = false)
    private String titulo;
    
    @ManyToOne
    @JoinColumn(name = "id_genero", nullable = false)
    private Genero genero;
}
