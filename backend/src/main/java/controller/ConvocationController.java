package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.User;
import model.UserWrapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConvocationController {
    final String jsonString = "{\n" +
            "    \"users\": [\n" +
            "        {\n" +
            "            \"email\": \"amin.hossain@humber.ca\",\n" +
            "            \"name\": \"Amin Hossain\",\n" +
            "            \"address\": {\n" +
            "                \"line1\": \"205 Humber College Blvd_199\",\n" +
            "                \"line2\": \"\",\n" +
            "                \"city\": \"Toronto\",\n" +
            "                \"state\": \"ON\",\n" +
            "                \"zip\": \"M9W SL7\"\n" +
            "            },\n" +
            "            \"programs\": [{\n" +
            "                \"name\": \"Bachelor of Health Science (Workplace Health and Wellness)\",\n" +
            "                \"eligibility\": true,\n" +
            "                \"date\": \"June 2022\",\n" +
            "                \"attending\": true\n" +
            "              },\n" +
            "              {\n" +
            "                \"name\": \"Early Childhood Education\",\n" +
            "                \"eligibility\": false,\n" +
            "                \"date\": \"June 2022\",\n" +
            "                \"attending\": false\n" +
            "              }\n" +
            "            ]\n" +
            "\n" +
            "        }\n" +
            "    ],\n" +
            "\n" +
            "    \"control\": {\n" +
            "        \"active\": true\n" +
            "    }\n" +
            "}";
    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
    @GetMapping("/")
    public UserWrapper getUser() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        UserWrapper userWrapper = objectMapper.readValue(jsonString, UserWrapper.class);
        return userWrapper;
    }

    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
    @GetMapping("/users")
    public UserWrapper getUserByEmail(@RequestParam(value = "email") String email) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        UserWrapper userWrapper = objectMapper.readValue(jsonString, UserWrapper.class);
        //userWrapper.getUsers().get(0).setEmail(email);
        return userWrapper;
    }
}
