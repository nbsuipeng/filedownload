package com.filedown.main.filedownload;

import java.io.IOException;
import java.net.URL;

public interface FileDownload {

    boolean fileDownload(String url, String des) throws IOException;
}
