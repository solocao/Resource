public abstract Class PageContext{
	/**
	  * ���ĸ�������С����������ң�����name
	  */
	public Object findAttribute(String name){
		Object value = null;
		//1.����page����
		value = this.getAttribute(name);
		if(value != null){
			return value;
		}
	
		//2.ȥ����������
		value = this.getRequest().getAttribute(name);
		if(value != null){
			return value;
		}

		//3.ȥ�Ự������
		value = this.getSession().getAttribute(name);
		if(value != null){
			return value;
		}


		//4.ȥӦ��������
		value = this.getServletContext().getAttribute(name);
		if(value != null){
			return value;
		}
		return value;
	}

}