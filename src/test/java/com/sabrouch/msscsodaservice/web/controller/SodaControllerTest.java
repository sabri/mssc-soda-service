package com.sabrouch.msscsodaservice.web.controller;

import com.sabrouch.msscsodaservice.web.model.SodaDto;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SodaController.class)
class SodaControllerTest {
@Autowired
    MockMvc mockMvc;


    private final ObjectMapper objectMapper;

    SodaControllerTest(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Test
    void getSoda() throws Exception {
        mockMvc.perform(get("/api/v1/soda/"+UUID.randomUUID()
                .toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void postHanfdle() throws Exception {
        SodaDto sodaDto = SodaDto.builder().build();
            String sodaDtoJson = objectMapper.writeValueAsString(sodaDto);
            mockMvc.perform(post("/api/v1/soda/")
                    .contentType(MediaType.APPLICATION_JSON).content(sodaDtoJson))
                    .andExpect(status().isCreated());
     }

    @Test
    void updateHandler() throws Exception {
        SodaDto sodaDto = SodaDto.builder().build();
        String sodaDtoJson = objectMapper.writeValueAsString(sodaDto);
        mockMvc.perform(put("/api/v1/soda/")
                .contentType(MediaType.APPLICATION_JSON).content(sodaDtoJson))
                .andExpect(status().isNoContent());
    }
    }
