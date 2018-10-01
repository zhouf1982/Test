package com.zhoufeng.tools;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

import java.io.File;
import java.io.OutputStream;
import java.util.Hashtable;

public class QRUtil {
    public static void create(String text, OutputStream stream, Integer size) throws Exception {
        int width = 100 + (10 * size);
        int height = 100 + (10 * size);
        // 二维码的图片格式
        String format = "jpg";
        Hashtable hints = new Hashtable();
        // 内容所使用编码
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        BitMatrix bitMatrix = new MultiFormatWriter().encode(text,
                BarcodeFormat.QR_CODE, width, height, hints);
        // 1.1去白边
        int[] rec = bitMatrix.getEnclosingRectangle();
        int resWidth = rec[2] + 1;
        int resHeight = rec[3] + 1;
        BitMatrix resMatrix = new BitMatrix(resWidth, resHeight);
        resMatrix.clear();
        for (int i = 0; i < resWidth; i++) {
            for (int j = 0; j < resHeight; j++) {
                if (bitMatrix.get(i + rec[0], j + rec[1])) {
                    resMatrix.set(i, j);
                }
            }
        }
        MatrixToImageWriter.writeToStream(resMatrix, format, stream);
    }

    public static void main(String[] args) throws Exception {
        String text = "http://www.baidu.com/action/page/formSub.html?mac=1111111111111111111111111111111111111111111111111111111";
        int width = 300;
        int height = 300;
        // 二维码的图片格式
        String format = "jpg";
        Hashtable hints = new Hashtable();
        // 内容所使用编码
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        BitMatrix bitMatrix = new MultiFormatWriter().encode(text,
                BarcodeFormat.QR_CODE, width, height, hints);
        // 生成二维码
        File outputFile = new File("d:" + File.separator + "new.jpg");
        MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
    }

}
