package app.fb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.fb.entity.PostEntity;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity, String> {
    
}
