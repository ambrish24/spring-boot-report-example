package com.angular.pdf;

import com.pdfcrowd.*;
import java.io.*;

public class ApiTest {
    public static void main(String[] args) throws IOException, Pdfcrowd.Error {
        try {
            // create the API client instance
            Pdfcrowd.HtmlToPdfClient client =
                    new Pdfcrowd.HtmlToPdfClient("demo", "");

            // run the conversion and write the result to a file
            client.convertUrlToFile("http://localhost:4000/dashboard", "result.pdf");
        }
        catch(Pdfcrowd.Error why) {
            // report the error
            System.err.println("Pdfcrowd Error: " + why);

            // rethrow or handle the exception
            throw why;
        }
        catch(IOException why) {
            // report the error
            System.err.println("IO Error: " + why);

            // rethrow or handle the exception
            throw why;
        }
    }
}
