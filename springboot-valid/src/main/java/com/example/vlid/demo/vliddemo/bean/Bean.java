package com.example.vlid.demo.vliddemo.bean;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Bean {

    @NotEmpty(message = "不能为空")
    private String name;

    @Min(value = 1,message = "大于0")
    @NotNull(message = "不能为空")
    private Integer age;
}
