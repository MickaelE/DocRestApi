package com.mickenet.DocRestApi.controller;

import com.mickenet.DocRestApi.dto.DocumentTableRepository;
import com.mickenet.DocRestApi.entity.DocumentTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/document-management", produces = { MediaType.APPLICATION_JSON_VALUE })
public class DocumentTableController {
    @Autowired
   private DocumentTableRepository documentTableRepository;
    @GetMapping(value = "/documents")
    public List<DocumentTable> getAllDocuments() {
        return documentTableRepository.findAll();
    }
    @GetMapping("/documents/{id}")
    DocumentTable getEmployeeById(@PathVariable Long id) {
        return documentTableRepository.findById(id).get();
    }
    @PostMapping("/documents")
    DocumentTable createOrSaveDocument(@RequestBody DocumentTable documentTable) {
        return documentTableRepository.save(documentTable);

    }
    @DeleteMapping("/documents/{id}")
    void deleteDocument(@PathVariable Long id) {
        documentTableRepository.deleteById(id);
    }
    @PutMapping("/documents/{id}")
    DocumentTable updateDocument(@RequestBody DocumentTable newDocument, @PathVariable Long id) {

        return documentTableRepository.findById(id).map(document -> {
            document.setDocumentTitle(newDocument.getDocumentTitle());
            document.setDocument(newDocument.getDocument());
            document.setDateChanged(newDocument.getDateChanged());
            return documentTableRepository.save(document);
        }).orElseGet(() -> {
            newDocument.setId(Math.toIntExact(id));
            return documentTableRepository.save(newDocument);
        });
    }
}
