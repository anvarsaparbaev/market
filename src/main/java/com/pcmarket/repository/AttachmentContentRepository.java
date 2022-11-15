package com.pcmarket.repository;


import com.pcmarket.models.Attachment;
import com.pcmarket.models.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {

    public Optional<AttachmentContent> getAttachmentContentByAttachment_Id(Integer attachmentId);

}
