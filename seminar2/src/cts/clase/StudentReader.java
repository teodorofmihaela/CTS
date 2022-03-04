package cts.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends Reader {

    @Override
    public List<Aplicant> readAplicanti(String file) {

        Scanner input = null;
        try {
            input = new Scanner(new File(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        input.useDelimiter(",|\n");
        List<Aplicant> aplicanti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
           Student student=new Student();
           readAplicant(input,student);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            student.setAn_studii(an_studii);
            student.setFacultate(facultate);
            aplicanti.add(student);
        }
        input.close();
        return aplicanti;
    }
}
