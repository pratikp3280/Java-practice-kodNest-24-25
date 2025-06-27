package Multi_Thread_examples;

public class FileDownloadTest {
    public static void main(String[] args) throws InterruptedException {
        FileDownloader file1 = new FileDownloader("File1.pdf");
        FileDownloader file2 = new FileDownloader("File2.jpg");
        FileDownloader file3 = new FileDownloader("File3.mp4");

        file1.start();
        Thread.sleep(3000);
        file2.start();
        Thread.sleep(3000);
        file3.start();
        Thread.sleep(3000);
    }
}


class FileDownloader extends Thread {
    private String fileName;

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Downloading " + fileName + "...");
       
        System.out.println(fileName + " Download Complete ✅");
    }
}


