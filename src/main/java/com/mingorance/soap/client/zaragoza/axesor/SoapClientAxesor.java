package com.mingorance.soap.client.zaragoza.axesor;

import java.net.MalformedURLException;

public class SoapClientAxesor {

    public static void main(String... args) throws MalformedURLException {
        QualitasWebServices qualitasWebServices = new QualitasWebServices();
        String message = "<SolicitudEnriquecimientoDirecciones>\n" +
                "         <Producto>EnriquecimientoDireccionesSabadell</Producto>\n" +
                "         <Direccion>CLL BRASIL</Direccion>\n" +
                "         <NumeroVia>1</NumeroVia>\n" +
                "         <Bloque></Bloque>\n" +
                "         <Escalera></Escalera>\n" +
                "         <Piso></Piso>\n" +
                "         <Puerta></Puerta>\n" +
                "         <RestoVia></RestoVia>\n" +
                "         <CodigoPostal>28341</CodigoPostal>\n" +
                "         <Poblacion>VALDEMORO</Poblacion>\n" +
                "         <Provincia>MADRID</Provincia>\n" +
                "         </SolicitudEnriquecimientoDirecciones>";
        String request = "<![CDATA[" + message + "]]>";
        String s = qualitasWebServices.getQualitasWebServicesSoap().atenderPeticion("dgmxsabadell06", "uznag3qw", message);
        System.out.println(s);
    }
}
