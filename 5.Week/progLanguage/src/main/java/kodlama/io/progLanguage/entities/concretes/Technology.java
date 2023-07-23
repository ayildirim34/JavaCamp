package kodlama.io.progLanguage.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table (name = "Technologies")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Technology {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name= "id")
    private int id;

    @Column (name = "name")
    private String name;
}
