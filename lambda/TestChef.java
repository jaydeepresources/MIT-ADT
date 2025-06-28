package lambda;

public class TestChef {
    public static void main(String[] args) {
//      Implementation by a class
        Recipe recipe = new Chef();

//      Implementation by anonymous inner class
        Recipe instantRecipe = new Recipe() {
            public void cook() {
                System.out.println("Instant Recipe");
            }
        };

//      Implementation by lambda
        Recipe lambdaRecipe = ()-> System.out.println("Instant Recipe");

    }
}