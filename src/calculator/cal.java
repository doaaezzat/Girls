package calculator;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
/**
* class problem 
* the main class 
* contain start method
*
*/
public class cal extends Application{
	/**
	 * public variable
	 * textfield , number one , number two
	 * and length variable
	 */
	    TextField t1 = new TextField();
	    double number1;
	    double number2;
	    String operation;
	    int length = 0;

	    /**
	     * public buttons
	     * 35 buttons
	     * first 6 buttons is the first row
	     */    
	    
	       Button b1=new Button("sin");
	       Button b2=new Button("cos");
	       Button b3=new Button("tan");
	       Button b4=new Button("sinh");
	       Button b5=new Button("cosh");
	       Button b6=new Button("tanh");

	       /**
	        * second row
	        * buttons
	        */
	       
	       Button b7=new Button("pi");
	       Button b8=new Button("x^3");
	       Button b9=new Button("10^x");
	       Button b10=new Button("log");
	       Button b11=new Button("ln");
	       Button b12=new Button("1/x");
	       
	       /**
	        * third row
	        * buttons
	        */
	       
	       Button b13=new Button("7");
	       Button b14=new Button("8");
	       Button b15=new Button("9");
	       Button b16=new Button("/");
	       Button b17=new Button("mc");
	       Button b18=new Button("c");
	       
	       /**
	        * fourth row
	        * buttons
	        */
	       
	       Button b19=new Button("4");
	       Button b20=new Button("5");
	       Button b21=new Button("6");
	       Button b22=new Button("*");
	       Button b23=new Button("(");
	       Button b24=new Button(")");
	       
	       /**
	        * fifth row
	        * buttons
	        */
	       
	       Button b25=new Button("1");
	       Button b26=new Button("2");
	       Button b27=new Button("3");
	       Button b28=new Button("-");
	       Button b29=new Button("x^2");
	       Button b30=new Button("sqr");
	        
	       /**
	        * sixth row
	        * buttons
	        */
	       
	       Button b31=new Button("0");
	       Button b32=new Button(".");
	       Button b33=new Button("%");
	       Button b34=new Button("+");
	       Button b35=new Button("=");

		/**
		 * start method
		 *
		 */
	       
