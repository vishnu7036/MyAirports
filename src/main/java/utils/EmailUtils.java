package utils;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Code;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.IOException;

public class EmailUtils {
    private static final String apiKey = "3y6SX0EZcAgYopLmB6YQj38BghU5QyOm";
    private static final String serverId = "uk90qnfw";
    private static final String serverDomain = "uk90qnfw.mailosaur.net";

    public static void getOTPFromEmail() throws MailosaurException, IOException {
        MailosaurClient mailosaur = new MailosaurClient(apiKey);

        MessageSearchParams params = new MessageSearchParams();
        params.withServer(serverId);

        SearchCriteria criteria = new SearchCriteria();

        criteria.withSentTo(getRandomAlphabet() + "@" + serverDomain);

        Message message = mailosaur.messages().get(params, criteria);
        Code code = message.html().codes().get(0);
        System.out.println(code);
    }

    public static String getRandomAlphabet() {
        return RandomStringUtils.randomAlphabetic(5);
    }
}
