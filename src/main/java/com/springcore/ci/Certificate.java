package com.springcore.ci;

import java.util.List;

public class Certificate {
    private String certificate;
    private List<String> topics;

    public Certificate(String certificate, List<String> topics) {
        this.certificate = certificate;
        this.topics = topics;
    }

    public String getCertificate() {
        return certificate;
    }
    public List<String> getTopics() {
        return topics;
    }
    @Override
    public String toString() {
        return "Certificate [certificate=" + certificate + ", topics=" + topics + "]";
    }
}
