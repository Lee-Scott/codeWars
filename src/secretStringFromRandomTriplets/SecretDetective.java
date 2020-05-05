package secretStringFromRandomTriplets;

import java.util.*;


public class SecretDetective {

    private static Map<Character, Set<Character>> buildEdgeMap(char[][] triplets) {
        Map<Character, Set<Character>> map = new HashMap<>();
        for(char[] cs : triplets) {
            for (char c : cs) {
                if (!map.containsKey(c)) map.put(c, new HashSet<>());
            }
            map.get(cs[0]).add(cs[1]);
            map.get(cs[1]).add(cs[2]);
        }
        return map;
    }


    private static char findLast(Map<Character, Set<Character>> map) {
        for(Map.Entry<Character, Set<Character>> entry : map.entrySet()) {
            if (entry.getValue().isEmpty()) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("No end point");
    }

    private static void remove(Map<Character, Set<Character>> map, Character c) {
        map.remove(c);
        for(Set<Character> cs : map.values()) {
            cs.remove(c);
        }
    }

    public String recoverSecret(char[][] triplets) {
        StringBuilder builder = new StringBuilder();
        Map<Character, Set<Character>> map = buildEdgeMap(triplets);

        while(!map.isEmpty()) {
            char last = findLast(map);
            builder.insert(0, last);
            remove(map, last);
        }

        return builder.toString();
    }
}