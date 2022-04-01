JUnit
--------------------------------------------------------------------

    Testing Types?
        Black Box Test
        White Box Test
        Grey Box Test
        Smoke Test

    Testing Levels?
        Unit Test                       employes Black Box Testing , Smoke Test
        Integration Test                employes Black Box Testing 
        System Test                     employes Black Box Testing + Grey Box Testing
        User Acceptence Test            employes White Box Testing

    What do we test?
        Functionality       Functional Testing      employes Black Box Testing 
        Performence         Quality Testing         employes White Box Testing 


    Lab Setup
    --------------------------------------
        Eclipse IDE for JavaEE
        JDK 1.8
        Mavne 3.x
        MySQL

  
    JUnit 5 Components
    ---------------------------------------
        1. Testing API          jupiter api
        2. Testing Engine       junit-jupiter
        3. Vintage Support      junit vintage
        4. Test Runner          u=junit-eclispe-runner / surefire


    To Run Junit on maven
    ----------------------------------------
    <plugin>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>2.19.1</version>
        <dependencies>
            <dependency>
                <groupId>org.junit.platform</groupId>
                <artifactId>junit-platform-surefire-provider</artifactId>
                <version>1.0.1</version>
            </dependency>
        </dependencies>
    </plugin>
    
    Mockito
    ----------------------------------------

        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <version>2.21.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-junit-jupiter</artifactId>
            <version>2.23.0</version>
            <scope>test</scope>
        </dependency>

        @ExtendWith(MockitoExtension.class)
        @RunWith(JUnitPlatform.class)

        @Mock

    Case Study
    ---------------------------------------
        Budget Tracking Application
            1. Is used by registered AccountHolders.
            2. Each account holder will have to record a transaction made.
            3. The application needs to track the current balance of the account holder
            4. The application has to generate a statement for a given month.


        Assignment # 1 
        ---------------
         1. Define a model com.cts.bt.model.AccountHolder (ahId,fullName,mobile,mailId,currentBalance)
         2. Define a interface com.cts.bt.repo.AccountHolderRepo
                    having method add,modify,delete,getAll,getById
         3. Define a interface com.cts.bt.service.AccountHolderService
                    having method add,modify,delete,getAll,getById and validateAccountHolder
         4. Define a class com.cts.bt.service.AccountHolderServiceImpl implmenting com.cts.bt.service.AccountHolderService
         5. Write all possible test senarios for all methods in com.cts.bt.service.AccountHolderServiceImpl
         6. Use appropriate exception whereever needed.
