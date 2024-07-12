Feature:Clientele Ultimate Dignity plan Functionality

  Background:
    Given user log in SGUI Website.

  Scenario Outline: User capture funeral Product for Family Cover
    When user log in with valid Credentials by entering.
    Then user select Plan cover on dropdown text list. "<CoverPlan>"
    When user Select the Plan option:Member and family by selecting. "<PlanOption>"
    Then User select the Date of birth of the main life assured. "<MemberDOB>"
    When User on the slider select the cover amounts that are applicable to the plan chosen, <CoverAmount>
    Then user add member details by capturing. "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    Then user add spouse details by capturing. "<SpouseTitle>", "<SpouseName>", "<SpouseSurname>", "<SpouseGender>", "<SpouseID>"
    When user add child details by capturing. "<ChildName>", "<ChildSurname>", "<ChildGender>", "<ChildID>", "<IsChildStudent>"
    Then user add extended member by capturing. "<Tittle>", "<Name>", "<Surname>", "<Relation>", "<Gender>", "<extendID>", "<PremiumPayBack>"
    When user add cover amount on the slider of extended family, <coverAmount>
    When user add payer details by capturing. "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"
    Then User proceed with the Cover and conclude sale...

    Examples:
    | CoverPlan  | PlanOption | MemberDOB  | CoverAmount | MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName           | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | SpouseTitle | SpouseName | SpouseSurname | SpouseGender | SpouseID      |ChildName | ChildSurname | ChildGender | ChildID       | IsChildStudent | Tittle | Name    | Surname  | Relation | Gender | extendID     | PremiumPayBack | coverAmount |
    | UF         | Family     | 2003-08-05 |  23000     |   Mr       | Samie      | Mobi         |       Yes         | 8106108452084 | 8106108452084 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 57 | 1234       |Miss       | Joy       | McGregor     | 8703182882184 | 8703182882184  | Sister        |    29     | 29 Jun 2024 | ABSA BANK           | 632005     | Savings Account | 1234          | 1234           | 0601234230   |       No        |Miss        | Hazel      | Smith         | Female       | 8509182470189 |Mixo   | Shakwa       | Female              | 2208054628182 |     No        | Mr     | Shanani | Bongo    |  Cousin  | Male   | 8810299719082|     Yes        |   20000     |