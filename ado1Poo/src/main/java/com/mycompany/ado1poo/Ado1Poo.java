/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ado1poo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author henry
 */
public class Ado1Poo {

    public static void main(String[] args) throws IOException {

        try {
            List<Estado> list = new ArrayList<Estado>();

            String Arquivo1 = "pib.txt";

            FileReader file = new FileReader(Arquivo1);
            BufferedReader bufferedReader = new BufferedReader(file);
            double pibTotal = 0;
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                String v[] = linha.split(";");
                pibTotal += Double.parseDouble(v[1]);
            }

            file.close();
            bufferedReader.close();

            file = new FileReader(Arquivo1);
            bufferedReader = new BufferedReader(file);
            linha = bufferedReader.readLine();
            while (linha != null) {
                String v[] = linha.split(";");
                String estadoDocumento = v[0];
                double pibDocumento = (((Double.parseDouble(v[1]) / pibTotal) * 100));
                Estado pib = new Estado(estadoDocumento, pibDocumento);
                list.add(pib);
                linha = bufferedReader.readLine();
            }

            file.close();
            bufferedReader.close();

            for (Estado pib : list) {
                System.out.println(pib);
            }
           
    }catch (IOException e) {
            System.out.println("ERROR.." + e.getMessage());
        }

}
    }
