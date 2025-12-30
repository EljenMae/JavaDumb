public class VariablesAndScopes {

    private Integer amount = 0; //This is for the command for the amount.

    public static void main(String[] args) {
        //Class Scope
        VariablesAndScopes odj = new VariablesAndScopes(); // because it has this is because it the two class is not static.

        odj.scope2Example();
        odj.anotherExample();
    }
    public void scope2Example(){
        amount++;
    }
    public void anotherExample(){
        Integer anotherAmount = amount + 4;
        System.out.println("Amount: " + anotherAmount);
    }

}
