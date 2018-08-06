package com.b7f2.ws.kike.service;

import com.b7f2.ws.kike.bean.BeanLogin;

public class ImplLoginProxy implements ImplLogin {
    private String _endpoint = null;
    private ImplLogin implLogin = null;

    public ImplLoginProxy() {
        _initImplLoginProxy();
    }

    public ImplLoginProxy(String endpoint) {
        _endpoint = endpoint;
        _initImplLoginProxy();
    }

    private void _initImplLoginProxy() {
        try {
            implLogin = (new ImplLoginServiceLocator()).getImplLogin();
            if (implLogin != null) {
                if (_endpoint != null)
                    ((javax.xml.rpc.Stub)implLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
                else
                    _endpoint = (String)((javax.xml.rpc.Stub)implLogin)._getProperty("javax.xml.rpc.service.endpoint.address");
            }

        }
        catch (javax.xml.rpc.ServiceException serviceException) {}
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public void setEndpoint(String endpoint) {
        _endpoint = endpoint;
        if (implLogin != null)
            ((javax.xml.rpc.Stub)implLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

    }

    public ImplLogin getImplLogin() {
        if (implLogin == null)
            _initImplLoginProxy();
        return implLogin;
    }

    public BeanLogin validaLogin(BeanLogin obj) throws java.rmi.RemoteException{
        if (implLogin == null)
            _initImplLoginProxy();
        return implLogin.validaLogin(obj);
    }


}