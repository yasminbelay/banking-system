package august.bank.app.bankproject.controller;


import august.bank.app.bankproject.dto.RoleDto;

import august.bank.app.bankproject.service.RoleService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@CrossOrigin
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;


    @GetMapping("/")
    public List<RoleDto> getRole() {
        return roleService.getRoles();
    }

    @GetMapping("/{id}")
    public RoleDto getRoleById(@PathVariable Long id) {
        return roleService.getRoleById(id);
    }

    @PostMapping("/")
    public RoleDto createRole(@RequestBody RoleDto roleDto) {
        return roleService.addRole(roleDto);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Long id) {
        roleService.deleteRole(id);
    }

    @PutMapping("/{id}")
    public RoleDto updateRole(@PathVariable Long id, @RequestBody RoleDto roleDto) {
        return roleService.updateRole(id, roleDto);
    }


}
