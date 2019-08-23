package main;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dto.MemberDto;

class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated metho
		
		//mybatis의 옛날 버전이 ibatis이다. 
		
		String res = "mybatis/config.xml";
		
		try {
			//mybatis 설정파일을 읽어오는 코드.
			InputStream is = Resources.getResourceAsStream(res);
			
			//SqlSessionFactory 객체를 취득하는 코드 
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			
			//SqlSession 객체를 취득
			SqlSession session = factory.openSession();
			
			//데이터 insert
//			MemberDto dto = new MemberDto("admin0822", "admin0822", "admin0822");
			//MemberDto dto = new MemberDto("admin08221", "admin08221", "admin08221");
			//MemberDto dto = new MemberDto("admin08222", "admin08222", "admin08222");
			
			//int n = session.insert("add", dto);
						
//			if( n > 0 ) {
//				session.commit();
//				System.out.println("추가 성공!");
//			}else {
//				session.rollback();
//				System.out.println("추가 실패!");
//			}
			
//			String findId = "admin08222";
//			int result = session.delete("remove", findId);
//			
//			if( result > 0 ) {
//				session.commit();
//				System.out.println("삭제 성공!");
//			}else {
//				session.rollback();
//				System.out.println("삭제 실패!");
//			}
			
			// 파라미터 타입을 MemberDto로 받는 쿼리 사용
//			MemberDto dto = new MemberDto("admin08221", null, null);
//			int result = session.delete("removeobj", dto);
//			
//			if( result > 0 ) {
//				session.commit();
//				System.out.println("삭제 성공!");
//			}else {
//				session.rollback();
//				System.out.println("삭제 실패!");
//			}
					
			MemberDto dto = new MemberDto("admin0822", "123", "123");
			int result = session.update("updateMem", dto);
			if( result > 0 ) {
				session.commit();
				System.out.println("수정 성공!");
			}else {
				session.rollback();
				System.out.println("수정 실패!");
			}		
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
				
				
				
	}

}