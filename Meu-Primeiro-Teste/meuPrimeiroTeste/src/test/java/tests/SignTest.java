package tests;


import org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class SignTest {
    @Test
    public void testFazerLoginNoTaskit(){

        //Declarando onde está o plugin do Browser
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChormeDriver\\chromedriver.exe");
        //Chamar o navegador
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Abrir a página
        navegador.get("http://www.juliodelima.com.br/taskit/");

        //Achar um link na página
        navegador.findElement(By.linkText("Sign in")).click();

        //Encontrar o elemento dentro do formulário e Preencher o Login
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("rafael");
        //Encontrar o elemento dentro do formulário e Preencher a senha
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys("123");
        //Encontrar o elemento dentro do formulário e Clicar no Link (Case sensitive)
        navegador.findElement(By.id("signinbox")).findElement(By.linkText("SIGN IN")).click();

        String saudacao = navegador.findElement(By.className("me")).getText();

        assertEquals( "Hi, Rafael", saudacao);
        navegador.quit();
    }

}
