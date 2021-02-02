package com.develogical;

import java.util.Arrays;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("your name")){
            return "Piazza";
        }
        else if (query.toLowerCase().contains("what is")){
            String[] tokens = query.split(" ");

            if (tokens[0] != "what")
                tokens = Arrays.copyOfRange(tokens, 1, tokens.length);

            System.out.println(tokens);
            if (query.toLowerCase().contains("plus")){
                return Integer.toString(Integer.parseInt(tokens[1])+Integer.parseInt(tokens[3]));
            }
        }
        else if (query.toLowerCase().contains("which of the following numbers is the largest")){
            String[] tokens = query.split(" ");

            if (tokens[0] != "which")
                tokens = Arrays.copyOfRange(tokens, 1, tokens.length);
            
            int max = Integer.parseInt(tokens[8]);
            for (int i = 8; i < tokens.length; i++){
                if (Integer.parseInt(tokens[i]) > max)
                    max = Integer.parseInt(tokens[i]);
            }
            
            return Integer.toString(max);
        }
        return "";
    }
}
