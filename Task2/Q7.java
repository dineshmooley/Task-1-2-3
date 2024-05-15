//Notes:
//15/05 09:12pm
//a++ and a++ values only change after the execution of the declared line.
//So, 28 + 29 + 28 + 28 = 113 and a = 28 + 113 = 141


class Q7    {
    public static void main(String[] args)  {
        int a = 28;
        a+= a++ + ++a + --a + a--;
        System.out.println(a);
    }
}

// The output is 144.
