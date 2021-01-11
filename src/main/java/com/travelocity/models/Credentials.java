package com.travelocity.models;

import cucumber.api.DataTable;

import java.util.List;
import java.util.Map;

public class Credentials {

    private static String email;
    private static String password;

    public Credentials(DataTable crednetials) {
        List<Map<String, String>> list = crednetials.asMaps(String.class, String.class);
        Credentials.email = list.get(0).get("correo");
        Credentials.password = list.get(0).get("password");
    }

    public static String getEmail() {
        return email;
    }

    public static String getPassword() {
        return password;
    }

}
