Feature:Clientele accident plus health event life plan Functionality

  Background:
    Given user Log in SGUI  website
  Scenario Outline: User capture Family sale for lump sum cover of R10000 for different age
    When User log in with valid credentials by entering
    Then User select plan cover on dropdown text list, "<CoverPlan>"
    When User Select the plan option:Member and family by selecting, "<PlanOption>"
    Then user Select the Date of birth of the main life assured, "<MemberDOB>"
    When User on the slider select the cover amounts that are applicable to the plan chosen.
    Then User add member details by capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When User add spouse details by capturing, "<SpouseTitle>", "<SpouseName>", "<SpouseSurname>", "<SpouseGender>", "<SpouseID>"
    Then User add child details by capturing, "<ChildName>", "<ChildSurname>", "<ChildGender>", "<ChildID>", "<IsChildStudent>"
    When user captures beneficiary details .
    Then User add payer details by capturing and conclude sale, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"


    Examples:
      | CoverPlan | PlanOption | MemberDOB  | MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | SpouseTitle | SpouseName | SpouseSurname | SpouseGender | SpouseID      |ChildName | ChildSurname | ChildGender | ChildID       | IsChildStudent |
      |     YA    |   Family   | 1979-03-04 |    Mr       | Shade      | Mills         |       Yes         | 9905215765406 | 9905215765406 | Up to 3,000   | Sales and services | Matric    | 0601234231 | 74 Hill Street   | 2092       |Miss       | Joy       | McGregor     | 9606035120182 | 9606035120182  | Sister        |    30     | 30 Apr 2024 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       No        |Miss        | Hazel      | Smith          | Female       | 9905217035154 |Micheal   | Smith        | Male        | 1704119505788 |     Yes        |
