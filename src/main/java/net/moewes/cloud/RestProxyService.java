package net.moewes.cloud;

import java.net.MalformedURLException;
import java.net.URL;
import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.RestClientBuilder;

@ApplicationScoped
public class RestProxyService {

  public <T> T getProxy(Class<T> proxyClass) {
    try {
      return RestClientBuilder.newBuilder()
          .baseUrl(new URL("http://localhost:8080/camunda/api"))
          /*
          .register((ClientRequestFilter) clientRequestContext -> {
            MultivaluedMap<String, Object> headers = clientRequestContext.getHeaders();
            headers.add("Authorization", "Bearer " + idToken.getRawToken());
          })
           */
          .build(proxyClass);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    return null;
  }

}
