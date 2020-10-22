package services.clients;

import javax.ws.rs.core.Response;

public class DevowelizerApiClient extends AbstractApiClient {

  DevowelizerApiClient(String url) {
    super(url);
  }

  public String getInput() {
    String path = "input";
    Response response = get(path);
    return parseResponse(response, String.class);
  }

  public Response get() {
    return super.get("");
  }

}
