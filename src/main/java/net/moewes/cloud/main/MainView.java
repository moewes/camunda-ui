package net.moewes.cloud.main;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import net.moewes.cloud.process.ProcessesView;
import net.moewes.cloud.token.TokenView;

@Route("")
public class MainView extends VerticalLayout {

  public MainView() {

    H1 title = new H1("Camunda POC");
    add(title);
    H2 subtitle = new H2("Funktionen");
    add(subtitle);
    H2 adminSubtitle = new H2("Administration");
    add(adminSubtitle);
    add(new RouterLink("Prozese", ProcessesView.class));
    add(new RouterLink("Token", TokenView.class));
  }
}
