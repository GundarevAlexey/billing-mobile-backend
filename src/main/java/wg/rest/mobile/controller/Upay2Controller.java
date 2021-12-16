package wg.rest.mobile.controller;

import com.apus.st.ConfirmPayment;
import com.apus.st.ConfirmPaymentResponse;
import com.apus.st.Prepayment;
import com.apus.st.PrepaymentResponse;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import wg.rest.mobile.dao.MobileDAO;
import wg.rest.mobile.dto.RequestData;
import wg.rest.mobile.services.upay.UpayService;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import java.util.HashMap;

@Controller
@CrossOrigin
@Path("/upay2")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Upay2Controller {

    @Autowired
    private UpayService service;

    @Autowired
    private MobileDAO dao;

    @GET
    public Response index(@Context HttpServletRequest requestContext,@RequestBody Request request){
        RequestData rd = new RequestData();
        rd.setData("test");
        Gson gson = new Gson();


//        String pid = requestContext.getHeader("pid");
//        String aacc = requestContext.getHeader("aacc");
//        dao.paymentInspector(pid,aacc,gson.toJson(rd),"upay");
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
    public Response confirmPayment(@Context HttpServletRequest requestContext, @RequestBody ConfirmPayment request){

        ConfirmPaymentResponse confirmPaymentResponse = service.confirmPaymentResponse(request);
        HashMap<String, Object> body = new HashMap<>();

        body.put("data", confirmPaymentResponse.getReturn());

        String pid = requestContext.getHeader("pid");
        String aacc = requestContext.getHeader("aacc");
        dao.paymentInspector(pid,aacc,new Gson().toJson(body.get("data")) ,"upay");

        return Response.ok(body).build();
    }

}
