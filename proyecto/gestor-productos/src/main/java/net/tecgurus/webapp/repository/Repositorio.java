package net.tecgurus.webapp.repository;

import java.util.List;

public interface Repositorio <T>{

    List<T> listar();
    T buscarPorId(Integer id);
    void guardar(T t);
    void eliminar(Integer id);

}
