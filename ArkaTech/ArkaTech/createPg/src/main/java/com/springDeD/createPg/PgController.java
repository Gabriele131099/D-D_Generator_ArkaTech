package com.springDeD.createPg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("")
public class PgController extends AbsPgsInterface {

    @Autowired
    @Lazy
    public PgRepository PgRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping("/pg")
    public List<Pg> getAllPg() {
        return PgRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/pg")
    public ResponseEntity<Pg> createPg(@RequestBody Pg pg) {
        try {
            String sql = "INSERT INTO pg (IDuser, CharacterName, Race, Alignment, ClassLevel, Background, PersonalityTraits, Ideals, Bonds, Flaws, XP, STR, STRmod, DEX, DEXmod, CON, CONmod, INT, INTmod, WIS, WISmod, CHA, CHAmod, Passive, ProfBonus, Initiative, Speed, HPMax, HDTotal, HD, RaceBonuses, RaceAndFeatures, FeaturesAndTraits, Class) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            jdbcTemplate.update(sql, pg.getUserId(), pg.getCharacterName(), pg.getRace(), pg.getAlignment(), pg.getClassLevel(), pg.getBackground(), pg.getPersonalityTraits(), pg.getIdeals(), pg.getBonds(), pg.getFlaws(), pg.getXP(), pg.getSTR(), pg.getStrMod(), pg.getDEX(), pg.getDexMod(), pg.getCON(), pg.getConMod(), pg.getINT(), pg.getIntMod(), pg.getWIS(), pg.getWisMod(), pg.getCHA(), pg.getChaMod(), pg.getPassive(), pg.getProfBonus(), pg.getInitiative(), pg.getSpeed(), pg.getHpMax(), pg.getHdTotal(), pg.getHD(), pg.getRaceBonuses(), pg.getRaceAndFeatures(), pg.getFeaturesAndTraits(), pg.getaClass ());
            return new ResponseEntity(pg, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
