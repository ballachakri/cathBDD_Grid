package com.cath.kidston.bbd.StepDefinitions;

import com.cath.kidston.bbd.Register.RegisterDataFromExcel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Ar;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class RegisterFromExcelData {

  RegisterDataFromExcel regExcel=new RegisterDataFromExcel ();

  File srcfile;
  FileInputStream inStream;
  HSSFWorkbook book;
  HSSFSheet sheet;

    @Given("^i am on the home page for excel data$")
    public void i_am_on_the_home_page_for_excel_data() {
    regExcel.gotoRegisterPage ();
    }

    @When("^i enter all the data from excel sheet$")
    public void i_enter_all_the_data_from_excel_sheet( ) throws IOException {

    srcfile=new File("C:\\Users\\sball\\IdeaProjects\\cathbdd\\src\\test\\java\\com\\cath\\kidston\\bbd\\UserData.xls");
    inStream=new FileInputStream (srcfile);
    book=new HSSFWorkbook (inStream);
    sheet=book.getSheetAt (0);

    ArrayList<String> columnData=new ArrayList<String> ();

    Iterator<Row> rows=sheet.iterator ();
    rows.next () ;

    while (rows.hasNext ()) {

        System.out.println (rows.next ().getCell (1));

          }


    }

    @Then("^all the individual shoild be registered$")
    public void all_the_individual_shoild_be_registered() {

    }


}

