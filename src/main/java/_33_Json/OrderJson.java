package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class OrderJson {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();

        jsonObject1.addProperty("orderId", "ORD123456");
        jsonObject1.addProperty("customer", "곽승제");
        jsonObject1.addProperty("product", "와 언더테일 아시는구나!");
        jsonObject1.addProperty("quantity", 1);
        jsonObject1.addProperty("price", 10500);

        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        String jeson1 = gson1.toJson(jsonObject1);

        JsonObject address = new JsonObject();
        address.addProperty("receiver", "곽승제");
        address.addProperty("phone", "010-1111-1111");
        address.addProperty("city", "지구");
        address.addProperty("district", "와 샌즈");
        address.addProperty("zipCode", 12345);

        jsonObject1.add("address", address);

        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        String json2 = gson2.toJson(jsonObject1);
        System.out.println(json2);
    }
}
