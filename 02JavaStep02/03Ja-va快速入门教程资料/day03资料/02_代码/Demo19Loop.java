/*
1. break��continueֻ��Ĭ��������������ε�ѭ��
2. ���ϣ��д���ڲ㣬�������������ѭ��������ô�죿

��ǩ����: for (...) {			 	// ���
	for (...) {			// �ڲ�
		break ��ǩ����;
	}
}

��ǩ���ƣ������һ���Զ���ı�ʶ����
*/
public class Demo19Loop {
	public static void main(String[] args) {
		int count = 0;
		
		label: for (int i = 1; i <= 10; i++) { // ���ѭ��10��
			
			// if (i == 3) {
			// 	continue;
			// }
		
			for (int j = 1; j <= 5; j++) { // �ڲ�ѭ��5��
				// if (j == 3) { // ����ڲ�ѭ������������3
				// 	continue;
				// }
				
				if (j == 3) {
					break label;
				}
				count++;
			}
		}
		
		System.out.println("�ܴ�����" + count);
	}
}