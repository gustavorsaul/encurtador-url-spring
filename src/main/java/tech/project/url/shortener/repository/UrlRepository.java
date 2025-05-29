package tech.project.url.shortener.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import tech.project.url.shortener.entities.UrlEntity;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {

}
