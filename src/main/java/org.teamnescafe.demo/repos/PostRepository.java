package org.teamnescafe.demo.repos;

import org.teamnescafe.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
