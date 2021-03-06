
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SearchRadiusUnitType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchRadiusUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MI"/>
 *     &lt;enumeration value="KM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchRadiusUnitType")
@XmlEnum
public enum SearchRadiusUnitType {

    MI,
    KM;

    public String value() {
        return name();
    }

    public static SearchRadiusUnitType fromValue(String v) {
        return valueOf(v);
    }

}
