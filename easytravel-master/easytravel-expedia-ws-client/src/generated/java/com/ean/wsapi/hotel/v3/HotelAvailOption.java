
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para hotelAvailOption.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="hotelAvailOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="HOTEL_DETAILS"/>
 *     &lt;enumeration value="ROOM_TYPES"/>
 *     &lt;enumeration value="ROOM_AMENITIES"/>
 *     &lt;enumeration value="PROPERTY_AMENITIES"/>
 *     &lt;enumeration value="HOTEL_IMAGES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "hotelAvailOption")
@XmlEnum
public enum HotelAvailOption {

    DEFAULT,
    HOTEL_DETAILS,
    ROOM_TYPES,
    ROOM_AMENITIES,
    PROPERTY_AMENITIES,
    HOTEL_IMAGES;

    public String value() {
        return name();
    }

    public static HotelAvailOption fromValue(String v) {
        return valueOf(v);
    }

}
