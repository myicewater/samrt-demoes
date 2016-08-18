package mybatis;

import java.io.IOException;
import java.io.InputStream;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class SessionFactoryUtil {
private static final String MYBATIS_CONFIG_PATH = "MyBatisConfiguration.xml";
	
	private static InputStream is = null;
	
	private static SqlSessionFactory sqlSessionFactory = null;
	
	static {
		try {
			is = Resources.getResourceAsStream(MYBATIS_CONFIG_PATH);
			//SqlSessionFactoryBuilder�������Ա�ʵ����,ʹ�úͶ�����һ�������� SqlSessionFactory ��,�����Ͳ��� Ҫ�����ˡ� 
			//��� SqlSessionFactoryBuilder ʵ������ѷ�Χ�Ƿ�����Χ (Ҳ���Ǳ��ط�������)��
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * ˽�й�����
	 */
	private SessionFactoryUtil(){};
	
	/**
	 *  SqlSessionFactory �����ʵ������Ӧ�������ڼ䲻Ҫ�ظ��������
	 *  ��򵥵ľ���ʹ�õ���ģʽ���߾�̬����ģʽ��
	 * @return SqlSessionFactory
	 */
	public static SqlSessionFactory getSqlSessionFactoryIntance(){
		
		return sqlSessionFactory;
		
	}
	
	/**
	 * ÿ���̶߳�Ӧ�������Լ��� SqlSession ʵ����
	 * SqlSession ��ʵ�����ܱ�����,Ҳ���߳� ����ȫ�ġ�
	 * �����ѵķ�Χ������򷽷���Χ��
	 * ���Բ��ܽ� SqlSession ʵ�������÷���һ�� ��ľ�̬�ֶ�������ʵ���ֶ��С�
	 * @return SqlSession
	 */
	public static SqlSession getSqlSessionIntance() {


		return sqlSessionFactory.openSession();
		
	}
}
