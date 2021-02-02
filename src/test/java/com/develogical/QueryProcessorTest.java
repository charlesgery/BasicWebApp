package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void teamName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("Piazza"));
    }

    @Test
    public void addition() throws Exception {
        assertThat(queryProcessor.process("what is 2 plus 2"), containsString("4"));
    }

    @Test
    public void findMax() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest 2018 2019"), containsString("2019"));
    }



    @Test
    public void findMaxComma() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest 2018, 2019"), containsString("2019"));
    }

    @Test
    public void mult() throws Exception {
        assertThat(queryProcessor.process("what is 2 mutiplied by 2"), containsString("4"));
    }

    @Test
    public void pow() throws Exception {
        assertThat(queryProcessor.process("what is 2 to the power of 2"), containsString("4"));
    }

    @Test
    public void minus() throws Exception {
        assertThat(queryProcessor.process("what is 2 minus 2"), containsString("0"));
    }
}

