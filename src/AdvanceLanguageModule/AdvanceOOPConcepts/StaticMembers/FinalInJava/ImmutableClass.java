package AdvanceLanguageModule.AdvanceOOPConcepts.StaticMembers.FinalInJava;

// Final class
final class ImmutableClass {
    private final String name;

    ImmutableClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
