package kodlama.io.progLanguage.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UpdateTecReq {
    private int id;
    private  String name;
}
