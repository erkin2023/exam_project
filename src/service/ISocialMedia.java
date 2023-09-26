package service;
import model.SocialMedia;

import java.util.List;

public interface ISocialMedia {
    void assignSocialMediaToPerson();
    String saveSocialMedia();
    SocialMedia getSocialMediaById();
    List<SocialMedia> getAllSocialMediaByPersonId();
    void deleteAllSocialMediaByPersonId();  //- Адамдын бардык Social media сы очсун, адам очпосун
    void deleteSocialMediaById();  //- Адамдын бир эле social media сы очот, адам очпойт
}
