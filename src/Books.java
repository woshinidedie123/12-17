import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Books{
	String bno;//���
	String name;//����
	double price;//�۸�
	String press;//������
	//ȫ�ι��췽��
	public Books(String bno,String name,double price,String press) {
		    super();
		    this.bno=bno;
		    this.name=name;
		    this.price=price;
		    this.press=press;
	}
}
@Override
public String toString() {
	return"BOOKS [bno="+bno+",name="+name+",price="+price+",press="+press+"]"
}


public class Books {

	public static void main(String[] args) {//new ���ͼ�����
		Books b1 = new Books("001","��������",56,"���ó�����");
		Books b2 = new Books("002","������",85,"�ظ�������");
		Books b3 = new Books("003","�滭����",76,"����������");
		Books b4 = new Books("004","��¥��",58,"�й�������");
		
		//newһ��list����
		List<Books> l =new ArrayList<Books>();
		//���ͼ�����l
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		//�������
		for (Books s:l) {
			System.out.println(s);
		}
		
		System.out.println("-----------------------------------");
		//mew һ��HASHmap����
		HashMap<String,Books>hm=new HashMap<String,Books>();
		//�Ա��Ϊkey���ͼ�鵽����hm
		hm.put(b1.bno, b1);
		hm.put(b2.bno, b2);
		hm.put(b3.bno, b3);
		hm.put(b4.bno, b4);
		//�������key
		Set<String> k= hm.keySet();
		//�������
		
		for(String s:k) {
			System.out.println(hm.get(s));
		}
	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
