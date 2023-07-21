package kodlama.io.progLanguage.dataAccess.abstracts;

import kodlama.io.progLanguage.entities.concretes.ProgLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository <ProgLanguage, Integer>  {
}
