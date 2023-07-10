package com.soap.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.soap.wsdl.AddResponse;
import com.soap.wsdl.Divide;
import com.soap.wsdl.DivideResponse;
import com.soap.wsdl.Multiply;
import com.soap.wsdl.MultiplyResponse;
import com.soap.wsdl.Subtract;
import com.soap.wsdl.SubtractResponse;
import com.soap.wsdl.Add;

public class SoapClient extends WebServiceGatewaySupport {
    
    /**
     * Metodo para sumar dos numeros
     * @param numberA
     * @param numberB
     * @return
     */
    public AddResponse getAddResponse(int numberA, int numberB) {
        Add addRequest = new Add();
        addRequest.setIntA(numberA);
        addRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");

        AddResponse addResponse = (AddResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", addRequest, soapActionCallback);

        return addResponse;
    }

    /**
     * Metodo que sirve para restar dos numeros
     * @param numberA
     * @param numberB
     * @return
     */
    public SubtractResponse getSubtractResponse(int numberA, int numberB) {
        Subtract subtractRequest = new Subtract();
        subtractRequest.setIntA(numberA);
        subtractRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");

        SubtractResponse subtractResponse = (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", subtractRequest, soapActionCallback);

        return subtractResponse;
    }

    /**
     * Metodo para multiplicar dos numeros
     * @param numberA
     * @param numberB
     * @return
     */
    public MultiplyResponse getMultiplyResponse(int numberA, int numberB) {
        Multiply multiplyRequest = new Multiply();
        multiplyRequest.setIntA(numberA);
        multiplyRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");

        MultiplyResponse multiplyResponse = (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", multiplyRequest, soapActionCallback);

        return multiplyResponse;
    }

    /**
     * Metodo que sirve para dividir dos numeros
     * @param numberA
     * @param numberB
     * @return
     */
    public DivideResponse getDivideResponse(int numberA, int numberB) {
        Divide divideRequest = new Divide();
        divideRequest.setIntA(numberA);
        divideRequest.setIntB(numberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");

        DivideResponse divideResponseResponse = (DivideResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", divideRequest, soapActionCallback);

        return divideResponseResponse;
    }
}
