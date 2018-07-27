package com.mingorance.soap.client.zaragoza;

import java.net.MalformedURLException;

public class SoapClientZaragoza {

    public static void main(String... args) throws MalformedURLException {
        ImplLoginService service = new ImplLoginService();
        BeanLogin beanLogin = new BeanLogin();
        beanLogin.setCad1("MATRICULA");
        beanLogin.setCad2("");
        beanLogin.setMensaje("");
        beanLogin.setPass("xxxx");
        beanLogin.setStatus(true);
        beanLogin.setTipo("json/M");
        beanLogin.setUsuario("yyyy");
        Object validaLoginResponse = service.getImplLogin().validaLogin(beanLogin);
        String pepe = "";

    }
}
