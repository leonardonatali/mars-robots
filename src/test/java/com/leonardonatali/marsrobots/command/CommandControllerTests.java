package com.leonardonatali.marsrobots.command;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@EnableWebMvc
public class CommandControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldBeReturn2_0_s() throws Exception {
        mockMvc.perform(post("/rest/mars/MMRMMRMM")).andExpect(status().isOk())
                .andExpect(content().string("(2, 0, S)"));
    }

    @Test
    public void shouldBeReturn0_2_w() throws Exception {
        mockMvc.perform(post("/rest/mars/MML")).andExpect(status().isOk()).andExpect(content().string("(0, 2, W)"));
    }

    @Test
    public void shouldBeReturn400_bad_requestToAnInvalidCommand() throws Exception {
        mockMvc.perform(post("/rest/mars/AAA")).andExpect(status().isBadRequest())
                .andExpect(content().string("400 Bad Request"));
    }

    @Test
    public void shouldBeReturn400_bad_requestToAnInvalidPosition() throws Exception {
        mockMvc.perform(post("/rest/mars/MMMMMMMMMMMMMMMMMMMMMMMM")).andExpect(status().isBadRequest())
                .andExpect(content().string("400 Bad Request"));
    }
}
