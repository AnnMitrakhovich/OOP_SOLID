package Pattern_Fabric;

public class GemGen implements ItemGen{
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}