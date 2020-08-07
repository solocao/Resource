package com.itheima.day26;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * GUI����汾3 -- �𶯹���
 */
// �̳�Frame������ʹ��Frame�еĹ���
public class GUIChat_v5 extends Frame {

	private static final long serialVersionUID = 4605735517129860188L;
	private TextField tf;
	private Button send;
	private Button log;
	private Button clear;
	private Button shake;
	private TextArea viewText;
	private TextArea sendText;

	private DatagramSocket socket; // ���Ͷ�Socket����
	
	private BufferedWriter bw; // ���������־�ļ�д����

	public GUIChat_v5() {
		// ������ĳ�ʼ�������ŵ����췽���У�����һ�����ͳ�ʼ�����ˡ�

		init(); // ��ʼ������

		southPanel(); // ��ʼ���ϱߵ�Panel

		centerPanel(); // ��ʼ���м��Panel

		event(); // ����¼�
	}

	public void event() {
		// ����ر��¼�
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				socket.close(); // �˳�֮ǰ�ٹر�socket����
				
				try {
					bw.close(); // �ر������
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				System.exit(0);
			}
		});

		// ���͹���
		send.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �ѷ��͹�����ȡ��һ������
				try {
					send();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		// ��¼����
		log.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					logFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		});
		
		// ��������
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewText.setText("");
			}
		});
		
		// �𶯹���
		shake.addActionListener(new ActionListener() {
			/*
			 * ���ǽ��Է��Ľ������������
			 * ʵ��˼·�����Է�����һ�������ֽڣ�-1. �ڽ��ն�����ӵ�������������ֽڣ��͵���shake()����������
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send(new byte[]{-1},tf.getText()); // ����һ���ֽ�ֵ��-1
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		});
	}
	
	// ��
	public void shake() {
		int x = this.getLocation().x;							//��ȡ������λ��
		int y = this.getLocation().y;							//��ȡ������λ��
		
		for(int i = 0; i < 20; i++) {
			try {
				this.setLocation(x + 20, y + 20);
				Thread.sleep(20);
				this.setLocation(x + 20, y - 20);
				Thread.sleep(20);
				this.setLocation(x - 20, y + 20);
				Thread.sleep(20);
				this.setLocation(x - 20, y - 20);
				Thread.sleep(20);
				this.setLocation(x, y);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	// ��¼
	public void logFile() throws IOException{
		bw.flush(); // ÿ�ε����¼����ȡ����ǰ��ˢ�»�����
		
		FileInputStream fis = new FileInputStream("config.txt");
		// ʹ���ڴ������������Ϣ��ȫ��ˢ���ڴ�����һ���Էŵ���ʾ����
		ByteArrayOutputStream baos = new ByteArrayOutputStream();	//���ڴ��д���������
		
		int len;
		byte[] arr = new byte[8192];
		while((len = fis.read(arr)) != -1) {
			baos.write(arr, 0, len);
		}
		
		String str = baos.toString();				//���ڴ��е�����ת�������ַ���
		viewText.setText(str);
		
		fis.close();
	}
	
	//�����͹�����Ĳ��ִ����ȡ�����γ�һ�����صķ����������������𶯹���
	public void send(byte[] arr, String ip) throws IOException {
		DatagramPacket packet = 
				new DatagramPacket(arr, arr.length, InetAddress.getByName(ip), 9999);
		socket.send(packet);						//��������
	}

	// ����
	public void send() throws IOException {
		String message = sendText.getText(); // ��ȡ�������������
		String ip = tf.getText(); // ��ȡip��ַ;
		
//		socket = new DatagramSocket(); // �������Ͷ�Socket���񣬷ŵ���ʼ��ʱ��ɣ���Ϊ����Ҫÿ�η��Ͷ����´���

		send(message.getBytes(),ip);

		String time = getCurrentTime(); // ��ȡ��ǰʱ��
		
		String str = time + " �Ҷ�:" + ip + "˵\r\n" + message + "\r\n\r\n";
		
		viewText.append(str); // ����Ϣ��ӵ���ʾ������
		
		bw.write(str); // ����Ϣд���ļ�
		
		sendText.setText(""); // ��շ�����������
		
//		socket.close(); // �رշ��Ͷ�Socket���񣬷ŵ��˳���������ܷ�һ����Ϣ���˳��ˡ�

	}

	// ��ȡ��ǰʱ���ַ���
	private String getCurrentTime() {
		Date d = new Date(); // ������ǰ���ڶ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		return sdf.format(d); // ��ʱ���ʽ��
	}

	// �м��Panel
	public void centerPanel() {
		Panel center = new Panel(); // �����м��Panel

		viewText = new TextArea();
		viewText.setEditable(false); // ���ò��ɱ༭
		viewText.setBackground(Color.WHITE); // ���ñ�����ɫ
		viewText.setFont(new Font("xxx", Font.PLAIN, 15)); // ��������15��

		sendText = new TextArea(5, 1);
		sendText.setFont(new Font("xxx", Font.PLAIN, 15));

		center.setLayout(new BorderLayout()); // ����Ϊ�߽粼�ֹ�����

		center.add(sendText, BorderLayout.SOUTH); // �������ı������������ϱ�
		center.add(viewText, BorderLayout.CENTER); // ����ʾ�ı������������м�

		this.add(center, BorderLayout.CENTER); // ���м��Panel��ӵ�����

	}

	// �ϱߵ�Panel
	public void southPanel() {
		Panel south = new Panel(); // �����ϱߵ�Panel

		tf = new TextField(15);
		tf.setText("127.0.0.1"); // ����Ĭ�ϵķ���IP

		send = new Button("�� ��");
		log = new Button("�� ¼");
		clear = new Button("�� ��");
		shake = new Button("�� ��");

		// ��ť��ӵ�Panel
		south.add(tf);
		south.add(send);
		south.add(log);
		south.add(clear);
		south.add(shake);

		this.add(south, BorderLayout.SOUTH); // ���ϱߵ�Panel��ӵ�����
	}

	// ��ʼ������
	public void init() {
		this.setLocation(500, 50); // ���ô���λ�ã������500px�����Ϸ�50px
		this.setSize(400, 600); // ���ô����С 400 * 600
		
		new Receive().start(); // ���������߳�
		
		try {
			socket = new DatagramSocket();// ��ʼ����ʱ��ʹ������Ͷ�Socket����
			
			bw = new BufferedWriter(new FileWriter("config.txt", true)); // ���������д�����¼, ׷��д��
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		this.setVisible(true); // ���ô���ɼ�
	}
	
	// �������ݵ��߳� -- ������ڲ���ĺô����ⲿ��ĳ�Ա��������ֱ������ʹ��
	private class Receive extends Thread {//���պͷ�����Ҫͬʱִ��,���Զ���ɶ��̵߳�
		@Override
		public void run() {
			try {
				DatagramSocket socket = new DatagramSocket(9999);
				DatagramPacket packet = new DatagramPacket(new byte[8192], 8192);
				
				while(true) {
					socket.receive(packet);				//������Ϣ
					byte[] arr = packet.getData();		//��ȡ�ֽ�����
					int len = packet.getLength();		//��ȡ��Ч���ֽ�����
					
					if(arr[0] == -1 && len == 1) {		//����������������һ���洢��ֵ��-1,�������鳤����1
						shake();						//�����𶯷���
						continue;						//��ֹ����ѭ��,�����´�ѭ��,��Ϊ�𶯺���Ҫִ������Ĵ���
					}
					
					String message = new String(arr,0,len);	//ת�����ַ���
					
					String time = getCurrentTime();		//��ȡ��ǰʱ��
					String ip = packet.getAddress().getHostAddress();	//��ȡip��ַ
					String str = time + " " + ip + " ����˵:\r\n" + message + "\r\n\r\n";
					viewText.append(str);
					
					bw.write(str); // �����յ���ϢҲд���ļ�
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new GUIChat_v5(); // ����һ�����壨Frame���������
	}

}
