package kodlama.io.progLanguage.business.abstracts;

import kodlama.io.progLanguage.business.request.CreateLanReq;
import kodlama.io.progLanguage.business.request.DeleteLanReq;
import kodlama.io.progLanguage.business.request.UpdateLanReq;
import kodlama.io.progLanguage.business.response.GetAllLanRes;

import java.util.List;

public interface LanguageService {
    List<GetAllLanRes> langetAll();
    void lanadd (CreateLanReq createLanReq);

    void landelete (DeleteLanReq deleteLanReq);

    void lanupdate (UpdateLanReq updateLanReq);

}
