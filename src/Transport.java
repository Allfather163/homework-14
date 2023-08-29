public abstract class Transport {
    String modelName;
    int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void service() {
        for (int i = 0; i < this.wheelsCount; i++) {
            this.updateTyre();
        }
    }
}