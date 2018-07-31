package com.b7f2.ws.service;

public class ImplLoginProxy implements com.b7f2.ws.service.ImplLogin {
    private String _endpoint = null;
    private String _proxyAddress = null;
    private int _proxyPort = 0;
    private com.b7f2.ws.service.ImplLogin implLogin = null;

    public ImplLoginProxy() {
        _initImplLoginProxy();
    }

    public ImplLoginProxy(String endpoint, String proxyAddress, int proxyPort) {
        _endpoint = endpoint;
        _proxyAddress = proxyAddress;
        _proxyPort = proxyPort;
        _initImplLoginProxy();
    }

    private void _initImplLoginProxy() {
        try {
            implLogin = (new com.b7f2.ws.service.ImplLoginServiceLocator()).getImplLogin();
            if (implLogin != null) {
                if (_endpoint != null)
                    ((javax.xml.rpc.Stub) implLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
                else
                    _endpoint = (String) ((javax.xml.rpc.Stub) implLogin)._getProperty("javax.xml.rpc.service.endpoint.address");
            }

        } catch (javax.xml.rpc.ServiceException serviceException) {
        }
    }

    public String getEndpoint() {
        return _endpoint;
    }

    public void setEndpoint(String endpoint) {
        _endpoint = endpoint;
        if (implLogin != null)
            ((javax.xml.rpc.Stub) implLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

    }

    public com.b7f2.ws.service.ImplLogin getImplLogin() {
        if (implLogin == null)
            _initImplLoginProxy();
        return implLogin;
    }

    public com.b7f2.ws.bean.BeanLogin validaLogin(com.b7f2.ws.bean.BeanLogin obj) throws java.rmi.RemoteException {
        if (implLogin == null)
            _initImplLoginProxy();
        return implLogin.validaLogin(obj);
    }


}