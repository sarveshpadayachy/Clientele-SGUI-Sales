Feature: Legal Cover for all ages

  Scenario Outline: Capture legal cover for all age bands.

    Given User logs in SGUI or shamba  website
    When  User Select the plan option ,'<SelectPlan>'
    Then User Selects the plan option and  date of birth of the main life assured '<PlanOP>','<mainLifeDOB>'
    When   User Select the plan option and then a consultant enters all the necessary required member details. '<Tittle>','<Name>','<Surname>','<SouthAfricanCitizen>','<IDNumber1>','<IDNumber2>','<DateOfBirth>','<MonthlyIncome>','<Occupation>','<Education>','<CellNumber>','<PostalAddress>','<PostalCode>',
  #  When  a user enters required spouse and child details  '<SpouseTitle>', '<SpouseName>','<spouseSurname>' , '<SpouseGender>', '<SpouseIDNumber>', '<ChildName>', '<childSurname>', '<childGen>', '<ChildIDNumber>', '<ChildIsStudent>',
    Then  A consultant enters required extended member details '<ExtMemberTitle>','<ExtMmemberName>','<ExtMmemberSurname>','<ExtMmemberRelationship>','<PreFee>','<ExtMmemberGender>','<ExtMmemberIDNumber>', '<ExtMemberTitleA>','<ExtMmemberNameA>','<ExtMmemberSurnameA>','<ExtMmemberRelationshipA>','<PreFeeA>','<ExtMmemberGenderA>','<ExtMmemberIDNumberA>'
    When  User adds beneficiary and  proceeds with the cover and concludes the sale, '<BeneficiaryRelationship>'
    Then  A consultant enters required necessary payer details,  '<PayerTitle>','<PayerName>','<PayerSurname>','<PayerID1>','<PayerID2>','<Relationship>','<DebitDay>','<FirstDebitDay>','<BankName>', '<BranchCode>', '<AccountType>', '<AccountNumber1>','<AccountNumber2>','<MobileNumber>','<IsEmployee>', '<Convert>'


    Examples:
      |PlanOP    |  mainLifeDOB | Tittle|Name  |Surname| SouthAfricanCitizen     | IDNumber1              |IDNumber2    |DateOfBirth| MonthlyIncome | Occupation | Education |CellNumber | PostalAddress |  PostalCode  |SelectPlan             |PayerTitle|PayerName|PayerSurname|PayerID1     |PayerID2     |Relationship|DebitDay|FirstDebitDay|BankName        |BranchCode|AccountType    |AccountNumber1|AccountNumber2|MobileNumber|IsEmployee|BeneficiaryRelationship|Convert                  |SpouseTitle|SpouseName|spouseSurname|SpouseGender|SpouseIDNumber|ChildName|childSurname|childGen|ChildIDNumber|ChildIsStudent|ExtMemberTitle|ExtMmemberName|ExtMmemberSurname|ExtMmemberRelationship|PreFee|ExtMmemberGender|ExtMmemberIDNumber|ExtMemberTitleA|ExtMmemberNameA|ExtMmemberSurnameA|ExtMmemberRelationshipA|PreFeeA|ExtMmemberGenderA|ExtMmemberIDNumberA|
      |Individual|  2001-06-03  | Miss  |Kamo  |Breeze |Yes                      | 0004097262671          |0004097262671|2022-06-03 | Up to 3,000   | Clerk      |Matric     |0625956363 |74 Hill Street | 2092         |Enhanced Extended Legal|Miss      |Tisetso  |Viks        |9704087447577|9704087447577|Cousin      |29      |29 Apr 2024  |CAPITEC BANK LTD|470010    |Savings Account|1234          |1234          |0601234230  |No        |Member Estate          | Enhanced Extended Legal |Mr         |Leeto     |Kgosi        |Male        |9411235211968 |Lame     |Kgomo       |Male    |0711239568522|No            |Mr            |Lerato        |Kgosi            |Brother               |Yes   |Male            |0004095524106     |Mr             |Kgosi          |Molusi            |Cousin                 |Yes    |Male             |0004096591401      |

