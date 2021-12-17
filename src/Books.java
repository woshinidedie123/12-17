import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Books{
	String bno;//编号
	String name;//名字
	double price;//价格
	String press;//出版社
	//全参构造方法
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

	public static void main(String[] args) {//new 五个图书对象
		Books b1 = new Books("001","悲惨世界",56,"天堂出版社");
		Books b2 = new Books("002","金银岛",85,"地府出版社");
		Books b3 = new Books("003","绘画艺术",76,"美术出版社");
		Books b4 = new Books("004","红楼梦",58,"中国出版社");
		
		//new一个list对象
		List<Books> l =new ArrayList<Books>();
		//添加图书对象到l
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		//遍历输出
		for (Books s:l) {
			System.out.println(s);
		}
		
		System.out.println("-----------------------------------");
		//mew 一个HASHmap对象
		HashMap<String,Books>hm=new HashMap<String,Books>();
		//以编号为key添加图书到对象hm
		hm.put(b1.bno, b1);
		hm.put(b2.bno, b2);
		hm.put(b3.bno, b3);
		hm.put(b4.bno, b4);
		//获得所有key
		Set<String> k= hm.keySet();
		//遍历输出
		
		for(String s:k) {
			System.out.println(hm.get(s));
		}
	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
