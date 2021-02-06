package cl.ravenhill.keen

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertSame
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.RepeatedTest
import kotlin.random.Random

/**
 * @author [Ignacio Slater Muñoz](mailto:ignacio.slater@ug.uchile.cl)
 */
internal class GeneTest {
  private var seed = 0

  @BeforeEach
  fun setUp() {
    seed = Random.nextInt()
    Keen.random = Random(seed)
  }

  @RepeatedTest(16)
  fun `creation of a gene from a binary alphabet`() {
    val alphabet = listOf(0, 1)
    val expectedGene = Gene(alphabet.shuffled(Random(seed))[0])
    val actualGene = Gene.fromAlphabet(alphabet)
    assertSame(expectedGene, expectedGene)
    assertEquals(expectedGene, actualGene, "Test failed with seed: $seed")
    assertEquals(
      expectedGene.hashCode(),
      actualGene.hashCode(),
      "Test failed with seed: $seed. Hash codes for $expectedGene and $actualGene don't match."
    )
  }
}