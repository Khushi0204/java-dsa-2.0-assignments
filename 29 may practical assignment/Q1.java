//1. Write a program to demonstrate method overloading with 3 different parameters.
class add{
    int add(int n1, int n2){
        return n1 + n2;  //returning the sum of two numbers.
    }
    int add(int n1, int n2, int n3){
        return n1 + n2+n3;  //returning the sum of two numbers.
    }
    double add(double n1, double n2,double n3){
        return n1 + n2+n3;  //returning the sum of two numbers.
    }
}
class Q1{
    public static void main(String[] args){
        add A = new add();
        int result =A.add(15,19);
        System.out.println(result);  
        int result1=A.add(19, 45,67);
        System.out.println(result1);
       double result2=A.add(2.5, 4.5, 7.8);
       System.out.println(result2);
    }
}