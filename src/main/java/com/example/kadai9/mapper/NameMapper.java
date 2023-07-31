package com.example.kadai9.mapper;

import com.example.kadai9.entity.Name;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface NameMapper {
    @Select("SELECT * FROM names")
    List<Name> findAll();

    @Select("SELECT * FROM names WHERE id = #{id}")
    Name findById(int id);

    @Insert("insert into names (name,age) values (#{name},#{age})")
    public void createName(Name name);

    @Update("update names set name = #{name}, age = #{age} where id = #{id}")
    public void updateName(Name name);
}
