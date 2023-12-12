package Pattern_Fabric;

public class GoldGen implements ItemGen{

    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}