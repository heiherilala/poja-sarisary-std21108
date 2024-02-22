package hei.school.sarisary.endpoint.rest.controller;

import hei.school.sarisary.model.PicturesUTL;
import hei.school.sarisary.service.PictureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ImageController {
  private final PictureService service;

  @PutMapping(value = "/black-and-white/{id}")
  public PicturesUTL getBlackAndWhiteImage(
      @PathVariable(name = "id") String id, @RequestBody(required = false) byte[] file) {
    try {
      return service.uploadAndConvertImageToBlackAndWhite(id, file);
    } catch (Exception e) {
      return null;
    }
  }

  @GetMapping(value = "/black-and-white/{id}")
  public PicturesUTL getImageURL(@PathVariable(name = "id") String id) {
    try {
      return service.getPicturesURL(id);
    } catch (Exception e) {
      return null;
    }
  }
}
