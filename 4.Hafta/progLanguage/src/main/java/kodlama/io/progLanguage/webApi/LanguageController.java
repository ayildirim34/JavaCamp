package kodlama.io.progLanguage.webApi;

import kodlama.io.progLanguage.business.abstracts.LanguageService;
import kodlama.io.progLanguage.business.request.CreateLanReq;
import kodlama.io.progLanguage.business.request.DeleteLanReq;
import kodlama.io.progLanguage.business.request.UpdateLanReq;
import kodlama.io.progLanguage.business.response.GetAllLanRes;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/languages")


public class LanguageController {
    private LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping ("/getall")
    public List<GetAllLanRes> langetAll () {
        return languageService.langetAll();
    }

    @PostMapping ("/add")
    public void lanadd (CreateLanReq createLanReq) {
        languageService.lanadd(createLanReq);
    }

    @DeleteMapping("/delete")
    public void landelete (DeleteLanReq deleteLanReq) {
        languageService.landelete(deleteLanReq);
    }
    @PutMapping ("/update")
    public void lanupdate (UpdateLanReq updateLanReq) {
        languageService.lanupdate(updateLanReq);
    }

}
