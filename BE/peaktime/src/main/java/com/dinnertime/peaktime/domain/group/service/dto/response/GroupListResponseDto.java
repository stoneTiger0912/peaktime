package com.dinnertime.peaktime.domain.group.service.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GroupListResponseDto {

    private List<GroupItemResponseDto> groupList;

    @Builder
    public GroupListResponseDto(List<GroupItemResponseDto> groupList) {
        this.groupList = groupList;
    }
}
