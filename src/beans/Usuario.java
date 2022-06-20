/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Jefferson
 */


@Entity
public class Usuario {
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String email;
    private int perfil;

    public Usuario() {
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        perfil = 1;
    }

    public Usuario(String nome, String email, int perfil) {
        this.nome = nome;
        this.email = email;
        this.perfil = perfil;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    
    
    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getPerfil() {
        return perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", email=" + email + ", perfil=" + perfil + '}';
    }

    public int getId() {
        return id;
    }
    
}
