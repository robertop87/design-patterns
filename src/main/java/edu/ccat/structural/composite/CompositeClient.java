package edu.ccat.structural.composite;

public class CompositeClient {

  public static void main(String[] args) {
    // Debe simular el comando tree de UNIX
    Folder folder1 = new Folder("Folder1");
    File docx = new FileImpl("docx");
    File pdf = new FileImpl("pdf");

    Folder folder2 = new Folder("Folder2");
    folder2.addFile(new FileImpl("txt"));
    folder2.addFile(new FileImpl("avi"));
    folder2.addFile(new Folder("folder3"));

    Folder folder4 = new Folder("folder4");
    folder4.addFile(new FileImpl("txt4"));
    folder2.addFile(folder4);


//    pdf.print();
//    docx.print();

    folder1.addFile(docx);
    folder1.addFile(pdf);
    folder1.addFile(folder2);

    // folder1.print();

    // folder2.print();
    System.out.println(folder1.getFormattedOutput());
  }
}
