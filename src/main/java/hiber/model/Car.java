package hiber.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
/*@Entity
@Table(name = "car")*/
@Embeddable
public class Car {
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;*/

    @Column(name = "model")
    public String model;

    @Column(name = "series")
    public int series;

    public Car() {}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    /*public Long getId() {
        return id;
    }*/
    public String getModel() {
        return model;
    }
    public int getSeries() {
        return series;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
