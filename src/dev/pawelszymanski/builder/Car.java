package dev.pawelszymanski.builder;

public class Car {
    private CarBrand carBrand;
    private String modelName;
    private Integer doorsNumber;
    private Double weight;
    private Integer horsepower;

    public static class Builder {
        private CarBrand carBrand = null;
        private String modelName = null;
        private Integer doorsNumber = null;
        private Double weight = null;
        private Integer horsepower = null;

        public Builder carBrand(CarBrand carBrand) {
            this.carBrand = carBrand;
            return this;
        }

        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public Builder doorsNumber(Integer doorsNumber) {
            this.doorsNumber = doorsNumber;
            return this;
        }

        public Builder weight(Double weight) {
            this.weight = weight;
            return this;
        }

        public Builder horsepower(Integer horsepower) {
            this.horsepower = horsepower;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        this.carBrand = builder.carBrand;
        this.modelName = builder.modelName;
        this.doorsNumber = builder.doorsNumber;
        this.weight = builder.weight;
        this.horsepower = builder.horsepower;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public String getModelName() {
        return modelName;
    }

    public Integer getDoorsNumber() {
        return doorsNumber;
    }

    public Double getWeight() {
        return weight;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand=" + carBrand +
                ", modelName='" + modelName + '\'' +
                ", doorsNumber=" + doorsNumber +
                ", weight=" + weight +
                ", horsepower=" + horsepower +
                '}';
    }
}
