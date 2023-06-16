package academy.wakanda.indicadorfilmes.filme.service;

import academy.wakanda.indicadorfilmes.filme.api.FilmeResponse;

import java.util.List;

public interface IndicadorFilmesService {
    List<FilmeResponse>  buscaIndicacaoFilmes(LocalizacaoDTO localizacao);
}
