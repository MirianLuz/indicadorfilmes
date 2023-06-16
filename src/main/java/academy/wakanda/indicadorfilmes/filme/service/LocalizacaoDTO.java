package academy.wakanda.indicadorfilmes.filme.service;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Getter
@ToString
@Builder
public class LocalizacaoDTO {
    private final String longitude;
    private final String latitude;
}
