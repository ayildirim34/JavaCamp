package kodlama.io.progLanguage.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UpdateLanReq {
    private int id;
    private  String name;
}
