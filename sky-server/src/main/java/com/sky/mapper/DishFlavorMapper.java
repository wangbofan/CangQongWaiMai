package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DishFlavorMapper {

    @Select("select * from dish_flavor where id = #{id}")
    DishFlavor getById(Long id);

}
