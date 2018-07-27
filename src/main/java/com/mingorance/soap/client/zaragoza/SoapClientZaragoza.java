package com.mingorance.soap.client.zaragoza;

import java.net.MalformedURLException;
import java.net.URL;

public class SoapClientZaragoza {

    public static void main(String... args) throws MalformedURLException {
        URL url = new URL("http://localhost:8088/mockImplLoginSoapBinding?wsdl");
        ImplLoginService service = new ImplLoginService(url);
        BeanLogin beanLogin = new BeanLogin();
        beanLogin.setCad1("5441FCZ");
        beanLogin.setCad2("");
        beanLogin.setMensaje("");
        beanLogin.setPass("UT9trnx8fh");
        beanLogin.setStatus(true);
        beanLogin.setTipo("json/M");
        beanLogin.setUsuario("BAnSaDAdELL@CzI6D18");
        Object validaLoginResponse = service.getImplLogin().validaLogin(beanLogin);
        String pepe="";

    }
}
