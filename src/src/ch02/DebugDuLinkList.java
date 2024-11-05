package src.ch02;

/**
 * 
 * 对双向循环链表及其基本操作进行调试
 * 
 */
public class DebugDuLinkList {
	
	public static void main(String[] args) throws Exception {
		// --------调用构造函数--------
		System.out.println("请输入3个双向循环链表中的数据元素：");
		DuLinkList L = new DuLinkList(3);// 从表尾到表头逆向建立一个表长为3的单链表
		System.out.println("双向循环链表中各个数据元素：");
		L.display();

		// --------调用length()求顺序表的长度--------
		System.out.println("双向循环链表的长度:" + L.length());// 输出顺序表的长度

		// --------调用get(int i)取出第i个元素--------
		if (L.get(2) != null)// 取第二个元素
			System.out.println("双向循环链表中第2个元素:" + L.get(2));

		// --------调用indexOf(Object x)查找x元素所在的位置--------
		int order = L.indexOf("c");// 求出数据元素字符串c在顺序表中的位置
		if (order != -1)
			System.out.println("双向循环链表中值为字符串c的数据元素的位置为：" + order);// 输出数据元素c的位置
		else
			System.out.println("字符'c'不在此双向循环链表中");

		// --------调用remove(int i)删除数据元素--------
		L.remove(2); // 删除第二个数据元素
		System.out.println("删除第二个数据元素后双向循环链表中各个数据元素：");
		L.display();

		// --------调用 insert(int i, Object x)插入数据元素--------
		L.insert(2, 'd');// 在双向循环链表的第三个位置插入数据元素d
		System.out.println("在2的位置插入数据元素d后双向循环链表中各个数据元素：");
		L.display();

		// --------调用L.clear()将顺序表置空--------
		L.clear();
		System.out.println("将双向循环链表置空后，再次打印表中的元素:");

		// --------调用isEmpty()判断顺序表是否为空--------
		if (L.isEmpty())
			System.out.println("双向循环链表为空");
		else {
			System.out.println("双向循环链表不为空,双向循环链表中各个数据元素：");
			L.display();
		}
	}
}

// 调试结果：
// 请输入3个双向循环链表中的数据元素：
// 1 2 3
// 双向循环链表中各个数据元素：
// 3 2 1
// 双向循环链表的长度:3
// 双向循环链表中第2个元素:1
// 字符'c'不在此双向循环链表中
// 删除第二个数据元素后双向循环链表中各个数据元素：
// 3 2
// 在2的位置插入数据元素d后双向循环链表中各个数据元素：
// 3 2 d
// 将双向循环链表置空后，再次打印表中的元素:
// 双向循环链表为空
