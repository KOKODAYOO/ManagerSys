package cn.tiangong.tool;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtils {
	public static String fileUpload(MultipartFile file,HttpServletRequest request,String dir){
        String FileName = System.currentTimeMillis()+file.getOriginalFilename();
        String path =request.getServletContext().getRealPath(dir);
        try {
        	InputStream inputStream = file.getInputStream();
            FileUtils.copyInputStreamToFile(inputStream,new File(path+File.separator+FileName));
            if(inputStream !=null) {
            	inputStream.close();
            }
            //System.out.println(path+"/"+FileName);
            return "http://129.211.26.221:8080/tiangong/"+dir+"/"+FileName;
            //return path+"/"+FileName;
           
            //return "http://localhost:8090/tiangong/"+dir+"/"+FileName;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
