/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jgrep;

import java.nio.file.Path;

/**
 *
 * @author ciaran
 */
public class NumberedLine {
    private final int number;
    private final String line;
    private final Path path;
    
    NumberedLine(int number, String line, Path path) {
        this.number = number;
        this.line = line;
        this.path = path;
    }
    
    public int getNumber() {
        return number;
    }
    
    public String getLine() {
        return line;
    }

    public Path getPath() {
        return path;
    }
    
    @Override
    public String toString() {
        return path.getFileName() + ":" + number + ":\t" + line;
    }
}
