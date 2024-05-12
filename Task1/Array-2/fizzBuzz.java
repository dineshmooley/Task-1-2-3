public String[] fizzBuzz(int start, int end) {
  String[] ans = new String[end - start];
  int j = 0;
  for(int i=start; i<end; i++)  {
    String val = "";
    if(i % 3 == 0 && i % 5 == 0)  {
      val = "FizzBuzz"; 
    }
    else if(i % 3 == 0 )  {
      val = "Fizz"; 
    }
    else if(i % 5 == 0)  {
      val = "Buzz"; 
    }
    else  val = String.valueOf(i);
    
    ans[j++] = val;
  }
  
  return ans;
}
