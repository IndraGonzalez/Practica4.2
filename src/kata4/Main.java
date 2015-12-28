package kata4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        String pathName = "/Users/Indra/Desktop/email.txt";
        ArrayList<String> mailList = MailReader.read(pathName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();  
    }
}
