Feature:Clientele accident plus health event life plan Functionality

  Background:
    Given User Log in SGUI  website.
  Scenario Outline: User capture Family sale for lump sum cover of R20000 for different age
    When User log in with valid credentials By entering
    Then User select Plan Cover on dropdown text list, "<CoverPlan>"
    When User Select the Plan option:Member and family By selecting, "<PlanOption>"
    Then User Select the Date of Birth of the main Life assured, "<MemberDOB>"
    When User on the slider select the cover amounts that are applicable to the Plan chosen..
    Then User add member details By Capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When User add spouse details By Capturing, "<SpouseTitle>", "<SpouseName>", "<SpouseSurname>", "<SpouseGender>", "<SpouseID>"
    Then User add child details By Capturing, "<ChildName>", "<ChildSurname>", "<ChildGender>", "<ChildID>", "<IsChildStudent>"
    When user Proceed with capturing beneficiary details.
    Then User add payer details By Capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"


    Examples:
      | CoverPlan | PlanOption | MemberDOB  | MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | SpouseTitle | SpouseName | SpouseSurname | SpouseGender | SpouseID      |ChildName | ChildSurname | ChildGender | ChildID       | IsChildStudent |
      |     YA    |   Family   | 1992-04-02 |    Mr       | Shade      | Mills         |       Yes         | 9704118719945 | 9704118719945 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55 | 1234       |Miss       | Joy       | McGregor     | 9606035120182 | 9606035120182  | Sister        |    30     | 30 Apr 2024 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       No        |Miss        | Hazel      | Smith         | Female       | 9704116081082 |Micheal   | Smith        | Male        | 1704116751922 |     Yes        |