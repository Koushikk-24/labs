//Create an interface called “sports” with methods getNumberOfGoals and dispTeam. Create classes Hockey and football that uses the interface “sports”. Write the appropriate code for the methods. 
interface sports{
    public void getNumberOfGoals();
    public void dispTeam();
}
class Hockey implements sports{
    public void getNumberOfGoals(){
        System.out.println("Hockey has 5 goals");
    }
    public void dispTeam(){
        System.out.println("Hockey is the best team");
    }
}
class Football implements sports{
    public void getNumberOfGoals(){
        System.out.println("Football has 10 goals");
    }
    public void dispTeam(){
        System.out.println("Football is the best team");
    }
}

public class lab8_03 {
    public static void main(String[] args) {
        Hockey h = new Hockey();
        Football f = new Football();
        h.getNumberOfGoals();
        h.dispTeam();
        f.getNumberOfGoals();
        f.dispTeam();
    }

    
}
