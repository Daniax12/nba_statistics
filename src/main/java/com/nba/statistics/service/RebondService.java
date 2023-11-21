package com.nba.statistics.service;

import com.nba.statistics.model.Rebond;
import com.nba.statistics.repository.RebondRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RebondService {

    private RebondRepository rebondRepository;

    @Autowired
    public RebondService(RebondRepository rebondRepository) {
        this.rebondRepository = rebondRepository;
    }

    public List<Rebond> getRebonds() {
        return rebondRepository.findAll();
    }

    public Rebond getRebondById(String idrebond) {
        Optional<Rebond> temp = rebondRepository.findById(idrebond);
        return temp.orElse(null);
    }

    public Rebond createOrUpdateRebond(Rebond rebond) {
        return rebondRepository.save(rebond);
    }

    public void deleteRebond(String idrebond) {
        rebondRepository.deleteById(idrebond);
    }
}
