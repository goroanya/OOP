package Forms;

import Delivery.DeliveryManager;
import Delivery.DeliveryManager.ShippingType;
import static Delivery.DeliveryManager.ShippingType.*;
import Payment.*;
import Products.Product;
import java.awt.Frame;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class OrderUI extends javax.swing.JFrame {
    
    private CustomerUI parent;
    private DeliveryManager delivery = new DeliveryManager();
    private ShippingType type;
    
    public OrderUI(CustomerUI parent) {
        initComponents();
        
        this.parent = parent;
        
        fillComponents(this.parent.curBasket);
        
        DeliveryPanel.setVisible(false);
        this.setVisible(true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Payment = new javax.swing.ButtonGroup();
        GoBackBtn = new javax.swing.JButton();
        MakeOrderBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ProductsCostLbl = new javax.swing.JLabel();
        Basket = new java.awt.List();
        jLabel2 = new javax.swing.JLabel();
        DeliveryPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AirCheckBox = new javax.swing.JCheckBox();
        TrainCheckBox = new javax.swing.JCheckBox();
        TaxiCheckBox = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        getDeliveryCheckBox = new javax.swing.JCheckBox();
        TotalCostLbl = new javax.swing.JLabel();
        RefreshCost = new javax.swing.JButton();
        CashPaymentRadio = new javax.swing.JRadioButton();
        CardPaymentRadio = new javax.swing.JRadioButton();
        BalanceLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order UI");

        GoBackBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GoBackBtn.setText("Go back to edit product list");
        GoBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackBtnActionPerformed(evt);
            }
        });

        MakeOrderBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MakeOrderBtn.setText("Make an order");
        MakeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeOrderBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Your products :");

        ProductsCostLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ProductsCostLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Basket.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Total cost :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Delivery");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("2000");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("1500");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("1000");

        AirCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AirCheckBox.setText("air");

        TrainCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TrainCheckBox.setText("train");

        TaxiCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TaxiCheckBox.setText("taxi");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("If you are  far away, you can select multiple types of delivery");

        javax.swing.GroupLayout DeliveryPanelLayout = new javax.swing.GroupLayout(DeliveryPanel);
        DeliveryPanel.setLayout(DeliveryPanelLayout);
        DeliveryPanelLayout.setHorizontalGroup(
            DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DeliveryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(DeliveryPanelLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AirCheckBox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TrainCheckBox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TaxiCheckBox, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DeliveryPanelLayout.setVerticalGroup(
            DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeliveryPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AirCheckBox))
                .addGap(18, 18, 18)
                .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TrainCheckBox))
                .addGap(18, 18, 18)
                .addGroup(DeliveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TaxiCheckBox))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        getDeliveryCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getDeliveryCheckBox.setText("get delivery");
        getDeliveryCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                getDeliveryCheckBoxStateChanged(evt);
            }
        });
        getDeliveryCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDeliveryCheckBoxActionPerformed(evt);
            }
        });

        TotalCostLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        RefreshCost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh-symbol.png"))); // NOI18N
        RefreshCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshCostActionPerformed(evt);
            }
        });

        Payment.add(CashPaymentRadio);
        CashPaymentRadio.setSelected(true);
        CashPaymentRadio.setText("cash payment");
        CashPaymentRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashPaymentRadioActionPerformed(evt);
            }
        });

        Payment.add(CardPaymentRadio);
        CardPaymentRadio.setText("card payment(cashback 10%)");
        CardPaymentRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardPaymentRadioActionPerformed(evt);
            }
        });

        BalanceLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BalanceLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BalanceLbl.setText("Your balance :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(CashPaymentRadio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CardPaymentRadio))
                        .addComponent(GoBackBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Basket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(getDeliveryCheckBox)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                            .addComponent(ProductsCostLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeliveryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BalanceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TotalCostLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RefreshCost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MakeOrderBtn)))))
                .addGap(61, 61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Basket, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getDeliveryCheckBox)
                            .addComponent(ProductsCostLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CashPaymentRadio)
                            .addComponent(CardPaymentRadio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(BalanceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeliveryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RefreshCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GoBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MakeOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TotalCostLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillComponents(HashMap<Product, Integer> map) {
        map.keySet().forEach((Product key) -> {
            if (map.get(key) != 0) {
                Basket.add(key.getName() + "  (x" + map.get(key) + ")");
            }
        });
        this.ProductsCostLbl.setText("" + parent.getUser().getAllProductsCost());
        this.BalanceLbl.setText("Your balance : " + (int) parent.getUser().getMoney());
        this.TotalCostLbl.setText(ProductsCostLbl.getText());
    }

    private void GoBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackBtnActionPerformed
        this.parent.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_GoBackBtnActionPerformed

    private void MakeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeOrderBtnActionPerformed
        if (Basket.getItemCount() == 0) {
            JOptionPane.showMessageDialog(
                    new Frame("Empty basket"),
                    "The basket is empty, add some products",
                    "Empty basket",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            if (!parent.getUser().hasMoneyToPay(chooseShippingType())) {
                JOptionPane.showMessageDialog(
                        new Frame("Failed order"),
                        "You don't have enough money to get this order",
                        "Unsuccessful order",
                        JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                delivery.ship(parent.getUser(), chooseShippingType());
                parent.setVisible(true);
                parent.updateUserInfo();
                parent.clearBasket();
                this.dispose();
            }
            
        }
    }//GEN-LAST:event_MakeOrderBtnActionPerformed
    
    private ShippingType chooseShippingType() {
        if (AirCheckBox.isSelected() && TrainCheckBox.isSelected() && TaxiCheckBox.isSelected()) {
            return AIR_TRAIN_TAXI;
        } else if (TrainCheckBox.isSelected() && TaxiCheckBox.isSelected()) {
            return TRAIN_TAXI;
        } else if (AirCheckBox.isSelected() && TaxiCheckBox.isSelected()) {
            return AIR_TAXI;
        } else if (AirCheckBox.isSelected() && TrainCheckBox.isSelected()) {
            return AIR_TRAIN;
        } else if (AirCheckBox.isSelected()) {
            return AIR;
        } else if (TrainCheckBox.isSelected()) {
            return TRAIN;
        } else if (TaxiCheckBox.isSelected()) {
            return TAXI;
        } else {
            return NONE;
        }
    }
    private void getDeliveryCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDeliveryCheckBoxActionPerformed
        DeliveryPanel.setVisible(getDeliveryCheckBox.isSelected());
        if (!getDeliveryCheckBox.isSelected()) {
            TaxiCheckBox.setSelected(false);
            TrainCheckBox.setSelected(false);
            AirCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_getDeliveryCheckBoxActionPerformed

    private void getDeliveryCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_getDeliveryCheckBoxStateChanged
    }//GEN-LAST:event_getDeliveryCheckBoxStateChanged

    private void RefreshCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshCostActionPerformed
        this.TotalCostLbl.setText("" + (parent.getUser().getAllProductsCost() + delivery.getShippingCost(chooseShippingType())));
    }//GEN-LAST:event_RefreshCostActionPerformed

    private void CardPaymentRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardPaymentRadioActionPerformed
        parent.getUser().setCustomerPayment(new CustomerPayment(new CardPayment()));
    }//GEN-LAST:event_CardPaymentRadioActionPerformed

    private void CashPaymentRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashPaymentRadioActionPerformed
        parent.getUser().setCustomerPayment(new CustomerPayment(new CashPayment()));
    }//GEN-LAST:event_CashPaymentRadioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AirCheckBox;
    private javax.swing.JLabel BalanceLbl;
    private java.awt.List Basket;
    private javax.swing.JRadioButton CardPaymentRadio;
    private javax.swing.JRadioButton CashPaymentRadio;
    private javax.swing.JPanel DeliveryPanel;
    private javax.swing.JButton GoBackBtn;
    private javax.swing.JButton MakeOrderBtn;
    private javax.swing.ButtonGroup Payment;
    private javax.swing.JLabel ProductsCostLbl;
    private javax.swing.JButton RefreshCost;
    private javax.swing.JCheckBox TaxiCheckBox;
    private javax.swing.JLabel TotalCostLbl;
    private javax.swing.JCheckBox TrainCheckBox;
    private javax.swing.JCheckBox getDeliveryCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
