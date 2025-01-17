package academy.wakanda.indicadorfilmes.filme.api;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class LocalizacaoRequest {
    private String longitude;
    private String latitude;

}
