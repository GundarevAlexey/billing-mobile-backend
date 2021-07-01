package wg.rest.mobile.controller;

import com.apus.st.STWSStub;
import com.apus.st.Test;
import org.apache.axis2.AxisFault;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import wg.rest.mobile.config.filter.TokenSecured;
import wg.rest.mobile.dao.MobileDAO;
import wg.rest.mobile.expt.EpayException;
import wg.rest.mobile.util.Converter;
import wg.rest.mobile.util.TokenKit;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by BigMan on 28.02.2019.
 */
@Controller
@CrossOrigin
@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PayController {

    @Autowired
    private MobileDAO dao;

    @GET
    public Response index() throws RemoteException {
        STWSStub st = new STWSStub();
        Test t = new Test();
        Test.TestRequest testRequest = new Test.TestRequest();
        testRequest.setLang("en");
        testRequest.setPhoneNumber("997961883");
        testRequest.setStPimsApiPartnerKey("2A084E55C87B1EBCDAAD1F62FDBBAC8E");
        testRequest.setVersion("1");
        t.setTestRequest(testRequest);
        st.test(t);
        return Response.ok().build();
    }




    @POST
    @Path("/{type}/{token}")
    public Response ident(

            @Context HttpServletRequest requestContext,
                          @Context HttpHeaders headers


    ) {
        try {
            List<String> keys = Arrays.stream(requestContext.getPathInfo().split("/")).filter(et -> !et.isEmpty()).collect(Collectors.toList());
            return do_request(keys.get(0) , keys.get(1), requestContext);

        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }



    private Response do_request (String reqUUID, String ctlUID, HttpServletRequest requestContext) throws Exception {
        try {
            Converter converter = new Converter();

            String requestIP = (requestContext.getHeader("X-FORWARDED-FOR")!=null?
                    requestContext.getHeader("X-REAL-IP"):requestContext.getRemoteAddr());

            Object jsonObject = dao.make_request(reqUUID, ctlUID, "ru", converter.getPMap(requestContext));
            return Response.status(Response.Status.OK).entity(jsonObject.toString()).build();
        } catch (EpayException ex) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ex.getErrObj().toString()).build();
        }
    }
}
