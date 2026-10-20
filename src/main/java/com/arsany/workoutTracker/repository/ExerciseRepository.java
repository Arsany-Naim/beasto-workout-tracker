package com.arsany.workoutTracker.repository;

import com.arsany.workoutTracker.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
