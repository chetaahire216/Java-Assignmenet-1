import java.util.*;
class matchID
{
	public static void main(String []args)
	{
		String ID="Flynaut@gmail.com";
		Scanner s = new Scanner(System.in);
		System.out.println("Eneter the User ID :-");
		String User_ID=s.nextLine();

		if(User_ID.equals(ID))
		{
			System.out.println("Jake's name ");
			System.out.println("age");
	    }
		else
		{
			System.out.println("User ID is not Match.");
	    }
	}
}