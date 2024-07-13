package LaptopPractice.programmers;

class Solution {
    public String solution(String str1, String str2) {
        String newString="";
        for (int i = 0; i< str1.length(); i++){
            newString = newString + str1.substring(i,i+1) + str2.substring(i,i+1);
        }

        return newString;
    }
}