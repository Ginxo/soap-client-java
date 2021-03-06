package com.b7f2.ws.kike.generatebykike.service;

import com.b7f2.ws.kike.generatebykike.bean.BeanLogin;

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
@XmlSeeAlso({com.b7f2.ws.kike.generatebykike.bean.ObjectFactory.class, ObjectFactory.class})
public interface ImplLogin {

    @WebMethod
    @RequestWrapper(localName = "validaLogin", targetNamespace = "http://service.ws.b7f2.com", className = "ValidaLogin")
    @ResponseWrapper(localName = "validaLoginResponse", targetNamespace = "http://service.ws.b7f2.com", className = "ValidaLoginResponse")
    @WebResult(name = "validaLoginReturn", targetNamespace = "http://service.ws.b7f2.com")
    public BeanLogin validaLogin(
        @WebParam(name = "obj", targetNamespace = "http://service.ws.b7f2.com")
                BeanLogin obj
    );
}
