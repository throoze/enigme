/*
 * Copyright (C) 2014 Victor De Ponte
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ve.org.enigme;

import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ve.org.enigme.config.Config;

/**
 *
 * @author Victor De Ponte
 */
public class StartPageController implements Initializable {
    
    @FXML
    private ImageView logo;
    
    @FXML
    private TextField username;
    
    @FXML
    private PasswordField password;
    
    @FXML
    private Button login;
    
    @FXML
    private Button register;
    
    
    @FXML
    private void handleLogin(ActionEvent event) {
        System.out.println("You clicked login!");
    }
    
    @FXML
    private void handleRegister(ActionEvent event) {
        System.out.println("You clicked register!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                handleLogin(t);
            }
        });
        this.register.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                handleRegister(t);
            }
        });
    }    
    
}
