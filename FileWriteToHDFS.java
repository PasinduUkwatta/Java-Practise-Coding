import jdk.internal.agent.FileSystem;
import sun.security.util.IOUtils;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.Path;

public class FileWriteToHDFS {
    public static void main(String[] args)throws Exception{
        String localSrc =args[0];
        String dst =args[1];

        InputStream in =new BufferedInputStream(new FileInputStream(localSrc));

        Configuration conf =new Configuration();
        System.out.println("Connecting to --"+conf.get("fs.defaultFS"));

        FileSystem fs =FileSystem.get(URI.create(dst),conf);
        OutputStream out =fs.create(new Path(dst));

        IOUtils.copyBytes(in,out,4096,true);

        System.out.println(dst+"copied to HDFS");

        }

    }


