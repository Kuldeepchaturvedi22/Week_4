package com.QueueInterface.HospitalTriageSystem;

public class HospitalTriage implements Comparable<HospitalTriage> {
    private String name;
    private int severity;

    public HospitalTriage(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    @Override
    public int compareTo(HospitalTriage other) {
        // Higher severity patients should come first
        return Integer.compare(other.severity, this.severity);
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}