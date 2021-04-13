import lombok.Data;

import java.util.List;

@Data
public class RoleVO {
    private String id;
    private String name;
    private String url;
    private List<PermissionVO> permissions;
    private List<String> structureIds;
    private List<String> menuBarIds;
    private List<String> pubAuthStructureIds;
    private List<String> channelIds;
}
