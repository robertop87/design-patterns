package edu.ccat.structural.composite;

// Leaf implementa del componente File
public class FileImpl implements File {

  private String name;

  public FileImpl(String name) {
    this.name = name;
  }

  @Override
  public void print() {
    System.out.println("\t" + this.name);
  }

  @Override
  public String getFormattedOutput() {
    return this.name + "\n";
  }
}
