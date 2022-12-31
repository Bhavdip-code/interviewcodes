public class Main {
    public static void main(String[] args) {

      String s = "Bhavdipkakadiya@#$";
      Integer count = 0;
String specialCharRemoved = "";

      for(int i= 0; i < s.length(); i++)
      {

            if (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))&& !Character.isWhitespace(s.charAt(i))){

                count ++;
            }else{
              specialCharRemoved = specialCharRemoved +s.charAt(i);

            }

      }
      if (count == 0){

          System.out.println("There is no single special characters in the given string");

      }else {

          System.out.println("There are "+ count + " special characters in the given string");

          System.out.println("special Characters removed " +specialCharRemoved);
      }




    }
}