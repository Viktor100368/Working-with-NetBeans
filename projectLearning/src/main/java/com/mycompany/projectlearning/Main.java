/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projectlearning;

//import com.mycompany.projectlearning.model.Comment;
import com.mycompany.projectlearning.model.Comment;
import com.mycompany.projectlearning.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.mycompany.projectlearning.proxies.EmailCommentNotificationProxy;
//import com.mycompany.projectlearning.repositories.DBCommentRepository;
//import com.mycompany.projectlearning.services.CommentService;
/**
 *
 * @author Victor
 */
public class Main {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {
            Comment comment = new Comment();
            comment.setAuthor("Viktor");
            comment.setText("Demo comment");
            CommentService service = context.getBean(CommentService.class);
            service.publishComment(comment);
        }

//     var commentRepository = new DBCommentRepository();
//     var commentNotificationProxy = new EmailCommentNotificationProxy();
//     var commentService = new CommentService( commentRepository, commentNotificationProxy);
//     var comment = new Comment(); comment.setAuthor("Laurentiu"); comment.setText("Demo comment");
//     commentService.publishComment(comment);
    }
}
