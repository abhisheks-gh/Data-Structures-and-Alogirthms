// https://leetcode.com/problems/defanging-an-ip-address/
// Google (2), Amazon (2)

package com.dsa.strings.interviewQuestions;

public class DefangingAnIPAddress {

    public static void main(String[] args) {
        DefangingAnIPAddress defang = new DefangingAnIPAddress();
        String address = "1.1.1.1";
        System.out.println(defang.defangIPaddr(address));   // Output: 1[.]1[.]1[.]1
    }

//    // Approach 1: Using inbuilt string method
//    public String defangIPaddr(String address) {
//        return address.replace(".", "[.]");
//    }

    // Approach 2: Using StringBuilder
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }

        String str = sb.toString();
        return str;
    }
}
