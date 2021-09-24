/*
What should the functions have as parameter(s) ?
The funtions should have celsius and farenheit

What type should they be?
They should be doubles since there are fractions/decimals

What should the functions return?
celsiustoFarenheit should return farenheit value from the celsius value
and
farenheitToCelsius should return celsius from the farenheit value
*/

public class CtoFTester{
  public static double celsiusToFahrenheit(double celsius){
    return 9*celsius/5+32; // 9/5C+35

  }
  public static double fahrenheitToCelsius(double fahrenheit){
    return (fahrenheit-32)*5/9; // 5/9(F-32)
  }
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(35));
    System.out.println(fahrenheitToCelsius(50));
  }
}
