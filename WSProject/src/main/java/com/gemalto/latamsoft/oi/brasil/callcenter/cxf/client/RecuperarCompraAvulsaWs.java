package com.gemalto.latamsoft.oi.brasil.callcenter.cxf.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.3
 * Mon Jun 03 19:57:16 ART 2013
 * Generated source version: 2.2.3
 * 
 */
 
@WebService(targetNamespace = "http://ws.callcenter.brasil.oi.latamsoft.gemalto.com/", name = "RecuperarCompraAvulsaWs")
@XmlSeeAlso({ObjectFactory.class})
public interface RecuperarCompraAvulsaWs {

    @WebResult(name = "RecuperarCompraAvulsaResponse", targetNamespace = "")
    @RequestWrapper(localName = "RecuperarCompraAvulsa", targetNamespace = "http://ws.callcenter.brasil.oi.latamsoft.gemalto.com/", className = "com.gemalto.latamsoft.oi.brasil.callcenter.cxf.client.RecuperarCompraAvulsa")
    @ResponseWrapper(localName = "RecuperarCompraAvulsaResponse", targetNamespace = "http://ws.callcenter.brasil.oi.latamsoft.gemalto.com/", className = "com.gemalto.latamsoft.oi.brasil.callcenter.cxf.client.RecuperarCompraAvulsaResponse")
    @WebMethod(operationName = "RecuperarCompraAvulsa")
    public com.gemalto.latamsoft.oi.brasil.callcenter.cxf.client.RecuperarCompraAvulsaResponseType recuperarCompraAvulsa(
        @WebParam(name = "RecuperarCompraAvulsaRequest", targetNamespace = "")
        com.gemalto.latamsoft.oi.brasil.callcenter.cxf.client.RecuperarCompraAvulsaRequestType recuperarCompraAvulsaRequest
    );
}
