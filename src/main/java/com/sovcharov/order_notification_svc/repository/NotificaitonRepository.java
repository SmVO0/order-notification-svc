package com.sovcharov.order_notification_svc.repository;

import com.sovcharov.order_notification_svc.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NotificaitonRepository extends JpaRepository<Notification, UUID> {
}
