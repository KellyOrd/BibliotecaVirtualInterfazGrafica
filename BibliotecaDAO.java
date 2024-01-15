/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.ejemploguiapp.dao;

import ec.edu.ups.poo.ejemplouiapp.modelo.Biblioteca;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.poo.ejemploguiapp.idao.IBibliotecaDAO;


public class BibliotecaDAO implements IBibliotecaDAO {
    
    private List<Biblioteca> bibliotecas;

    public BibliotecaDAO() {
        bibliotecas = new ArrayList<>();

    }
    
    public void crearBiblioteca(Biblioteca biblioteca) {
        bibliotecas.add(biblioteca);
    }

    public Biblioteca obtenerBiblioteca(int codigo) {
        for(Biblioteca biblioteca : bibliotecas){
            if(biblioteca.getCodigo() == codigo){
                return biblioteca;
            }
        }
        return null;
    }

    public void actualizarBiblioteca(int codigo, Biblioteca biblioteca) {
        for (int i = 0; 1 < bibliotecas.size(); i++){
            Biblioteca bibliotecaBuscada = bibliotecas.get(i);
            if(bibliotecaBuscada.getCodigo() == codigo){
                bibliotecas.set(i, biblioteca);
                break;
            }
        }
    }

    public void eliminarBiblioteca(int codigo) {
        for (int i = 0; 1 < bibliotecas.size(); i++){
            Biblioteca bibliotecaBuscada = bibliotecas.get(i);
            if(bibliotecaBuscada.getCodigo() == codigo){
                bibliotecas.remove(i);
                break;
            }
        }
    }

    public List<Biblioteca> listarBiblioteca() {
        return bibliotecas;
    }

    public void create(Biblioteca biblioteca) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Biblioteca read(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void update(int codigo, Biblioteca biblioteca) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void delete(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Biblioteca> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}