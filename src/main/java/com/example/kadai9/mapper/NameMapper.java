package com.example.kadai9.mapper;

import com.example.kadai9.entity.Name;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface NameMapper {
    @Select("SELECT * FROM names")
    List<Name> findAll();

    @Select("SELECT * FROM names WHERE id = #{id}")
    Optional<Name> findById(int id);

    @Insert("insert into names (id,name,age) values (#{id},#{name},#{age})")
    public void createName(Name name) ;
}
