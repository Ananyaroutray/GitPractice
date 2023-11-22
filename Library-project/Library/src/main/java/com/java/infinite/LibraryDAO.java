package com.java.infinite;

import java.sql.SQLException;
import java.util.List;

public interface LibraryDAO {
	String createUser(LibUsers userName) throws ClassNotFoundException, SQLException;
	int authenticate(LibUsers libUsers) throws ClassNotFoundException, SQLException;
	List<Books> searchBooks(String searchType, String searchValue) throws SQLException, ClassNotFoundException;
	String IssuedBook(String userName, int bookId) throws SQLException, ClassNotFoundException;
	List<TranBook> showIssuedBooks(String userName) throws ClassNotFoundException, SQLException;
	int issueOrNot(String userName, int bookId) throws ClassNotFoundException, SQLException;
	
}
