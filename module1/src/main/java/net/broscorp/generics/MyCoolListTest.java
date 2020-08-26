package net.broscorp.generics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Function;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyCoolListTest {

  private Function<Integer, Double> function = Integer::doubleValue;
  private static MyCoolList<Integer> integerMyCoolList = new MyCoolList<>();

  @BeforeEach
  public void init() {
    integerMyCoolList.add(7);
  }

  @Test
  public void addTest() {
    integerMyCoolList.add(777);
    assertEquals(2, integerMyCoolList.size());
  }

  @Test
  public void getTest() {
    assertEquals(7, integerMyCoolList.get(0));
  }

  @Test
  public void removeTest() {
    integerMyCoolList.remove(0);
    assertEquals(7, integerMyCoolList.get(0));
  }

  @Test
  public void mapTest() {
    MyCoolList<Double> list = integerMyCoolList.map(function);

    for (int i = 0; i < list.size(); i++) {
      assertTrue(list.get(i) instanceof Double);
    }
  }

  @Test
  public void sizeTest() {
    assertEquals(5, integerMyCoolList.size());
  }
}
