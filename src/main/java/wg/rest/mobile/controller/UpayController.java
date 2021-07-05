package wg.rest.mobile.controller;

import com.apus.st.ConfirmPayment;
import com.apus.st.Prepayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import wg.rest.mobile.services.upay.UpayService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
    public HttpEntity<?> prepayment(@RequestBody Prepayment request){

        return ResponseEntity.ok(service.prepaymentResponse(request));
    }
    @POST
    @Path("/confirm-payment")
    public HttpEntity<?> confirmPayment(@RequestBody ConfirmPayment request){

        return ResponseEntity.ok(service.confirmPaymentResponse(request));
    }

}
