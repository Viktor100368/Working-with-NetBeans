/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectlearning.repositories;

import com.mycompany.projectlearning.model.Comment;
import org.springframework.stereotype.Component;

/**
 *
 * @author Victor
 */
@Component
public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
    
}
