package wg.rest.mobile.controller;

import com.apus.st.ConfirmPayment;
import com.apus.st.Prepayment;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Response prepayment(@RequestBody Prepayment request){

        return Response.ok(service.prepaymentResponse(request)).build();
    }
    @POST
    @Path("/confirm-payment")
    public Response confirmPayment(@RequestBody ConfirmPayment request){

        return Response.ok(service.confirmPaymentResponse(request)).build();
    }

}
