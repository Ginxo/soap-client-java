package com.mingorance.soap.client.zaragoza;

import com.b7f2.ws.kike.bean.BeanLogin;
import com.b7f2.ws.kike.service.ImplLoginProxy;
import org.apache.axis.AxisProperties;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class SoapClientZaragozaCxfFromZaragoza {

    public static void main(String... args) throws MalformedURLException, RemoteException {
//        System.setProperty("https.proxyHost", "cache.bancsabadell.com");
//        System.setProperty("https.proxyPort", "8080");
//
        AxisProperties.getProperties().put("proxySet","true");
        AxisProperties.setProperty("http.proxyHost", "cache.bancsabadell.com");
        AxisProperties.setProperty("http.proxyPort", "8080");

        ImplLoginProxy implLoginServiceProxy = new ImplLoginProxy("https://www.czidconnect.es:8443/messenger/services/ImplLogin");

        BeanLogin beanLogin = new BeanLogin();
        beanLogin.setCad1("1234GGG");
        beanLogin.setCad2("");
        beanLogin.setMensaje("");
        beanLogin.setPass("PASS");
        beanLogin.setStatus(true);
        beanLogin.setTipo("json/M");
        beanLogin.setUsuario("USER");
        BeanLogin beanLogin1 = implLoginServiceProxy.getImplLogin().validaLogin(beanLogin);
        System.out.println("Response: " + beanLogin1.getCad2());

    }
}
