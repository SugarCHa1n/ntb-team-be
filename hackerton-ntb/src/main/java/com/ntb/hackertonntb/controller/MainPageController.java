package com.ntb.hackertonntb.controller;

import com.ntb.hackertonntb.domain.entity.Gesipan;
import com.ntb.hackertonntb.domain.entity.Skills;
import com.ntb.hackertonntb.domain.entity.User;
import com.ntb.hackertonntb.domain.repository.GesipanRepository;
import com.ntb.hackertonntb.domain.repository.SkillsRepository;
import com.ntb.hackertonntb.domain.repository.UserRepository;
import com.ntb.hackertonntb.service.UserService;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainPageController {

    @Autowired
    private SkillsRepository skillsRepository;

    @GetMapping("/skills")
    public List<Skills> getRandomSkills() {
        List<Skills> randomSkills = skillsRepository.findRandomSkills(2);
        return randomSkills;
    }

    @GetMapping("/skills/{id}")
    public String getSkillsPage(@PathVariable Long id, Model model) {
        Skills skills = skillsRepository.findById(id).orElse(null);
        if (skills == null) {
            return "redirect:/skills";
        }
        model.addAttribute("skills", skills);
        return "skills/skills";
    }
    @Autowired
    private GesipanRepository gesipanRepository;

    @GetMapping("/gesipan")
    public List<Gesipan> getRandomGesipan() {
        List<Gesipan> randomGesipan = gesipanRepository.findRandomGesipan(2);
        return randomGesipan;
    }

    @GetMapping("/gesipan/{id}")
    public String getGesipanPage(@PathVariable Long id, Model model) {
        Gesipan gesipan = gesipanRepository.findById(id).orElse(null);
        if (gesipan == null) {
            return "redirect:/gesipan";
        }
        model.addAttribute("gesipan", gesipan);
        return "gesipan/gesipan";
    }

//    @RequestMapping("/user")
//    public class UserController {
        @Autowired
        private UserService userService;

        @PostMapping("/add")
        public String add(@RequestBody User user) {
            userService.saveUser(user);
            return "New user is added";         //사용자 정보 추가
        }

        @GetMapping("/getAll")
        public List<User> getAllUsers() {

            return userService.getAllUsers();
        }

        @Autowired
        UserRepository UserRepo;

        //skillname에 해당하는 유저 리스트 조회
        @GetMapping("/Users/skillname")
        public ResponseEntity<List<User>> getUsersBySkillName (@RequestParam String skillname) {
            return new ResponseEntity<List<User>>(UserRepo.findBySkillName(skillname), HttpStatus.OK);
    }
        //categoryname에 해당하는 유저 리스트 조회
        @GetMapping("/Users/categoryname")
        public ResponseEntity<List<User>> getUsersByCategoryName (@RequestParam String categoryname) {
            return new ResponseEntity<List<User>>(UserRepo.findByCategoryName(categoryname), HttpStatus.OK);
        }

        @GetMapping("/Users/loginid")
        public ResponseEntity<List<User>> getUsersByLoginID (@RequestParam String loginid) {
            return new ResponseEntity<List<User>>(UserRepo.findByLoginID(loginid), HttpStatus.OK);
        }


}
