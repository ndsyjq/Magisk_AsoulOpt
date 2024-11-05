package pta;

import java.util.*;

public class A {
    
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
       
        int n = scanner.nextInt();  
        int[] parents = new int[n + 1];  
        
   
        for (int i = 1; i <= n; i++) {  
            parents[i] = scanner.nextInt();  
        }  

    
        findYoungestGeneration(n, parents);  
        
        scanner.close();  
    }  
    
    private static void findYoungestGeneration(int n, int[] parents) {  
       
        List<Integer>[] children = new ArrayList[n + 1];  
        for (int i = 1; i <= n; i++) {  
            children[i] = new ArrayList<>();  
        }  
        
      
        int root = 0;  
        for (int i = 1; i <= n; i++) {  
            if (parents[i] == -1) {  
                root = i;  
            } else {  
                children[parents[i]].add(i);  
            }  
        }  
        
     
        Queue<Integer> queue = new LinkedList<>();  
        queue.offer(root);  
        
   
        int[] depth = new int[n + 1];  
        depth[root] = 1; // 根节点的辈分为1  
     
        int maxDepth = 1;  
      
        while (!queue.isEmpty()) {  
            int current = queue.poll();  
            
            for (int child : children[current]) {  
                depth[child] = depth[current] + 1;  
                maxDepth = Math.max(maxDepth, depth[child]);  
                queue.offer(child);  
            }  
        }  

        List<Integer> youngestMembers = new ArrayList<>();  
        for (int i = 1; i <= n; i++) {  
            if (depth[i] == maxDepth) {  
                youngestMembers.add(i);  
            }  
        }  

    
        Collections.sort(youngestMembers);  
        
    
        System.out.println(maxDepth);  
        System.out.println(String.join(" ", youngestMembers.stream().map(String::valueOf).toArray(String[]::new)));  
    }  
}
