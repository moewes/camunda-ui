package net.moewes.cloud.rest.camunda;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Produces({"application/json"})
@Path(ProcessDefinitionRestService.PATH)
public interface ProcessDefinitionRestService {

  String APPLICATION_BPMN20_XML = "application/bpmn20+xml";
  MediaType APPLICATION_BPMN20_XML_TYPE = new MediaType("application", "bpmn20+xml");
  String PATH = "/process-definition";

/*
  @Path("/{id}")
  ProcessDefinitionResource getProcessDefinitionById(@PathParam("id") String var1);

  @Path("/key/{key}")
  ProcessDefinitionResource getProcessDefinitionByKey(@PathParam("key") String var1);

  @Path("/key/{key}/tenant-id/{tenantId}")
  ProcessDefinitionResource getProcessDefinitionByKeyAndTenantId(@PathParam("key") String var1,
      @PathParam("tenantId") String var2);
*/

  @GET
  @Produces({"application/json"})
  List<ProcessDefinitionModel> getProcessDefinitions();
/*
  @GET
  @Path("/count")
  @Produces({"application/json"})
  CountResultDto getProcessDefinitionsCount(@Context UriInfo var1);
 */

  /*
  @GET
  @Path("/statistics")
  @Produces({"application/json"})
  List<StatisticsResultDto> getStatistics(@QueryParam("failedJobs") Boolean var1,
      @QueryParam("rootIncidents") Boolean var2, @QueryParam("incidents") Boolean var3,
      @QueryParam("incidentsForType") String var4);

  @PUT
  @Path("/suspended")
  @Consumes({"application/json"})
  void updateSuspensionState(ProcessDefinitionSuspensionStateDto var1);

  @DELETE
  @Path("/key/{key}/delete")
  void deleteProcessDefinitionsByKey(@PathParam("key") String var1,
      @QueryParam("cascade") boolean var2, @QueryParam("skipCustomListeners") boolean var3,
      @QueryParam("skipIoMappings") boolean var4);

  @DELETE
  @Path("/key/{key}/tenant-id/{tenantId}/delete")
  void deleteProcessDefinitionsByKeyAndTenantId(@PathParam("key") String var1,
      @QueryParam("cascade") boolean var2, @QueryParam("skipCustomListeners") boolean var3,
      @QueryParam("skipIoMappings") boolean var4, @PathParam("tenantId") String var5);
   */
}


