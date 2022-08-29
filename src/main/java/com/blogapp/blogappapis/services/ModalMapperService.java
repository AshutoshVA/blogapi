package com.blogapp.blogappapis.services;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ModalMapperService {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
