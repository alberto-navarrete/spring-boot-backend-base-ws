package com.stefanini.demoFG;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.stefanini.demoFG.controller.CargaOrdenController;
import com.stefanini.demoFG.service.CargaOrdenService;

public class HomeControllerTest {
	
	private MockMvc mockMvc;

    @Mock
    private CargaOrdenService coService;

    @InjectMocks
    private CargaOrdenController coController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(coController).build();
    }

    @Test
    public void testSayHello() throws Exception {
    	
        when(coService.getHelloMessage()).thenReturn("Hola Mundo");

        mockMvc.perform(get("/sincronizaOrden/hola"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hola Mundo"));
    }

}
