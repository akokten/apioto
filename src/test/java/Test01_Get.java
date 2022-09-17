import io.restassured.RestAssured;
import kong.unirest.GetRequest;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import net.bytebuddy.description.ByteCodeElement;
import org.testng.annotations.Test;
import io.restassured.response.Response;


public class Test01_Get {

    @Test
    void aCreateBoard(){

        HttpResponse<String> response = Unirest.post("https://api.trello.com/1/boards/")
                .queryString("name", "{TestBoard}")
                .queryString("key", "c0600ab20b9d82f70bdbc18d078e1150")
                .queryString("token", "22194a2a693956d491578fa65e8e48715b4be23045072ffbf494476b1d20c690")
                .asString();

        System.out.println(response.getBody());
}


    @Test
    void bGetBoard() {

        HttpResponse<JsonNode> response = Unirest.get("https://api.trello.com/1/boards/63257c6b9c52230366753cb7/")
                .header("Accept", "application/json")
                .queryString("key", "c0600ab20b9d82f70bdbc18d078e1150")
                .queryString("token", "22194a2a693956d491578fa65e8e48715b4be23045072ffbf494476b1d20c690")
                .asJson();

        System.out.println(response.getBody());
        }

    @Test
    void cCreateCard() {

        HttpResponse<JsonNode> response = Unirest.post("https://api.trello.com/1/cards")
                .header("Accept", "application/json")
                .queryString("idList", "63257c6b9c52230366753cbe")
                .queryString("key", "c0600ab20b9d82f70bdbc18d078e1150")
                .queryString("token", "22194a2a693956d491578fa65e8e48715b4be23045072ffbf494476b1d20c690")
                .asJson();

        System.out.println(response.getBody());
    }
    @Test
    void dGetCart() {

        HttpResponse<JsonNode> response = Unirest.get("https://api.trello.com/1/cards/6325a19144c728055657541d")
                .header("Accept", "application/json")
                .queryString("key", "c0600ab20b9d82f70bdbc18d078e1150")
                .queryString("token", "22194a2a693956d491578fa65e8e48715b4be23045072ffbf494476b1d20c690")
                .asJson();

        System.out.println(response.getBody());
    }
    @Test
    void eUpdateCard() {

        HttpResponse<JsonNode> response = Unirest.put("https://api.trello.com/1/cards/6325a0614bcf7d022441140c")
                .header("Accept", "application/json")
                .queryString("key", "c0600ab20b9d82f70bdbc18d078e1150")
                .queryString("token", "22194a2a693956d491578fa65e8e48715b4be23045072ffbf494476b1d20c690")
                .asJson();

        System.out.println(response.getBody());
    }
    @Test
    void fDeleteCard() {

    HttpResponse<String> response = Unirest.delete("https://api.trello.com/1/cards/6325d38b396505014e845d92")
            .queryString("key", "c0600ab20b9d82f70bdbc18d078e1150")
            .queryString("token", "22194a2a693956d491578fa65e8e48715b4be23045072ffbf494476b1d20c690")
            .asString();

System.out.println(response.getBody());
}
    @Test
    void gDeleteBoard() {
        HttpResponse<String> response = Unirest.delete("https://api.trello.com/1/boards/6325d39fd260e104d81cd6e7")
                .queryString("key", "c0600ab20b9d82f70bdbc18d078e1150")
                .queryString("token", "22194a2a693956d491578fa65e8e48715b4be23045072ffbf494476b1d20c690")
                .asString();

        System.out.println(response.getBody());
}}

///