package FileIO;

import java.math.BigDecimal;
import java.time.LocalDate;

public class NewClass {
    public String toys;
    public LocalDate releaseDate;
    public BigDecimal price;

    public NewClass(String toys, LocalDate releaseDate, BigDecimal price) {
        this.toys = toys;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    public String getToys() {
        return toys;
    }

    public void setToys(String toys) {
        this.toys = toys;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate today) {
        this.releaseDate = today;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "NewClass{" +
                "toys='" + toys + '\'' +
                ", release date =" + releaseDate +
                ", price=" + price +
                '}';
    }
}
