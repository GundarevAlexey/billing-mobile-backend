package wg.rest.mobile.services.upay;

import com.apus.st.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UpayService {

    @Autowired
    private UpayClient client;


    public PrepaymentResponse prepaymentResponse(Prepayment prepayment) {

        prepayment.getPrepaymentRequest().setStPimsApiPartnerKey(UpayConst.KEY);
        prepayment.getPrepaymentRequest().setServiceId(UpayConst.SERVICE_262);
        prepayment.getPrepaymentRequest().setPartnerDate(new Date().getTime());

        ObjectFactory obj = new ObjectFactory();
        PrepaymentResponse prepaymentResponse = client.prepayment(UpayConst.WSDL_URL, obj.createPrepayment(prepayment));

        return prepaymentResponse;

    }

    public ConfirmPaymentResponse confirmPaymentResponse(ConfirmPayment confirmPayment) {

        confirmPayment.getConfirmPaymentRequest().setStPimsApiPartnerKey(UpayConst.KEY);

        ObjectFactory obj = new ObjectFactory();
        ConfirmPaymentResponse confirmPaymentResponse = client.confirmPayment(UpayConst.WSDL_URL, obj.createConfirmPayment(confirmPayment));

        return confirmPaymentResponse;

    }

}