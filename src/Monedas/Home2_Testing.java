package Monedas;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Home2_Testing extends Application {

	private OpcionesConversion conversion;
	private OpcionesConversionTemperatura conversionT;

	@Override
	public void start(Stage primaryStage) {
		conversion = new OpcionesConversion();
		conversionT = new OpcionesConversionTemperatura();

		Label titleLabel = new Label("¿Qué quieres convertir?");
		titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

		Button monedasBtn = new Button("Vamos por monedas");
		monedasBtn.setOnAction(event -> mostrarVentanaMonedas());

		Button temperaturasBtn = new Button("Vamos por temperaturas");
		temperaturasBtn.setOnAction(event -> mostrarVentanaTemperaturas());

		VBox vbox = new VBox(20, titleLabel, monedasBtn, temperaturasBtn);
		vbox.setAlignment(Pos.CENTER);

		BorderPane root = new BorderPane(vbox);
		Scene scene = new Scene(root, 400, 300);

		primaryStage.setTitle("Conversor de monedas y temperaturas");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private Object mostrarVentanaTemperaturas() {
		// TODO Auto-generated method stub
		return null;
	}

	private void mostrarVentanaMonedas() {
        Dialog<Double> dialog = new Dialog<>();
        dialog.setTitle("Conversión de monedas");

        Label cantidadLabel = new Label("Cantidad:");
        TextField cantidadField = new TextField();

        ButtonType convertirBtnType = new ButtonType("Convertir", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(convertirBtnType, ButtonType.CANCEL);

        VBox vbox = new VBox(20, cantidadLabel, cantidadField);
        dialog.getDialogPane().setContent(vbox);

        dialog.setResultConverter(btnType -> {
            if (btnType == convertirBtnType) {
                double valorRecibido = Double.parseDouble(cantidadField.getText());
                conversion.ConvertirMonedas(valorRecibido);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Conversión exitosa");
                alert.setHeaderText(null);
                alert.setContentText("¿Otra otra Conversión?");
                alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);
                if (alert.showAndWait().orElse(ButtonType.NO) == ButtonType.NO) {
                    System.exit(0);
                }
            }
            return null;
        });

        dialog.showAndWait();
    }
/*
private void mostrarVentanaTemperaturas() {
        Dialog<Double> dialog = new Dialog<>();
        dialog.setTitle("Conversión de temperaturas");

        Label cantidadLabel = new Label("Cantidad:");
        TextField cantidadField = new TextField();

        ButtonType convertirBtnType = new ButtonType("Convertir", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(convertirBtnType, ButtonType.CANCEL);

        VBox vbox = new VBox(20, cantidadLabel, cantidadField);
        dialog.getDialogPane().setContent(vbox);

        dialog.setResult(btnType -> {
            if (btnType == convertirBtnType) {
                double valorRecibido = Double.parseDouble(cantidadField.getText());
                conversionT.ConvertirTemperaturas(valorRecibido);

                Alert alert = new Alert(Alert.AlertType
            }}
            */
	}
