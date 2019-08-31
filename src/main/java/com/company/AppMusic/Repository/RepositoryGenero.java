/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.AppMusic.Repository;

import com.company.AppMusic.Model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Notebook
 */
public interface RepositoryGenero extends JpaRepository<Genero, Integer>{
    
}
