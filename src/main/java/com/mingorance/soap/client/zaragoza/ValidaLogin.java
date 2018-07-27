
package com.mingorance.soap.client.zaragoza;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="obj" type="{http://bean.ws.b7f2.com}BeanLogin"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "obj"
})
@XmlRootElement(name = "validaLogin")
public class ValidaLogin {

    @XmlElement(required = true)
    protected BeanLogin obj;

    /**
     * Obtiene el valor de la propiedad obj.
     * 
     * @return
     *     possible object is
     *     {@link BeanLogin }
     *     
     */
    public BeanLogin getObj() {
        return obj;
    }

    /**
     * Define el valor de la propiedad obj.
     * 
     * @param value
     *     allowed object is
     *     {@link BeanLogin }
     *     
     */
    public void setObj(BeanLogin value) {
        this.obj = value;
    }

}
