package services.clients;

public class DevowelizerService extends AbstractService {

  private final DevowelizerApiClient apiClient;

  public DevowelizerService(String host) {
    super(host);
    this.apiClient = new DevowelizerApiClient(getHost());
  }

  public String getInput() {
    return apiClient.getInput();
  }

  public int getStatusCodeForHostPing() {
    return apiClient.get().getStatus();
  }
}
