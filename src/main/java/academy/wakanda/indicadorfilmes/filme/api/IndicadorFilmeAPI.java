package academy.wakanda.indicadorfilmes.filme.api;

import academy.wakanda.indicadorfilmes.filme.api.FilmeResponse;
import academy.wakanda.indicadorfilmes.filme.service.IndicadorFilmesService;
import academy.wakanda.indicadorfilmes.filme.service.LocalizacaoDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/indicadorfilme")
@Log4j2
public class IndicadorFilmeAPI {

    private final IndicadorFilmesService indicadorFilmesService;
    @GetMapping
    public List<FilmeResponse> indicaFilmes(@RequestParam String longitude, @RequestParam String latitude){
        log.info("[start] IndicadorFilmesAPI - indicaFilmes");
        var localizacao = LocalizacaoDTO.builder()
                .latitude(latitude)
                .longitude(longitude)
                .build();
        var filmes = indicadorFilmesService.buscaIndicacaoFilmes(localizacao);
        log.info("[finish] IndicadorFilmesAPI - indicaFilmes");
        return filmes;
    }
}
