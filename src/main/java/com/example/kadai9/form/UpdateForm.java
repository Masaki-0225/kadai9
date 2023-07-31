package com.example.kadai9.form;

import com.example.kadai9.entity.Name;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class UpdateForm {

    @Size(max = 20, message = "名前は２０文字以内で入力してください!!")
    private String name;

    @Min(value = 18, message = "18才未満はご利用いただけません")
    private Integer age;

    public Name UpdateForm(int id) {
        Name updatename = new Name(id, name, age);
        return updatename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
