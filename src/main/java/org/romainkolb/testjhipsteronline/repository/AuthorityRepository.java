package org.romainkolb.testjhipsteronline.repository;

import org.romainkolb.testjhipsteronline.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
