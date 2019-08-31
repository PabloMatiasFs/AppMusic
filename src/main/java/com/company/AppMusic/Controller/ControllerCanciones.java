/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.AppMusic.Controller;

import com.company.AppMusic.Model.Canciones;
import com.company.AppMusic.Model.Genero;
import com.company.AppMusic.Service.ServiceCanciones;
import com.company.AppMusic.Service.ServiceCancionesImp;
import com.company.AppMusic.Service.ServiceGenero;
import com.company.AppMusic.Service.ServiceGeneroImp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

/**
 *
 * @author Notebook
 */
@RestController
@RequestMapping("/inicio")
public class ControllerCanciones {

    private static final Log LOG = LogFactory.getLog(Controller.class);
    
    @RequestMapping(value = "/titulo", method = RequestMethod.GET)
    public String Titulo(){
        return "Soy un titulo";
    }

    @Autowired
    @Qualifier("ServiceCancionesImp")
    private ServiceCancionesImp serviceCancionesImp;

    @Autowired
    private ServiceCanciones serviceCanciones;
    
    @Autowired
    @Qualifier("ServiceGeneroImp")
    private ServiceGeneroImp serviceGeneroImp;

    @Autowired
    public ServiceGenero serviceGenero;

    @RequestMapping(value = "/listado", method = RequestMethod.GET)
    public ModelAndView listado() {
        ModelAndView mv = new ModelAndView("index");
        LOG.info("Call " + " ListCanciones()");
        mv.addObject("Canciones", serviceCanciones.ListCanciones());
        mv.addObject("Generos", serviceGeneroImp.ListGenero());
        return mv; 
    }
    
   
}
