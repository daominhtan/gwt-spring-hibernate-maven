package com.gemalto.latamsoft.oi.brasil.callcenter.cxf.client2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.3
 * Wed Jun 05 17:04:38 ART 2013
 * Generated source version: 2.2.3
 * 
 */
 
@WebService(targetNamespace = "http://alsb.telemar/xsd", name = "RecuperarCompraAvulsaWs")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RecuperarCompraAvulsaWs {

    @WebResult(name = "RecuperarCompraAvulsaResponse", targetNamespace = "http://alsb.telemar/xsd", partName = "parameters")
    @WebMethod(operationName = "RecuperarCompraAvulsa")
    public RecuperarCompraAvulsaResponse recuperarCompraAvulsa(
        @WebParam(partName = "parameters", name = "RecuperarCompraAvulsa", targetNamespace = "http://alsb.telemar/xsd")
        RecuperarCompraAvulsa parameters
    );
}
