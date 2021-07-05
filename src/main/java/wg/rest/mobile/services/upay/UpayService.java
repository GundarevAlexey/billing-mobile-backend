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

        ObjectFactory obj = new ObjectFactory();
        PrepaymentResponse prepaymentResponse = client.prepayment(UpayConst.WSDL_URL, obj.createPrepayment(prepayment));

        return prepaymentResponse;

    }

    public ConfirmPaymentResponse confirmPaymentResponse(ConfirmPayment confirmPayment) {

        ObjectFactory obj = new ObjectFactory();
        ConfirmPaymentResponse confirmPaymentResponse = client.confirmPayment(UpayConst.WSDL_URL, obj.createConfirmPayment(confirmPayment));

        return confirmPaymentResponse;

    }

}