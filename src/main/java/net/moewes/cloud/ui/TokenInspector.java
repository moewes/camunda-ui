package net.moewes.cloud.ui;

import java.net.MalformedURLException;
import java.net.URL;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.eclipse.microprofile.rest.client.RestClientBuilder;

@Path("/tokens")
public class TokenInspector {

  // @Inject
  // SecurityIdentity identity;

  /**
   * Injection point for the ID Token issued by the OpenID Connect Provider
   */
  //@Inject
  //@IdToken
  //JsonWebToken idToken;

  /**
   * Injection point for the Access Token issued by the OpenID Connect Provider
   */
  //@Inject
  //JsonWebToken accessToken;

  /**
   * Injection point for the Refresh Token issued by the OpenID Connect Provider
   */
  // @Inject
  //RefreshToken refreshToken;

  /**
   * Returns the tokens available to the application. This endpoint exists only for demonstration
   * purposes, you should not expose these tokens in a real application.
   *
   * @return a map containing the tokens available to the application
   */
  @GET
  public String getTokens() {
    StringBuilder response = new StringBuilder().append("<html>")
        .append("<body>")
        .append("<ul>");

    //Object userName = this.idToken.getClaim("preferred_username");
/*
    if (userName != null) {
      response.append("<li>username: ").append(userName.toString()).append("</li>");
    }

    Object scopes = this.accessToken.getClaim("scope");

    if (scopes != null) {
      response.append("<li>scopes: ").append(scopes.toString()).append("</li>");
    }
    response.append(accessToken.getRawToken());

    response.append("<li>refresh_token: ").append(refreshToken.getToken() != null).append("</li>");
*/
    return response.append("</ul>").append("</body>").append("</html>").toString();
  }

  @Path("remote")
  @GET
  public String getRemoteTokens() {
    String response = "n.a.";

    try {
      Service build = RestClientBuilder.newBuilder()
          .baseUrl(new URL("http://localhost:8080/camunda/api"))
          /*
          .register((ClientRequestFilter) clientRequestContext -> {
            MultivaluedMap<String, Object> headers = clientRequestContext.getHeaders();
            headers.add("Authorization", "Bearer " + idToken.getRawToken());
          })
           */
          .build(Service.class);

      response = build.getTokens();

    } catch (MalformedURLException e) {
      e.printStackTrace();
    }

    return response;
  }
}