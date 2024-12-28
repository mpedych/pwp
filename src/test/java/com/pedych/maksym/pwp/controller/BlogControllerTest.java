package com.pedych.maksym.pwp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(controllers = BlogController.class)
class BlogControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void blog() throws Exception {
        mockMvc.perform(get("/blog"))
                .andExpect(content().string(containsString("This is the blog main page.")));
    }

}