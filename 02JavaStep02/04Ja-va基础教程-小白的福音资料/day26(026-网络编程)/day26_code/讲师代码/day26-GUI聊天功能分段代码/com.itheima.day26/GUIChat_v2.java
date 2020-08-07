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
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * GUI����汾2 -- ���͹���
 */
// �̳�Frame������ʹ��Frame�еĹ���
public class GUIChat_v2 extends Frame {

	private static final long serialVersionUID = 4605735517129860188L;
	private TextField tf;
	private Button send;
	private Button log;
	private Button clear;
	private Button shake;
	private TextArea viewText;
	private TextArea sendText;

	private DatagramSocket socket;

	public GUIChat_v2() {
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
	}

	private void send() throws IOException {
		String message = sendText.getText(); // ��ȡ�������������
		String ip = tf.getText(); // ��ȡip��ַ;
		
//		socket = new DatagramSocket(); // �������Ͷ�Socket���񣬷ŵ���ʼ��ʱ��ɣ���Ϊ����Ҫÿ�η��Ͷ����´���

		DatagramPacket packet = new DatagramPacket(message.getBytes(),
				message.getBytes().length, InetAddress.getByName(ip), 9999);
		socket.send(packet);

		String time = getCurrentTime(); // ��ȡ��ǰʱ��
		
		String str = time + " �Ҷ�:" + ip + "˵\r\n" + message + "\r\n\r\n";
		
		viewText.append(str); // ����Ϣ��ӵ���ʾ������
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
		} catch (SocketException e) {
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
					
					String message = new String(arr,0,len);	//ת�����ַ���
					
					String time = getCurrentTime();		//��ȡ��ǰʱ��
					String ip = packet.getAddress().getHostAddress();	//��ȡip��ַ
					String str = time + " " + ip + " ����˵:\r\n" + message + "\r\n\r\n";
					viewText.append(str);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new GUIChat_v2(); // ����һ�����壨Frame���������
	}

}
