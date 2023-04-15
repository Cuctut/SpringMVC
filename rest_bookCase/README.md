
# 步骤

## 1. 导入 json 相关坐标

    ```xml
    <dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-databind</artifactId>
      <version>2.14.1</version>
    </dependency>
    ```

## 2. 设置发送数据

### listParamForJson

    ```cURL
    curl --location --request GET 'http://localhost:6080/listParamForJson' \
    --header 'Content-Type: application/json' \
    --data '["sing","dance","rap","basketball","music"]'
    ```

### pojoParamForJson

    ```cURL
    curl --location --request GET 'http://localhost:6080/pojoParamForJson' \
    --header 'Content-Type: application/json' \
    --data '{
        "name": "lin",
        "age": 23,
        "address": {
            "city": "st",
            "province": "gd"
        }
    }'
    ```

### listPojoParamForJson

    ```cURL
    curl --location --request GET 'http://localhost:6080/listPojoParamForJson' \
    --header 'Content-Type: application/json' \
    --data '[
        {
            "name" : "lin",
            "age" : 23,
            "address" : {
                "city" : "st",
                "province" : "gd"
            }
        },

        {
            "name" : "cxk",
            "age" : 25,
            "address" : {
                "city" : "wz",
                "province" : "zj"
            }
        }
    ]'
    ```

## 3. 开启自动转换 json 数据的支持

    ```java
    @Configuration
    @ComponentScan("com.lin.controller")
    @EnableWebMvc
    public class SpringMvcConfig {

    }
    ```

## 4. 设置接受 json 数据 ( @RequestBody )

    ```java
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println(likes);
        return "{'module':'list param for json'}";
    }
    ```
