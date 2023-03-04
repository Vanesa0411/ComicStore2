package com.example.comicstore.servicios;

import com.example.comicstore.entidades.Producto;
import com.example.comicstore.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Servicioproducto implements ServicioComun<Producto> {

    @Autowired //Conexion con el repositorio
    ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> buscarTodos() {
        return null;
    }

    @Override
    public Producto buscarPorId(Integer id) {
        try{
            Optional<Producto> producto=productoRepositorio.findById(id);
            return producto.get();

        }catch (Exception error){
            return null;
            //throw new Exception(error.getMessage());

        }
    }

    @Override
    public Producto agregar(Producto datos) {
        return null;
    }
}
