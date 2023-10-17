// https://leetcode.com/problems/goal-parser-interpretation/

package com.dsa.strings.interviewQuestions;

public class GoalParserInterpretation {

    public static void main(String[] args) {
        GoalParserInterpretation temp = new GoalParserInterpretation();
        String command = "(al)G(al)()()G";
        System.out.println(temp.interpret(command));
    }

    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') { sb.append("G"); }
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    sb.append("o");
                    i++;
                } else {
                    sb.append("al");
                }
            }
        }

        return sb.toString();
    }
}


