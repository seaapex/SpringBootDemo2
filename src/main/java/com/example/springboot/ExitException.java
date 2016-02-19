package com.example.springboot;

import org.springframework.boot.ExitCodeGenerator;

/**
 * Created by Deven on 2016-02-17.
 */
public class ExitException extends RuntimeException implements ExitCodeGenerator {

    @Override
    public int getExitCode() {
        return 10;
    }

}
