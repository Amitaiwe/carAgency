package com.example.car_agency;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    ArrayList<String> branches = new ArrayList<String>();
    ArrayList<String> YNboolean = new ArrayList<String>();
    ArrayList<String> types = new ArrayList<String>();

    GridPane landingPane = new GridPane();//1
    GridPane adminPane = new GridPane();//2
    GridPane chooseTypePane = new GridPane();//3
    GridPane choosePrivatePane = new GridPane();//4
    GridPane addMotorPane = new GridPane();//5
    GridPane addFamilyPane = new GridPane();//6
    GridPane addLuxuryPane = new GridPane();//7
    GridPane addJeepPane = new GridPane();//8
    GridPane showPane = new GridPane();//9
    GridPane resultsPane = new GridPane();//10
    Scene landingScene = new Scene(landingPane, 480, 480);//1

    Scene adminScene = new Scene(adminPane, 480, 480);//2
    Scene chooseTypeCarsScene = new Scene(chooseTypePane, 480, 480);//3
    Scene choosePrivateScene = new Scene(choosePrivatePane, 480, 480);//4
    Scene addMotorScene = new Scene(addMotorPane, 480, 480);//5
    Scene addFamilyScene = new Scene(addFamilyPane, 480, 480);//6
    Scene addLuxuryScene = new Scene(addLuxuryPane, 480, 480);//7
    Scene addJeepScene = new Scene(addJeepPane, 480, 480);//8
    Scene showCarsScene = new Scene(showPane, 480, 480);//9
    Scene resultsScene = new Scene(resultsPane, 480, 480);//10

    Text t1 = new Text("");
    Text t2 = new Text("");

    Text t3 = new Text("");
    Text t4 = new Text("");
    Text t5 = new Text("");
    Text t6 = new Text("");
    void findCars(agency a , String br, String t){
        int i = 0;
        for (branch b : a.getB()){
            if (b.getCity() == br){
                for(car c : b.getCars()){
                    if(c.getClassName() == t){
                        System.out.println(c);
                        showCars(c, i);
                        i++;
                    }
                }
            }
        }
    }
    void showCars(car c, int i){
        if(i == 0)t1.setText(c.toString());
        if(i == 1)t2.setText(c.toString());
        if(i == 2)t3.setText(c.toString());
        if(i == 3)t4.setText(c.toString());
        if(i == 4)t5.setText(c.toString());
        if(i == 5)t6.setText(c.toString());
    }
    void addMotor(agency a, String motorB, String motorC, int motorY, int motorP, boolean motorO){
        a.addCar(motorB, motorC, motorY, motorP, motorO);
    }
    void addFamily(agency a, String b, String c, int y, int p, int e,boolean mobileye,String multy){
        a.addCar(b, c, y, p, e, mobileye, multy);
    }
    void addLuxury(agency a, String b, String c, int y, int p, int engine, boolean mobileye, boolean massage){
        a.addCar(b, c, y, p, engine, mobileye, massage);
    }
    void addJeep(agency a, String b, String c, int y, int p, boolean Awd, boolean ws){
        a.addCar(b, c, y, p, Awd, ws);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws IOException {

        t1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));

        branches.add("Haifa");
        branches.add("Jerusalem");
        branches.add("Taibe");

        YNboolean.add("yes");
        YNboolean.add("no");

        types.add("motor");
        types.add("private");
        types.add("jeep");

        agency a1 = new agency();

        //scene 1 landing page !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        FileInputStream inputstream = new FileInputStream("C://Users//AMITA//IdeaProjects//demo//src//main//java//com//example//demo//icon.png");
        Image image = new Image(inputstream);

        Label landingLab = new Label("Welcome to our Car Agency");
        landingLab.setStyle("-fx-font: normal bold 20px 'serif' ");

        landingPane.setStyle("-fx-background-image:image");

        Button add = new Button("add car");
        add.setStyle("-fx-background-color: red; -fx-text-fill: white;");
        Button show = new Button("find car");
        show.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        add.setOnAction(e -> {//add cars
                    stage.setScene(adminScene);
                }
        );
        show.setOnAction(e ->{//find car
            stage.setScene(showCarsScene);

        });

        //create the grid and css it
        landingPane.setPadding(new Insets(10, 10, 10, 10));
        landingPane.setVgap(7);
        landingPane.setHgap(5);
        landingPane.setAlignment(Pos.CENTER);

        //adding the elements to the layout
        landingPane.add(landingLab, 1, 0);
        landingPane.add(add, 1,2);
        landingPane.add(show, 1,4);
        landingPane.setStyle("-fx-background-color: BEIGE;");

        //scene 2 - password!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
        Label adminLabel = new Label("enter admin password");
        adminLabel.setStyle("-fx-font: normal bold 20px 'serif' ");

        PasswordField pw = new PasswordField();
        Button submitBtn = new Button("click");
        submitBtn.setStyle("-fx-background-color: red; -fx-text-fill: white;");


        submitBtn.setOnAction(e -> {//check password
                    if(Integer.parseInt(pw.getText()) == 12345){
                        stage.setScene(chooseTypeCarsScene);//jump to scene 3
                    }
                    else{
                        stage.setScene(landingScene);//jump to scene 1

                    }
                }
        );
        //create the grid and css it
        adminPane.setPadding(new Insets(10, 10, 10, 10));
        adminPane.setVgap(7);
        adminPane.setHgap(5);
        adminPane.setAlignment(Pos.CENTER);
        //adding the elements to the layout
        adminPane.add(adminLabel, 0, 0);
        adminPane.add(pw, 0,2);
        adminPane.add(submitBtn, 0,4);
        adminPane.setStyle("-fx-background-color: BEIGE;");


        //scene 3!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Label chooseLabel = new Label("which car");
        chooseLabel.setStyle("-fx-font: normal bold 20px 'serif' ");


        Button mBtn = new Button("add motor");
        add.setStyle("-fx-background-color: red; -fx-text-fill: white;");
        Button pBtn = new Button("add private");
        add.setStyle("-fx-background-color: red; -fx-text-fill: white;");
        Button jBtn = new Button("add jeep");
        add.setStyle("-fx-background-color: red; -fx-text-fill: white;");

        mBtn.setOnAction(e -> {//add motor
                    stage.setScene(addMotorScene);
                }
        );
        pBtn.setOnAction(e -> {//add private
                    stage.setScene(choosePrivateScene);
                }
        );
        jBtn.setOnAction(e -> {//add jeep
                    stage.setScene(addJeepScene);
                }
        );
        //create the grid and css it
        chooseTypePane.setPadding(new Insets(10, 10, 10, 10));
        chooseTypePane.setVgap(7);
        chooseTypePane.setHgap(5);
        chooseTypePane.setAlignment(Pos.CENTER);
        //adding the elements to the layout
        chooseTypePane.add(chooseLabel, 0, 0);
        chooseTypePane.add(mBtn, 0,3);
        chooseTypePane.add(pBtn, 0,6);
        chooseTypePane.add(jBtn, 0,9);
        chooseTypePane.setStyle("-fx-background-color: BEIGE;");


        //scene 4 - choose private type!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Label choosePrivateLabel = new Label("please choose private type");
        choosePrivateLabel.setStyle("-fx-font: normal bold 20px 'serif' ");

        Button fBtn = new Button("add family car");
        fBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        Button lBtn = new Button("add luxury car");
        lBtn.setStyle("-fx-background-color: red; -fx-text-fill: white;");

        fBtn.setOnAction(e -> {//add family
                    stage.setScene(addFamilyScene);
                }
        );
        lBtn.setOnAction(e -> {//add luxury
                    stage.setScene(addLuxuryScene);
                }
        );
        //create the grid and css it
        choosePrivatePane.setPadding(new Insets(10, 10, 10, 10));
        choosePrivatePane.setVgap(7);
        choosePrivatePane.setHgap(5);
        choosePrivatePane.setAlignment(Pos.CENTER);
        //adding the elements to the layout
        choosePrivatePane.add(choosePrivateLabel, 0, 0);
        choosePrivatePane.add(fBtn, 0,3);
        choosePrivatePane.add(lBtn, 0,6);
        choosePrivatePane.setStyle("-fx-background-color: BEIGE;");

        // scene 5 -add motor!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
        Label motorLabel = new Label("add a motor");
        motorLabel.setStyle("-fx-font: normal bold 20px 'serif' ");

        ComboBox motorBranch =new ComboBox(FXCollections.observableArrayList(branches));
        motorBranch.setStyle("-fx-font: normal bold 20px 'serif' ");
        motorBranch.setPromptText("choose branch");
        Label motorCompanyL = new Label("company:");
        motorCompanyL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField motorCompanyT = new TextField();
        Label motorYearL = new Label("year:");
        motorYearL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField motorYearT = new TextField();
        Label motorPriceL = new Label("price:");
        motorPriceL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField motorPriceT = new TextField();
        ComboBox offRoadB =new ComboBox(FXCollections.observableArrayList(YNboolean));
        offRoadB.setStyle("-fx-font: normal bold 20px 'serif' ");
        offRoadB.setPromptText("offRoad motor?");

        Button motorBtn = new Button("add");
        motorBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        Button mHome = new Button("Home");
        mHome.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");


        motorBtn.setOnAction(e -> {//add motor
                    Alert alrt = new Alert(Alert.AlertType.INFORMATION);
                    String motorB = (String) motorBranch.getValue();
                    String motorC = (String) motorCompanyT.getText();
                    int motorY;
                    try{
                        motorY = Integer.parseInt(motorYearT.getText());
                        //int number = Integer.parseInt(Integer.toString(motorY));
                    }
                    catch (NumberFormatException ex){
                        ex.printStackTrace();
                        alrt.setHeaderText("illegal year!, please try again");
                        alrt.show();
                        throw new Error("illegal value/s\n");
                    }
                    int motorP = Integer.parseInt(motorYearT.getText());
                    if (motorY < 1980 || motorY > 2023 || motorC.length() > 15 || motorC.length() < 2 || motorP < 100){
                        alrt.setHeaderText("illegal value/s!, please try again");
                        alrt.show();
                        throw new Error("illegal value/s\n");
                    }
                    boolean motorO;
                    if (offRoadB.getValue() == "yes") {
                        motorO = true;
                    } else {
                        motorO = false;
                    }
                    addMotor(a1, motorB, motorC, motorY, motorP, motorO);
                    alrt.setHeaderText("motor added!");
                    alrt.show();
                }
        );
        mHome.setOnAction(e ->{
            stage.setScene(landingScene);
        });


        addMotorPane.setPadding(new Insets(10, 10, 10, 10));
        addMotorPane.setVgap(7);
        addMotorPane.setHgap(5);
        addMotorPane.setAlignment(Pos.CENTER);

        //adding the elemets to the layout
        addMotorPane.add(motorLabel, 1, 0);
        addMotorPane.add(motorBranch, 1, 1);
        addMotorPane.add(motorCompanyL, 0, 2);
        addMotorPane.add(motorCompanyT, 1, 2);
        addMotorPane.add(motorYearL, 0, 3);
        addMotorPane.add(motorYearT, 1, 3);
        addMotorPane.add(motorPriceL, 0, 4);
        addMotorPane.add(motorPriceT, 1, 4);
        addMotorPane.add(offRoadB, 1, 5);
        addMotorPane.add(motorBtn,1,6);
        addMotorPane.add(mHome, 1, 7);
        addMotorPane.setStyle("-fx-background-color: BEIGE;");


        //scene 6 add family!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Label familyLabel = new Label("add a family car");
        familyLabel.setStyle("-fx-font: normal bold 20px 'serif' ");

        ComboBox familyBranch =new ComboBox(FXCollections.observableArrayList(branches));
        familyBranch.setStyle("-fx-font: normal bold 20px 'serif' ");
        familyBranch.setPromptText("choose branch");
        Label familyCompanyL = new Label("company:");
        familyCompanyL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField familyCompanyT = new TextField();
        Label familyYearL = new Label("year:");
        familyYearL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField familyYearT = new TextField();
        Label familyPriceL = new Label("price:");
        familyPriceL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField familyPriceT = new TextField();
        Label familyEngineL = new Label("engine capacity?:");
        familyEngineL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField familyEngineT = new TextField();
        ComboBox mobileyeB =new ComboBox(FXCollections.observableArrayList(YNboolean));
        mobileyeB.setStyle("-fx-font: normal bold 20px 'serif' ");
        mobileyeB.setPromptText("have Mobileye?");
        Label multyMediaL = new Label("company of the multyMedia system?:");
        multyMediaL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField multyMediaT = new TextField();

        Button familyBtn = new Button("add");
        familyBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        Button fHome = new Button("Home");
        fHome.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");


        familyBtn.setOnAction(e -> {//add family private
                    String b = (String) familyBranch.getValue();
                    String c = (String) familyCompanyT.getText();
                    int y = Integer.parseInt(familyYearT.getText());//חריגות!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
                    int p = Integer.parseInt(familyPriceT.getText());
                    int engine = Integer.parseInt(familyEngineT.getText());
                    boolean mobileye;
                    if(mobileyeB.getValue() == "yes"){
                        mobileye = true;
                    }
                    else{
                        mobileye = false;
                    }
                    String multy = multyMediaT.getText();
                    addFamily(a1, b, c, y, p, engine, mobileye, multy);
                }
        );
        fHome.setOnAction(e ->{
            stage.setScene(landingScene);
        });

        addFamilyPane.setPadding(new Insets(10, 10, 10, 10));
        addFamilyPane.setVgap(7);
        addFamilyPane.setHgap(5);
        addFamilyPane.setAlignment(Pos.CENTER);
        //adding the elemets to the layout
        addFamilyPane.add(familyLabel, 1, 0);
        addFamilyPane.add(familyBranch, 1, 1);
        addFamilyPane.add(familyCompanyL, 0, 2);
        addFamilyPane.add(familyCompanyT, 1, 2);
        addFamilyPane.add(familyYearL, 0, 3);
        addFamilyPane.add(familyYearT, 1, 3);
        addFamilyPane.add(familyPriceL, 0, 4);
        addFamilyPane.add(familyPriceT, 1, 4);
        addFamilyPane.add(familyEngineL, 0, 5);
        addFamilyPane.add(familyEngineT, 1, 5);
        addFamilyPane.add(mobileyeB, 1, 6);
        addFamilyPane.add(multyMediaL, 0, 7);
        addFamilyPane.add(multyMediaT, 1, 7);
        addFamilyPane.add(familyBtn,1, 8);
        addFamilyPane.add(fHome, 1, 9);
        addFamilyPane.setStyle("-fx-background-color: BEIGE;");

        //scene 7 add luxury!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Label luxuryLabel = new Label("add a luxury car");
        luxuryLabel.setStyle("-fx-font: normal bold 20px 'serif' ");

        ComboBox luxuryBranch =new ComboBox(FXCollections.observableArrayList(branches));
        luxuryBranch.setStyle("-fx-font: normal bold 20px 'serif' ");
        luxuryBranch.setPromptText("choose branch");
        Label luxuryCompanyL = new Label("company:");
        luxuryCompanyL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField luxuryCompanyT = new TextField();
        Label luxuryYearL = new Label("year:");
        luxuryYearL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField luxuryYearT = new TextField();
        Label luxuryPriceL = new Label("price:");
        luxuryPriceL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField luxuryPriceT = new TextField();
        Label luxuryEngineL = new Label("engine capacity?:");
        luxuryEngineL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField luxuryEngineT = new TextField();
        ComboBox mobileyeBool =new ComboBox(FXCollections.observableArrayList(YNboolean));
        mobileyeBool.setStyle("-fx-font: normal bold 20px 'serif' ");
        mobileyeBool.setPromptText("have Mobileye?");
        ComboBox massageBool =new ComboBox(FXCollections.observableArrayList(YNboolean));
        massageBool.setStyle("-fx-font: normal bold 20px 'serif' ");
        massageBool.setPromptText("have Massage chairs?");

        Button luxuryBtn = new Button("add");
        luxuryBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        Button lHome = new Button("Home");
        lHome.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");


        luxuryBtn.setOnAction(e -> {//add family private
                    String b = (String) luxuryBranch.getValue();
                    String c = (String) luxuryCompanyT.getText();
                    int y = Integer.parseInt(luxuryYearT.getText());//חריגות!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
                    int p = Integer.parseInt(luxuryPriceT.getText());
                    int engine = Integer.parseInt(luxuryEngineT.getText());
                    boolean mobileye;
                    if(mobileyeBool.getValue() == "yes"){
                        mobileye = true;
                    }
                    else{
                        mobileye = false;
                    }
                    boolean massage;
                    if(massageBool.getValue() == "yes"){
                        massage = true;
                    }
                    else{
                        massage = false;
                    }
                    addLuxury(a1, b, c, y, p, engine, mobileye, massage);
                }
        );
        lHome.setOnAction(e ->{
            stage.setScene(landingScene);
        });

        addLuxuryPane.setPadding(new Insets(10, 10, 10, 10));
        addLuxuryPane.setVgap(7);
        addLuxuryPane.setHgap(5);
        addLuxuryPane.setAlignment(Pos.CENTER);
        //adding the elemets to the layout
        addLuxuryPane.add(luxuryLabel, 1, 0);
        addLuxuryPane.add(luxuryBranch, 1, 1);
        addLuxuryPane.add(luxuryCompanyL, 0, 2);
        addLuxuryPane.add(luxuryCompanyT, 1, 2);
        addLuxuryPane.add(luxuryYearL, 0, 3);
        addLuxuryPane.add(luxuryYearT, 1, 3);
        addLuxuryPane.add(luxuryPriceL, 0, 4);
        addLuxuryPane.add(luxuryPriceT, 1, 4);
        addLuxuryPane.add(luxuryEngineL, 0, 5);
        addLuxuryPane.add(luxuryEngineT, 1, 5);
        addLuxuryPane.add(mobileyeBool, 1, 6);
        addLuxuryPane.add(massageBool, 1, 7);
        addLuxuryPane.add(luxuryBtn, 1, 8);
        addLuxuryPane.add(lHome, 1, 9);

        addLuxuryPane.setStyle("-fx-background-color: BEIGE;");

        //scene 8 - add jeep!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        Label jeepLabel = new Label("add jeep");
        jeepLabel.setStyle("-fx-font: normal bold 20px 'serif' ");

        ComboBox jeepBranch =new ComboBox(FXCollections.observableArrayList(branches));
        jeepBranch.setStyle("-fx-font: normal bold 20px 'serif' ");
        jeepBranch.setPromptText("choose branch");
        Label jeepCompanyL = new Label("company:");
        jeepCompanyL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField jeepCompanyT = new TextField();
        Label jeepYearL = new Label("year:");
        jeepYearL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField jeepYearT = new TextField();
        Label jeepPriceL = new Label("price:");
        jeepPriceL.setStyle("-fx-font: normal bold 20px 'serif' ");
        TextField jeepPriceT = new TextField();
        ComboBox awd =new ComboBox(FXCollections.observableArrayList(YNboolean));
        awd.setStyle("-fx-font: normal bold 20px 'serif' ");
        awd.setPromptText("4X4?");
        ComboBox windShield =new ComboBox(FXCollections.observableArrayList(YNboolean));
        windShield.setStyle("-fx-font: normal bold 20px 'serif' ");
        windShield.setPromptText("have wind shield?");
        Button jeepBtn = new Button("add");
        Button jHome = new Button("Home");
        jHome.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        jeepBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        jeepBtn.setOnAction(e -> {//add family private
                    String b = (String) jeepBranch.getValue();
                    String c = (String) jeepCompanyT.getText();
                    int y = Integer.parseInt(jeepYearT.getText());//חריגות!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
                    int p = Integer.parseInt(jeepPriceT.getText());
                    boolean Awd;
                    if(awd.getValue() == "yes"){
                        Awd = true;
                    }
                    else{
                        Awd = false;
                    }
                    boolean ws;
                    if(windShield.getValue() == "yes"){
                        ws = true;
                    }
                    else{
                        ws = false;
                    }
                    addJeep(a1, b, c, y, p, Awd, ws);
                }
        );
        jHome.setOnAction(e ->{
            stage.setScene(landingScene);
        });

        addJeepPane.setPadding(new Insets(10, 10, 10, 10));
        addJeepPane.setVgap(7);
        addJeepPane.setHgap(5);
        addJeepPane.setAlignment(Pos.CENTER);
        //adding the elemets to the layout
        addJeepPane.add(jeepLabel, 1, 0);
        addJeepPane.add(jeepBranch, 1, 1);
        addJeepPane.add(jeepCompanyL, 0, 2);
        addJeepPane.add(jeepCompanyT, 1, 2);
        addJeepPane.add(jeepYearL, 0, 3);
        addJeepPane.add(jeepYearT, 1, 3);
        addJeepPane.add(jeepPriceL, 0, 4);
        addJeepPane.add(jeepPriceT, 1, 4);
        addJeepPane.add(awd, 1, 6);
        addJeepPane.add(windShield, 1, 7);
        addJeepPane.add(jeepBtn, 1, 8);
        addJeepPane.add(jHome, 1, 9);
        addJeepPane.setStyle("-fx-background-color: BEIGE;");

        //scene 9 - show cars!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        Label showLabel = new Label("Welcome to our Car Agency");
        showLabel.setStyle("-fx-font: normal bold 20px 'serif' ");

        ComboBox branch =new ComboBox(FXCollections.observableArrayList(branches));
        branch.setStyle("-fx-font: normal bold 20px 'serif' ");
        branch.setPromptText("choose branch");
        ComboBox type =new ComboBox(FXCollections.observableArrayList(types));
        type.setStyle("-fx-font: normal bold 20px 'serif' ");
        type.setPromptText("choose car type");

        Button findBtn = new Button("SHOW");
        findBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        Button home = new Button("Home");
        home.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        findBtn.setOnAction(e -> {//find cars
                    String br = (String) branch.getValue();
                    String t = (String) type.getValue();
                    findCars(a1, br, t);
                    stage.setScene(resultsScene);
                }
        );
        home.setOnAction(e ->{
            stage.setScene(landingScene);
        });

        showPane.setPadding(new Insets(10, 10, 10, 10));
        showPane.setVgap(7);
        showPane.setHgap(5);
        showPane.setAlignment(Pos.CENTER);

        //adding the elemets to the layout
        showPane.add(showLabel, 0, 0);
        showPane.add(branch, 0,1);
        showPane.add(type, 0,2);
        showPane.add(findBtn, 0,4);
        showPane.add(home, 1, 4);
        showPane.setStyle("-fx-background-color: BEIGE;");

        //scene 10 the agency!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Label resultsLabel = new Label("results:");
        resultsLabel.setStyle("-fx-font: normal bold 20px 'serif' ");

        Button rHome = new Button("Home");
        rHome.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        rHome.setOnAction(e ->{
            stage.setScene(landingScene);
        });


        //create the grid and css it
        resultsPane.setPadding(new Insets(10, 10, 10, 10));
        resultsPane.setVgap(7);
        resultsPane.setHgap(5);
        resultsPane.setAlignment(Pos.CENTER);

        //adding the elements to the layout
        resultsPane.add(resultsLabel, 1, 0);
        resultsPane.add(t1, 1, 1);
        resultsPane.add(t2, 1, 2);
        resultsPane.add(t3, 1, 3);
        resultsPane.add(t4, 1, 4);
        resultsPane.add(t5, 1, 5);
        resultsPane.add(t6, 1, 6);
        resultsPane.add(rHome, 1, 9);
        resultsPane.setStyle("-fx-background-color: BEIGE;");

        stage.setTitle("Amitai app");
        stage.setScene(landingScene);
        stage.show();
    }
}