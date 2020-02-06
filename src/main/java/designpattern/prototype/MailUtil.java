package designpattern.prototype;

import java.text.MessageFormat;

/**
 * TODO 描述
 *
 * @author cy
 */
public class MailUtil {

    public static void sendEmail(Mail mail){
        String outContent = "向{0}同学，邮件地址：{1},邮件内容：{2},发送邮件成功";
        System.out.println(MessageFormat.format(outContent,mail.getName(),mail.getAddress(),mail.getContent()));
    }

    public static void save(Mail mail){
        System.out.println("存储邮件记录："+mail.getContent());
    }
}
