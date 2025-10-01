//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.09.26 a las 02:06:22 PM CST 
//


package com.gym.reservation.dto;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idReservation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idRoom"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxExclusive value="21"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="instructor" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="discount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="3"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idReservation",
    "idRoom",
    "instructor",
    "discount"
})
@XmlRootElement(name = "confirmation")
public class Confirmation {

    protected int idReservation;
    protected int idRoom;
    protected String instructor;
    protected BigDecimal discount;

    /**
     * Obtiene el valor de la propiedad idReservation.
     * 
     */
    public int getIdReservation() {
        return idReservation;
    }

    /**
     * Define el valor de la propiedad idReservation.
     * 
     */
    public void setIdReservation(int value) {
        this.idReservation = value;
    }

    /**
     * Obtiene el valor de la propiedad idRoom.
     * 
     */
    public int getIdRoom() {
        return idRoom;
    }

    /**
     * Define el valor de la propiedad idRoom.
     * 
     */
    public void setIdRoom(int value) {
        this.idRoom = value;
    }

    /**
     * Obtiene el valor de la propiedad instructor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructor() {
        return instructor;
    }

    /**
     * Define el valor de la propiedad instructor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructor(String value) {
        this.instructor = value;
    }

    /**
     * Obtiene el valor de la propiedad discount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Define el valor de la propiedad discount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

}
