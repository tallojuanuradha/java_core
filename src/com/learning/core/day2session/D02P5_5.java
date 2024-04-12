package com.learning.core.day2session;

import java.util.*;

public class D02P5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the number of strings: ");
			int n = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Enter the strings:");
			String[] strings = new String[n];
			for (int i = 0; i < n; i++) {
			    strings[i] = scanner.nextLine();
			}

			boolean canFormCircle = canFormCircle(strings);
			if (canFormCircle) {
			    System.out.println("The given strings can be chained to form a circle.");
			} else {
			    System.out.println("The given strings cannot be chained to form a circle.");
			}
			
			scanner.close();
		}
    

    public static boolean canFormCircle(String[] strings) {
        if (strings == null || strings.length == 0) {
            return false;
        }

        // Create a map to store the adjacency list representation of the graph
        Map<Character, List<String>> graph = new HashMap<>();
        for (String str : strings) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            graph.putIfAbsent(firstChar, new ArrayList<>());
            graph.get(firstChar).add(str);
            graph.putIfAbsent(lastChar, new ArrayList<>());
        }

        
        for (String str : strings) {
            if (dfs(str, str.charAt(0), new HashSet<>(), graph)) {
                return true;
                
                
            }
        }

        return false;
    }

    private static boolean dfs(String currentString, char startChar, Set<String> visited, Map<Character, List<String>> graph) {
        char endChar = currentString.charAt(currentString.length() - 1);
        if (endChar == startChar && visited.size() == graph.size()) {
            return true;
        }

        visited.add(currentString);
        List<String> neighbors = graph.getOrDefault(endChar, new ArrayList<>());
        for (String neighbor : neighbors) {
            if (!visited.contains(neighbor)) {
                if (dfs(neighbor, startChar, visited, graph)) {
                    return true;
                }
            }
        }
        visited.remove(currentString);

        return false;
        
        
    }
}
