/****************************************************************************/
// Eclipse SUMO, Simulation of Urban MObility; see https://eclipse.org/sumo
// Copyright (C) 2017-2019 German Aerospace Center (DLR) and others.
// TraaS module
// Copyright (C) 2013-2017 Dresden University of Technology
// This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v2.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v20.html
// SPDX-License-Identifier: EPL-2.0
/****************************************************************************/
/// @file    SimulationConvertGeo.java
/// @author  Mario Krumnow
/// @date    2013
/// @version $Id$
///
//
/****************************************************************************/

package de.tudresden.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Simulation_convertGeo complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Simulation_convertGeo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fromGeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Simulation_convertGeo", propOrder = {
    "x",
    "y",
    "fromGeo"
})
public class SimulationConvertGeo {

    protected double x;
    protected double y;
    protected String fromGeo;

    /**
     * Ruft den Wert der x-Eigenschaft ab.
     *
     */
    public double getX() {
        return x;
    }

    /**
     * Legt den Wert der x-Eigenschaft fest.
     *
     */
    public void setX(double value) {
        this.x = value;
    }

    /**
     * Ruft den Wert der y-Eigenschaft ab.
     *
     */
    public double getY() {
        return y;
    }

    /**
     * Legt den Wert der y-Eigenschaft fest.
     *
     */
    public void setY(double value) {
        this.y = value;
    }

    /**
     * Ruft den Wert der fromGeo-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFromGeo() {
        return fromGeo;
    }

    /**
     * Legt den Wert der fromGeo-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFromGeo(String value) {
        this.fromGeo = value;
    }

}
