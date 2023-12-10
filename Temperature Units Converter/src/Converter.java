/**
 * Using @FunctionalInterface in an interface that is expected to be functional
 * prevents writing more than one method to the interface.
 *
 * Simple example of using Functional Interface
 */
@FunctionalInterface
public interface Converter {
    void convert(double unit);
}
