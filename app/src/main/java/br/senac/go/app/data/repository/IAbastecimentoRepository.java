package br.senac.go.app.data.repository;

import java.util.List;

import br.senac.go.app.data.model.Abastecimento;
import br.senac.go.app.data.model.Veiculo;

public interface IAbastecimentoRepository {
    void getAbastecimentosByIdVeiculo(Callback<List<Abastecimento>> callback, Veiculo veiculo);
}
