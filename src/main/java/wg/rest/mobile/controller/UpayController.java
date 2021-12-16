package wg.rest.mobile.controller;

import com.apus.st.ConfirmPayment;
import com.apus.st.ConfirmPaymentResponse;
import com.apus.st.Prepayment;
import com.apus.st.PrepaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import wg.rest.mobile.services.upay.UpayService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;

@Controller
@CrossOrigin
@Path("/upay")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UpayController {

    @Autowired
    private UpayService service;

    @GET
    public Response index(){
        return Response.ok().build();
    }

    @POST
    @Path("/prepayment")
    public Response prepayment(@RequestBody Prepayment request){
        try {
            request.getPrepaymentRequest().setPaymentAmount(request.getPrepaymentRequest().getPaymentAmount().replaceAll(" ", ""));
        } catch (Exception e) {}

        PrepaymentResponse prepaymentResponse = service.prepaymentResponse(request);

        HashMap<String, Object> body = new HashMap<>();

        body.put("data", prepaymentResponse.getReturn());

        return Response.ok(body).build();
    }
    @POST
    @Path("/confirm-payment")
    public Response confirmPayment(@RequestBody ConfirmPayment request){

        ConfirmPaymentResponse confirmPaymentResponse = service.confirmPaymentResponse(request);
        HashMap<String, Object> body = new HashMap<>();

        body.put("data", confirmPaymentResponse.getReturn());

        return Response.ok(body).build();
    }

}
