package com.jcworx.blur;

/**
 * Masking operations that intend to detect, and blur out personally
 * identifiable information or PII from key/value pair inputs provided by the
 * user.
 * 
 * @author jbustamove
 */
public final class Blur {

    private final String piiFieldNameDictionary = "name,address,sex,city,state,province,territory,zip,country,gender,email,creditCard,pin,religion";

    /**
     * Replace specific key/value pairs in a string
     */
    public String out(String input) {
        return "";
    }

    public static final Blur getInstance() {
        return new Blur();
    }
}
