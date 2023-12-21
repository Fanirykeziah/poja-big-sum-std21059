import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;

@RestController
public class BigSumController {

    @GetMapping("/big-sum")
    public void calculateBigSum(
            @RequestParam("a") String aValue,
            @RequestParam("b") String bValue) {

        try {
            BigInteger a = new BigInteger(aValue);
            BigInteger b = new BigInteger(bValue);

            BigInteger sum = a.add(b);

            return sum;
        } catch (NumberFormatException e) {
            return "Invalid number";
        }
    }
}
