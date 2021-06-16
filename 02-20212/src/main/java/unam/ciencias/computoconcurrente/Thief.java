package unam.ciencias.computoconcurrente;

/**
 *
 * @author ferfong
 */
public interface Thief {
    boolean findPassword(Vault vault, int lowerBound, int upperBound);
}
