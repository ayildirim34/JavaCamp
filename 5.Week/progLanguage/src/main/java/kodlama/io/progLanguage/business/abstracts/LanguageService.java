package kodlama.io.progLanguage.business.abstracts;

import kodlama.io.progLanguage.business.request.CreateLanReq;
import kodlama.io.progLanguage.business.request.UpdateLanReq;
import kodlama.io.progLanguage.business.response.GetAllLanRes;
import kodlama.io.progLanguage.business.response.GetByIdLanRes;

import java.util.List;

public interface LanguageService {
    List<GetAllLanRes> getAll();

    GetByIdLanRes getById (int id);
    void add (CreateLanReq createLanReq);

    void delete (int id);

    void update (UpdateLanReq updateLanReq);

}
