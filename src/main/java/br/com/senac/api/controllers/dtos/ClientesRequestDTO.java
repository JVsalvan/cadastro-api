package br.com.senac.api.controllers.dtos;

public class ClientesRequestDTO {
    public String nome;
    public  String sobrenome;
    public String email;
    public String documento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }



    public void setDocumento(String documento) {
        this.documento = documento;


    }
    @Override
    public String toString() {
        return "ClientesRequestDTO{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }
}
