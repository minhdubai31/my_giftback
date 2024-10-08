package com.minhdubai.Giftback.domain.dto.user;

import java.util.Set;
import java.security.AuthProvider;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.minhdubai.Giftback.domain.constant.Role;
import com.minhdubai.Giftback.domain.dto.notification.NotificationDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
   private Integer id;
   private String username;
   private String name;
   private Role role;
   private AuthProvider authProvider;
   
   @JsonManagedReference
   private Set<NotificationDto> notifications;
   
   private LocalDateTime createdAt;
   private LocalDateTime updatedAt;
}
