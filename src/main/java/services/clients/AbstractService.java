package services.clients;

class AbstractService {

  private final String host;

  AbstractService(String serviceHost) {
    this.host = serviceHost;
  }

  String getHost() {
    return this.host;
  }
}
