Feature:Clientele Funeral Dignity plan Functionality

  Background:
    Given user log in SGUI Website...

  Scenario Outline: User capture funeral Product for Family Cover
    When user log in with valid Credentials by entering....
    Then user select Plan cover on dropdown text list... "<CoverPlan>"
    When user Select the Plan option:Member and family by selecting... "<PlanOption>"
    Then User select the Date of birth of the main life assured... "<MemberDOB>"
    When User on the slider select the cover amounts that are applicable to the plan chosen... <CoverAmount>
    Then user add member details by capturing... "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When user add spouse details by capturing... "<SpouseTitle>", "<SpouseName>", "<SpouseSurname>", "<SpouseGender>", "<SpouseID>"
    Then user add child details by capturing... "<ChildName>", "<ChildSurname>", "<ChildGender>", "<ChildID>", "<IsChildStudent>"
    When user add extended member by capturing... "<Tittle>", "<Name>", "<Surname>", "<Relation>", "<Gender>", "<extendID>", "<PremiumPayBack>"
    Then user add cover amount on the slider of extended family.. <coverAmount>
    When User proceed adding beneficiary details.....
    Then user add payer details and concludes sale... "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"

    Examples:
      | CoverPlan  | PlanOption | MemberDOB  | CoverAmount | MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName           | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | SpouseTitle | SpouseName | SpouseSurname | SpouseGender | SpouseID      |ChildName | ChildSurname | ChildGender | ChildID       | IsChildStudent | Tittle | Name    | Surname  | Relation | Gender | extendID    | PremiumPayBack | coverAmount |
      | FR         | Family     | 1999-05-05 |  75000      |   Mr        | Show        | Molo         |       Yes         | 0306206016934 | 0306206016934 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55  | 1234       |Miss       | Joy       | McGregor     | 9804148137926 | 9804148137926  | Sister        |    30     | 30 Apr 2024 | ABSA BANK           | 632005     | Savings Account | 1234          | 1234           | 0601234230   |       No        |Miss        | Hazel      | Smith         | Female       | 9804147160424 |Mixo   | Shakwa           | Female      | 2208054628182 |     No        | Mr     | Shanani | Bongo    |  Cousin  | Male   | 9804147380725|     Yes        |   20000     |