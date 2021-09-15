package Level1.신규아이디추천;

class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        String str = "";
        if(!new_id.matches("[0-9a-z\\-_.]+")) {
            for (int i = 0; i < new_id.length(); i++) {
                if(new_id.substring(i, i+1).matches("[0-9a-z\\-_.]+")){
                    str += new_id.substring(i, i+1);
                }
            }
        } else {
            str = new_id;
        }
        new_id = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.length() == 1 && str.charAt(0) == '.') {
                new_id = ".";
                break;
            }
            if(i == 0) {
                if(!(str.charAt(i) == '.' && str.charAt(i+1) == str.charAt(i))) {
                    new_id += str.charAt(i);
                }
            } else {
                if(!(str.charAt(i-1) == '.' && str.charAt(i-1) == str.charAt(i))) {
                    new_id += str.charAt(i);
                }
            }
        }

        if(new_id.length() >= 1 && new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }

        if(new_id.length() >= 1 && new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length()-1);
        }

        if(new_id.equals("")) {
            new_id = "a";
        }

        if(new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            if(new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length()-1);
            }
        }

        if(new_id.length() <= 2) {
            for(int i = new_id.length(); i < 3; i++) {
                new_id += new_id.charAt(i-1);
            }
        }
        return new_id;
    }
}

public class 신규아이디추천 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "~!@#$%&*()=+[{]}:?,<>/";
        System.out.println(solution.solution(str));
    }
}