	    public void start(Stage primaryStage) {
	      

			/**
			 * gridpane
			 *
			 */
	    	
	       GridPane pane = new GridPane();
	       pane.setAlignment(Pos.CENTER);
	       
			/**
			 * setpadding
			 * set 0 to up , 10 to right 
			 * 10 to down , 10 to left
			 *
			 */
	     
	       pane.setPadding(new Insets(0, 10, 10, 10));

			/**
			 * gap between cells
			 *
			 */
	       pane.setHgap(2);
	       pane.setVgap(2);
	       StackPane pan = new StackPane();
	       pan.setPadding(new Insets(10, 10, 5, 10));
	       
			/**
			 * vbox contain stackpane 
			 * and gridpane
			 *
			 */
	       
	       VBox vBox = new VBox(2);
	       t1.setMinSize(250,60);
	       pan.getChildren().add(t1); 
	       

			/**
			 * set size to
			 * buttons
			 *
			 */
	       
	       b1.setMinSize(50,40);
	       b2.setMinSize(50,40);
	       b3.setMinSize(50,40);
	       b4.setMinSize(50,40);
	       b5.setMinSize(50,40);
	       b6.setMinSize(62,40);
	       
	       b7.setMinSize(50,40);
	       b8.setMinSize(50,40);
	       b9.setMinSize(50,40);
	       b10.setMinSize(50,40);
	       b11.setMinSize(50,40);
	       b12.setMinSize(62,40);
	       
	       b13.setMinSize(50,40);
	       b14.setMinSize(50,40);
	       b15.setMinSize(50,40);
	       b16.setMinSize(50,40);
	       b17.setMinSize(50,40);
	       b18.setMinSize(62,40);
	       
	       b19.setMinSize(50,40);
	       b20.setMinSize(50,40);
	       b21.setMinSize(50,40);
	       b22.setMinSize(50,40);
	       b23.setMinSize(50,40);
	       b24.setMinSize(62,40);
	       
	       b25.setMinSize(50,40);
	       b26.setMinSize(50,40);
	       b27.setMinSize(50,40);
	       b28.setMinSize(50,40);
	       b29.setMinSize(50,40);
	       b30.setMinSize(62,40);
	       
	       b31.setMinSize(50,40);
	       b32.setMinSize(50,40);
	       b33.setMinSize(50,40);
	       b34.setMinSize(50,40);
	       b35.setMinSize(115,40);
	       
	       /**
			 * set style
			 *
			 */
	       
	       b17.setStyle(" -fx-background-color: orange;"); 
	       b18.setStyle(" -fx-background-color: orange;"); 
	       
	       /**
			 * add the buttons to
			 * the grid pane
			 *
			 */
	       
	       pane.add(b1, 0 , 0);
	       pane.add(b2, 1 , 0);
	       pane.add(b3, 2 , 0);
	       pane.add(b4, 3 , 0);
	       pane.add(b5, 4 , 0);
	       pane.add(b6, 5 , 0);
	       
	       pane.add(b7, 0 , 1);
	       pane.add(b8, 1 , 1);
	       pane.add(b9, 2 , 1);
	       pane.add(b10, 3 , 1);
	       pane.add(b11, 4 , 1);
	       pane.add(b12, 5 , 1);
	       
	       pane.add(b13, 0 , 2);
	       pane.add(b14, 1 , 2);
	       pane.add(b15, 2 , 2);
	       pane.add(b16, 3 , 2);
	       pane.add(b17, 4 , 2);
	       pane.add(b18, 5 , 2);
	      
	       pane.add(b19, 0 , 3);
	       pane.add(b20, 1 , 3);
	       pane.add(b21, 2 , 3);
	       pane.add(b22, 3 , 3);
	       pane.add(b23, 4 , 3);
	       pane.add(b24, 5 , 3);
	       
	       pane.add(b25, 0 , 4);
	       pane.add(b26, 1 , 4);
	       pane.add(b27, 2 , 4);
	       pane.add(b28, 3 , 4);
	       pane.add(b29, 4 , 4);
	       pane.add(b30, 5 , 4);
	       
	       pane.add(b31, 0 , 5);
	       pane.add(b32, 1 , 5);
	       pane.add(b33, 2 , 5);
	       pane.add(b34, 3 , 5);
	       pane.add(b35, 4 , 5 , 2 , 1);
	      
	       /**
			 * the action to button 1
			 * set value to the first number from the textfield
			 * and make the number double number
			 * set value to operation sin
			 */
	       
	       b1.setOnAction(new EventHandler<ActionEvent>() {
	       public void handle(ActionEvent e) {
	           number1 = Double.parseDouble(t1.getText());
	           operation="sin";
	            }
	        });
	       
	       /**
			 * the action to button 2
			 * set value to the first number from the textfield
			 * and make the number double number
			 * set value to operation cos
			 */
	       	
	        b2.setOnAction(new EventHandler<ActionEvent>() {
	    public void handle(ActionEvent e) {
	           number1 = Double.parseDouble(t1.getText());
	           operation="cos";
	            }
	        });
	        
	        /**
			 * the action to button 3
			 * set value to the first number from the textfield
			 * and make the number double number
			 * set value to operation tan
			 */
	        
	        b3.setOnAction(new EventHandler<ActionEvent>() {
	     public void handle(ActionEvent e) {
	           number1 = Double.parseDouble(t1.getText());
	           operation="tan";
	            }
	        });
	        
	        /**
			 * the action to button 4
			 * set value to the first number from the textfield
			 * and make the number double number
			 * set value to operation sinh
			 */
	        
	       b4.setOnAction(new EventHandler<ActionEvent>() {
	       public void handle(ActionEvent e) {
	           number1 = Double.parseDouble(t1.getText());
	           operation="sinh";
	             }
	        });
	       
	       /**
			 * the action to button 5
			 * set value to the first number from the textfield
			 * and make the number double number
			 * set value to operation cosh
			 */
	       
	       b5.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	               number1 = Double.parseDouble(t1.getText());
	               operation="cosh";
	                }
	            });
	       
	       /**
			 * the action to button 6
			 * set value to the first number from the textfield
			 * and make the number double number
			 * set value to operation tanh
			 */
	       
	       b6.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	               number1 = Double.parseDouble(t1.getText());
	               operation="tanh";
	                }
	            });
	           
	       /**
			 * the action to button 7
			 * set value to the constant pi
			 * 
			 */
	       
	       b7.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	               t1.setText("3.142857142857143");
	                }
	            });
	       
	       /**
			 * the action to button 8
			 * set value to the first number from the textfield
			 * and make the number double number
			 * set value to operation x^3
			 */
	       
	       b8.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	               number1 = Double.parseDouble(t1.getText());
	               operation="x^3";
	                }
	            });
	       
	       /**
			 * the action to button 9
			 * set value to the first number from the textfield
			 * and make the number double number
			 * set value to operation 10^x
			 */
	       
	       b9.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) { 
	           number1 = Double.parseDouble(t1.getText());
	           operation="10^x";
	                }
	            });
	            
	       /**
			 * the action to button 10
			 * set value to the first number from the textfield
			 * and make the number double number
			 * set value to operation log
			 */
	       
	       b10.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	               number1 = Double.parseDouble(t1.getText());
	               operation="log";
	                }
	            });
	       
	       /**
			 * the action to button 11
			 * set value to the first number from the textfield
			 * and make the number double number
			 * set value to operation ln
			 */
	       
	       b11.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	               number1 = Double.parseDouble(t1.getText());
	               operation="ln";
	                }
	            });
	           
	       /**
			 * the action to button 12
			 * set value to the first number from the textfield
			 * and make the number double number
			 * set value to operation 1/x
			 */
	       
	       b12.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           number1 = Double.parseDouble(t1.getText());
	           operation="1/x";
	                }
	            });
	           
	       /**
			 * the action to button 13
			 * take the number on the button and
			 * display it on the textfield
			 * 
			 */
	       
	       b13.setOnAction(new EventHandler<ActionEvent>() {      
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	                }
	            });
	       
	       /**
			 * the action to button 14
			 * take the number on the button and
			 * display it on the textfield
			 * 
			 */
	       
	       b14.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	                }
	            });
	       /**
			 * the action to button 15
			 * take the number on the button and
			 * display it on the textfield
			 * 
			 */
	       
	       b15.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	                }
	            });
	       /**
			 * the action to button 16
			 * take the operation on the button and
			 * display it on the textfield
			 * set the length of the string to lenght variable
			 * split the first number
			 * convert it to double
			 * set value to operation /
			 */
	       
	       b16.setOnAction(new EventHandler<ActionEvent>() {
	               
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	           String text1 = t1.getText();
	           length=text1.length();
	           String num1 = text1.substring(0 , length-1);
	           number1 = Double.parseDouble(num1);
	           operation="/";
	                }
	            });
	           
	       /**
			 * the action to button 17
			 * take the text from the textfield
			 * and delete the last character
			 */
	       
	       b17.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = t1.getText();
	           t1.setText(s.substring(0, s.length()-1));
	           length=0;
	                }
	            });
	          
	       /**
			 * the action to button 18
			 * clear the screen
			 * 
			 */
	           
	       b18.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           t1.setText("");
	           length=0;
	                }
	            });   
	           
	       /**
			 * the action to button 19
			 * take the number on the button and
			 * display it on the textfield
			 * 
			 */
	       
	       b19.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	                }
	            });
	           
	       /**
			 * the action to button 20
			 * take the number on the button and
			 * display it on the textfield
			 * 
			 */
	       
	       b20.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	                }
	            });
	           
	       /**
			 * the action to button 21
			 * take the number on the button and
			 * display it on the textfield
			 * 
			 */
	       
	       b21.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	                }
	            });
	           
	       /**
			 * the action to button 22
			 * take the operation on the button and
			 * display it on the textfield
			 * set the length of the string to lenght variable
			 * split the first number
			 * convert it to double
			 * set value to operation *
			 */
	       
	       b22.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	           String text1 = t1.getText();
	           length=text1.length();
	           String num1 = text1.substring(0 , length-1);
	           number1 = Double.parseDouble(num1);
	           operation="*";
	                }
	            });
	       /**
			 * the action to button 23
			 * take the text on the button and
			 * display it on the textfield
			 * 
			 */    
	       b23.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	                }
	            });
	       /**
			 * the action to button 24
			 * take the text on the button and
			 * display it on the textfield
			 * 
			 */    
	       b24.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	                }
	            });
	       
	       /**
			 * the action to button 25
			 * take the number on the button and
			 * display it on the textfield
			 * 
			 */
	       
	       b25.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	                }
	            });
	           
	       /**
			 * the action to button 26
			 * take the number on the button and
			 * display it on the textfield
			 * 
			 */
	       b26.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	                }
	            });
	       /**
			 * the action to button 27
			 * take the number on the button and
			 * display it on the textfield
			 * 
			 */    
	       b27.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	                }
	            });
	           
	           /**
				 * the action to button 28
				 * take the operation on the button and
				 * display it on the textfield
				 * set the length of the string to lenght variable
				 * split the first number
				 * convert it to double
				 * set value to operation -
				 */
	       b28.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	           String text1 = t1.getText();
	           length=text1.length();
	           String num1 = text1.substring(0 , length-1);
	           number1 = Double.parseDouble(num1);
	           operation="-";
	                }
	            });
	       
	       /**
			 * the action to button 29
			 * set value to the first number from the textfield
			 * and make the number double number
			 * set value to operation x^2
			 */
	       b29.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           number1 = Double.parseDouble(t1.getText());
	           operation="x^2";
	                }
	            });
	           
	       /**
			 * the action to button 30
			 * set value to the first number from the textfield
			 * and make the number double number
			 * set value to operation sqr
			 */ 
	       b30.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           number1 = Double.parseDouble(t1.getText());
	           operation="sqr";
	                }
	            });
	       /**
			 * the action to button 31
			 * take the number on the button and
			 * display it on the textfield
			 * 
			 */ 
	        b31.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	                }
	            });
	        
	        /**
			 * the action to button 32
			 * take the text on the button and
			 * display it on the textfield
			 * 
			 */
	        b32.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	                }
	            });
	           
	           /**
				 * the action to button 33
				 * take the operation on the button and
				 * display it on the textfield
				 * set the length of the string to lenght variable
				 * split the first number
				 * convert it to double
				 * set value to operation %
				 */ 
	       b33.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	           String text1 = t1.getText();
	           length=text1.length();
	           String num1 = text1.substring(0 , length-1);
	           number1 = Double.parseDouble(num1);
	           operation="%";
	                }
	            });
	       /**
			 * the action to button 34
			 * take the operation on the button and
			 * display it on the textfield
			 * set the length of the string to lenght variable
			 * split the first number
			 * convert it to double
			 * set value to operation +
			 */
	        b34.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           String s = ((Button)e.getSource()).getText();
	           t1.setText(t1.getText()+s);
	           String text1 = t1.getText();
	           length=text1.length();
	           String num1 = text1.substring(0 , length-1);
	           number1 = Double.parseDouble(num1);
	           operation="+";
	                }
	            });
	        
	        /**
			 * the action to button 35
			 * the button that make the operation
			 * 
			 */   
	        b35.setOnAction(new EventHandler<ActionEvent>() {
	           public void handle(ActionEvent e) {
	           if(operation == "x^2" || operation == "sqr" || operation == "%" || operation== "x^3"
	              || operation == "sin" || operation == "cos" || operation == "tan"
	              || operation == "sinh" || operation == "cosh" || operation == "tanh"
	              || operation == "log" || operation == "ln" || operation == "10^x"
	              || operation == "1/x ")
	           {
	            String s;
	            double result = 0;
	         if(operation == "1/x" && number1 == 0 )
                   t1.setText("Cannot divide by zero");
            if (operation == "sqr" && number1 <0)
           	    t1.setText("Exception");
            else
	                {
	            switch(operation)
	                {
	                    case "x^2":
	                         result = number1 * number1;
	                        break;
	                    case "sqr":
	                         result = Math.sqrt( number1 );
	                        break;
	                    case "%": 
	                         result = number1 / 100 ;
	                        break;
	                    case "x^3":
	                        result = number1 * number1 * number1;
	                        break;
	                    case "sin":
	                        result = Math.sin(Math.toRadians(number1));
	                        break;
	                    case "cos":
	                        result = Math.cos(Math.toRadians(number1));
	                        break;
	                    case "tan":
	                        result = Math.tan(Math.toRadians(number1));
	                        break;
	                    case "sinh":
	                        result = Math.sinh(Math.toRadians(number1));
	                        break;
	                    case "cosh":
	                        result = Math.cosh(Math.toRadians(number1));
	                        break;
	                    case "tanh":
	                        result = Math.tanh(Math.toRadians(number1));
	                        break;
	                    case "log":
	                        result = Math.log(number1);
	                        break;
	                    case "ln":
	                        result = 1/Math.log(number1);
	                        break;
	                    case "10^x":
	                        result = Math.pow(10,number1);
	                        break;
	                    case "1/x":
	                    	result = Math.pow(number1,-1);
	                        break;
	                }
	            s = Double.toString(result);
	            t1.setText(s);
	            }
	            }
	           else
	              {
	            String s;
	            String text = t1.getText();
	            String num = text.substring( length , text.length());
	            number2 = Double.parseDouble(num);
	            double result = 0;
	                if(operation == "/" && number2 == 0)
	                    t1.setText("Cannot divide by zero");
	                else
	                {
	                    switch(operation)
	                       {
	                        case "+":
	                            result = number1 + number2;
	                            break;
	                        case "-":
	                            result = number1 - number2;
	                            break;
	                        case "*":
	                            result = number1 * number2;
	                            break;
	                        case "/":
	                            result = number1 / number2; 
	                            break;
	                       }
	                s = Double.toString(result);
	                t1.setText(s);}
	                }
	                }
	            });
	           
	        
	           vBox.getChildren().addAll(pan,pane); 
	           vBox.setStyle(" -fx-background-color: grey;"); 
	           Scene scene = new Scene(vBox);
	           primaryStage.setTitle("Calculator");
	           primaryStage.setResizable(false);
	           primaryStage.setScene(scene);
	           primaryStage.show();
	        }
	        public static void main(String[] args) {
	            launch(args);
	        }
	    }