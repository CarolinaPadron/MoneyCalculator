package ui;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Money;
import model.Number;

public class PanelMoneyDialog extends JPanel implements MoneyDialog{
    private String amount = "0";
    private CurrencyDialog currencyDialog;

    public PanelMoneyDialog() {
        super(new FlowLayout(FlowLayout.LEFT));
        this.createComponents();
    }
    
    @Override
    public Money getMoney() {
        return new Money(new Number (Double.parseDouble(amount)), currencyDialog.getCurrency());
    }

    private void createComponents() {
        this.add(createAmountWidget());
        this.add(createCurrencyDialogPanel());
    }

    private JTextField createAmountWidget() {
        final JTextField textField = new JTextField(amount, 10);
        textField.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                amount = textField.getText();
            }
        });
        return textField;
    }

    private PanelCurrencyDialog createCurrencyDialogPanel() {
        PanelCurrencyDialog panel = new PanelCurrencyDialog();
        this.currencyDialog = (CurrencyDialog) panel;
        return panel;
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
