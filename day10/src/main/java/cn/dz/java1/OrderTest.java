package cn.dz.java1;

import cn.dz.java.Order;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();

		order.orderPublic = 2;
		// 出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
//		order.orderDefault = 1;
		// order.orderPrivate = 3;//The field Order.orderPrivate is not visible

		order.methodPublic();
		// 出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
//		order.methodDefault();
		// order.methodPrivate();//The method methodPrivate() from the type Order is not visible
	}

	/*
		 * JavaBean是一种Java语言写成的可重用组件。

			所谓JavaBean，是指符合如下标准的Java类：
				>类是公共的
				>有一个无参的公共的构造器
				>有属性，且有对应的get、set方法

		 *
		 */
	public static class Customer {

		private int id;
		private String name;

		public Customer(){

		}

		public void setId(int i){
			id = i;
		}
		public int getId(){
			return id;
		}
		public void setName(String n){
			name = n;
		}
		public String getName(){
			return name;
		}

	}
}
