import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
public class NioExample {


public class NioExample {
    public static void main(String[] args) throws IOException {
        // intializing two files in Array;
        String[] inputFiles = {"C:/Downloads/file1.txt", "C:/Downloads/file2,txt"};

        // Specify out file with path location

//Files contents will be written in these files
        String outputFile -"C:/Downloads/nioOutput.txt";


        // Get Channel for destination or outPutFiles
        FilesOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for (int i = 0; i < inputFiles.length; i++) {

        }
        // Get channel for inputFiles
        FileInputStream fis = new FileInputStream(inoutFiles[i]);
        FileChannel inputChannel = fis.getChannel();
        long size = inputchannel.size();
        ByteBufferbuf = ByteBuffer.allocate((int) size);
        System.out.println((char) buf.get());
        while (inputchannel.read(buf) > 0) {
            buf.flip();
            // System.out.print((char) nuf.get());
            targetChannel.write(buf);
        }
    }
    //fis.close();
    }
}
}
