package designpattern.prototype;

/**
 * TODO 描述
 *
 * @author cy
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail() ;
        mail.setContent("邮件初始化模版");

        for(int i=0;i<10;i++){
            Mail mailTmp = (Mail) mail.clone();
            mailTmp.setName("姓名"+i);
            mailTmp.setAddress("姓名"+i+"@**.com");
            mailTmp.setContent("恭喜您中奖了");
            MailUtil.sendEmail(mailTmp);
        }
        MailUtil.save(mail);
    }
}
