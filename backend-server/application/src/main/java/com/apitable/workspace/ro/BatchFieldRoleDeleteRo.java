/*
 * APITable <https://github.com/apitable/apitable>
 * Copyright (C) 2022 APITable Ltd. <https://apitable.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.apitable.workspace.ro;

import com.apitable.core.support.deserializer.StringArrayToLongArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * Batch Field Role Delete Ro.
 */
@Data
@Schema(description = "Batch data table field role deletion request parameter")
public class BatchFieldRoleDeleteRo {

    @NotEmpty(message = "Organization unit cannot be empty")
    @Schema(description = "Org Unit ID Set", type = "java.util.List",
        requiredMode = RequiredMode.REQUIRED, example = "[\"1\",\"2\",\"3\"]")
    @JsonDeserialize(using = StringArrayToLongArrayDeserializer.class)
    private List<Long> unitIds;

}
