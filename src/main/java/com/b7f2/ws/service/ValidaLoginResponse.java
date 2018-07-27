
package com.b7f2.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.b7f2.ws.bean.BeanLogin;


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
 *         &lt;element name="validaLoginReturn" type="{http://bean.ws.b7f2.com}BeanLogin"/&gt;
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
    "validaLoginReturn"
})
@XmlRootElement(name = "validaLoginResponse")
public class ValidaLoginResponse {

    @XmlElement(required = true)
    protected BeanLogin validaLoginReturn;

    /**
     * Obtiene el valor de la propiedad validaLoginReturn.
     * 
     * @return
     *     possible object is
     *     {@link BeanLogin }
     *     
     */
    public BeanLogin getValidaLoginReturn() {
        return validaLoginReturn;
    }

    /**
     * Define el valor de la propiedad validaLoginReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link BeanLogin }
     *     
     */
    public void setValidaLoginReturn(BeanLogin value) {
        this.validaLoginReturn = value;
    }

}
