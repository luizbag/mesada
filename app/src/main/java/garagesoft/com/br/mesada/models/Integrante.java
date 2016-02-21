package garagesoft.com.br.mesada.models;

import com.orm.SugarRecord;

/**
 * Created by Luiz on 21/02/2016.
 */
public class Integrante extends SugarRecord {

    private String nome;

    private String papel;

    private Familia familia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }
}
