package no.falldal.jdbc.service;

import no.falldal.jdbc.model.Part;
import no.falldal.jdbc.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartService {
    private final PartRepository partRepository;

    @Autowired
    public PartService(PartRepository partRepository) {
        this.partRepository = partRepository;
    }

    public List<Part> getParts() {
        return partRepository.findAll();
    }

    public Part getPartById(Integer id) {
        return partRepository.findById(id).orElse(null);
    }

    public Part createPart(Part part) {
        return partRepository.save(part);
    }

    public void deletePart(Integer id) {
        partRepository.delete(getPartById(id));
    }

    public Part updatePart(Part part) {
        return partRepository.save(part);
    }
}
