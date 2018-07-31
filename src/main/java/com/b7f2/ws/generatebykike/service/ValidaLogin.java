
package com.b7f2.ws.generatebykike.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.b7f2.ws.generatebykike.bean.BeanLogin;


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
 *         &lt;element name="obj" type="{http://bean.ws.b7f2.com}BeanLogin"/&gt;
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
