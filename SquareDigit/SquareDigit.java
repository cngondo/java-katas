public class SquareDigit {

  public int squareDigits(int n) {
    //Convert it to an array
    int[] intArray = Integer.toString(n).chars().map(c -> c-='0').toArray();
    
    //Square every element of the array
    for(int i = 0; i < intArray.length; i++){
      intArray[i] = (int) Math.pow(intArray[i], 2);
    }

    //convert the squared array back to an integer
    StringBuilder num = new StringBuilder();
    for(int i: intArray){
      num.append(i);
    }
    int square = Integer.parseInt(num.toString());

    return square;
  }
}
