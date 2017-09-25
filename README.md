# BricandoSelenium
Teste de Login com Selenium WebDriver

- Selenium WebDriver
- Chrome WebDriver
- Maven
- Java
- Junit

 1) Criar um projeto Maven;
 2) Inserir as seguintes dependências do Selenium, ou buscar no site https://mvnrepository.com/ a versão mais atual;

<dependencies>
        <!-- https://mvnrepository.com/artifact/junit/junit -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.5.3</version>
        </dependency>
</dependencies>

 3) Aguardar o Maven baixar as dependências;
 4) Ir até SRC -> Test -> Java -> <<NOME_DA_PASTA>>
 5) Criar uma classe Java com o nome da pagína que deseja automatizar com o sufixo Test;
 6) Criar um metódo de test, utilizando a anotação @Test;
 7) Baixar o Chrome WebDriver, salvar em uma pasta dentro de Users;
 8) Para informar ao Selenium onde está o Chrome Webdriver, basta informar da seguinte maneira:

-  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChormeDriver\\chromedriver.exe");

 9) Para instanciar o navegador Google Chrome, basta informar dentro do metódo da seguinte maneira:
  -   WebDriver navegador = new ChromeDriver();

 10)Para abrir uma determinada página na internet, basta informar da seguinte maneira:
  
  - WebDriver navegador = new ChromeDriver();

 11) Como buscar um elemento por ID?

- navegador.findElement(By.id("<ID>"));

 12) Como buscar um elemento por name?

- navegador.findElement(By.name("login"));

 13) Como buscar um elemento por Link?

- navegador.findElement(By.linkText("SIGN IN");

 14)Como validar o teste?
 
 assertEquals( expectativa, encontrado);
 Ex: assertEquals(1, 2);
 
 
 //Referencias:
  https://www.youtube.com/watch?v=YPTlx9vbikM&t=34
 
