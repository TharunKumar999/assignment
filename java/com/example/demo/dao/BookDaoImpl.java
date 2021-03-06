package com.example.demo.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.BookNotFoundException;
import com.example.demo.model.Book;
import com.example.demo.model.BookRowMapper;

@Repository
public class BookDaoImpl implements BookDao {

	/*
	 * private DataSource dataSource;
	 * 
	 * public BookDaoImpl(DataSource dataSource) { super(); this.dataSource =
	 * dataSource; }
	 * 
	 * @Override public Connection getMyConnection() throws SQLException {
	 * 
	 * Connection connection=dataSource.getConnection(); return connection; }
	 */
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public BookDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Book createBook(Book book) throws SQLException {
		
		int count=jdbcTemplate.update("insert into book(book_id,book_name,book_price) values(?,?,?)",book.getBookId(),book.getBookName(),book.getBookPrice());
		System.out.format("%d rows inserted",count);
		return book;
	}
	@Override
	public Book updateBook(Book book) throws SQLException {
		
		int count=jdbcTemplate.update("update book(book_id,book_name,book_price) values(?,?,?)",book.getBookId(),book.getBookName(),book.getBookPrice());
		System.out.format("%d rows inserted",count);
		return book;
	}
	

	@Override
	public List<Book> displayAllBook() {

	//	List<Book> books=jdbcTemplate.query("select * from book", new BeanPropertyRowMapper<Book>(Book.class));
		
		List<Book> books=jdbcTemplate.query("select * from book", new BookRowMapper());
		return books;
	}

	@Override
	public List<Book> findBookById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		List<Book> list=jdbcTemplate.query("select * from book where book_id='"+id+"'",new BookRowMapper());
			
		
		
		return list;
	}

	@Override
	public List<Book> updateBookById(Book book) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> updateBookById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	

}

