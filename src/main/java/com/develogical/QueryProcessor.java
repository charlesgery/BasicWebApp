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
        else if (query.toLowerCase().contains("which city is the eiffel tower in")){
            return "Paris";
        }
        else if (query.toLowerCase().contains("who played james bond in the film dr no")){
            return "Sean Connery";
        }
        else if (query.toLowerCase().contains("what is")){
            String[] tokens = query.split(" ");

            if (!tokens[0].equals("what"))
                tokens = Arrays.copyOfRange(tokens, 1, tokens.length);

            if (query.toLowerCase().contains("plus")){
                return Integer.toString(Integer.parseInt(tokens[2])+Integer.parseInt(tokens[4]));
            }
            if (query.toLowerCase().contains("mutiplied by")){
                return Integer.toString(Integer.parseInt(tokens[2])*Integer.parseInt(tokens[5]));
            }
        }
        else if (query.toLowerCase().contains("which of the following numbers is the largest")){
            String[] tokens = query.split(" ");

            if (!tokens[0].equals("which"))
                tokens = Arrays.copyOfRange(tokens, 1, tokens.length);
            
            int max = Integer.parseInt(tokens[8].replace(",", ""));
            for (int i = 8; i < tokens.length; i++){
                if (Integer.parseInt(tokens[i].replace(",", "")) > max)
                    max = Integer.parseInt(tokens[i].replace(",", ""));
            }
            
            return Integer.toString(max);
        }
        else if (query.toLowerCase().contains("which of the following numbers is both a square and a cube")){
            String[] tokens = query.split(" ");

            if (!tokens[0].equals("which"))
                tokens = Arrays.copyOfRange(tokens, 1, tokens.length);
            
            int max = Integer.parseInt(tokens[8].replace(",", ""));
            for (int i = 8; i < tokens.length; i++){
                if (Integer.parseInt(tokens[i].replace(",", "")) > max)
                    max = Integer.parseInt(tokens[i].replace(",", ""));
            }
            
            return Integer.toString(max);
        }
        return "";
    }

    static boolean checkPerfectSquareCube(double x)  
    { 

	// finding the square root of given number 
	double sq = Math.sqrt(x); 

	/* Math.floor() returns closest integer value, for
	 * example Math.floor of 984.1 is 984, so if the value
	 * of sq is non integer than the below expression would
	 * be non-zero.
	 */
	return ((sq - Math.floor(sq)) == 0); 
    } 
}
