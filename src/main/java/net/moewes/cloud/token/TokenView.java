package net.moewes.cloud.token;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("token")
public class TokenView extends Div {

  //@Inject
  //@IdToken
  public TokenView() {

    Anchor link = new Anchor();
    link.setHref("/vaadin");
    link.setText("Home");

    add(link);

    Div div = new Div();
    div.setText("Token");

    add(div);
  }

}
