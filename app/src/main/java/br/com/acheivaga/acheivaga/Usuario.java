package br.com.acheivaga.acheivaga;

/**
 * Created by Wanderson on 28/05/2017.
 */

public class Usuario {
    private String NomeProprietario;
    private String NomeEstacionamento;
    private String CNPJ;
    private String Telefone;
    private String Endereco;
    private String Número;
    private String QtdVagas;
    private String Bairro;
    private String Cidade;
    private String Email;
    private String senha;

    public String getNomeProprietario() {
        return NomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        NomeProprietario = nomeProprietario;
    }

    public String getNomeEstacionamento() {
        return NomeEstacionamento;
    }

    public void setNomeEstacionamento(String nomeEstacionamento) {
        NomeEstacionamento = nomeEstacionamento;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getNúmero() {
        return Número;
    }

    public void setNúmero(String número) {
        Número = número;
    }

    public String getQtdVagas() {
        return QtdVagas;
    }

    public void setQtdVagas(String qtdVagas) {
        QtdVagas = qtdVagas;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        Email = Email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
