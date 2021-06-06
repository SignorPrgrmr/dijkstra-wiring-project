package com.hugs4bugs.simkeshi.service.interfaces;

import java.util.List;
import java.util.Map;

public interface ImageService {
    Map<String, List<? extends Object>> findTheOptimumSolution(int name);
}
