package com.pcmarket.controller;

import com.pcmarket.models.Attachment;
import com.pcmarket.models.payload.Result;
import com.pcmarket.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class AttachmentController {


    @Autowired
    AttachmentService attachmentService;

    @GetMapping("/{id}")
    public Attachment getAttachmentById(@PathVariable Integer id){
        return attachmentService.getAttachmentById(id);
    }

    @PostMapping
    public Result addAttachment(@RequestBody Attachment attachment){
        return attachmentService.addAttachment(attachment);
    }


}
