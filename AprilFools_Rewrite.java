import java.util.Random;
import java.util.ArrayList;

public class AprilFools_Rewrite {
    public static void main(String[] args) {
        Random rand = new Random();
        int amount = 100;
        int iterations = 0;
        int xNum = 0;
        int yNum = 0;
        int zNum = 0;
        ArrayList<String> x = new ArrayList<String>();
        x.add("melt");
        x.add("eat");
        x.add("throw");
        x.add("buy");
        x.add("sell");
        x.add("flip over");
        x.add("bury");
        x.add("hide");
        x.add("laugh at");
        x.add("glue");
        x.add("scream at");
        x.add("run at");
        x.add("menacingly stare at");
        x.add("run at");
        x.add("draw on");
        x.add("blow up");
        x.add("steal the soul of");
        x.add("fall on");
        x.add("commit grand theft with");
        x.add("be gay, do crime with");
        ArrayList<String> y = new ArrayList<String>();
        y.add("a");
        y.add("an evil");
        y.add("the");
        y.add("everyone's");
        y.add("your parent's");
        y.add("your own");
        y.add("your friend's");
        y.add("your pet's");
        ArrayList<String> z = new ArrayList<String>();
        z.add("house");
        z.add("TV");
        z.add("lamp");
        z.add("face");
        z.add("computer");
        z.add("book");
        z.add("horse");
        z.add("bread");
        z.add("dog");
        z.add("cat");
        z.add("book");
        z.add("pictures");
        z.add("bicycle");
        z.add("appliance");
        z.add("food");
        z.add("dino nuggets");
        z.add("cult");
        z.add("iPhone 16 Pro Max");
        z.add("Ford F150");
        z.add("pizza");
        z.add("mortal possesions");
        z.add("bank account");
        z.add("souls of the innocent");
        z.add("cheeseburger");
        z.add("friend");
        while(iterations<amount){
            xNum = rand.nextInt(x.size());
            System.out.println(x.get(xNum));
            yNum = rand.nextInt(y.size());
            System.out.println(y.get(yNum));
            zNum = rand.nextInt(z.size());
            System.out.println(z.get(zNum));
            iterations++;
            System.out.println("");
        }
        System.out.println("AprilFools.java has stopped at " + iterations + " fools! Have fun :3");
    }
}
