1��OGNL���ʽ�ļ�ʹ��
	OGNL������ͼ��������
	OGNL���ʽ�������Ի�ȡ���ݣ������Դ����ݡ�
	�����Ե���java����ķ�����
	user.name ����ȥ���ַ���������ִ��user�����getName����ʱ����ʾ��OGNL���ʽ���͡�
	ʹ��OGNL���ʽ��ȡ���ݣ��������ڿ����о����õġ�
	ʹ��OGNL���ʽʵ�ָ�����ĸ�ֵ����struts2������ġ�

	ѧϰ��OGNL���ʽ֮��EL���ʽ���ò��ã�
		EL���ʽ��������Χ��
			page	request	   session	application
		��С�������������ֻҪ�ҵ��Ͳ��ټ�������
		��ʹ����Struts2֮������request��������ǿ���ı���EL���ʽ������˳��
		���Խ��ۣ������Ժ���EL���ʽ
2��OGNL������-ContextMap
	����Struts2����з�װ����������������װ������һ��������ܻ��õ����������ݡ�
	����һ��Map�ṹ��Map��key��String���ͣ�Map��Value��Object���͡�
	�������ݰ������������������ݣ�
	     |
	     |--application	����һ��Map����������Ӧ�����е���������
	     |
	     |--session		����һ��Map���������ǻỰ���е���������
context map--|
	     |--request		����һ��Map�����������������е���������
	     |
	     |--value stack(root)	����һ������List�ṹ����������ѵ㣩
	     |
	     |--action (the current action)	����һ�����󣬱�ʾ���ǵ�ǰִ�е�Action����
	     |
	     |--parameters		����һ��Map�������������������request.getParameterMap()
	     |
	     |--attr (searches page, request, session, then application scopes)
	     |����һ��Map�����������Ĵ����е����ݣ����Ҳ����ǰ�����С�����˳����

3��ActionContext�Լ�����ContextMap�Ĺ�ϵ
	����һ�������࣬�����ṩ���Ա�ݲ���ContextMap�ķ�����
	ActionContext�Ĵ���ʱ��㣺 ÿ�����󶼻ᴴ���µġ�������Struts2�ĺ��Ĺ������е�doFilter����
	����java eeӦ���Ƕ��ߵģ���ͨ����ActionContext�󶨵�ThreadLocal��ʵ�����߳�ͬ����
	����ͨ�������֪��Ҫ���ȡ�ö�����Ҫ����ActionContext�ľ�̬����getContext()�ӵ�ǰ�߳��ϻ�ȡ
4��ValueStack�����ʹ��
	��Ҳ��һ�������ࡣ����һ��List�ṹ��
5��Struts2��EL���ʽ��ʹ��

���ַ����ܽ᣺
	%��
	  1����OGNL���ʽת����ͨ�ַ��� %{""}
	  2�����ַ���ת��OGNL���ʽ%{}
	#��
	  1����ȡContextMap�е����ݡ�#key
	  2����ҳ���п��Դ���Map���ϡ� #{}
	$��
	  1��EL���ʽʹ��
	  2��������struts2��������ʹ��OGNL���ʽ�����ÿ�����xml�ļ���Ҳ������ע�⣩${}
6��������ʹ��OGNL���ʽ��ȡ�ͻ��б�չʾ