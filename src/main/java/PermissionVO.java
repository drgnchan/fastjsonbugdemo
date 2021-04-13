import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class PermissionVO {
    @JSONField(alternateNames = {"structureId"})
    private String id;
    private String type;
    @JSONField(alternateNames = {"structureName"})
    private String description;
    private Boolean isOn;
    @JSONField(alternateNames = {"childrenStructures"})
    private List<PermissionVO> childrenPermission;
}
