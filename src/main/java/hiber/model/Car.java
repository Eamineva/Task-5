package hiber.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "model")
    public String model;

    @Column(name = "series")
    public int series;

    @OneToOne(mappedBy = "car")
    private User user;

    public Car() {}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
    public Car(String model, int series, long id) {
        this.model = model;
        this.series = series;
        this.id = id;
    }


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
