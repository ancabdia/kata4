package main;

import java.io.IOException;
import java.util.List;
import model.*;
import view.*;

public class main {
    public static void main(String[] args) throws IOException {
        String filename = "email.txt";
        List<Mail> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
