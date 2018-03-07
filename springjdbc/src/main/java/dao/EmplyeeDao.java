/**
 * 
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import entity.Employee;

/**
 * 
 * @author wentao
 */
@Repository("employeeDao")
public class EmplyeeDao {
	
	@Resource(name="jt")
	private JdbcTemplate jt;
	//插入数据
	public void save(Employee e) {
		String sql="INSERT INTO EMPS (ENAME,JOB,MGR) VALUES(?,?,?)";
		Object[] args= {e.getName(),e.getJob(),e.getMgr()};
		jt.update(sql,args);
	}
	//查询数据
	public List<Employee> findAll(){
		String sql="SELECT * FROM EMPS WHERE MGR=1";
		return jt.query(sql, new EmpRowMapper());
	}
	//根据id查询
	public Employee findById(int id) {
		String sql="SELECT * FROM EMPS WHERE EMPNO=?";
		Object[] args= {id};
		try {
			return 	jt.queryForObject(sql, args,new EmpRowMapper());
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	
	}
	//修改
	public void update(Employee e) {
		String sql="update emps set ename=? where empno=?";
		Object[] args= {e.getName(),e.getId()};
		jt.update(sql,args);
	}
	//删除
	public void delete(int id) {
		String sql="delete from emps where empno=?";
		Object[] args= {id};
		jt.update(sql,args);
	}
	/**
	 * 定义内部类封装结果集处理
	 * 告诉JdbcTemplate如何将一个记录
	 * 转换成一个实体对象
	 * ResultSet rs：结果集
	 * int rowNum:正在被处理记录的下标
	 * 
	 */
	class EmpRowMapper implements RowMapper<Employee>{
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {	
			Employee e=new Employee();
				e.setId(rs.getInt("empno"));
				e.setName(rs.getString("ename"));
				e.setJob(rs.getString("job"));
				e.setMgr(rs.getInt("mgr"));
			return e;
		}
		
	}
	

}
