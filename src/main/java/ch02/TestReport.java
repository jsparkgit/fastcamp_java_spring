package ch02;

public class TestReport {

    public static void main(String[] args) {

        MakeReport report = new MakeReport();
        String builder = report.getReport();
        System.out.printf(builder);

    }
}
