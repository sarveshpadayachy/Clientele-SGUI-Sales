Feature:Clientele accident plus health event life plan Functionality

  Background:
    Given user Log in SGUI  website.
  Scenario Outline: User capture Family sale for lump sum cover of R15000 for different age
    When User log in with valid Credentials by entering
    Then User select Plan cover on dropdown text list, "<CoverPlan>"
    When User Select the Plan option:Member and family by selecting, "<PlanOption>"
    Then User Select the Date of birth of the main Life assured, "<MemberDOB>"
    When User on the slider select the cover amounts that are applicable to the plan chosen..
    Then User add member details by Capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    Then User add spouse details by Capturing, "<SpouseTitle>", "<SpouseName>", "<SpouseSurname>", "<SpouseGender>", "<SpouseID>"
    When User add child details by Capturing, "<ChildName>", "<ChildSurname>", "<ChildGender>", "<ChildID>", "<IsChildStudent>"
    Then user proceed with capturing beneficiary details..
    When User add payer details by Capturing and conclude sales,,,, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"


    Examples:
      | CoverPlan | PlanOption | MemberDOB  | MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | SpouseTitle | SpouseName | SpouseSurname | SpouseGender | SpouseID      |ChildName | ChildSurname | ChildGender | ChildID       | IsChildStudent |
      |     YA    |   Family   | 1993-04-02 |    Mr       | Shade      | Mills         |       Yes         | 9704119073565 | 9704119073565 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55 | 1234       |Miss       | Joy       | McGregor     | 9704119364402 | 9704119364402  | Sister        |    30     | 30 Apr 2024 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       No        |Miss        | Hazel      | Smith         | Female       | 9704117530632 |Micheal   | Smith        | Male        | 1406030809188 |     Yes        |