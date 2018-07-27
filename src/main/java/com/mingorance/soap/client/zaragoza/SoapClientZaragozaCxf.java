package com.mingorance.soap.client.zaragoza;

import com.b7f2.ws.bean.BeanLogin;
import com.b7f2.ws.service.ImplLoginService;

import java.net.MalformedURLException;

public class SoapClientZaragozaCxf {

    public static void main(String... args) throws MalformedURLException {
        ImplLoginService implLoginService = new ImplLoginService();
        BeanLogin beanLogin = new BeanLogin();
        beanLogin.setCad1("xxx");
        beanLogin.setCad2("");
        beanLogin.setMensaje("");
        beanLogin.setPass("yyyyyy");
        beanLogin.setStatus(true);
        beanLogin.setTipo("json/M");
        beanLogin.setUsuario("zzzz");
        BeanLogin beanLogin1 = implLoginService.getImplLogin().validaLogin(beanLogin);
        System.out.println("Response: " + beanLogin1.getCad2());

    }
}
