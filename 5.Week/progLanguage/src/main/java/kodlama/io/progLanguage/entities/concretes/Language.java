package kodlama.io.progLanguage.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table (name = "languages")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Language {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column (name="name")
    private String name;

}
