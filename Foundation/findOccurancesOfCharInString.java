package newtestleaf.Foundation;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import junit.framework.Assert;

import static java.util.Map.entry;

public abstract class findOccurancesOfCharInString {

    /* Pseudo Code
     * Convert the string into Char Array
     * Create an empty map
     * For loop to traverse each character and put it in map variable
     * if Condition to check the every char is present already, if its already exist, count + 1
     * else add them newly to map
     * Using map.get, should return the occurances count of each character
     * *
     */

    @Test
    public void test1()
    {
        //Assert.assertEquals(findCharOccurances("Nagarajan"),);
      //  Map<Character, Integer> expected = Map.ofEntries(('N',1),('a',4),
        //        ('g',1),('r',1),('j',1),('n',1));

       // Assert.assertEquals(findCharOccurances("Nagarajan"),expected);
        //Assert.assertEquals(charOccurances,);
    }
  
    public Map<Character, Integer> findCharOccurances(String input){

        char[] chars = input.toCharArray();
        Map<Character,Integer> occurances = new TreeMap<Character,Integer>();

        for (int i = 0; i < chars.length; i++)
        {

          occurances.put(chars[i],occurances.getOrDefault(chars[i],0)+1);
            /*if (occurances.containsKey(chars[i])){
                int i1 =occurances.getOrDefault(chars[i], 0) );
            }else{
                occurances.put(chars[i], 1);
            }*/
        }
        return occurances;
    }
}
