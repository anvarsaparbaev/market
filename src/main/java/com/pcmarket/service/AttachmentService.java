package com.pcmarket.service;

import com.pcmarket.models.Attachment;
import com.pcmarket.models.payload.Result;
import com.pcmarket.repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AttachmentService {


    @Autowired
    AttachmentRepository attachmentRepository;

    public Result addAttachment(Attachment attachment){
        attachmentRepository.save(attachment);
        return new Result("Successfull saved",true);
    }

    public Attachment getAttachmentById(Integer id){
        Optional<Attachment> byId = attachmentRepository.findById(id);
        return byId.orElse(null);
    }


}
