package com.company.data.structures.structures.Arrays;

import com.company.data.structures.models.User;


public class SimpleArray {

    /* Arrays :
    * it is a fixed size data collection
    * */

    public static void main(String[] args) {
        simpleIntegersArray();

        System.out.println("\nArray of objects:");

        arrayOfObjects();

        twoDimensionalArray();

    }

    public static void simpleIntegersArray()
    {
        //int[] nums=new int[5];
        int [] numbers={10,5,2,9,15};

        //insertion
        //Big-o in simple case is o(1) but in complex cases it will ber o(n) because elements shifting
        numbers[2]=7;

        //searching
        //Big-o is o(n)
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }

    public static void arrayOfObjects()
    {
        User [] users=new User[3];
        users[0]=new User("Eric",24);
        users[1]=new User("Coady",31);
        users[2]=new User("Williams",27);

        for (User user:users) {
            System.out.println("username:"+user.getUsername()+", age: "+user.getAge());
        }
    }

    public static void twoDimensionalArray()
    {
        //int [][] dimensional = new int[2][2];
        int [][] dimensional={{4,6,8},{7,11,15}};
        System.out.println("Two Dimensional Array: ");

        for (int i=0; i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(dimensional[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
