/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.AppMusic.Model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Notebook
 */
@Entity
@Table(name = "canciones")
public class Canciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCancion")
    private Integer idCancion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "artista")
    private String artista;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tiempo")
    private float tiempo;
    @JoinColumn(name = "genero", referencedColumnName = "idGenero")
    @ManyToOne
    private Genero genero;

    public Canciones() {
    }

    public Canciones(Integer idCancion) {
        this.idCancion = idCancion;
    }

    public Canciones(Integer idCancion, String nombre, String artista, float tiempo) {
        this.idCancion = idCancion;
        this.nombre = nombre;
        this.artista = artista;
        this.tiempo = tiempo;
    }

    public Integer getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(Integer idCancion) {
        this.idCancion = idCancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCancion != null ? idCancion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Canciones)) {
            return false;
        }
        Canciones other = (Canciones) object;
        if ((this.idCancion == null && other.idCancion != null) || (this.idCancion != null && !this.idCancion.equals(other.idCancion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[ idCancion=" + idCancion + " ]";
    }
    
}
