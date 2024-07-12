Feature:Clientele Investment plan Functionality

  Background:
    Given user Log in SGUI   website.

  Scenario Outline: User capture Clientele Wealth Plan Cover for different age
    When User log in with Valid Credentials by entering
    Then user select Plan Cover on dropdown text list, "<CoverPlan>"
    When User Add member details by Capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    Then user confirms Beneficiary details, "<BeneficiaryRelation>"
    When User Add payer details by Capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"
    Then user proceed with the Cover, FICA and Premium Rates by capturing necessary details and Conclude sale. "<IsProminentPublicOfficial>","<IsProminentInternationalPublicOfficial>", "<PremiumRates>"


    Examples:
     | CoverPlan                 |  MemberTitle   | MemberName | MemberSurname | MemberCitizenShip   | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay  | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | BeneficiaryRelation | IsProminentPublicOfficial | IsProminentInternationalPublicOfficial | PremiumRates           |
     | Clientele Wealth Plan     |       Mr       | Sandile      | Mills         |       Yes         | 9804147349480 | 9804147349480 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55  | 1234       |Miss        | Joy       | McGregor     | 9808163004184 | 9808163004184  | Sister        |    30     | 30 Apr 2024 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       No        | Member Estate       |         No                |           No                           | Premium R400/ Cover R0 |