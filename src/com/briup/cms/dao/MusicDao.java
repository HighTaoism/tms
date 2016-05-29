package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.briup.cms.bean.Music;
import com.briup.cms.common.ConnectionFactory;


/*
 * 保存信息
 * */
public class MusicDao {
     public void save(Music music){
    	 try {
 			
 			Connection conn = null;
 			PreparedStatement pstmt = null;
 			try{
 				//1.注册驱动，获取连接
 				conn = ConnectionFactory.getConn();
 				String sql = "insert t_music(m_name,author,content,"
 						+ "publisurdate,c_id)values(?,?,?,?,?)";
 				//2.预处理sql
 				pstmt = conn.prepareStatement(sql);
 				pstmt.setString(1, music.getM_name());
 				pstmt.setString(2, music.getAuthor());
 				pstmt.setString(3, music.getContent());
 				long time = music.getPublisurdate().getTime();
 				pstmt.setDate(4, new Date(time));
 				pstmt.setLong(5, music.getC_id());
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
     
     /*
      * 修改
      * */
     public void update(Music music){
    	 try {
 			
 			Connection conn = null;
 			PreparedStatement pstmt = null;
 			try{
 				//1.注册驱动，获取连接
 				conn = ConnectionFactory.getConn();
 				String sql = "update t_music set m_name=?,author=?,"
 						+ "content=? where id = ?";
 				//2.预处理sql
 				pstmt = conn.prepareStatement(sql);
 				pstmt.setString(1, music.getM_name());
 				pstmt.setString(2, music.getAuthor());
 				pstmt.setString(3, music.getContent());
 				pstmt.setLong(4, music.getId());
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
     
     /*
      * 修改中的通过ID查找
      * */
     public Music findById(long id){
    	 Music music = null;
    	 
    	 try {
	 			
	 			Connection conn = null;
	 			PreparedStatement pstmt = null;
	 			ResultSet rs = null;
	 			try{
	 				//1.注册驱动，获取连接
	 				conn = ConnectionFactory.getConn();
	 				String sql = "select * from t_music where id = ?";
	 				//2.预处理
	 				pstmt = conn.prepareStatement(sql);
	 				pstmt.setLong(1, id);
	 				//3.执行SQL
	 				rs = pstmt.executeQuery();
	 				while(rs.next()){
	 					
	 					String m_name = rs.getString("m_name");
	 					String content = rs.getString("content");
	 					String author = rs.getString("author");
	 					java.util.Date publisurdate = rs.getDate("publisurdate");
	 					long c_id = rs.getLong("c_id");
	 					music = new Music(id, m_name, author, content, publisurdate, c_id);
	 					music.setId(id);
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
    	 return music;
     }
     /*
      * 查询全部音乐
      * */
     public List<Music> findAll(){
    	 List<Music> list = new ArrayList<Music>();
    	 try {
    	 			
    	 			Connection conn = null;
    	 			PreparedStatement pstmt = null;
    	 			ResultSet rs = null;
    	 			try{
    	 				//1.注册驱动，获取连接
    	 				conn = ConnectionFactory.getConn();
    	 				String sql = "select * from t_music";
    	 				//2.预处理
    	 				pstmt = conn.prepareStatement(sql);
    	 				//3.执行SQL
    	 				rs = pstmt.executeQuery();
    	 				while(rs.next()){
    	 					long id = rs.getLong("id");
    	 					String m_name = rs.getString("m_name");
    	 					String content = rs.getString("content");
    	 					String author = rs.getString("author");
    	 					java.util.Date publisurdate = rs.getDate("publisurdate");
    	 					long c_id = rs.getLong("c_id");
    	 					Music music = new Music(id, m_name, author, content, publisurdate, c_id);
    	 					list.add(music);
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
     
     /*
      * 通过id删除信息
      * */
   public void deleteById(long id){
	   try {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				//1.注册驱动，获取连接
				conn = ConnectionFactory.getConn();
				String sql = "delete from t_music where id=?";
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

