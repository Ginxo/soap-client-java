
package com.b7f2.ws.kike.generatebykike.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import com.b7f2.ws.kike.generatebykike.bean.BeanLogin;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2018-07-27T13:20:45.098+02:00
 * Generated source version: 3.1.4
 * 
 */
public final class ImplLogin_ImplLogin_Client {

    private static final QName SERVICE_NAME = new QName("http://service.ws.b7f2.com", "ImplLoginService");

    private ImplLogin_ImplLogin_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ImplLoginService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ImplLoginService ss = new ImplLoginService(wsdlURL, SERVICE_NAME);
        ImplLogin port = ss.getImplLogin();  
        
        {
        System.out.println("Invoking validaLogin...");
        BeanLogin _validaLogin_obj = null;
        BeanLogin _validaLogin__return = port.validaLogin(_validaLogin_obj);
        System.out.println("validaLogin.result=" + _validaLogin__return);


        }

        System.exit(0);
    }

}