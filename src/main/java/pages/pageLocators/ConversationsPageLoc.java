package pages.pageLocators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public interface ConversationsPageLoc {
    By lblHeading = By.xpath("//*[@text='Conversations']");
    By btnConversation = By.xpath("//*[@text='Start New Conversation']");
    By btnFAQ = By.xpath("//*[@text='FAQ']");
    By btnBack = AppiumBy.accessibilityId("Navigate up");
    By listMessages = By.xpath("//*[@resource-id='klia.mahb.ios:id/messageList']/*");
    By lblNoConversations = By.xpath("//*[@text='You have no conversations']");

}
