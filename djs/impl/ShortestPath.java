package djs.impl;
import java.util.Arrays;

public class ShortestPath{
  //this is the actual implementation of the Disjkstra's algorithm
  //to find the shortest path from the source to all nodes and display
  //the distance between them all

//this function will return the minimum number index
//so that we can go to the next node
static int minimum(int[] myNodes,boolean[] visited){
int minInList=Integer.MAX_VALUE;

for(int i=0;i<myNodes.length;i++){
  //System.out.println("Enetering the minimum loop 1");
  //System.out.println(minInList + ">" + myNodes[i] + " visited=" + visited[i]); //for debugging
  if(minInList>myNodes[i] && !visited[i]){
    minInList=myNodes[i];
  }
}

int index =-1;
for(int i=0; i<myNodes.length;i++){
  //System.out.println("Enetering the minimum loop 2");
  //to find the index number where the node hasnt been visited
  if(myNodes[i]==minInList && visited[i]==false){
    index = i;
    break;
  }
  else{
    index=50; //this will break the while loop
  }
}

return index;

}//end of minimum function


//this is for the displaying the values
public void display(int nodes[]){
  //for naming all the nodes
  String[] myNodes = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V"};
  System.out.println("Node   Distance to the Source");
  for (int i=0;i<nodes.length ;i++ ) {
    //System.out.println("Enetering the display loop 1");
    System.out.println(myNodes[i] +"      " +nodes[i]);
  }

}//end of display function




//set all the nodes in the graph to be max value except for the
//source node
//the graph[][] is my adjacency matrix
public void dja(int[][] graph , int src ,int graphSize){
//setUp
int[] nodes=new int[graphSize];
int inf=Integer.MAX_VALUE;
boolean[] visited= new boolean[graphSize];
for(int i=0; i<nodes.length;i++){
  //System.out.println("Enetering the dja loop 1");
  nodes[i]=inf;//set all nodes to be infinity (since path asnt been determined)
  visited[i]=false;
}
//this will check if the node at index i has been visited
//represents A,B,C,D,E nodes

//the actual startup
int visitedCounter=0;
//for(int i=0;i<nodes.length;i++){
int pos=src; //ie the first node
while(pos <40){
  //System.out.println("Enetering the dja while loop 1");
  nodes[src]=0; //set the first node to be 0

  //this loop will be used to go over the adjacency matrix
  for(int y=0; y<nodes.length;y++){
    //System.out.println("Enetering the dja while loop 2");
    //check the adjacency matrix
    if(graph[pos][y]!=0 && visited[pos]==false){

      //to update if the value is less than current value
      if(nodes[pos] + graph[pos][y]<nodes[y]){
      nodes[y]=nodes[pos]+graph[pos][y];//setting the values
    }//end of second if
    }//end of if
  }//end of second loop

  //visitedCounter++;
  visited[pos]=true;
  pos=minimum(nodes , visited); //set the new position

}//end of loop


//to display the results
display(nodes);

}//end of function


}//end of class
