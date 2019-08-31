/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.AppMusic.Service;

import com.company.AppMusic.Model.Canciones;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Notebook
 */
public interface ServiceCanciones extends Serializable {
    
    public abstract List<Canciones>ListCanciones();
    
}
