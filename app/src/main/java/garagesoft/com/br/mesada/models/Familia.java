package garagesoft.com.br.mesada.models;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by Luiz on 21/02/2016.
 */
public class Familia extends SugarRecord {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Integrante> getIntegrantes() {
        return Integrante.find(Integrante.class, "familia = ?", getId().toString());
    }
}
