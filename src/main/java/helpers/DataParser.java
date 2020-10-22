package helpers;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.util.Objects;

public class DataParser {

  private DataParser() {
    throw new UnsupportedOperationException();
  }

  public static <T> T parseFileAsObject(Path path, Class<T> classOfT) {
    Gson gson = new Gson();
    BufferedReader bufferedReader;
    try {
      bufferedReader = new BufferedReader(new FileReader(path.toFile()));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      throw new RuntimeException("Can't find file with path: " + path.toFile().getPath());
    }
    return gson.fromJson(Objects.requireNonNull(bufferedReader), classOfT);
  }

  public static <T> T parseString(String json, Type type) {
    return new Gson().fromJson(Objects.requireNonNull(json), type);
  }

  public static String parseObjectToJson(Object object) {
    return new Gson().toJson(object);
  }
}
