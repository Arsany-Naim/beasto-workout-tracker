package com.arsany.workoutTracker.repository;

import com.arsany.workoutTracker.entity.User;
import com.arsany.workoutTracker.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    List<Workout> findByUserOrderByScheduledDateTimeAsc(User user);
    List<Workout> findByUserAndIsCompletedTrue(User user);
}
