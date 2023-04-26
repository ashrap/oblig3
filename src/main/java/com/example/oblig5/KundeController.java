package com.example.oblig5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class KundeController {
   @Autowired
   private KundeRepository rep;

    @PostMapping("/lagre")
    public void lagreKunde(Kunde kunde) { rep.lagreKunde(kunde); }

@GetMapping ("/hentAlle")
    public List<Kunde> hentAlle() {
        return rep.hentAlleKunder();
    }

    @GetMapping("/slettEnKunde")
    public void slettEnKunde(int id) {
        rep.slettEnKunde(id);
    }

    @GetMapping("/slett")
public void slettAlle() {rep.slettAlleKunder();
    }

}

