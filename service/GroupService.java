package service;

import model.Group;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupService {
    private final List<Group> groups = new ArrayList<>();

    public Group addGroup(Group group){
        groups.add(group);
        return group;
    }

    public List<Group> getAllGroupList() {return groups;}

    public Group getGroupByName(String name){
        for (Group group : groups){
            if (group.getName().equalsIgnoreCase(name)){
                return group;
            }
        }
        return null;
    }

}
