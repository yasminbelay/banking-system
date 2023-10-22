package august.bank.app.bankproject.service.impl;

import august.bank.app.bankproject.dto.RoleDto;
import august.bank.app.bankproject.entity.Role;
import august.bank.app.bankproject.repository.RoleRepository;
import august.bank.app.bankproject.service.RoleService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class RoleServiceImpl implements RoleService {


    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private ModelMapper modelMapper;

    //    get all roles
    public List<RoleDto> getRoles() {
        List<Role> roles = roleRepository.findAll();

        return roles.stream().map(r -> modelMapper.map(r, RoleDto.class)).toList();
    }

    //    get Role By Id
    public RoleDto getRoleById(Long id) {
        try {
            Role role = roleRepository.findById(id).get();
            return modelMapper.map(role, RoleDto.class);
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    //    add Role
    public RoleDto addRole(RoleDto roleDto) {
        Role role = modelMapper.map(roleDto, Role.class);

        try {
            Role savedRole = roleRepository.save(role);
            return modelMapper.map(savedRole, RoleDto.class);
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    //    delete Role
    public void deleteRole(Long id) {
        try {
            roleRepository.deleteById(id);
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
//    update Role

    public RoleDto updateRole(Long id, RoleDto roleDto) {
        try {
            Role role = modelMapper.map(roleDto, Role.class);
            role.setId(id);
            Role savedRole = roleRepository.save(role);
            return modelMapper.map(savedRole, RoleDto.class);

        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }


}
