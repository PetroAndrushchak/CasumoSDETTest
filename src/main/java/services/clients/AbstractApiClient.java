package services.clients;

import helpers.DataParser;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;

abstract class AbstractApiClient {

  private WebTarget webTarget;

  AbstractApiClient(String url) {
    ClientConfig config = new ClientConfig()
        .register(new LoggingFeature(Logger.getLogger(LoggingFeature.DEFAULT_LOGGER_NAME),
            Level.INFO, LoggingFeature.Verbosity.PAYLOAD_ANY, 10000))
        .register((MultiPartFeature.class));

    this.webTarget = ClientBuilder
        .newClient(config)
        .target(url);
  }

  Response get(String path) {
    WebTarget webTarget = this.webTarget.path(path);
    return webTarget.request(MediaType.APPLICATION_JSON).get();
  }

  protected <T> T parseResponse(Response response, Type type) {
    return DataParser.parseString(response.readEntity(String.class), type);
  }
}
