package com.abclearning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyStructureTest {
    @Test
    void codeAccessFalseTest(){
        TechnicalLead technicalLead = new TechnicalLead("Richard"); // Tech Lead
        SoftwareEngineer seA = new SoftwareEngineer("Kim"); // Software Engineer

        seA.setCodeAccess(false); // Test 'false' as an input
        technicalLead.addReport(seA);

        System.out.println("Test Case #1");
        System.out.println(" Expected Result: False"); // print expected result

        boolean actualResult = seA.getCodeAccess();
        System.out.println("Actual Result: " + actualResult); // Print actual result
        assertEquals(false, actualResult); // Compare the expected result (False) & Actual Result
    }

    @Test
    void codeAccessTrueTest(){
        TechnicalLead technicalLead = new TechnicalLead("Richard"); // Tech Lead
        SoftwareEngineer seA = new SoftwareEngineer("Kim"); // Software Engineer

        seA.setCodeAccess(true); // Test 'false' as an input
        technicalLead.addReport(seA);

        System.out.println("Test Case #2");
        System.out.println(" Expected Result: True"); // print expected result

        boolean actualResult = seA.getCodeAccess();
        System.out.println("Actual Result: " + actualResult); // Print actual result
        assertEquals(true, actualResult); // Compare the expected result (True) & Actual Result
    }

    @Test
    void accountantApproveBonusFalseTest(){
        BusinessLead businessLead = new BusinessLead("YC"); // Business Lead
        TechnicalLead technicalLead = new TechnicalLead("Richard"); // Tech Lead
        Accountant accountant = new Accountant("Joy");
        SoftwareEngineer seA = new SoftwareEngineer("Kim"); // Software Engineer

        technicalLead.addReport(seA); // Add employee under Tech lead
        businessLead.addReport(accountant,technicalLead); // Add employee under business lead

        System.out.println("Test Case #3");
        System.out.println(" Expected Result: False"); // print expected result

        boolean actualResult = accountant.approveBonus(20000000);
        System.out.println("Actual Result: " + actualResult); // Print actual result
        assertEquals(false, actualResult); // Compare the expected result (False) & Actual Result
    }


    @Test
    void accountantApproveBonusTrueTest(){
        BusinessLead businessLead = new BusinessLead("YC"); // Business Lead
        TechnicalLead technicalLead = new TechnicalLead("Richard"); // Tech Lead
        Accountant accountant = new Accountant("Joy");
        SoftwareEngineer seA = new SoftwareEngineer("Kim"); // Software Engineer

        technicalLead.addReport(seA); // Add employee under Tech lead
        businessLead.addReport(accountant,technicalLead); // Add employee under business lead

        System.out.println("Test Case #4");
        System.out.println(" Expected Result: True"); // print expected result

        boolean actualResult = accountant.approveBonus(1000);
        System.out.println("Actual Result: " + actualResult); // Print actual result
        assertEquals(true, actualResult); // Compare the expected result (True) & Actual Result
    }

    @Test
    void softwareEngGetBonusFalseTest(){
        BusinessLead businessLead = new BusinessLead("YC"); // Business Lead
        TechnicalLead technicalLead = new TechnicalLead("Richard"); // Tech Lead
        Accountant accountant = new Accountant("Joy");
        SoftwareEngineer seA = new SoftwareEngineer("Kim"); // Software Engineer

        technicalLead.addReport(seA); // Add employee under Tech lead
        businessLead.addReport(accountant,technicalLead); // Add employee under business lead

        System.out.println("Test Case #5");
        System.out.println(" Expected Result: False"); // print expected result

        boolean actualResult = technicalLead.requestBonus(seA,20000000);
        System.out.println("Actual Result: " + actualResult); // Print actual result
        assertEquals(false, actualResult); // Compare the expected result (False) & Actual Result
    }

    @Test
    void softwareEngGetBonusTrueTest(){
        BusinessLead businessLead = new BusinessLead("YC"); // Business Lead
        TechnicalLead technicalLead = new TechnicalLead("Richard"); // Tech Lead
        Accountant accountant = new Accountant("Joy");
        SoftwareEngineer seA = new SoftwareEngineer("Kim"); // Software Engineer

        technicalLead.addReport(seA); // Add employee under Tech lead
        businessLead.addReport(accountant,technicalLead); // Add employee under business lead

        System.out.println("Test Case #6");
        System.out.println(" Expected Result: True"); // print expected result

        boolean actualResult = technicalLead.requestBonus(seA,1000);
        System.out.println("Actual Result: " + actualResult); // Print actual result
        assertEquals(true, actualResult); // Compare the expected result (True) & Actual Result
    }
}