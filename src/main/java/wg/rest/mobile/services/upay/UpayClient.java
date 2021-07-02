package wg.rest.mobile.services.upay;

import com.apus.st.ConfirmPaymentResponse;
import com.apus.st.PrepaymentResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

public class UpayClient extends WebServiceGatewaySupport {

    public PrepaymentResponse prepayment(String url, Object request){
        JAXBElement<PrepaymentResponse> response = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return response.getValue();
    }

    public ConfirmPaymentResponse confirmPayment(String url, Object request){
        JAXBElement<ConfirmPaymentResponse> response = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return response.getValue();
    }

}

