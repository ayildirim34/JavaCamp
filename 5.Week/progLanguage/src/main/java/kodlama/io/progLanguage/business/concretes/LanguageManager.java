package kodlama.io.progLanguage.business.concretes;

import kodlama.io.progLanguage.business.abstracts.LanguageService;
import kodlama.io.progLanguage.business.core.utilities.mappers.ModelMapperService;
import kodlama.io.progLanguage.business.request.CreateLanReq;
import kodlama.io.progLanguage.business.request.UpdateLanReq;
import kodlama.io.progLanguage.business.response.GetAllLanRes;
import kodlama.io.progLanguage.business.response.GetByIdLanRes;
import kodlama.io.progLanguage.dataAccess.abstracts.LanguageRepository;
import kodlama.io.progLanguage.entities.concretes.Language;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllLanRes> getAll() {
        List<Language> languages = languageRepository.findAll();
        List<GetAllLanRes> getAllLanRes = languages.stream().map(language -> this.modelMapperService.forResponse().map(language, GetAllLanRes.class)).collect(Collectors.toList());
        return getAllLanRes;
    }
    @Override
    public GetByIdLanRes getById(int id) {
        Language language = this.languageRepository.findById(id).orElseThrow();
        GetByIdLanRes getByIdLanRes = this.modelMapperService.forResponse().map(language, GetByIdLanRes.class);
        return getByIdLanRes;
    }
    @Override
    public void add(CreateLanReq createLanReq) {
        Language language = this.modelMapperService.forRequest().map(createLanReq, Language.class );
        this.languageRepository.save(language);
    }
    @Override
    public void update(UpdateLanReq updateLanReq) {
    Language language = this.modelMapperService.forRequest().map(updateLanReq, Language.class);
    this.languageRepository.save(language);
    }

    @Override
    public void delete(int id) {
        this.languageRepository.deleteById(id);
    }


}