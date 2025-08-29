//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.scene.Scene;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//public class SupermarketEmployeeTable extends Application {
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Tableau des Employés du Supermarché");
//
//        TableView<Employee> table = new TableView<>();
//        ObservableList<Employee> data = getEmployeeData();
//
//        TableColumn<Employee, String> positionColumn = new TableColumn<>("Poste");
//        positionColumn.setCellValueFactory(new PropertyValueFactory<>("position"));
//
//        TableColumn<Employee, Integer> countColumn = new TableColumn<>("Nombre d'Employés");
//        countColumn.setCellValueFactory(new PropertyValueFactory<>("count"));
//
//        table.setItems(data);
//        table.getColumns().addAll(positionColumn, countColumn);
//
//        VBox vbox = new VBox(table);
//        Scene scene = new Scene(vbox);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    public ObservableList<Employee> getEmployeeData() {
//        return FXCollections.observableArrayList(
//            new Employee("Caissier", 10),
//            new Employee("Réassortisseur", 5),
//            new Employee("Manager", 2),
//            new Employee("Sécurité", 3)
//        );
//    }
//
//    public static class Employee {
//        private final String position;
//        private final int count;
//
//        public Employee(String position, int count) {
//            this.position = position;
//            this.count = count;
//        }
//
//        public String getPosition() {
//            return position;
//        }
//
//        public int getCount() {
//            return count;
//        }
//    }
//}
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.scene.Scene;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class SupermarketEmployeeTable extends Application {
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Tableau des Employés du Supermarché");
//
//        TableView<Employee> table = new TableView<>();
//        ObservableList<Employee> data = getEmployeeData();
//
//        TableColumn<Employee, String> nameColumn = new TableColumn<>("Nom");
//        nameColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));
//
//        TableColumn<Employee, String> surnameColumn = new TableColumn<>("Prénom");
//        surnameColumn.setCellValueFactory(new PropertyValueFactory<>("prenom"));
//
//        TableColumn<Employee, String> positionColumn = new TableColumn<>("Poste");
//        positionColumn.setCellValueFactory(new PropertyValueFactory<>("poste"));
//
//        TableColumn<Employee, String> phoneColumn = new TableColumn<>("Numéro de Téléphone");
//        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("numero_telephone"));
//
//        TableColumn<Employee, Double> salaryColumn = new TableColumn<>("Salaire");
//        salaryColumn.setCellValueFactory(new PropertyValueFactory<>("salaire"));
//
//        table.setItems(data);
//        table.getColumns().addAll(nameColumn, surnameColumn, positionColumn, phoneColumn, salaryColumn);
//
//        VBox vbox = new VBox(table);
//        Scene scene = new Scene(vbox);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    public ObservableList<Employee> getEmployeeData() {
//        ObservableList<Employee> employees = FXCollections.observableArrayList();
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT nom, prenom, poste, numero_telephone, salaire FROM employees");
//
//            while (resultSet.next()) {
//                employees.add(new Employee(
//                    resultSet.getString("nom"),
//                    resultSet.getString("prenom"),
//                    resultSet.getString("poste"),
//                    resultSet.getString("numero_telephone"),
//                    resultSet.getDouble("salaire")
//                ));
//            }
//
//            connection.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return employees;
//    }
//
//    public static class Employee {
//        private final String nom;
//        private final String prenom;
//        private final String poste;
//        private final String numero_telephone;
//        private final double salaire;
//
//        public Employee(String nom, String prenom, String poste, String numero_telephone, double salaire) {
//            this.nom = nom;
//            this.prenom = prenom;
//            this.poste = poste;
//            this.numero_telephone = numero_telephone;
//            this.salaire = salaire;
//        }
//
//        public String getNom() {
//            return nom;
//        }
//
//        public String getPrenom() {
//            return prenom;
//        }
//
//        public String getPoste() {
//            return poste;
//        }
//
//        public String getNumero_telephone() {
//            return numero_telephone;
//        }
//
//        public double getSalaire() {
//            return salaire;
//        }
//    }
////}
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//import java.sql.*;
//import javafx.application.Application;
//import static javafx.application.Application.launch;
//
//public class SupermarketEmployeesApp extends Application {
//
//    private TableView<Employee> tableView;
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Employés du Supermarché");
//
//        tableView = new TableView<>();
//
//        TableColumn<Employee, String> nomCol = new TableColumn<>("Nom");
//        nomCol.setCellValueFactory(new PropertyValueFactory<>("nom"));
//
//        TableColumn<Employee, String> prenomCol = new TableColumn<>("Prénom");
//        prenomCol.setCellValueFactory(new PropertyValueFactory<>("prenom"));
//
//        TableColumn<Employee, String> posteCol = new TableColumn<>("Poste");
//        posteCol.setCellValueFactory(new PropertyValueFactory<>("poste"));
//
//        tableView.getColumns().addAll(nomCol, prenomCol, posteCol);
//
//        loadDataFromDatabase();
//
//        VBox vbox = new VBox(tableView);
//        Scene scene = new Scene(vbox);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    private void loadDataFromDatabase() {
////        String url = "jdbc:mysql://localhost:3306/supermarket";
////        String user = "root";
////        //  N'oubliez JAMAIS de mettre un vrai mot de passe ici, ou mieux, utilisez des variables d'environnement
////        String password = ""; // Remplacez par votre mot de passe MySQL
//            
//        try {
//            // Charger le driver JDBC pour MySQL.  Cela doit être fait AVANT la connexion.
//            //Class.forName("com.mysql.cj.jdbc.Driver");
//            //System.out.println("Driver charge");
//            try (/*Connection connection = DriverManager.getConnection(url, user, password);*/
//                    Connection conn=connexion.getConnection();
//                 Statement statement = /*connection*/conn.createStatement();
//                 ResultSet resultSet = statement.executeQuery("SELECT nom, prenom, poste FROM employees")) {
//                 ResultSetMetaData rsmd=resultSet.getMetaData();
//                 
//                while (resultSet.next()) {
//                    String nom = resultSet.getString("nom");
//                    String prenom = resultSet.getString("prenom");
//                    String poste = resultSet.getString("poste");
//                    tableView.getItems().add(new Employee(nom, prenom, poste));
//                }
//
//            } catch (SQLException e) {
//                // Affichage d'un message d'erreur plus informatif à l'utilisateur.
//                Alert alert = new Alert(Alert.AlertType.ERROR);
//                alert.setTitle("Erreur de base de données");
//                alert.setHeaderText("Impossible de se connecter à la base de données.");
//                alert.setContentText("Erreur : " + e.getMessage());
//                alert.showAndWait();
//            }
////
////        } catch (Exception e) {
////            e.printStackTrace(); // Pour le débogage, à supprimer en production
////            Alert alert = new Alert(Alert.AlertType.ERROR);
////            alert.setTitle("Erreur Inconnue");
////            alert.setHeaderText("Une erreur inconnue s'est produite.");
////            alert.setContentText("Veuillez vérifier votre configuration.");
////            alert.showAndWait();
////        }
//    }
//    }
//
//    public static class Employee {
//        private final String nom;
//        private final String prenom;
//        private final String poste;
//
//        public Employee(String nom, String prenom, String poste) {
//            this.nom = nom;
//            this.prenom = prenom;
//            this.poste = poste;
//        }
//
//        public String getNom() { return nom; }
//        public String getPrenom() { return prenom; }
//        public String getPoste() { return poste; }
//    }
//}

//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.scene.Scene;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import javafx.scene.layout.Priority;
//
//public class SupermarketEmployeeTable extends Application {
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Tableau des Employés du Supermarché");
//
//        TableView<Employee> table = new TableView<>();
//        ObservableList<Employee> data = getEmployeeData();
//
//        TableColumn<Employee, String> nameColumn = new TableColumn<>("Nom");
//        nameColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));
//
//        TableColumn<Employee, String> surnameColumn = new TableColumn<>("Prénom");
//        surnameColumn.setCellValueFactory(new PropertyValueFactory<>("prenom"));
//
//        TableColumn<Employee, String> positionColumn = new TableColumn<>("Poste");
//        positionColumn.setCellValueFactory(new PropertyValueFactory<>("poste"));
//
//        TableColumn<Employee, String> phoneColumn = new TableColumn<>("Numéro de Téléphone");
//        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("numero_telephone"));
//        phoneColumn.setMinWidth(50);
//        
//        TableColumn<Employee, Double> salaryColumn = new TableColumn<>("Salaire");
//        salaryColumn.setCellValueFactory(new PropertyValueFactory<>("salaire"));
//
//        table.setItems(data);
//        table.getColumns().addAll(nameColumn, surnameColumn, positionColumn, phoneColumn, salaryColumn);
//
//        VBox vbox = new VBox(table);
//        VBox.setVgrow(table, Priority.ALWAYS);
//        Scene scene = new Scene(vbox,450,300);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    public ObservableList<Employee> getEmployeeData() {
//        ObservableList<Employee> employees = FXCollections.observableArrayList();
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT nom, prenom, poste, numero_telephone, salaire FROM employees");
//
//            while (resultSet.next()) {
//                employees.add(new Employee(
//                    resultSet.getString("nom"),
//                    resultSet.getString("prenom"),
//                    resultSet.getString("poste"),
//                    resultSet.getString("numero_telephone"),
//                    resultSet.getDouble("salaire")
//                ));
//            }
//
//            connection.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return employees;
//    }
//
//    public static class Employee {
//        private final String nom;
//        private final String prenom;
//        private final String poste;
//        private final String numero_telephone;
//        private final double salaire;
//
//        public Employee(String nom, String prenom, String poste, String numero_telephone, double salaire) {
//            this.nom = nom;
//            this.prenom = prenom;
//            this.poste = poste;
//            this.numero_telephone = numero_telephone;
//            this.salaire = salaire;
//        }
//
//        public String getNom() {
//            return nom;
//        }
//
//        public String getPrenom() {
//            return prenom;
//        }
//
//        public String getPoste() {
//            return poste;
//        }
//
//        public String getNumero_telephone() {
//            return numero_telephone;
//        }
//
//        public double getSalaire() {
//            return salaire;
//        }
//    }
//}



//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.Priority;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//public class ResizableUI extends Application {
//
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Interface Redimensionnable");
//
//        Button button1 = new Button("Bouton 1");
//        Button button2 = new Button("Bouton 2");
//        Button button3 = new Button("Bouton 3");
//
//        VBox vbox = new VBox(button1, button2, button3);
//        VBox.setVgrow(button1, Priority.ALWAYS);
//        VBox.setVgrow(button2, Priority.ALWAYS);
//        VBox.setVgrow(button3, Priority.ALWAYS);
//
//        Scene scene = new Scene(vbox, 300, 200);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}



import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.Priority;
import javafx.scene.layout.HBox;
import javafx.beans.binding.Bindings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeSearchApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Recherche d'Employés");

        TableView<Employee> table = new TableView<>();
        ObservableList<Employee> data = getEmployeeData();

        TableColumn<Employee, String> nameColumn = new TableColumn<>("Nom");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("nom"));

        TableColumn<Employee, String> surnameColumn = new TableColumn<>("Prénom");
        surnameColumn.setCellValueFactory(new PropertyValueFactory<>("prenom"));

        TableColumn<Employee, String> positionColumn = new TableColumn<>("Poste");
        positionColumn.setCellValueFactory(new PropertyValueFactory<>("poste"));

        TableColumn<Employee, String> phoneColumn = new TableColumn<>("Numéro de Téléphone");
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("numero_telephone"));
        phoneColumn.setMinWidth(50);

        TableColumn<Employee, Double> salaryColumn = new TableColumn<>("Salaire");
        salaryColumn.setCellValueFactory(new PropertyValueFactory<>("salaire"));

        table.setItems(data);
        table.getColumns().addAll(nameColumn, surnameColumn, positionColumn, phoneColumn, salaryColumn);

        TextField searchField = new TextField();
        searchField.setPromptText("Rechercher...");
        searchField.textProperty().addListener((observable, oldValue, newValue) -> {
            table.setItems(filterList(data, newValue));
        });

        HBox searchBox = new HBox(new Label("Recherche: "), searchField);
        VBox vbox = new VBox(searchBox, table);
        VBox.setVgrow(table, Priority.ALWAYS);
        Scene scene = new Scene(vbox, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private ObservableList<Employee> filterList(ObservableList<Employee> list, String searchText) {
        return FXCollections.observableArrayList(list.filtered(employee -> 
            employee.getNom().toLowerCase().contains(searchText.toLowerCase()) ||
            employee.getPrenom().toLowerCase().contains(searchText.toLowerCase()) ||
            employee.getPoste().toLowerCase().contains(searchText.toLowerCase()) ||
            employee.getNumero_telephone().toLowerCase().contains(searchText.toLowerCase()) ||
            String.valueOf(employee.getSalaire()).contains(searchText)
        ));
    }

    public ObservableList<Employee> getEmployeeData() {
        ObservableList<Employee> employees = FXCollections.observableArrayList();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT nom, prenom, poste, numero_telephone, salaire FROM employees");

            while (resultSet.next()) {
                employees.add(new Employee(
                    resultSet.getString("nom"),
                    resultSet.getString("prenom"),
                    resultSet.getString("poste"),
                    resultSet.getString("numero_telephone"),
                    resultSet.getDouble("salaire")
                ));
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("echec de connexion a la Base de donnee");
        }
        return employees;
    }

    public static class Employee {
        private final String nom;
        private final String prenom;
        private final String poste;
        private final String numero_telephone;
        private final double salaire;

        public Employee(String nom, String prenom, String poste, String numero_telephone, double salaire) {
            this.nom = nom;
            this.prenom = prenom;
            this.poste = poste;
            this.numero_telephone = numero_telephone;
            this.salaire = salaire;
        }

        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public String getPoste() {
            return poste;
        }

        public String getNumero_telephone() {
            return numero_telephone;
        }

        public double getSalaire() {
            return salaire;
        }
    }
}
