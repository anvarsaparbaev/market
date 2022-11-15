package com.pcmarket.controller;

import com.pcmarket.models.payload.Result;
import com.pcmarket.service.AttachmentContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("attachmentContent")
public class AttachmentContentController {


    @Autowired
    AttachmentContentService attachmentContentService;

    @GetMapping("/{id}")
    public void downloadAttachment(@PathVariable Integer id, HttpServletResponse response) throws IOException {
        attachmentContentService.downloadAttachment(id,response);
    }

    @PostMapping
    public Result addAttachment(MultipartHttpServletRequest request) throws IOException {
        Result result = attachmentContentService.addFile(request);
        return result;
    }


}
