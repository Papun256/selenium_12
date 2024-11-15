package GenericUtility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility
{
/**
*
* @return
*/
public String getSystemTime()
{
return LocalDateTime.now().toString().replace(":", "-");

}

/**
 *
 * @return
 */

public int getRandomNumber()
{
Random random = new Random();
return random.nextInt(1000);
}

}



