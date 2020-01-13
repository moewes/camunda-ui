package net.moewes.cloud.process;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import javax.inject.Inject;

@Route("processes")
public class ProcessesView extends VerticalLayout {

  private Grid<ProcessDefinition> grid;
  private Div title = new Div();
  private ProcessService service;

  @Inject
  public ProcessesView(ProcessService service) {

    this.service = service;

    title.setText("Processes");
    add(title);

    grid = new Grid<>();

    grid.addColumn(ProcessDefinition::getKey).setHeader("Key");
    grid.addColumn(ProcessDefinition::getName).setHeader("Name");

    grid.setItems(service.getProcesse());
    add(grid);
  }

}
