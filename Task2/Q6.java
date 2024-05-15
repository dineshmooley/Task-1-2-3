// 6) Evaluate the following expression on paper and on program and understand the difference

//(i) ++a-b--
//Notes: ++a takes precedence over -, and b value will change on the next line
//So, 2 - 1 should result in 1, and a becomes 2 and b becomes 0.
class Q6_1    {
    public static void main(String[] args)  {
        int a = 1, b = 1;
        System.out.println("Before a=> " + a + " b=> " + b);
        System.out.println(++a-b--);
        System.out.println("After a=> " + a + " b=> " + b);
    }
}

// The output is 1 as expected and a and b values are also correct.

//(ii) a%b++
//Notes: b's value is not chnaged in this line, so it remains the same.
//So, 1 % 1 should be 0, a remains the same and b becomes 2.
class Q6_2    {
    public static void main(String[] args)  {
        int a = 1, b = 1;
        System.out.println("Before a=> " + a + " b=> " + b);
        System.out.println(a%b++);
        System.out.println("After a=> " + a + " b=> " + b);
    }
}

// The output is 0 as expected and a and b values are also correct.

//(iii) a*=b+5
//Notes: b + 5 will be added and then will be multiplied with a.
//So, 1 + 5 = 6 and 1 x 6 = 6, the output should be 6, a will be 6 and b remains the same.
class Q6_3    {
    public static void main(String[] args)  {
        int a = 1, b = 1;
        System.out.println("Before a=> " + a + " b=> " + b);
        System.out.println(a*=b+5);
        System.out.println("After a=> " + a + " b=> " + b);
    }
}

// The output is 6 as expected and a and b values are also correct.

//(iv) 69>>>2
//Notes: 69's binary number will be shifted to right by 2 bits.
//So, 60 => 1000101 becomes 0010001 => 1 + 16 => 17
class Q6_4    {
    public static void main(String[] args)  {
        System.out.println(69>>>2);
    }
}

// The output is 17 as expected.
