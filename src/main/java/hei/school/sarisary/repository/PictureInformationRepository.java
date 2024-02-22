package hei.school.sarisary.repository;

import hei.school.sarisary.repository.model.PictureInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureInformationRepository extends JpaRepository<PictureInformation, String> {}
