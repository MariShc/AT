package services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import modules.newStore.Store;

import static io.restassured.RestAssured.given;

public class NewStoreServices {

    private String uri = "https://petstore.swagger.io/v2/store/order/";

    public Store postStore(Store store) {

        Response response = given()
                .contentType(ContentType.JSON)
                .body(store)
                .post(uri);

        if (response.statusCode() == 200) {
            return response.as(Store.class);
        }
        return null;
    }

    public Store getStore(String key) {
        Response response = given()
                .contentType(ContentType.JSON)
                .get(uri + key);

        if (response.statusCode() == 200) {

            return response.as(Store.class);
        }
        return null;
    }

    public Store getStoreInventory() {

        Response response = given()
                .contentType(ContentType.JSON)
                .get(uri);

        if (response.statusCode() == 200) {
            return response.as(Store.class);
        }
        return null;

    }

    public Store deleteStore(String key) {
        Response response = given()
                .contentType(ContentType.JSON)
                .delete(uri + key);
        if (response.statusCode() == 200) {
            return response.as(Store.class);
        }
        return null;
    }
}
