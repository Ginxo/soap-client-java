package com.b7f2.ws.generatebykike.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-07-27T13:20:45.191+02:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "http://service.ws.b7f2.com", name = "ImplLogin")
@XmlSeeAlso({com.b7f2.ws.generatebykike.bean.ObjectFactory.class, ObjectFactory.class})
public interface ImplLogin {

    @WebMethod
    @RequestWrapper(localName = "validaLogin", targetNamespace = "http://service.ws.b7f2.com", className = "com.b7f2.ws.generatebykike.service.ValidaLogin")
    @ResponseWrapper(localName = "validaLoginResponse", targetNamespace = "http://service.ws.b7f2.com", className = "com.b7f2.ws.generatebykike.service.ValidaLoginResponse")
    @WebResult(name = "validaLoginReturn", targetNamespace = "http://service.ws.b7f2.com")
    public com.b7f2.ws.generatebykike.bean.BeanLogin validaLogin(
        @WebParam(name = "obj", targetNamespace = "http://service.ws.b7f2.com")
        com.b7f2.ws.generatebykike.bean.BeanLogin obj
    );
}