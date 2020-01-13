package net.moewes.cloud.process;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import net.moewes.cloud.RestProxyService;
import net.moewes.cloud.rest.camunda.ProcessDefinitionModel;
import net.moewes.cloud.rest.camunda.ProcessDefinitionRestService;

@SessionScoped
public class ProcessService implements Serializable {

  @Inject
  RestProxyService restProxyService;

  public List<ProcessDefinition> getProcesse() {

    ProcessDefinitionRestService service = restProxyService
        .getProxy(ProcessDefinitionRestService.class);

    List<ProcessDefinitionModel> processDefinitions = service.getProcessDefinitions();

    List<ProcessDefinition> result = new ArrayList<>();

    for (ProcessDefinitionModel model : processDefinitions) {
      ProcessDefinition pd = new ProcessDefinition();
      pd.setName(model.getName());
      pd.setKey(model.getKey());
      result.add(pd);
    }

    return result;
  }
}
