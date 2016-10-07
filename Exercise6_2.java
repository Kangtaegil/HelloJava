
public class Exercise6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		card1.info();
		card2.info();
	}

}

class SutdaCard
{
	int num;
	boolean isKwang;
	
	SutdaCard()
	{
		num = 1;
		isKwang = true;
	}
	
	SutdaCard(int num2, boolean isKwang2)
	{
		num = num2;
		isKwang = isKwang;
	}
	
	void info()
	{
		if(isKwang == true)
			System.out.println(num);
		
		else
			System.out.println(num + isKwang);
	}
}