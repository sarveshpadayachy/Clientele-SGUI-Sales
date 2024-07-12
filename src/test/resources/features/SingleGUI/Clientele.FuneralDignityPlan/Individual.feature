Feature:Clientele Funeral Dignity plan Functionality

  Background:
    Given user log in SGUI Website..

  Scenario Outline: User capture funeral Product for Individual Cover
    When user log in with valid Credentials by entering.....
    Then user select Plan cover on dropdown text list.... "<CoverPlan>"
    When user Select the Plan option : "<PlanOption>"
    Then User select the Date of birth of the main life assured.... "<MemberDOB>"
    When User on the slider select the cover amounts that are applicable to the plan chosen.... <CoverAmount>
    Then user add member details by capturing.... "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When user add extended member by capturing.... "<Tittle>", "<Name>", "<Surname>", "<Relation>", "<Gender>", "<extendID>", "<PremiumPayBack>"
    Then user add cover amount on the slider of extended family..... <coverAmount>
    When User proceed with capturing beneficiary details .......
    Then user add payer details by capturing payer details and concluding sale.... "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"

    Examples:
      | CoverPlan  | PlanOption | MemberDOB  | CoverAmount | MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay  | DebitDate  | BankName                 | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | Tittle | Name    | Surname  | Relation | Gender | extendID     | PremiumPayBack | coverAmount |
      | FR         | Individual | 2003-08-05 |  35000      |   Mr        | Sam        | Moloi         |       Yes         | 9605177572457 | 9605177572457 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55  | 1234       | Miss       | Joy       | McGregor     | 9804149705408 | 9804149705408  | Sister        |    25     | 25 Apr 2024| CAPITEC BANK LTD         | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       No        | Mr     | Shanani | Bongo    |  Cousin  | Male   | 9605179628638|     Yes        |   20000     |