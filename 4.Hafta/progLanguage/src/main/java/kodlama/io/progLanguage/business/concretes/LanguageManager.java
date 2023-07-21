package kodlama.io.progLanguage.business.concretes;

import kodlama.io.progLanguage.business.abstracts.LanguageService;
import kodlama.io.progLanguage.business.request.CreateLanReq;
import kodlama.io.progLanguage.business.request.DeleteLanReq;
import kodlama.io.progLanguage.business.request.UpdateLanReq;
import kodlama.io.progLanguage.business.response.GetAllLanRes;
import kodlama.io.progLanguage.dataAccess.abstracts.LanguageRepository;
import kodlama.io.progLanguage.entities.concretes.ProgLanguage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }


    @Override
    public List<GetAllLanRes> langetAll() {
        List<ProgLanguage> progLanguages = languageRepository.findAll();
        List<GetAllLanRes> getAllRes = new ArrayList<GetAllLanRes>();

        for (ProgLanguage languageItem : progLanguages) {
            GetAllLanRes getAllResItem = new GetAllLanRes();
            getAllResItem.setName(languageItem.getName());
            getAllResItem.setId(languageItem.getId());
            getAllRes.add(getAllResItem);
        }
        return getAllRes;
    }

    @Override
    public void lanadd(CreateLanReq createLanReq) {
        ProgLanguage language = new ProgLanguage();
        language.setName(createLanReq.getName());
        this.languageRepository.save(language);
    }

    @Override
    public void landelete(DeleteLanReq deleteLanReq) {
        this.languageRepository.deleteById(deleteLanReq.getId());
    }

    @Override
    public void lanupdate(UpdateLanReq updateLanReq) {
        ProgLanguage language = this.languageRepository.getById(updateLanReq.getId());
        language.setName(updateLanReq.getName());
        this.languageRepository.save(language);
    }
}