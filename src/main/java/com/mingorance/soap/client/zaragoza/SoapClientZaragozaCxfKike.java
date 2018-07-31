package com.mingorance.soap.client.zaragoza;

import com.b7f2.ws.generatebykike.bean.BeanLogin;
import com.b7f2.ws.generatebykike.service.ImplLoginService;

import java.net.MalformedURLException;
import java.net.URL;

public class SoapClientZaragozaCxfKike {

    public static void main(String... args) throws MalformedURLException {
        URL url = new URL("http://localhost:8088/mockImplLoginSoapBinding?wsdl");
        ImplLoginService implLoginService = new ImplLoginService(url);
        BeanLogin beanLogin = new BeanLogin();
        beanLogin.setCad1("5441FCZ");
        beanLogin.setCad2("");
        beanLogin.setMensaje("");
        beanLogin.setPass("UT9trnx8fh");
        beanLogin.setStatus(true);
        beanLogin.setTipo("json/M");
        beanLogin.setUsuario("BAnSaDAdELL@CzI6D18");
        BeanLogin beanLogin1 = implLoginService.getImplLogin().validaLogin(beanLogin);
        System.out.println("Response: " + beanLogin1.getCad2());

    }
}
