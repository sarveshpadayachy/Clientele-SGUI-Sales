Feature:Clientele Ultimate Dignity plan Functionality

  Background:
    Given user log in SGUI Website....

  Scenario Outline: User capture funeral Product for Individual Cover
    When user log in with valid Credentials by entering,
    Then user select Plan cover on dropdown text list "<CoverPlan>"
    When user Select the Plan option: "<PlanOption>"
    Then User select the Date of birth of the main life assured "<MemberDOB>"
    When User on the slider select the cover amounts that are applicable to the plan chosen <CoverAmount>
    Then user add member details by capturing "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    Then user add extended member by capturing "<Tittle>", "<Name>", "<Surname>", "<Relation>", "<Gender>", "<extendID>", "<PremiumPayBack>"
    When user add cover amount on the slider of extended family <coverAmount>
    When user add payer details by capturing "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"

    Then User proceed with the Cover and conclude sale....

    Examples:
      | CoverPlan  | PlanOption | MemberDOB  | CoverAmount| MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName           | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | Tittle | Name    | Surname  | Relation | Gender | extendID     | PremiumPayBack | coverAmount |
      | UF         | Individual | 2003-08-05 |  23000     |   Mr        | Sam        | Moloi         |       Yes         | 9808066367084 | 9808066367084 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55  | 1234       | Miss       | Joy       | McGregor     | 8808107492082 | 8808107492082  | Sister        |    15     | 15 Mar 2024| CAPITEC BANK LTD         | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       No        | Mr     | Shanani | Bongo    |  Cousin  | Male   | 8810299719082|     Yes        |   20000     |