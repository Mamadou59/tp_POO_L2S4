public class MonthMain{
	public static void main(String[] args){
		Month m1 = Month.february;
		System.out.print(m1.getNbDays(2016));
		System.out.print('\n');
		System.out.print(m1.getNbDays(2019));
		System.out.print('\n');
		System.out.print(m1.getNextMonth());
		System.out.print('\n');
	}
}