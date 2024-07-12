Feature:Clientele Investment plan Functionality

  Background:
    Given user Log in SGUI  Website.

  Scenario Outline: User capture Clientele Wealth Plan(GSD) Cover for different age
    When User Log in with Valid Credentials by entering
    Then User Select Plan Cover on dropdown text list, "<CoverPlan>"
    When User Add member details By Capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    Then user confirms Beneficiary details "<BeneficiaryRelation>",
    When User Add payer details By Capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"
    Then user add Government details if selected yes, "<EmployeeNumber>", "<Department>", "<Authorised>", "<DebitDay>", "<DebitDate>"
    When User confirms FICA and Premium rates by capturing necessary details   "<IsProminentPublicOfficial>", "<IsProminentInternationalPublicOfficial>", "<PremiumRates>"
    Then user proceed with the Cover and Conclude Sale.


    Examples:
     | CoverPlan                 |  MemberTitle   | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay  | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee  | EmployeeNumber | Department                          | Authorised | BeneficiaryRelation | IsProminentPublicOfficial | IsProminentInternationalPublicOfficial | PremiumRates           |
     | Clientele Wealth Plan     |       Mr       | Sansa      | Mills         |       Yes         | 9405195004975 | 9405195004975 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55  | 1234       |Miss        | Joy       | McGregor     | 9405195709359 | 9405195709359  | Sister        |    25     | 25 Jun 2024 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       Yes        | 22694064       |  National Department Of Home Affairs|    Yes     | Member Estate       |         No                |           No                           | Premium R400/ Cover R0 |