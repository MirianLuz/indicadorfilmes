package academy.wakanda.indicadorfilmes.filme.service;

import academy.wakanda.indicadorfilmes.filme.api.FilmeResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class IndicadorFilmesApplicationService implements IndicadorFilmesService {
    @Override
    public List<FilmeResponse> buscaIndicacaoFilmes(LocalizacaoDTO localizacao) {
        log.info("[start] IndicadorFilmesApplicationService - buscaIndicacaoFilmes");
        log.info("[localizacao]", localizacao);
        log.info("[finish] IndicadorFilmesApplicationService - buscaIndicacaoFilmes");
        return null;
    }
}
