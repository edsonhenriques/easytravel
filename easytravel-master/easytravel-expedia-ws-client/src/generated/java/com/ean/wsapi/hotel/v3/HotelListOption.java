
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para hotelListOption.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="hotelListOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="HOTEL_SUMMARY"/>
 *     &lt;enumeration value="ROOM_RATE_DETAILS"/>
 *     &lt;enumeration value="DEEP_LINKS"/>
 *     &lt;enumeration value="REQUEST_ONLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "hotelListOption")
@XmlEnum
public enum HotelListOption {

    DEFAULT,
    HOTEL_SUMMARY,
    ROOM_RATE_DETAILS,
    DEEP_LINKS,
    REQUEST_ONLY;

    public String value() {
        return name();
    }

    public static HotelListOption fromValue(String v) {
        return valueOf(v);
    }

}
