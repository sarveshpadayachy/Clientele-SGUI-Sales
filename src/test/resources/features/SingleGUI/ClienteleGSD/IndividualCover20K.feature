Feature:Clientele accident plus health event life plan Functionality

  Background:
    Given User Log in SGUI Website

  Scenario Outline: User capture Individual sale for lump sum cover(GSD) of R20000 for different age
    When user log in with Valid Credentials by Entering
    Then User select Plan Cover on Dropdown text List, "<CoverPlan>"
    When user Select the Plan Option:Member and Family by selecting, "<PlanOption>"
    Then User select the Date of Birth of the Main life assured, "<MemberDOB>"
    When User on the Slider Select the Cover amounts that are applicable to the plan chosen
    Then user Add Member Details by capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When user Confirms Beneficiary "<BeneficiaryRelation>"
    When user Add payer Details by capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"
    Then User add Government Details if selected yes , FICA and Premium Rates by capturing necessary Details,  "<EmployeeNumber>", "<Department>", "<Authorised>", "<DebitDay>", "<DebitDate>", "<IsProminentPublicOfficial>", "<IsProminentInternationalPublicOfficial>"
    Then User Proceed with the Cover and Conclude sale.


    Examples:
     | CoverPlan | PlanOption | MemberDOB | MemberTitle   | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | EmployeeNumber|   Department        | Authorised | BeneficiaryRelation | IsProminentPublicOfficial | IsProminentInternationalPublicOfficial |
     | YA        | Individual | 1993-06-03|     Mr        | Shade      | Mills         |       Yes         | 9805196486271 | 9805196486271 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55  | 1234       |Miss        | Joy       | McGregor     | 0005176483922 | 0005176483922  | Sister        |    1     | 01 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       Yes       |  55964877     | Western Cape Health |    Yes     | Member Estate       |         Yes               |           No                           |