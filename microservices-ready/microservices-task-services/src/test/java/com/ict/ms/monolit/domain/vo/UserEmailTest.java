package com.ict.ms.monolit.domain.vo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ict.ms.microservices.task.domain.vo.UserEmail;

public class UserEmailTest {

    @Test
    public void shouldBeTheSame(){
        assertEquals(new UserEmail("some@email.com"), new UserEmail("some@email.com"));
    }

    @Test
    public void shouldBeCaseInsensitive(){
        assertEquals(new UserEmail("SOME@email.com"), new UserEmail("some@EMAIL.com"));
    }

}