package kodlama.io.progLanguage.dataAccess.abstracts;

import kodlama.io.progLanguage.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository <Language, Integer>  {
}
