public class VariablesAndScopes {

    private Integer amount = 0; //This is for the command for the amount.

    public static void main(String[] args) {
        //This part here is static so I made the command here to run it all here.
        VariablesAndScopes odj = new VariablesAndScopes(); // because it has this is because it the two class is not static.

        odj.scope2Example();
        odj.anotherExample();
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

}
