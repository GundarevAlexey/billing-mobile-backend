package wg.rest.mobile.controller;

import javassist.tools.rmi.RemoteException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import wg.rest.mobile.dao.MobileDAO;
import wg.rest.mobile.expt.EpayException;
import wg.rest.mobile.util.Converter;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by BigMan on 28.02.2019.
 */
@Controller
@CrossOrigin
@Path("/archive")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ArchiveController {

    @Autowired
    private MobileDAO dao;

    private static final Logger logger = LoggerFactory.getLogger(ArchiveController.class);

    @GET
    public Response index() throws RemoteException {
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
            return do_request(keys.get(1) , keys.get(2), requestContext);

        } catch (Exception e) {
//            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }



    private Response do_request (String reqUUID, String ctlUID, HttpServletRequest requestContext) throws Exception {
        try {
            Converter converter = new Converter();

            String requestIP = (requestContext.getHeader("X-FORWARDED-FOR")!=null?
                    requestContext.getHeader("X-REAL-IP"):requestContext.getRemoteAddr());

            Object jsonObject = dao.getArchivedPayments(reqUUID, ctlUID, "ru", converter.getPMap(requestContext));
            return Response.status(Response.Status.OK).entity(jsonObject.toString()).build();
        } catch (EpayException ex) {
            return Response.status(Response.Status.BAD_REQUEST).entity(ex.getErrObj().toString()).build();
        }
    }
}
