/**
 * BeanLogin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.b7f2.ws.bean;

public class BeanLogin  implements java.io.Serializable {
    private java.lang.String cad1;

    private java.lang.String cad2;

    private java.lang.String mensaje;

    private java.lang.String pass;

    private java.lang.Boolean status;

    private java.lang.String tipo;

    private java.lang.String usuario;

    public BeanLogin() {
    }

    public BeanLogin(
           java.lang.String cad1,
           java.lang.String cad2,
           java.lang.String mensaje,
           java.lang.String pass,
           java.lang.Boolean status,
           java.lang.String tipo,
           java.lang.String usuario) {
           this.cad1 = cad1;
           this.cad2 = cad2;
           this.mensaje = mensaje;
           this.pass = pass;
           this.status = status;
           this.tipo = tipo;
           this.usuario = usuario;
    }


    /**
     * Gets the cad1 value for this BeanLogin.
     * 
     * @return cad1
     */
    public java.lang.String getCad1() {
        return cad1;
    }


    /**
     * Sets the cad1 value for this BeanLogin.
     * 
     * @param cad1
     */
    public void setCad1(java.lang.String cad1) {
        this.cad1 = cad1;
    }


    /**
     * Gets the cad2 value for this BeanLogin.
     * 
     * @return cad2
     */
    public java.lang.String getCad2() {
        return cad2;
    }


    /**
     * Sets the cad2 value for this BeanLogin.
     * 
     * @param cad2
     */
    public void setCad2(java.lang.String cad2) {
        this.cad2 = cad2;
    }


    /**
     * Gets the mensaje value for this BeanLogin.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this BeanLogin.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the pass value for this BeanLogin.
     * 
     * @return pass
     */
    public java.lang.String getPass() {
        return pass;
    }


    /**
     * Sets the pass value for this BeanLogin.
     * 
     * @param pass
     */
    public void setPass(java.lang.String pass) {
        this.pass = pass;
    }


    /**
     * Gets the status value for this BeanLogin.
     * 
     * @return status
     */
    public java.lang.Boolean getStatus() {
        return status;
    }


    /**
     * Sets the status value for this BeanLogin.
     * 
     * @param status
     */
    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }


    /**
     * Gets the tipo value for this BeanLogin.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this BeanLogin.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the usuario value for this BeanLogin.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this BeanLogin.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BeanLogin)) return false;
        BeanLogin other = (BeanLogin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cad1==null && other.getCad1()==null) || 
             (this.cad1!=null &&
              this.cad1.equals(other.getCad1()))) &&
            ((this.cad2==null && other.getCad2()==null) || 
             (this.cad2!=null &&
              this.cad2.equals(other.getCad2()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.pass==null && other.getPass()==null) || 
             (this.pass!=null &&
              this.pass.equals(other.getPass()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCad1() != null) {
            _hashCode += getCad1().hashCode();
        }
        if (getCad2() != null) {
            _hashCode += getCad2().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getPass() != null) {
            _hashCode += getPass().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BeanLogin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean.ws.b7f2.com", "BeanLogin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cad1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.ws.b7f2.com", "cad1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cad2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.ws.b7f2.com", "cad2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.ws.b7f2.com", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.ws.b7f2.com", "pass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.ws.b7f2.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.ws.b7f2.com", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bean.ws.b7f2.com", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
