
public class Country {
	public static void main(String args[]) {
		/* Class Nation�� ����� �����̸�, ����, �α����� ��� ������ �����,
		�����̸�����(),��������(),�α�������()�޼��带 ����ÿ�.*/
		/* Class Nation�� ����� ���� 3�� �����, ���󺰷� Ư���� �������
		�ϳ��� �޼��� �ϳ��� �����Ͻÿ�. */
		
		Nation n = new Nation("Seoul",510_000_000,100000);
		System.out.println(n.area);
		System.out.println(n.population);
		
//		n.changeName("Japan");          // �����̸����� �޼���
//		System.out.println(n.countryName);
//		n.changeArea(900_000_000);      // �������� �޼���
//		System.out.println(n.area);
//		n.changePopulation(10_000_000); // �α������� �޼���
//		System.out.println(n.population);
		
		
		Singapore s = new Singapore();
		s.identifyRace("Chinese");
		Taiwan t = new Taiwan();
		t.whereLiveIn(1);

	}
	
}

class Nation {  // Class Nation ����
	String countryName;     // �����̸�
	public long area;        // ���� 
	public long population;  // �α���

	Nation() {}  //������ �ʱ�ȭ(�Ű����� ����)
	
	Nation(String s, long a, long p) {  //������ �ʱ�ȭ(�Ű����� �ִ�)
		countryName = s;
		area = a;
		population = p;
	}
	
	String changeName(String name) {  // �����̸� ����޼���
		countryName = name;
		return name; 
	}
	
	long changeArea(long area) {   // �������� �޼���
		this.area = area;
		return area;
	}
	
	long changePopulation(long p) {  // �α������� �޼���
		this.population = p;
		return p;
	}
}

class Singapore extends Nation { // Nation �θ� Ŭ������ Singapore �ڽ� Ŭ����
	// ������� �ϳ�, �޼��� �ϳ�(�ּ�)
	String race;
	
	void identifyRace(String race) {  // �޼���
		this.race = race;
		
		if(race.contains("malay") || race.contains("Malay")) {  // �Է¹��� ���� malay�� Malay ���� �ϳ��̸�
			System.out.println("you're malay singaporean");     // ����� malay Singaporean!
		} else if(race.contains("chinese") || race.contains("Chinese")) {
			System.out.println("you're chinese singaporean");
		} else if(race.contains("india") || race.contains("India"))  {
			System.out.println("you're india singapore");
		} else {
			System.out.println("please write correctly");
		}
	}

}

class Taiwan extends Nation {  // Nation �θ� Ŭ������ Taiwan �ڽ� Ŭ����
	// ������� �ϳ�, �޼��� �ϳ�(�ּ�)
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
	// ������� �ϳ�, �޼��� �ϳ�
	int sheep;
}

