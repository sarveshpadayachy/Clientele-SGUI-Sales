Feature:Clientele accident plus health event life plan Functionality

Background:
Given user Log in SGUI Website

Scenario Outline: User capture Individual sale for lump sum cover(GSD) of R15000 for different age
When user log in with Valid Credentials by entering
Then User select Plan Cover on dropdown text List, "<CoverPlan>"
When user Select the Plan Option:Member and family by selecting, "<PlanOption>"
Then User select the Date of Birth of the main life assured, "<MemberDOB>"
When User on the Slider Select the cover amounts that are applicable to the plan chosen
Then user Add Member details by capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
When user Confirms Beneficiary details, "<BeneficiaryRelation>"
When user add payer Details by capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>"
Then User add Government details if selected yes and add FICA and Premium Rates by capturing necessary details "<EmployeeNumber>", "<Department>", "<Authorised>", "<DebitDay>", "<DebitDate>" , "<IsProminentPublicOfficial>", "<IsProminentInternationalPublicOfficial>"
Then User Proceed with the Cover and conclude sale.




Examples:
| CoverPlan | PlanOption | MemberDOB | MemberTitle   | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress    | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | EmployeeNumber|          Department                 | Authorised | BeneficiaryRelation | IsProminentPublicOfficial | IsProminentInternationalPublicOfficial |
| YA        | Individual | 1993-06-03|     Mr        | Shandu     | Mills         |       Yes         | 9105219504030 | 9105219504030 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55  | 1234       |Miss        | Joy       | McGregor     | 9705149240850 | 9705149240850  | Sister        |    25    | 25 Jun 2024 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   |       Yes        |   22694064     |  National Department Of Home Affairs |    Yes     | Member Estate       |         Yes               |           No                           |