/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observavel;

import beans.Usuario;
import com.sun.org.apache.bcel.internal.generic.AALOAD;

import daos.UsuarioDAO;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jefferson
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ObservavelPU");
        UsuarioDAO dao = new UsuarioDAO(factory);
        Usuario u = new Usuario("Jeff   ", "Jeff@gmail");
        u = dao.findUsuario(101);
        u.setNome("Julio");
        dao.destroy(1);
     
        
        
        
        
        
        
        
        
    }
    
}
