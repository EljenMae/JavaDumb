import java.util.Arrays;
import java.util.List;

public class VariablesAndScopes {

    private Integer amount = 0; //This is for the command for the amount.
    //private Integer area = 0;
    public static void main(String[] args) {
        //Class scope
        //This part here is static so I made the command here to run it all here.
        VariablesAndScopes odj = new VariablesAndScopes(); // because it has this is because it the two class is not static.

        //class scope
        odj.scope2Example();
        odj.anotherExample();

        //Method scope
        VariablesAndScopes abc = new VariablesAndScopes();
        abc.methodA();
      //  abc.methodB();

    }
    //Class scope
    public void scope2Example(){
        amount++;
    }
    //Class scope
    public void anotherExample(){
        Integer anotherAmount = amount + 4;
        System.out.println("Amount: " + anotherAmount);
    }
    //method scope
    public void methodA(){
        Integer area = 2;
    }
    //public void methodB(){
        //This will be error since the area was inside instead of outside.
      //  int area1 = area + 2;
      //  System.out.println("Counting the area: "+ area1);

    //Loop scope
    List<String> listOfNames = Arrays.asList("Joe", "Susan", "Patrick");
    public void iterationOfNames(){
       // String
    }




}
