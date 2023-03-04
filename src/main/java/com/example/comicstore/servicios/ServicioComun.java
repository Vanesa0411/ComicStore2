package com.example.comicstore.servicios;

import java.util.List;

public interface ServicioComun<E> {

    //La E significa entidad generica -- Solo nombra las acciones pero no indica como lo realiza

    public List<E> buscarTodos();
    public E buscarPorId(Integer id);
    public E agregar(E datos);




}
