package tests;

import helpers.StringHelper;
import org.junit.Assert;
import org.testng.annotations.Test;
import services.clients.DevowelizerService;

public class InputVowelsTests {

  String host = "http://localhost:8080";

  @Test
  public void healthCheckOfTheService() {
    DevowelizerService devowelizerService = new DevowelizerService(host);
    int statusCode = devowelizerService.getStatusCodeForHostPing();
    Assert.assertEquals(200, statusCode);
  }

  @Test
  public void testMissingVowelsTest() {
    DevowelizerService devowelizerService = new DevowelizerService(host);
    String input = devowelizerService.getInput();
    Assert.assertFalse(StringHelper.isVowelsInString(input));
  }

}
