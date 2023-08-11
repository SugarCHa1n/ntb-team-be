package com.ntb.hackertonntb.controller;

import com.ntb.hackertonntb.domain.entity.Gesipan;
import com.ntb.hackertonntb.domain.entity.Skills;
import com.ntb.hackertonntb.domain.repository.GesipanRepository;
import com.ntb.hackertonntb.domain.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class MainPageController {

    @Autowired
    private SkillsRepository skillsRepository;

    @GetMapping("/skills")
    public String getSkillsPage(Model model){
        List<Skills> randomSkills = skillsRepository.findRandomSkills(2);
        model.addAttribute("skills",randomSkills);
        return "skills/skills_list";
    }

    @GetMapping("/skills/{id}")
    public String getSkillDetail(@PathVariable Long id, Model model) {
        Skills skills = skillsRepository.findById(id).orElse(null);
        if (skills == null) {
            return "redirect:/skills";
        }
        model.addAttribute("skills", skills);
        return "skills/skills_detail";
    }

    @Autowired
    private GesipanRepository gesipanRepository;

    @GetMapping("/gesipan")
    public String getCommunityPage(Model model){
        List<Gesipan> randomGesipanPosts = gesipanRepository.findRandomGesipanPosts(2);
        model.addAttribute("gesipanPosts", randomGesipanPosts);
        return "gesipan/gesipan_list";
    }

    @GetMapping("/gesipan/{id}")
    public String getCommunityPage(@PathVariable Long id, Model model) {
        Gesipan gesipan = gesipanRepository.findById(id).orElse(null);
        if (gesipan == null) {
            return "redirect:/gesipan";
        }
        model.addAttribute("gesipan", gesipan);
        return "gesipan/gesipan";
    }
}
