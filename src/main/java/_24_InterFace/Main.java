package _24_InterFace;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelUpButton(),
                new ChannelDownButton(),
                new ValumeUpButton(),
                new ValumeDownButton()
        );
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedPowerButton();

        tvRemoteController.onValumeUpButton();
        tvRemoteController.onValumeDownButton();

        tvRemoteController.onValumeUpPressedButton();
        tvRemoteController.onValumeDownPressedButton();

        tvRemoteController.onPressedDownChannelButton();
        tvRemoteController.onDownChannelButton();

        tvRemoteController.onPressedUpChannelButton();
        tvRemoteController.onUpChannelButton();
    }
}
