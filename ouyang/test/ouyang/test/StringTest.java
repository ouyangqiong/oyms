package ouyang.test;

/**
 * @ClassName StringTest
 * @Description TODO(用一句话描述功能)
 * @author 欧阳琼
 * @date 2014-2-18 下午03:11:45
 */
public class StringTest {

	static{
		System.out.println("paaa");
	}
	public StringTest(){
		System.out.println("pbbb");
	}
	static{
		System.out.println("pccc");
	}
	{
		System.out.println("pddd");
	}
	{
		System.out.println("peee");
	}
	public static int a=3;
	public static void main(String[] args){
		//StringTest st=new StringTest();
//		String str="opq";
//		st.getStr1(str);
//		System.out.println(str);
//		String[] arr=new String[]{"111","ttt","ppp"};
//		st.changeArr(arr);
//		a++;
//		st.a++;
//		StringTest.a++;
//		System.out.println(a);
		StringTest c=new Child();
	}
	
	public void getStr(String str){
		str.replace("o", "t");
	}
	public void getStr1(String str){
		str=new String("Hello");
	}
	public void changeArr(String[] arr){
		arr[0]="nihao";
	}
}
class Child extends StringTest{
	{
		System.out.println("d");
	}
	static{
		System.out.println("a");
	}
	public Child(){
		System.out.println("b");
	}
	static{
		System.out.println("c");
	}
	
	{
		System.out.println("e");
	}
}
