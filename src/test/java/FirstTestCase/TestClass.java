package FirstTestCase;

import org.junit.Test;

public class TestClass {
    private final TestBase testBase = new TestBase();

    @Test
    public void userCanSendOrder() {
        testBase.restSelect();
        testBase.goMainPage();
        testBase.mathRandomHead();
        testBase.pickRandCards();
        testBase.goBasket();
        testBase.selectDeliveryType();
        testBase.selectAdressForDelivery();
        testBase.fillInFields();
        testBase.selectPayType();
        testBase.sendOrder();
        testBase.waitForComplete();
    }
}