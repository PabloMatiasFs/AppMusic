/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.AppMusic.Service;

import com.company.AppMusic.Model.Canciones;
import com.company.AppMusic.Repository.RepositoryCanciones;
import com.company.AppMusic.Repository.RepositoryGenero;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Notebook
 */
@Service("ServiceCancionesImp")
public class ServiceCancionesImp implements ServiceCanciones{
    
    
    @Autowired
    @Qualifier("repositoryCanciones")
    public RepositoryCanciones repositoryCanciones;
    
    @Autowired
    @Qualifier("repositoryGenero")
    public RepositoryGenero repositoryGenero;

    @Override
    public List<Canciones> ListCanciones() {
        List<Canciones> canciones = repositoryCanciones.findAll();
        return canciones;
    }
    
}
