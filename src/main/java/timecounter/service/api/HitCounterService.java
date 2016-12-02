package timecounter.service.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import timecounter.service.api.vo.HitCounterInfo;


/**
 * Rest API for study management
 *
 * @author Dinesh.Joshi
 */
@Produces( MediaType.APPLICATION_JSON )
@Consumes( MediaType.APPLICATION_JSON )
public interface HitCounterService {

	/**
     * @return - HitCounterInfo Object that contains info about total hit to this service along with current timestamp
     * @unpublished
     */
    @GET
    @Path( "/hitcount" )
    HitCounterInfo getHitCount();
}
