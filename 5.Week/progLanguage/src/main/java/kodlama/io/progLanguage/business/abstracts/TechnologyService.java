package kodlama.io.progLanguage.business.abstracts;

import kodlama.io.progLanguage.business.request.CreateTecReq;
import kodlama.io.progLanguage.business.request.UpdateTecReq;
import kodlama.io.progLanguage.business.response.GetAllTecRes;
import kodlama.io.progLanguage.business.response.GetByIdTecRes;

import java.util.List;

public interface TechnologyService {
    List<GetAllTecRes> getAll ();

    GetByIdTecRes getById (int id);
    void add (CreateTecReq createTecReq);

    void delete (int id);

    void update (UpdateTecReq updateTecReq);
}
