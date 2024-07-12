Feature:Clientele accident plus health event life plan Functionality

  Background:
    Given User log in SGUI Website

  Scenario Outline: User capture Individual sale for lump sum cover(GSD) of R25000 for different age
    When User log in with Valid Credentials by Entering
    Then User select Plan Cover on Dropdown Text List, "<CoverPlan>"
    When user Select the Plan Option:Member and Family by Selecting, "<PlanOption>"
    Then User select the Date of Birth of the Main life Assured, "<MemberDOB>"
    When User on the Slider Select the Cover Amounts that are applicable to the plan chosen
    Then user Add Member Details by Capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When User Confirms Beneficiary, "<BeneficiaryRelation>"
    When user Add Payer Details by capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"
    Then User add Government Details if selected Yes, FICA and Premium Rates by capturing necessary Details, "<EmployeeNumber>", "<Department>", "<Authorised>", "<DebitDay>", "<DebitDate>", "<IsProminentPublicOfficial>", "<IsProminentInternationalPublicOfficial>"
    Then user Proceed with the Cover and Conclude sale.


    Examples:
     | CoverPlan | PlanOption | MemberDOB | MemberTitle   | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | EmployeeNumber|          Department                 | Authorised | BeneficiaryRelation | IsProminentPublicOfficial | IsProminentInternationalPublicOfficial |
     | YA        | Individual | 1993-06-03|     Mr        | Shade      | Mills         |       Yes         | 9306038542082 | 9306038542082 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55  | 1234       |Miss        | Joy       | McGregor     | 9606035120182 | 9606035120182  | Sister        |    1     | 01 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       Yes        |  55964877     | Western Cape Health |    Yes     | Member Estate       |         Yes               |           No                           |