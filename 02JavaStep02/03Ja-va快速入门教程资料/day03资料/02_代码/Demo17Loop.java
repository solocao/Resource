public class Demo17Loop {
	public static void main(String[] args) {
		int count = 0;
		
		for (int i = 1; i <= 300; i++) { // ѭ��300�Σ�����300���༶
		
			for (int j = 1; j <= 80; j++) { // ѭ��80�Σ�����ÿ���༶80��ѧ��
				count++;
			}
			
		}
		
		System.out.println("��������" + count);
	}
}