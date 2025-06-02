package _31_Generic;

import _27_Bean.UserEntity;
import _27_Bean.UserEntityLombok;
import lombok.Data;

import java.util.Date;

public class DataControler {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData("데이터:", "주송현", 18, 3.14);
//        System.out.println(responseData.toString());
//        System.out.println(responseData.toStringInt());
//        System.out.println(responseData.toStringDouble());

        ResponseData<String> responseData1 = new ResponseData("이름:", "주송현");
        System.out.println(responseData1);
        ResponseData<Integer> responseData2 = new ResponseData("나이", 18);
        System.out.println(responseData2);
        ResponseData<Double> responseData3 = new ResponseData("원주율:", 3.14159265358973);

        Date now = new Date();
        ResponseData<Date> nowDate = new ResponseData<>("현재날짜:",now);
        System.out.println(nowDate);

        UserEntityLombok userEntityLomBok = new UserEntityLombok();
        userEntityLomBok.setUserId(1);
        userEntityLomBok.setEmail("어쩌고 저쩌고 샬라샬라");
        userEntityLomBok.setUsername("주송현");
        userEntityLomBok.setAge(18);
        ResponseData<UserEntityLombok> user = new ResponseData<>("유저:", userEntityLomBok);
        System.out.println(user);

        // product패키지
        //ProductController.java, Product.java
        //상품 정보, => 상품명(ProductName), 상품정보(ProductInfo)
        //Product<String> product1 = new ProductInfo=...
    }
}
