/**
 * 
 */
package entity;

/**
 * 演示springjdbc使用
 * @author wentao
 */
public class Employee {
	private int id;
	private String name;
	private String job;
	private int mgr;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", job=" + job + ", mgr=" + mgr + "]";
	}
	
	
	

}
