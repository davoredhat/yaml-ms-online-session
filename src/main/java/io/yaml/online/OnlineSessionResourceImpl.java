package io.yaml.online;

import javax.inject.Inject;

import io.yaml.online.beans.OnlineSession;
import io.yaml.online.repositories.OnlineSessionRepository;

public class OnlineSessionResourceImpl implements OnlineSessionResource {

  @Inject
  OnlineSessionRepository onlineSessionRepository;

  @Override
  public void createOnlineSession(OnlineSession data) {
    onlineSessionRepository.persist(data);
    onlineSessionRepository.flush();
  }

  @Override
  public OnlineSession getOnlineSession(Long sessionId) {
    return onlineSessionRepository.findById(sessionId);
  }
}