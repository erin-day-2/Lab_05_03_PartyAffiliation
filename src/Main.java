public class Main
{

    public static void main(String[] args)
    {
	String typeOfParty = "O";
    System.out.println("Enter your party: D)emocrat R)epublican I)ndependent or O)ther [DRIO]");

    if (typeOfParty.equals("D"))
    {
        System.out.println("You get a Democratic Donkey!");
    }
    else if (typeOfParty.equals("R"))
    {
        System.out.println("You get a Republican Elephant!");
    }
    else if (typeOfParty.equals("I"))
    {
        System.out.println("You get an Independent Man");
    }
    else
    {
        System.out.println("You chose other, pick your own mascot!");
    }
    }
}
