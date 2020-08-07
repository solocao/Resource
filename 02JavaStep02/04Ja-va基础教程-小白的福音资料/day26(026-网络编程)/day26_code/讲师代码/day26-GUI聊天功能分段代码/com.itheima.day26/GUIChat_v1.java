package com.itheima.day26;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * GUI����汾1 -- ����
 */
// �̳�Frame������ʹ��Frame�еĹ���
public class GUIChat_v1 extends Frame {

	private static final long serialVersionUID = 1L;

	public GUIChat_v1() {
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
				System.exit(0);
			}
		});
	}

	public void centerPanel() {
		Panel center = new Panel(); // �����м��Panel
		
		TextArea viewText = new TextArea(); // ��ʾ�ı�����
		viewText.setEditable(false); // ���ò��ɱ༭
		viewText.setBackground(Color.WHITE); // ���ñ�����ɫ
		viewText.setFont(new Font("xxx", Font.PLAIN, 15)); // ��������15��
		
		TextArea sendText = new TextArea(5, 1); // �����ı�����
		sendText.setFont(new Font("xxx", Font.PLAIN, 15));
		
		center.setLayout(new BorderLayout()); // ����Ϊ�߽粼�ֹ�����
		
		center.add(sendText, BorderLayout.SOUTH); // �������ı������������ϱ�
		center.add(viewText, BorderLayout.CENTER); // ����ʾ�ı������������м�
		
		this.add(center, BorderLayout.CENTER); // ���м��Panel��ӵ�����
		
	}

	public void southPanel() {
		Panel south = new Panel(); // �����ϱߵ�Panel
		
		TextField tf = new TextField(15); // �����ı��ֶδ洢ip��ַ��15��
		Button send = new Button("�� ��"); // ���Ͱ�ť
		Button log = new Button("�� ¼"); // ��¼��ť
		Button clear = new Button("�� ��"); // ������ť
		Button shake = new Button("�� ��"); // �𶯰�ť
		
		// ��ť��ӵ�Panel
		south.add(tf);
		south.add(send);
		south.add(log);
		south.add(clear);
		south.add(shake);
		
		this.add(south, BorderLayout.SOUTH); // ���ϱߵ�Panel��ӵ�����
	}

	public void init() {
		this.setLocation(500, 50); // ���ô���λ�ã������500px�����Ϸ�50px
		this.setSize(400, 600); // ���ô����С 400 * 600
		this.setVisible(true); // ���ô���ɼ�
	}

	public static void main(String[] args) {
		new GUIChat_v1(); // ����һ�����壨Frame���������
	}

}
