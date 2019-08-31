/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.AppMusic.Repository;

import com.company.AppMusic.Model.Canciones;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Notebook
 */
public interface RepositoryCanciones extends CrudRepository<Canciones, Integer>{
    
}
