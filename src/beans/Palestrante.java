/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import javax.persistence.Entity;

/**
 *
 * @author Jefferson
 */

@Entity
public class Palestrante extends Usuario{
    
    
    private String titulos;
    private String descrição;

    public Palestrante(String titulos, String descrição) {
        this.titulos = titulos;
        this.descrição = descrição;
    }

    public Palestrante(String titulos, String descrição, String nome, String email) {
        super(nome, email);
        this.titulos = titulos;
        this.descrição = descrição;
        this.setPerfil(2);
    }


    public Palestrante() {
    }
    
    
    
    
    
    
}
