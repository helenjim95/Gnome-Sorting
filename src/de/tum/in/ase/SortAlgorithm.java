package de.tum.in.ase;

import org.checkerframework.checker.nullness.qual.NonNull;

public interface SortAlgorithm {
    /**
     *
     * @param input the two-dimensional array to be sorted
     * @return sorted two-dimensional array
     */
    @NonNull
    Student[][] performSort(@NonNull Student[][] input);
}
