package ch02Exercise;

import ch02.SqList;


public class Exercise2_3_1 {

	public static void main(String[] args) throws Exception {
		SqList L = new SqList(10);
		for (int i = 0; i <= 8; i++)
			L.insert(i, i);
		System.out.println("逆置前顺序表中的各个数据元素为：");
		L.display();
		L.reverse();
		System.out.println("逆置后顺序表中的各个数据元素为：");
		L.display();
	}
}

// 调试结果：
// 逆置前顺序表中的各个数据元素为：
// 0 1 2 3 4 5 6 7 8
// 逆置后顺序表中的各个数据元素为：
// 8 7 6 5 4 3 2 1 0
