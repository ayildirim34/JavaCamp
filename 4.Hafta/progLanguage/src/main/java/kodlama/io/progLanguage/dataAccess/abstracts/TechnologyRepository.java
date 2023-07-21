package kodlama.io.progLanguage.dataAccess.abstracts;

import kodlama.io.progLanguage.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository <Technology, Integer>
{
}
