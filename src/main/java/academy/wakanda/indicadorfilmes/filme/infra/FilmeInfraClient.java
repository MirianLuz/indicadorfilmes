package academy.wakanda.indicadorfilmes.filme.infra;

import academy.wakanda.indicadorfilmes.filme.application.api.FilmeResponse;
import academy.wakanda.indicadorfilmes.filme.application.service.FilmeClient;
import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoria;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
@Log4j2
public class FilmeInfraClient implements FilmeClient {
    @Override
    public List<FilmeResponse> buscaAtravesCategoria(FilmeCategoria categoria) {
        log.info("[start] FilmeInfraClient - buscaAtravesCategoria");
        log.info("[categoria]{}",categoria);

        log.info("[finish] FilmeInfraClient - buscaAtravesCategoria");
        return null;
    }
}
