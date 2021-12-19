package store;

import modules.newStore.Store;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.NewStoreServices;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StoreTest {

    private final NewStoreServices newStoreServices = new NewStoreServices();

    @DisplayName("create new store by api")
    @Test
    void createNewStore() {

        Store store = Store.builder()
                .id("0")
                .petId("0")
                .quantity("0")
                .shipDate("2021-12-18T17:27:34.812Z")
                .status("placed").complete(true)
                .build();

        Store createdStore = newStoreServices.postStore(store);
        System.out.println(createdStore.getId());
        assertNotNull(createdStore);
        assertNotNull(createdStore.getId());

    }

    @DisplayName("get store for id")
    @Test
    void getStoreForId() {
        newStoreServices.getStore("9223372000001093270");
    }

    @DisplayName("delete store")
    @Test
    void deleteTrueStore() {
        given()
                .when()
                .delete("https://petstore.swagger.io/v2/store/order/" + "9223372000001093270")
                .then()
                .statusCode(200);
        given()
                .when()
                .get("https://petstore.swagger.io/v2/store/order/" + "9223372000001093270")
                .then()
                .statusCode(404);
    }

    @DisplayName("get inventory")
    @Test
    void getStoreInventory() {

        HashMap<Object, Object> inventory = given()
                .when().get("https://petstore.swagger.io/v2/store/inventory")
                .then().statusCode(200).extract().body().as((Type) Map.class);

        inventory.forEach((k, v) -> System.out.println(k + " " + v));

        Assert.assertTrue("Inventory не содержит статус sold", inventory.containsKey("sold"));
    }
}
