/**
 * 
 */
package springjdbc;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmplyeeDao;
import entity.Employee;

/**
 * 
 * @author wentao
 */
public class test {
	private EmplyeeDao edao;
	@Before
	/**
	 * @Before修饰的方法会在其他
	 * 测试方法运行之前先执行
	 * */
	public void init() {
		String config="applicationContext.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(config);
	    edao=ac.getBean("employeeDao",EmplyeeDao.class);
	}
	
	@Test
	public void test() {
		Employee e=new Employee();
		e.setName("ceshi");
		edao.save(e);
	}
	
	@Test
	public void test1() {
		List<Employee> d=edao.findAll();
		System.out.println(d);
		
	}
	
	@Test
	public void test2() {
		Employee d=edao.findById(1);
		System.out.println(d);
		
	}
	
	@Test
	public void test3() {
		Employee d=edao.findById(1);
		d.setName("hehe");
		edao.update(d);
	}
	
	@Test
	public void test4() {
		//Employee d=edao.findById(1);
		edao.delete(1);
	}


}
