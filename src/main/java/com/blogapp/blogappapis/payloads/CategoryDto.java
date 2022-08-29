package com.blogapp.blogappapis.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Integer categoryId;

    @NotBlank
    @Size(min = 4, message = "minimum title size is 4")
    private String categoryTitle;

    @NotBlank
    @Size(min = 10, message = "minimum description size is 10")
    private String categoryDescription;
}
