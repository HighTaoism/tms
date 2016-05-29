package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.briup.cms.bean.Category;
import com.briup.cms.common.ConnectionFactory;

public class CategoryDao {
/*
 * 栏目保存项目
 * */
	public void save(Category category){
		
		try {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				//1.注册驱动，获取连接
				conn = ConnectionFactory.getConn();
				String sql = "insert t_category(name,code)values(?,?)";
				//2.预处理sql
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, category.getName());
				pstmt.setInt(2, category.getCode());
				//3.执行SQL
				pstmt.executeUpdate();
				
			}finally{
				//4.释放资源
				if(pstmt!=null){
					pstmt.close();
				}
				if(conn!=null){
					pstmt.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 查找栏目列表
	 * */
	public List<Category> findAll(){
		List<Category> list = new ArrayList<Category>();
try {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				//1.注册驱动，获取连接
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_category";
				//2.预处理
				pstmt = conn.prepareStatement(sql);
				//3.执行SQL
				rs = pstmt.executeQuery();
				while(rs.next()){
					long id = rs.getLong("id");
					String name = rs.getString("name");
					int code = rs.getInt("code");
					Category c = new Category(name, code);
					c.setId(id);
					list.add(c);
				}
			}finally{
				//4.释放资源
				if(rs!=null){
					rs.close();
				}
				if(pstmt!=null){
					pstmt.close();
				}
				if(conn!=null){
					pstmt.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 删除栏目由传来的ID号
	 * */
	public void deleteById(Long id){
try {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				//1.注册驱动，获取连接
				conn = ConnectionFactory.getConn();
				String sql = "delete from t_category where id=?";
				//2.预处理sql
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				//3.执行SQL
				pstmt.executeUpdate();
				
			}finally{
				//4.释放资源
				if(pstmt!=null){
					pstmt.close();
				}
				if(conn!=null){
					pstmt.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
