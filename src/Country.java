
public class Country {
	public static void main(String args[]) {
		/* Class Nation을 만들고 나라이름, 면적, 인구수를 멤버 변수를 만들고,
		나라이름변경(),면적변경(),인구수변경()메서드를 만드시오.*/
		/* Class Nation을 상속한 나라를 3개 만들고, 나라별로 특수한 멤버변수
		하나와 메서드 하나를 생성하시오. */
		
		Nation n = new Nation("Seoul",510_000_000,100000);
		System.out.println(n.area);
		System.out.println(n.population);
		
//		n.changeName("Japan");          // 나라이름변경 메서드
//		System.out.println(n.countryName);
//		n.changeArea(900_000_000);      // 면적변경 메서드
//		System.out.println(n.area);
//		n.changePopulation(10_000_000); // 인구수변경 메서드
//		System.out.println(n.population);
		
		
		Singapore s = new Singapore();
		s.identifyRace("Chinese");
		Taiwan t = new Taiwan();
		t.whereLiveIn(1);

	}
	
}

class Nation {  // Class Nation 생성
	String countryName;     // 나라이름
	public long area;        // 면적 
	public long population;  // 인구수

	Nation() {}  //생성자 초기화(매개변수 없는)
	
	Nation(String s, long a, long p) {  //생성자 초기화(매개변수 있는)
		countryName = s;
		area = a;
		population = p;
	}
	
	String changeName(String name) {  // 나라이름 변경메서드
		countryName = name;
		return name; 
	}
	
	long changeArea(long area) {   // 면적변경 메서드
		this.area = area;
		return area;
	}
	
	long changePopulation(long p) {  // 인구수변경 메서드
		this.population = p;
		return p;
	}
}

class Singapore extends Nation { // Nation 부모 클래스의 Singapore 자식 클래스
	// 멤버변수 하나, 메서드 하나(최소)
	String race;
	
	void identifyRace(String race) {  // 메서드
		this.race = race;
		
		if(race.contains("malay") || race.contains("Malay")) {  // 입력받은 수가 malay나 Malay 둘중 하나이면
			System.out.println("you're malay singaporean");     // 당신은 malay Singaporean!
		} else if(race.contains("chinese") || race.contains("Chinese")) {
			System.out.println("you're chinese singaporean");
		} else if(race.contains("india") || race.contains("India"))  {
			System.out.println("you're india singapore");
		} else {
			System.out.println("please write correctly");
		}
	}

}

class Taiwan extends Nation {  // Nation 부모 클래스의 Taiwan 자식 클래스
	// 멤버변수 하나, 메서드 하나(최소)
	int TaiBei = 0;
	String Taibei; 
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	void whereLiveIn(int i) {
		TaiBei = i;
		
		if(i == 0) {
			System.out.println("you are living in Taibei");
		} else {
			System.out.println("you are not living in Taibei");
		}

	}
}

class Australia extends Nation {
	// 멤버변수 하나, 메서드 하나
	int sheep;
}

