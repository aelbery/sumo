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
/// @file    VehicleRemove.java
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
 * <p>Java class for Vehicle_remove complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Vehicle_remove">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle_remove", propOrder = {
    "vehID",
    "reason"
})
public class VehicleRemove {

    protected String vehID;
    protected byte reason;

    /**
     * Ruft den Wert der vehID-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVehID() {
        return vehID;
    }

    /**
     * Legt den Wert der vehID-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVehID(String value) {
        this.vehID = value;
    }

    /**
     * Ruft den Wert der reason-Eigenschaft ab.
     *
     */
    public byte getReason() {
        return reason;
    }

    /**
     * Legt den Wert der reason-Eigenschaft fest.
     *
     */
    public void setReason(byte value) {
        this.reason = value;
    }

}
