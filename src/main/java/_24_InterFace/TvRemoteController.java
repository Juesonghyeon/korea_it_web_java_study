package _24_InterFace;

public class TvRemoteController {

    private PowerButton powerButton;
    private ChannelUpButton channelUpButton;
    private ChannelDownButton channelDownButton;
    private ValumeUpButton valumeUpButton;
    private ValumeDownButton valumeDownButton;

    public TvRemoteController(PowerButton powerButton, ChannelUpButton channelUpButton, ChannelDownButton channelDownButton, ValumeUpButton valumeUpButton, ValumeDownButton valumeDownButton) {
        this.powerButton = powerButton;
        this.channelUpButton = channelUpButton;
        this.channelDownButton = channelDownButton;
        this.valumeUpButton = valumeUpButton;
        this.valumeDownButton = valumeDownButton;
    }
    public void onPressedPowerButton() {
        System.out.print("TV의");
        powerButton.onPressed();
    }
    public void onUpChannelButton(){
        System.out.print("TV의");
        channelUpButton.onUp();
    }
    public void onPressedUpChannelButton(){
        System.out.print("TV의");
        channelUpButton.onPressed();
    }
    public void onDownChannelButton(){
        System.out.print("TV의");
        channelDownButton.onDown();
    }
    public void onPressedDownChannelButton(){
        System.out.print("TV의");
        channelDownButton.onPressed();
    }
    public void onValumeUpButton(){
        System.out.print("TV의");
        valumeUpButton.onUp();
    }
    public void onValumeUpPressedButton(){
        System.out.print("TV의");
        valumeUpButton.onPressed();
    }
    public void onValumeDownButton(){
        System.out.print("TV의");
        valumeDownButton.onDown();
    }

    public void onValumeDownPressedButton(){
        System.out.print("TV의");
        valumeDownButton.onPressed();
    }
}
