package com.example.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.googlecode.tesseract.android.TessBaseAPI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyTest extends AppCompatActivity {/*
    private static final String TAG = "my";
    private static File  fileUri="";
    private TessBaseAPI baseAPI;
    public void recognizeTextImage() {
        if (fileUri == null) return;
        Bitmap bitmap = BitmapFactory.decodeFile(fileUri.getPath());
        baseAPI.setImage(bitmap);
        String recognizedText = baseAPI.getUTF8Text();
        TextView textView=findViewById(R.id.image2);
        if (!recognizedText.isEmpty()){
            textView.append("识别结果：\n"+recognizedText);
        }
    }
    public void initTessBaseAPI() throws IOException{
        baseAPI=new TessBaseAPI();
        String datapath= Environment.getExternalStorageDirectory()+"/tesseract";
        File dir=new File(datapath+"tessdata/");
        if (!dir.exists()){
            dir.mkdirs();
            InputStream input=getResources().openRawResource(R.raw.eng);
            File file=new File(dir,"eng.traineddata");
            FileOutputStream output=new FileOutputStream(file);
            byte[] buff=new byte[1024];
            int len=0;
            while ((len=input.read(buff))!=-1){
                output.write(buff,0,len);
            }
            input.close();
            output.close();
        }
        boolean success =baseAPI.init(datapath,"eng");
        if (success){
            Log.d(TAG,"ok!");
        }
        else
        {
            Log.d(TAG,"no!");
        }
    }
    */
}
