package askmsaconfiguration;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class askmsaobjectrepo {
    
    
    public void testConfig() throws Exception{
        
        File src=new File("./Configuration/Config.property");
        
        FileInputStream fis=new FileInputStream(src);
        
        Properties pro=new Properties();
        
        pro.load(fis);
        
        String chromepath=pro.getProperty("ChromeDriver");
        
        System.out.println("Hey Chrome Path is ==="+chromepath);
        
        String IEpath=pro.getProperty("IEDriver");
        
        System.out.println("Hey IE Path is ==="+IEpath);
        
        String FireFoxpath=pro.getProperty("FireFoxDriver");
        
        System.out.println("Hey Firefox Path is ==="+FireFoxpath);
        
        String Edgepath=pro.getProperty("EdgeDriver");
        
        System.out.println("Hey Firefox Path is ==="+Edgepath);
        
        pro.getProperty("STGURLVIP");
        
        pro.getProperty("STGVIPusername1");
        pro.getProperty("STGVIPusername2");
        
        pro.getProperty("STGVIPpasword1");
        pro.getProperty("STGVIPpasword2");
        
        pro.getProperty("STGVIPLoginbutton");
        
        pro.getProperty("STGURLCMS");
        
        pro.getProperty("STGCMSusername1");
        pro.getProperty("STGCMSusername2");
        
        pro.getProperty("STGCMSpassword1");
        pro.getProperty("STGCMSpassword2");
        
        pro.getProperty("STGURLASKMSA");
        
        
        
        
        
    }
}