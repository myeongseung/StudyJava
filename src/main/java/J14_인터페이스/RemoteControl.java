package J14_인터페이스;

public class RemoteControl {
    private PowerButton powerButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public RemoteControl(PowerButton powerButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    public void pushPowerButton(){
        powerButton.onPressed();
    }
    public void pushVolumUpButton(){
        volumeUpButton.onPressed();
    }
    public void pushVolumDownButton(){
        volumeDownButton.onPressed();
    }
}
