package edu.ccat.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Este es el  composite
public class Folder implements File {

  private List<File> files; // leafs
  private String name;

  public Folder(String name) {
    this.name = name;
    this.files = new ArrayList<>();
  }

  @Override
  public void print() {
    System.out.println(this.name);
    files.forEach(File::print);
  }

  @Override
  public String getFormattedOutput() {
    return this.name + "\n" +
        files.stream()
        .map(f -> "\t" + f.getFormattedOutput())
        .reduce("", (x, y) -> x+y);
  }

  public void addFile(File file) {
    this.files.add(file);
  }
}
