
package com.ean.wsapi.hotel.v3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CancelPolicyInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancelPolicyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cancelTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startWindowHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nightCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZoneDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPolicyInfo", propOrder = {
    "versionId",
    "cancelTime",
    "startWindowHours",
    "nightCount",
    "percent",
    "amount",
    "currencyCode",
    "timeZoneDescription"
})
public class CancelPolicyInfo {

    protected int versionId;
    protected String cancelTime;
    protected String startWindowHours;
    protected int nightCount;
    protected String percent;
    protected BigDecimal amount;
    protected String currencyCode;
    protected String timeZoneDescription;

    /**
     * Obtiene el valor de la propiedad versionId.
     * 
     */
    public int getVersionId() {
        return versionId;
    }

    /**
     * Define el valor de la propiedad versionId.
     * 
     */
    public void setVersionId(int value) {
        this.versionId = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelTime() {
        return cancelTime;
    }

    /**
     * Define el valor de la propiedad cancelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelTime(String value) {
        this.cancelTime = value;
    }

    /**
     * Obtiene el valor de la propiedad startWindowHours.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartWindowHours() {
        return startWindowHours;
    }

    /**
     * Define el valor de la propiedad startWindowHours.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartWindowHours(String value) {
        this.startWindowHours = value;
    }

    /**
     * Obtiene el valor de la propiedad nightCount.
     * 
     */
    public int getNightCount() {
        return nightCount;
    }

    /**
     * Define el valor de la propiedad nightCount.
     * 
     */
    public void setNightCount(int value) {
        this.nightCount = value;
    }

    /**
     * Obtiene el valor de la propiedad percent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercent() {
        return percent;
    }

    /**
     * Define el valor de la propiedad percent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercent(String value) {
        this.percent = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Define el valor de la propiedad currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad timeZoneDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneDescription() {
        return timeZoneDescription;
    }

    /**
     * Define el valor de la propiedad timeZoneDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneDescription(String value) {
        this.timeZoneDescription = value;
    }

}
