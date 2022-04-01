package org.leiers.uni.sep.uebung02;

import lombok.Getter;
import lombok.Setter;

/**
 * Klasse, die einen Punkt innerhalb eines kartesischen Koordinatensystems beschreibt.
 */
public class CartesianPoint {
    @Getter
    @Setter
    private double x;
    @Setter
    @Getter
    private double y;
}
