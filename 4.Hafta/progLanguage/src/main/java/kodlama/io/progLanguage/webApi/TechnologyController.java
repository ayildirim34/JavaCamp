package kodlama.io.progLanguage.webApi;

import kodlama.io.progLanguage.business.abstracts.TechnologyService;
import kodlama.io.progLanguage.business.request.CreateTecReq;
import kodlama.io.progLanguage.business.request.DeleteTecReq;
import kodlama.io.progLanguage.business.request.UpdateTecReq;
import kodlama.io.progLanguage.business.response.GetAllTecRes;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/technology")

public class TechnologyController {
    private TechnologyService technologyService;

    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping ("/getall")
    public List<GetAllTecRes> tecgetAll () {
        return technologyService.getAllTec();
    }

    @PostMapping ("/add")
    public void addTec (CreateTecReq createTecReq) {
        technologyService.addTec(createTecReq);
    }

    @DeleteMapping ("/delete")
    public void delTec (DeleteTecReq deleteTecReq) {
        technologyService.delTec(deleteTecReq);
    }

    @PutMapping ("/update")
    public void updateTec (UpdateTecReq updateTecReq) {
        technologyService.update(updateTecReq);
    }

}
