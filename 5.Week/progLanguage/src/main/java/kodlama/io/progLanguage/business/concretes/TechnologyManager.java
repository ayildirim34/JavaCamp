package kodlama.io.progLanguage.business.concretes;

import kodlama.io.progLanguage.business.abstracts.TechnologyService;
import kodlama.io.progLanguage.business.core.utilities.mappers.ModelMapperService;
import kodlama.io.progLanguage.business.request.CreateTecReq;
import kodlama.io.progLanguage.business.request.UpdateTecReq;
import kodlama.io.progLanguage.business.response.GetAllTecRes;
import kodlama.io.progLanguage.business.response.GetByIdTecRes;
import kodlama.io.progLanguage.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.progLanguage.entities.concretes.Technology;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class TechnologyManager implements TechnologyService {

    private TechnologyRepository technologyRepository;

    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllTecRes> getAll() {
        List <Technology> technologies = technologyRepository.findAll();
        List <GetAllTecRes> getAllTecRes = technologies.stream().map(technology -> this.modelMapperService.forResponse().map(technology, GetAllTecRes.class)).collect(Collectors.toList());
        return getAllTecRes;
    }
    @Override
    public GetByIdTecRes getById(int id) {
        Technology technology = this.technologyRepository.findById(id).orElseThrow();
        GetByIdTecRes getByIdTecRes = this.modelMapperService.forResponse().map(technology, GetByIdTecRes.class);
        return getByIdTecRes;
    }
    @Override
    public void add(CreateTecReq createTecReq) {
        Technology technology = this.modelMapperService.forRequest().map(createTecReq, Technology.class );
        this.technologyRepository.save(technology);
    }
    @Override
    public void update(UpdateTecReq updateTecReq) {

        Technology technology = this.modelMapperService.forRequest().map(updateTecReq, Technology.class);
        this.technologyRepository.save(technology);
    }

    @Override
    public void delete(int id) {
    this.technologyRepository.deleteById(id);
    }




}
