Feature: Legal Cover for all ages

  Scenario Outline: Capture legal cover for all age bands.

    Given user log in SGUI or shamba  website
    When  user Select the plan option '<SelectPlan>'
    Then user Selects the date of birth of the main life assured, '<mainLifeDOB>'
    When   user Select the plan option and then a consultant enters all the necessary required member details, '<Tittle>','<Name>','<Surname>','<SouthAfricanCitizen>','<IDNumber1>','<IDNumber2>','<DateOfBirth>','<MonthlyIncome>','<Occupation>','<Education>','<CellNumber>','<PostalAddress>','<PostalCode>',
    Then  a consultant enters required  extended member details  '<ExtMemberTitleB>','<ExtMmemberNameB>','<ExtMmemberSurnameB>','<ExtMmemberRelationshipB>','<ExtMmemberGenderB>','<ExtMmemberIDNumberB>'
    When user adds beneficiary as well as payer details and  proceeds with the cover and conclude sales, '<BeneficiaryRelationship>', '<Convert>', '<PayerTitle>','<PayerName>','<PayerSurname>','<PayerID1>','<PayerID2>','<Relationship>','<DebitDay>','<FirstDebitDay>','<BankName>', '<BranchCode>', '<AccountType>', '<AccountNumber1>','<AccountNumber2>','<MobileNumber>','<IsEmployee>',



    Examples:
      |  mainLifeDOB | Tittle| Name |Surname| SouthAfricanCitizen     | IDNumber1     |IDNumber2    |DateOfBirth| MonthlyIncome | Occupation | Education |CellNumber | PostalAddress |  PostalCode  |SelectPlan                                   |PayerTitle|PayerName|PayerSurname|PayerID1     |PayerID2     |Relationship|DebitDay|FirstDebitDay|BankName        |BranchCode|AccountType    |AccountNumber1|AccountNumber2|MobileNumber|IsEmployee|BeneficiaryRelationship|Convert                                       |ExtMemberTitleB|ExtMmemberNameB|ExtMmemberSurnameB|ExtMmemberRelationshipB|ExtMmemberGenderB|ExtMmemberIDNumberB|
      |  2001-06-03  | Miss  |Kamo  |Breeze |Yes                      | 9704086124284 |9704086124284|2022-06-03 | Up to 3,000   | Clerk      |Matric     |0625956363 |74 Hill Street | 2092         |Clientele Standard Legal Policy (Member Only)|Miss      |Tisetso  |Viks        |9704086981246|9704086981246|Cousin      |30      |30 Apr 2024  |CAPITEC BANK LTD|470010    |Savings Account|1234          |1234          |0601234230  |No        |Member Estate          |Clientele Standard Legal Policy (Member Only) |Mr             |Gibbs          |Molalo            |Brother                |Male             |9704086110705      |