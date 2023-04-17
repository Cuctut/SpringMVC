package com.lin.dao;

import com.lin.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

    @Insert("INSERT INTO tbl_book (type, name, description) VALUES (#{type}, #{name}, #{description})")
    int save(Book book);

    @Update("UPDATE tbl_book SET type = #{type}, name = #{name}, description = #{description} WHERE id = #{id}")
    int update(Book book);

    @Delete("DELETE FROM tbl_book WHERE id = #{id}")
    int delete(Integer id);

    @Select("SELECT * FROM tbl_book WHERE id = #{id}")
    Book getById(Integer id);

    @Select("SELECT * FROM tbl_book")
    List<Book> getAll();

}
