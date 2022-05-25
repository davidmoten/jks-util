package com.github.davidmoten.jks;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.junit.Test;

public class JksTest {

    @Test
    public void test() throws IOException {
        File input = new File("src/test/resources/cacerts.jks");
        File output = new File("target/cacerts.jks");
        output.getParentFile().mkdirs();
        output.delete();
        Files.copy(input.toPath(), output.toPath());
        long now = 1653446875550L;
        List<String> list = Jks.removeExpiringCertificates(output, "changeit".toCharArray(), now);
        assertEquals(28, list.size());
    }

    @Test
    public void testCommandLine() throws IOException {
        File input = new File("src/test/resources/cacerts.jks");
        File output = new File("target/cacerts.jks");
        output.getParentFile().mkdirs();
        output.delete();
        Files.copy(input.toPath(), output.toPath());
        Jks.main(new String[] { "removeExpiring", output.getPath(), "changeit", "90"});
    }
}
