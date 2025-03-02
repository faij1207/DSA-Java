//you have 3 towers and n disks of different sizes which can slide onto any tower. The puzzle starts with disks 
//sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one). 
//You have the following constraints:

//1.Only one disk can be moved at a time.
//2.A disk is slid off the top of one tower onto another tower.
//3.A disk cannot be placed on top of a smaller disk.
// write a program to move the disks from the first tower to the last using stacks.

//let rod 1='A', rod 2='B', rod 3='C'
//An example with 2 disks i.e n=2
//step 1: shift the disk from 'A' to 'B'
//step 2: shift the disk from 'A' to 'C'
//step 3: shift the disk from 'B' to 'C'



public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String source, String helper , String destination){
        if(n==1){
            System.out.println("Move disk "+n+"  from " + source + " to " + destination);
            return;
        }

        //transfer n-1 disks from source to helper using destination as helper
        towerOfHanoi(n-1, source, destination, helper);

        //move nth disk from source to destination
        System.out.println("Move disk "+n+"  from " + source + " to " + helper);

        //transfer n-1 disks from helper to destination using source as helper
        towerOfHanoi(n-1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "A", "B", "C");
    }
}
