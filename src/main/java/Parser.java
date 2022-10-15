import com.google.gson.Gson;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Parser {
    public static void main(String[] args) throws IOException {

        String link = "C:\\Users\\lolid\\Documents\\_Programming\\Java\\ParsingJson\\src\\main\\resources\\specification.json";

        String json = String.join(" ", Files.readAllLines(
                Paths.get(link),
                StandardCharsets.UTF_8)
        );

        Config config = new Gson().fromJson(json, Config.class);

        System.out.println(config.getId());
        System.out.println(config.getFullName().getName());
        System.out.println(config.getFullName().getSurname());
        System.out.println(config.getFullName().getPatronymic());
        System.out.println(config.getBerries());

    }
}
