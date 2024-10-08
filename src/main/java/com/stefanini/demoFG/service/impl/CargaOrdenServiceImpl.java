package com.stefanini.demoFG.service.impl;

import org.springframework.stereotype.Service;

import com.stefanini.demoFG.service.CargaOrdenService;

@Service
public class CargaOrdenServiceImpl implements CargaOrdenService {

	@Override
	public String getHelloMessage() {
        return "Hola Mundo";
    }
	
}
