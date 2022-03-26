/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hashcodes;

import java.util.Objects;

/**
 *
 * @author PC1
 */
public class Personas {
    
    private String cui;
    private String infoV1;
    private String infoV2;

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getInfo() {
        return infoV1;
    }

    public void setInfo(String info) {
        this.infoV1 = info;
    }

    public String getInfoV2() {
        return infoV2;
    }

    public void setInfoV2(String infoV2) {
        this.infoV2 = infoV2;
    }

    public Personas(String cui, String infoV1, String infoV2) {
        this.cui = cui;
        this.infoV1 = infoV1;
        this.infoV2 = infoV2;
    }
    
        @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.cui);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personas other = (Personas) obj;
        if (!Objects.equals(this.cui, other.cui)) {
            return false;
        }
        return true;
    }
    
    
}
