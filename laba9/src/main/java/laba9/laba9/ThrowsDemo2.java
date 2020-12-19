package laba9.laba9;

import java.util.Scanner;

public class ThrowsDemo2 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) throws Exception {
        // try {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
        // }catch (Exception x){

        // }
    }

    private String getDetails(String key) throws Exception {
        if (key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}