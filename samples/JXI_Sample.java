import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class JXI_Sample {

    @GET
    @Path("/stuff")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON) 
    public Response loadStuff(Stuff s) {
        return Response.ok().build();
    }
    
    
    static class Stuff {
    }
}
