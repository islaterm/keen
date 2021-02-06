/**
 * "keen" (c) by Ignacio Slater M.
 * "keen" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.ravenhill.keen

/**
 * Genes are the base of the _Keen_ framework.
 * The actual information used by the algorithms is stored in the genes.
 *
 * In principle, a gene could represent every kind of information for encoding a solution.
 *
 * @property dna
 *    The actual information contained in this gene.
 * @param DNA
 *    the type of the information stored in this gene
 *
 * @author [Ignacio Slater Muñoz](mailto:islaterm@gmail.com)
 */
class Gene<DNA> internal constructor(val dna: DNA) {

  companion object {
    fun <DNA> fromAlphabet(alphabet: List<DNA>) = Gene(alphabet.shuffled(Keen.random)[0])
  }
}
