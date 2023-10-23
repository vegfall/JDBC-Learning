package no.falldal.jdbc.controller;

import no.falldal.jdbc.model.Part;
import no.falldal.jdbc.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/part")
public class PartController {
    private final PartService partService;

    @Autowired
    public PartController(PartService partService) {
        this.partService = partService;
    }

    @GetMapping
    public List<Part> getParts() {
        return partService.getParts();
    }

    @GetMapping("{id}")
    public Part getPartById(@PathVariable Integer id) {
        return partService.getPartById(id);
    }

    @PostMapping
    public Part createPart(@RequestBody Part part) {
        return partService.createPart(part);
    }

    @DeleteMapping("/{id}")
    public void deletePart(@PathVariable Integer id) {
        partService.deletePart(id);
    }

    @PutMapping
    public Part updatePart(@RequestBody Part part) {
        return partService.updatePart(part);
    }
}
