package wg.rest.mobile.services.upay;

import com.apus.st.*;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wg.rest.mobile.dao.MobileDAO_Impl;

import java.util.Date;

@Service
public class UpayService {

    @Autowired
    private UpayClient client;

    private static final Logger logger = LoggerFactory.getLogger(UpayService.class);

    Gson gson = new Gson();

    public PrepaymentResponse prepaymentResponse(Prepayment data) {
        logger.warn("request -- {}", gson.toJson(data));
        Prepayment.PrepaymentRequest request = data.getPrepaymentRequest();

        Prepayment prepayment  = new Prepayment();
        Prepayment.PrepaymentRequest prepaymentRequest = new Prepayment.PrepaymentRequest();

        prepaymentRequest.setStPimsApiPartnerKey(UpayConst.KEY);
        prepaymentRequest.setPhoneNumber(request.getPhoneNumber());
        prepaymentRequest.setCardNumber(request.getCardNumber());
        prepaymentRequest.setCardExpireDate(request.getCardExpireDate());
        prepaymentRequest.setServiceId(UpayConst.SERVICE_645);
        prepaymentRequest.setPersonalAccount(request.getPersonalAccount()+":"+request.getPaymentType()+":"+request.getPaymentDateFrom()+":"+request.getPaymentDateTo());
        prepaymentRequest.setPaymentAmount(request.getPaymentAmount());
        prepaymentRequest.setPartnerDate(new Date().getTime());

        prepayment.setPrepaymentRequest(prepaymentRequest);

        ObjectFactory obj = new ObjectFactory();
        PrepaymentResponse prepaymentResponse = client.prepayment(UpayConst.WSDL_URL, obj.createPrepayment(prepayment));

        logger.warn("response -- {}", gson.toJson(prepaymentResponse));
        return prepaymentResponse;

    }

    public ConfirmPaymentResponse confirmPaymentResponse(ConfirmPayment confirmPayment) {
        logger.warn("request -- {}", gson.toJson(confirmPayment));
        confirmPayment.getConfirmPaymentRequest().setStPimsApiPartnerKey(UpayConst.KEY);

        ObjectFactory obj = new ObjectFactory();
        ConfirmPaymentResponse confirmPaymentResponse = client.confirmPayment(UpayConst.WSDL_URL, obj.createConfirmPayment(confirmPayment));
        logger.warn("response -- {}", gson.toJson(confirmPaymentResponse));
        return confirmPaymentResponse;

    }

}