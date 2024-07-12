Feature:Clientele accident plus health event life plan Functionality

  Background:
    Given user log in SGUI or Shamba Website

  Scenario Outline: User capture Individual sale for lump sum cover of R25000 for different age
    When user log in With valid Credentials by entering
    Then User select Plan cover On dropdown text list, "<CoverPlan>"
    When User select the Plan option:Member and family By selecting, "<PlanOption>"
    Then User Select the Date Of birth of the main life assured, "<MemberDOB>"
    When user on the Slider select the cover amounts that are applicable to the Plan Chosen
    Then User Add member details By capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When User confirms Beneficiary details, "<BeneficiaryRelation>"
    Then User add payer Details by Capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"
    When user Proceed with the Cover, FICA and Premium Rates By capturing necessary details  and Conclude Sale. "<IsProminentPublicOfficial>", "<IsProminentInternationalPublicOfficial>"


    Examples:
      | CoverPlan | PlanOption | MemberDOB | MemberTitle   | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | BeneficiaryRelation | IsProminentPublicOfficial | IsProminentInternationalPublicOfficial |
      | YA        | Individual | 1993-08-03|     Mr        | Shade      | Mills         |       Yes         | 9804145318685 | 9804145318685 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55  | 1234       |    Miss    | Joy       | McGregor     | 9804149552578 | 9804149552578  | Sister        |    30    | 30 Apr 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       No        | Member Estate       |         No                |           No                           |