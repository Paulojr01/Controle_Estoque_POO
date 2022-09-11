package br_com_Controle_Estoque_POO;

public class Usuario{

    private String nome_Usuario;
    private String senha_usuario;
    private String cpf_usuario;

    public Usuario(String nome_Usuario, String senha_usuario, String cpf_usuario) {
        this.nome_Usuario = nome_Usuario;
        this.senha_usuario = senha_usuario;
        this.cpf_usuario = cpf_usuario;
    }

    public void SetNome_Usuario(String nome_usuario){
        this.nome_Usuario = nome_usuario;

    }

    public String GetNome_Usuario (){
        return nome_Usuario;

    }

    public void SetSenha_Usuario (String senha_usuario){
        this.senha_usuario = senha_usuario;
    }

    public String GetSenha_Usuario(){
        return  senha_usuario;

    }

    public void SetCpf_Usuario (String cpf_usuario ){
        this.cpf_usuario = cpf_usuario;
    }

    public String GetCpf_Usuario(){
        return senha_usuario;

    }

}

