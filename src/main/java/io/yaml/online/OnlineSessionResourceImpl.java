package io.yaml.online;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.yaml.online.beans.OnlineSession;
import io.yaml.online.repositories.OnlineSessionRepository;

public class OnlineSessionResourceImpl implements OnlineSessionResource {

  @Inject
  OnlineSessionRepository onlineSessionRepository;

  @Transactional
  @Override
  public OnlineSession createOnlineSession(OnlineSession data) {
    OnlineSession newSession = new OnlineSession();
    data.getProcesar().setOnlineSession(newSession);
    newSession.setProcesar(data.getProcesar());
    onlineSessionRepository.persist(newSession);
    onlineSessionRepository.flush();
    return newSession;
  }

  @Override
  public OnlineSession getOnlineSession(Long sessionId) {
    return onlineSessionRepository.findById(sessionId);
  }
}