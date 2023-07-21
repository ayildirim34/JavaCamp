package kodlama.io.progLanguage.business.concretes;

import kodlama.io.progLanguage.business.abstracts.TechnologyService;
import kodlama.io.progLanguage.business.request.CreateTecReq;
import kodlama.io.progLanguage.business.request.DeleteTecReq;
import kodlama.io.progLanguage.business.request.UpdateTecReq;
import kodlama.io.progLanguage.business.response.GetAllTecRes;
import kodlama.io.progLanguage.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.progLanguage.entities.concretes.Technology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class TechnologyManager implements TechnologyService {

    private TechnologyRepository technologyRepository;

    public TechnologyManager(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    @Override
    public List<GetAllTecRes> getAllTec() {
        List <Technology> technology = technologyRepository.findAll();
        List <GetAllTecRes> getAllTecRes = new ArrayList<GetAllTecRes>();

        for (Technology technologyItem: technology) {
            GetAllTecRes getAllTecResItem = new GetAllTecRes();
            getAllTecResItem.setId(technologyItem.getId());
            getAllTecResItem.setName(technologyItem.getName());
            getAllTecRes.add(getAllTecResItem);
        }
        return getAllTecRes;
    }

    @Override
    public void addTec(CreateTecReq createTecReq) {
        Technology technology = new Technology();
        technology.setName(createTecReq.getName());
        technologyRepository.save(technology);
    }

    @Override
    public void delTec(DeleteTecReq deleteTecReq) {
        technologyRepository.deleteById(deleteTecReq.getId());
    }

    @Override
    public void update(UpdateTecReq updateTecReq) {
    Technology technology = technologyRepository.getById(updateTecReq.getId());
    technology.setName(updateTecReq.getName());
    technologyRepository.save(technology);
    }
}
