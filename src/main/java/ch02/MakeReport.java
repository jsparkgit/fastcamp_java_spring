package ch02;

public class MakeReport {

    StringBuffer buffer = new StringBuffer();

    private String line = "===============================================\n";
    private String title = "    name\t      address \t\t    phone number    \n";
    private void makeHeader() {

        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody() {
        buffer.append("James \t");
        buffer.append("Seould Korea \t");
        buffer.append("010-21212-2323\n");

        buffer.append("Tmoas \t");
        buffer.append("Busan \t");
        buffer.append("010-2393-2323\n");
    }

    private void makeFooter() {

        buffer.append(line);

    }

    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}

