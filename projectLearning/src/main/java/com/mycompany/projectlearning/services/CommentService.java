/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectlearning.services;

import com.mycompany.projectlearning.model.Comment;
import com.mycompany.projectlearning.proxies.CommentNotificationProxy;
import com.mycompany.projectlearning.repositories.CommentRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;
    public CommentService( CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment); }
}
