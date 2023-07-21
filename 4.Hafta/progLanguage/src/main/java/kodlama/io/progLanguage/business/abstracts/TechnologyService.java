package kodlama.io.progLanguage.business.abstracts;

import kodlama.io.progLanguage.business.request.CreateTecReq;
import kodlama.io.progLanguage.business.request.DeleteTecReq;
import kodlama.io.progLanguage.business.request.UpdateTecReq;
import kodlama.io.progLanguage.business.response.GetAllTecRes;

import java.util.List;

public interface TechnologyService {
    List<GetAllTecRes> getAllTec ();
    void addTec (CreateTecReq createTecReq);

    void delTec (DeleteTecReq deleteTecReq);

    void update (UpdateTecReq updateTecReq);
}
