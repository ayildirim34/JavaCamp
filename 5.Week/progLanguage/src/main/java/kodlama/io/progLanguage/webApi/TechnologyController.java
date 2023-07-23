package kodlama.io.progLanguage.webApi;

import kodlama.io.progLanguage.business.abstracts.TechnologyService;
import kodlama.io.progLanguage.business.request.CreateTecReq;
import kodlama.io.progLanguage.business.request.UpdateTecReq;
import kodlama.io.progLanguage.business.response.GetAllTecRes;
import kodlama.io.progLanguage.business.response.GetByIdTecRes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/technology")

public class TechnologyController {
    private TechnologyService technologyService;

    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping ()
    public List<GetAllTecRes> getAll () {
        return technologyService.getAll();
    }

    @GetMapping ("/{id}")
    public GetByIdTecRes getById (int id) {
        return technologyService.getById(id);
    }

    @PostMapping ()
    @ResponseStatus (code= HttpStatus.CREATED)

    public void addTec (@RequestBody CreateTecReq createTecReq) {
        technologyService.add(createTecReq);
    }

    @DeleteMapping ("/{id}")
    public void delTec (int id) {
        technologyService.delete(id);
    }

    @PutMapping ()
    public void updateTec (@RequestBody UpdateTecReq updateTecReq) {
        technologyService.update(updateTecReq);
    }

}
