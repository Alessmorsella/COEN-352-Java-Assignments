/*Josephus problem. In the Josephus problem from antiquity, N people are in dire straits
and agree to the following strategy to reduce the population. They arrange them-selves in a circle
(at positions numbered from 0 to N–1) and proceed around the circle, eliminating every Mth
person until only one person is left. Legend has it that Josephus figured out where to sit to avoid
being eliminated. This program is a Queue client Josephus program that takes N and M and prints out the order in which people are eliminated (and thus would show
Josephus where to sit in the circle).*/
public class Josephus {
public static int algor(int n, int m){
    int alive;
    if(n==1)
        alive=1;
    else
        alive=((algor(n-1,m)+m-1)%n)+1;
    return alive;
    
}  
public static void main(String[] args){

int n=5;
int m=4;
if(n==0)
    System.out.print("Error, there is no one in the circle!");
else 
    System.out.print(algor(n,m));

}

}
