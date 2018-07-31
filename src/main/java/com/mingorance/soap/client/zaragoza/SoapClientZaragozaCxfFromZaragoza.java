package com.mingorance.soap.client.zaragoza;

import com.b7f2.ws.bean.BeanLogin;
import com.b7f2.ws.service.ImplLoginProxy;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class SoapClientZaragozaCxfFromZaragoza {

    public static void main(String... args) throws MalformedURLException, RemoteException {
        System.setProperty("https.proxyHost", "cache.bancsabadell.com");
        System.setProperty("https.proxyPort", "8080");

        ImplLoginProxy implLoginServiceProxy = new ImplLoginProxy("https://www.czidconnect.es:8443/messenger/services/ImplLogin", "cache.bancsabadell.com", 8080);

        BeanLogin beanLogin = new BeanLogin();
        beanLogin.setCad1("XXXXX");
        beanLogin.setCad2("");
        beanLogin.setMensaje("");
        beanLogin.setPass("PASSS");
        beanLogin.setStatus(true);
        beanLogin.setTipo("json/M");
        beanLogin.setUsuario("USER");
        BeanLogin beanLogin1 = implLoginServiceProxy.getImplLogin().validaLogin(beanLogin);
        System.out.println("Response: " + beanLogin1.getCad2());

    }
}
