package pl.comarch.szkoelnia.maven;

import org.apache.commons.codec.digest.DigestUtils;

public class App {
    public static void main(String[] args) {
        String pass = "tajneHaslo";

        String hash = DigestUtils.md5Hex(pass);

        System.out.println(hash);
    }
}
