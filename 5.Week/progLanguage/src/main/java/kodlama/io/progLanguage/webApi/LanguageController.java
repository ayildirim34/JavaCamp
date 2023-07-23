package kodlama.io.progLanguage.webApi;

import kodlama.io.progLanguage.business.abstracts.LanguageService;
import kodlama.io.progLanguage.business.request.CreateLanReq;
import kodlama.io.progLanguage.business.request.UpdateLanReq;
import kodlama.io.progLanguage.business.response.GetAllLanRes;
import kodlama.io.progLanguage.business.response.GetByIdLanRes;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/languages")
@AllArgsConstructor


public class LanguageController {
    private LanguageService languageService;

    @GetMapping ()
    public List<GetAllLanRes> getAll () {
        return languageService.getAll();
    }

    @GetMapping ("/{id}")
    public GetByIdLanRes getById (int id) {
        return languageService.getById(id);
    }

    @PostMapping ()
    @ResponseStatus (code = HttpStatus.CREATED)
    public void add (@RequestBody  CreateLanReq createLanReq) {
        languageService.add(createLanReq);
    }

    @DeleteMapping("/{id}")
    public void landelete (int id) {
        languageService.delete(id);
    }

    @PutMapping ("/update")
    public void lanupdate (@RequestBody UpdateLanReq updateLanReq) {
        languageService.update(updateLanReq);
    }

}
