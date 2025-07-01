package com.erudayu.posapi.mapper;

import com.erudayu.posapi.dto.response.UserResponse;
import com.erudayu.posapi.entity.User;
import com.erudayu.posapi.dto.request.CreateUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    // Request → Entity
    @Mapping(target = "id", ignore = true) // Let DB assign ID
    @Mapping(target = "passwordHash", source = "password") // Custom mapping
    User toEntity(CreateUserRequest request);

    // Entity → Response DTO
    UserResponse toDto(User user);
}
