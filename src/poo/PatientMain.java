package poo;

import java.util.Scanner;

public class PatientMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Patient patient = new Patient();
        System.out.print("Poids du patient (en kg) : ");
        patient.setPoids(input.nextDouble());
        System.out.print("Taille du patient (en m): ");
        patient.setTaille(input.nextDouble());

        System.out.println(patient);

    }
}
