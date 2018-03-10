package djs.impl;

import java.util.ArrayList;
public class Main{

public static void main(String[] args) {
  System.out.println("The Disjkstra Algorithm");
  ShortestPath myPaths = new ShortestPath();
   //debugging
  //boolean[] blah={true,false,true,true,true};
 //int[] test = {0,5,3,1,2};
 //System.out.println(s.minimum(test,blah));

 int graph[][] = { {0,1,0,4,2},
                   {1,0,3,0,0},
                   {0,3,0,3,4},
                   {4,0,3,0,5},
                   {2,0,4,5,0}};

//graph taken from https://www.geeksforgeeks.org/?p=27697
 // int[][] graph =  {{0, 4, 0, 0, 0, 0, 0, 8, 0},
 //                   {4, 0, 8, 0, 0, 0, 0, 11, 0},
 //                   {0, 8, 0, 7, 0, 4, 0, 0, 2},
 //                   {0, 0, 7, 0, 9, 14, 0, 0, 0},
 //                   {0, 0, 0, 9, 0, 10, 0, 0, 0},
 //                   {0, 0, 4, 14, 10, 0, 2, 0, 0},
 //                   {0, 0, 0, 0, 0, 2, 0, 1, 6},
 //                   {8, 11, 0, 0, 0, 0, 1, 0, 7},
 //                   {0, 0, 2, 0, 0, 0, 6, 7, 0}
 //                   };

  myPaths.dja(graph , 0, graph.length);
}//end of main


}//end of class
