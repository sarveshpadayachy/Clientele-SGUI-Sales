Feature: Legal Cover for all ages

  Scenario Outline: Capture legal cover for all age bands.

    Given User log in SGUI or shamba  website,
    When  User Select the plan option '<SelectPlan>'
    Then User Selects the date of birth of the main life assured, '<PlanOP1>', '<mainLifeDOB>'
    When   User Select the plan option and then a consultant enters all the necessary required member details, '<Tittle>','<Name>','<Surname>','<SouthAfricanCitizen>','<IDNumber1>','<IDNumber2>','<DateOfBirth>','<MonthlyIncome>','<Occupation>','<Education>','<CellNumber>','<PostalAddress>','<PostalCode>',
    When  a user enters required spouse and child details  '<SpouseTitle>', '<SpouseName>','<spouseSurname>' , '<SpouseGender>', '<SpouseIDNumber>', '<ChildName>', '<childSurname>', '<childGen>', '<ChildIDNumber>', '<ChildIsStudent>',
    Then a user then enters extended member details  '<ExtMemberTitle>','<ExtMmemberName>','<ExtMmemberSurname>','<ExtMmemberRelationship>','<ExtMmemberGender>','<ExtMmemberIDNumber>'
    When  User adds beneficiary and  proceeds with the cover and conclude sales, '<BeneficiaryRelationship>'
    Then  A consultant enters required payer details,  '<PayerTitle>','<PayerName>','<PayerSurname>','<PayerID1>','<PayerID2>','<Relationship>','<DebitDay>','<FirstDebitDay>','<BankName>', '<BranchCode>', '<AccountType>', '<AccountNumber1>','<AccountNumber2>','<MobileNumber>','<IsEmployee>', '<Convert>'



    Examples:
      |SelectPlan          |  mainLifeDOB |PlanOP1|Tittle | Name |Surname| SouthAfricanCitizen     | IDNumber1    |IDNumber2    |DateOfBirth| MonthlyIncome | Occupation | Education |CellNumber | PostalAddress |  PostalCode  | SpouseTitle|SpouseName|spouseSurname|SpouseGender|SpouseIDNumber|ChildName|childSurname|childGen|ChildIDNumber|ChildIsStudent|ExtMemberTitle|ExtMmemberName|ExtMmemberSurname|ExtMmemberRelationship|ExtMmemberGender|ExtMmemberIDNumber|BeneficiaryRelationship|PayerTitle|PayerName|PayerSurname|PayerID1     |PayerID2     |Relationship|DebitDay|FirstDebitDay|BankName        |BranchCode|AccountType    |AccountNumber1|AccountNumber2|MobileNumber|IsEmployee|Convert             |EmployeeNmber|Department                   |Deduction|
      | Classic Legal Plan |  2001-06-03  | Family|Miss   |Kamo  |Breeze |Yes                      | 9705125321898|9705125321898|2022-06-03 | Up to 3,000   | Clerk      |Matric     |0625956363 |74 Hill Street | 2092         |Mr         |Leeto     |Kgosi         |Male        |9205126038625 |Lame     |Kgomo       |Male    |0705125115323|No            |Mr            |Lerato        |Kgosi            |Brother               |Male            |9905079217320     |Member Estate          |Miss      |Tisetso  |Viks        |9205129433070|9205129433070|Cousin      |30      |30 May 2024  |CAPITEC BANK LTD|470010    |Savings Account|1234          |1234          |0601234230  |No        |Classic Legal Plan  |72491906     |South African Police Service | Yes     |

#Change plan option if you want an individual plan here