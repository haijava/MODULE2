package hai.exam1.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class ImageViewUpload {

    private CommonsMultipartFile[] fileDatas;

    public CommonsMultipartFile[] getFileDatas() {
        return fileDatas;
    }

    public void setFileDatas(CommonsMultipartFile[] fileDatas) {
        this.fileDatas = fileDatas;
    }

}
