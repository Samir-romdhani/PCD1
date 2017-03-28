/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.ensi.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author user
 */
@Entity
@Table(name = "formations", catalog = "rhdatabase", schema = "")
@NamedQueries({
    @NamedQuery(name = "Formation.findAll", query = "SELECT f FROM Formation f")
    , @NamedQuery(name = "Formation.findByIdF", query = "SELECT f FROM Formation f WHERE f.idF = :idF")
    , @NamedQuery(name = "Formation.findByLibelleF", query = "SELECT f FROM Formation f WHERE f.libelleF = :libelleF")
    , @NamedQuery(name = "Formation.findByRate", query = "SELECT f FROM Formation f WHERE f.rate = :rate")})
public class Formation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "IdF")
    private String idF;
    @Size(max = 50)
    @Column(name = "libelleF")
    private String libelleF;
    @Column(name = "Rate")
    private Integer rate;

    public Formation() {
    }

    public Formation(String idF) {
        this.idF = idF;
    }

    public String getIdF() {
        return idF;
    }

    public void setIdF(String idF) {
        this.idF = idF;
    }

    public String getLibelleF() {
        return libelleF;
    }

    public void setLibelleF(String libelleF) {
        this.libelleF = libelleF;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idF != null ? idF.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formation)) {
            return false;
        }
        Formation other = (Formation) object;
        if ((this.idF == null && other.idF != null) || (this.idF != null && !this.idF.equals(other.idF))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tn.ensi.entities.Formation[ idF=" + idF + " ]";
    }
    
}
