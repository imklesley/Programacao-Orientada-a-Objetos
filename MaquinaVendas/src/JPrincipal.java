
/**
 *
 * @author KlesleyGonçalves
 */
public class JPrincipal extends javax.swing.JFrame {

    public JPrincipal() {
        initComponents();
    }
    float dinheiroCliente;
    boolean noDinheiro=false;
    boolean noCartao=false;
    int p1=8,p2=10,p3=8,p4=9,p5=8,p6=8,p7=8,p8=6,p9=5;
    

    public void recebe_jAbastecer(int a, int b, int c, int d, int e, int f, int g, int h,int i){
        setP1(a);
        setP2(b);
        setP3(c);
        setP4(d);
        setP5(e);
        setP6(f);
        setP7(g);
        setP8(h);
        setP9(i);   
    }
    
    

    ///Métodos Especiais
    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    public int getP4() {
        return p4;
    }

    public void setP4(int p4) {
        this.p4 = p4;
    }

    public int getP5() {
        return p5;
    }

    public void setP5(int p5) {
        this.p5 = p5;
    }

    public int getP6() {
        return p6;
    }

    public void setP6(int p6) {
        this.p6 = p6;
    }

    public int getP7() {
        return p7;
    }

    public void setP7(int p7) {
        this.p7 = p7;
    }

    public int getP8() {
        return p8;
    }

    public void setP8(int p8) {
        this.p8 = p8;
    }

    public int getP9() {
        return p9;
    }

    public void setP9(int p9) {
        this.p9 = p9;
    }
    
    //////////////
    
    
    
    
    
  
    JAbastecer ab1;// INSTANCIANDO A FRAME DE ABASTECER OS PRODUTOSS
    SenhaCartao sc=new SenhaCartao(); ///PEDE SENHA AO USUÁRIO
    
    
       
    
    
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        txtCampo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jBok = new javax.swing.JButton();
        jB2R = new javax.swing.JButton();
        jB10R = new javax.swing.JButton();
        jB50R = new javax.swing.JButton();
        jB100R = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jBCartao = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLCliente = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabelAvisos = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        trocoL = new javax.swing.JLabel();
        erroProduto = new javax.swing.JLabel();
        bemSu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jButton5.setText("jButton5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 80));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jB1.setText("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB2.setText("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB3.setText("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jB4.setText("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB5.setText("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB6.setText("6");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB7.setText("7");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB8.setText("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB9.setText("9");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        txtCampo.setText("0");
        txtCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("FORMAS DE PAGAMENTO");

        jBok.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jBok.setText("OK");
        jBok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBokActionPerformed(evt);
            }
        });

        jB2R.setText("2,00 R$");
        jB2R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2RActionPerformed(evt);
            }
        });

        jB10R.setText("10,00 R$");
        jB10R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB10RActionPerformed(evt);
            }
        });

        jB50R.setText("50,00 R$");
        jB50R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB50RActionPerformed(evt);
            }
        });

        jB100R.setText("100,00 R$");
        jB100R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB100RActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Dinheiro: ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Cartão: ");

        jBCartao.setText("Insira o cartão");
        jBCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCartaoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Escolha Seu Produto:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PEGUE SEU TROCO AQUI");

        jButton1.setText("<-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 0));
        jLabel20.setText("Dinheiro inserido: ");

        jLCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLCliente.setForeground(new java.awt.Color(204, 0, 0));
        jLCliente.setText("***********");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 204, 204));
        jLabel24.setText("Avisos: ");

        jLabelAvisos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelAvisos.setForeground(new java.awt.Color(0, 204, 204));
        jLabelAvisos.setText("                         ***********");

        jBCancelar.setBackground(new java.awt.Color(255, 0, 0));
        jBCancelar.setText("X");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        trocoL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        trocoL.setForeground(new java.awt.Color(0, 204, 51));
        trocoL.setText("R$ 0,00");

        erroProduto.setBackground(new java.awt.Color(255, 0, 0));
        erroProduto.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        erroProduto.setForeground(new java.awt.Color(204, 0, 0));
        erroProduto.setText("*");

        bemSu.setForeground(new java.awt.Color(0, 102, 153));
        bemSu.setText("                                            ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jB2R, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel17))
                                    .addComponent(jB50R))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jB10R, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jB100R, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel19))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBCartao)
                                .addComponent(jLabel18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(erroProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBok))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jB1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jB2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jB3))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jB4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jB5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jB6))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jB8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jB9)))
                                    .addComponent(bemSu))))
                        .addGap(9, 9, 9)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(trocoL, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLCliente))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabelAvisos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB2R)
                    .addComponent(jB10R))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB50R)
                    .addComponent(jB100R))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(12, 12, 12)
                .addComponent(jBCartao)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(23, 23, 23)
                .addComponent(erroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(1, 1, 1)
                .addComponent(bemSu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB1)
                    .addComponent(jB2)
                    .addComponent(jB3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB4)
                    .addComponent(jB5)
                    .addComponent(jB6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jB8)
                        .addComponent(jB9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBok)
                    .addComponent(jBCancelar))
                .addGap(33, 33, 33)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trocoL, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Máquina de Refrigerante 24 Hrs");

        jLabel4.setText("1");

        jLabel6.setText("2");

        jLabel7.setText("3");

        jLabel8.setText("4");

        jLabel9.setText("5");

        jLabel10.setText("6");

        jLabel11.setText("7");

        jLabel12.setText("8");

        jLabel13.setText("9");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("RETIRE SEU PRODUTO AQUI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel15)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel15)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaIcon/c1.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaIcon/c2.png"))); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaIcon/c3.png"))); // NOI18N

        jLabel25.setText("R$ 3,00");

        jLabel26.setText("R$ 4,00");

        jLabel27.setText("R$ 4,50");

        jLabel28.setText("R$ 2,00");

        jLabel29.setText("R$ 3,50");

        jLabel30.setText("R$ 3,65");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaIcon/c1.png"))); // NOI18N

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaIcon/c2.png"))); // NOI18N

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaIcon/c3.png"))); // NOI18N

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaIcon/c2.png"))); // NOI18N

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaIcon/c3.png"))); // NOI18N

        jLabel37.setText("R$ 4,00");

        jLabel38.setText("R$ 4,00");

        jLabel39.setText("R$ 4,00");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imaIcon/c1.png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu1.setText("Configurações");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Abastecer");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setText("EXIT");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel3)
                                        .addGap(157, 157, 157)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9)
                                                .addGap(23, 23, 23))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(10, 10, 10)
                                                            .addComponent(jLabel28))
                                                        .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addComponent(jLabel37)
                                                    .addComponent(jLabel35)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel25)
                                                        .addComponent(jLabel21)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(21, 21, 21)
                                                            .addComponent(jLabel4))))
                                                .addGap(55, 55, 55)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel29)
                                                    .addComponent(jLabel32)
                                                    .addComponent(jLabel38)
                                                    .addComponent(jLabel26)
                                                    .addComponent(jLabel22)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(19, 19, 19)
                                                        .addComponent(jLabel6))
                                                    .addComponent(jLabel36))))))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel27)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel30)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel10))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addGap(54, 54, 54)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel33)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCartaoActionPerformed
        trocoL.setText("R$ 0,00");
        if(noDinheiro==false)
        {
            sc.setVisible(true);
            noCartao=true;
        }
        else {
            jLabelAvisos.setText("Opção de dinheiro ATIVADA");
        }
        
    }//GEN-LAST:event_jBCartaoActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
             txtCampo.setText(txtCampo.getText()+"1");
             erroProduto.setText("*       ");
             trocoL.setText("R$ 0,00");
             bemSu.setText(" ");
             
            
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
            txtCampo.setText(txtCampo.getText()+"2");
            erroProduto.setText("*       ");
            trocoL.setText("R$ 0,00");
            bemSu.setText(" ");
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
            txtCampo.setText(txtCampo.getText()+"3");
            erroProduto.setText("*       ");
            trocoL.setText("R$ 0,00");
            bemSu.setText(" ");
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
            txtCampo.setText(txtCampo.getText()+"4");
            erroProduto.setText("*       ");
            trocoL.setText("R$ 0,00");
            bemSu.setText(" ");
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
            txtCampo.setText(txtCampo.getText()+"5");
            erroProduto.setText("*       ");
            trocoL.setText("R$ 0,00");
            bemSu.setText(" ");
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
            txtCampo.setText(txtCampo.getText()+"6");
            erroProduto.setText("*       ");
            trocoL.setText("R$ 0,00");
            bemSu.setText(" ");
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
            txtCampo.setText(txtCampo.getText()+"7");
            erroProduto.setText("*       ");
            trocoL.setText("R$ 0,00");
            bemSu.setText(" ");
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
            txtCampo.setText(txtCampo.getText()+"8");
            erroProduto.setText("*       ");
            trocoL.setText("R$ 0,00");
            bemSu.setText(" ");
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
            txtCampo.setText(txtCampo.getText()+"9");
            erroProduto.setText("*       ");
            trocoL.setText("R$ 0,00");
            bemSu.setText(" ");
    }//GEN-LAST:event_jB9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String conteudo = txtCampo.getText();
        erroProduto.setText("*       ");
        if(conteudo.length()>0){
            conteudo=conteudo.substring(0,conteudo.length()-1);
            txtCampo.setText(conteudo);
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
          
          if(ab1==null)
          {
              ab1=new JAbastecer();
              ab1.setVisible(true);
              ab1.recebe_JPricipal(p1, p2, p3, p4,p5,p6,p7,p8,p9);// manda os valores de JPrincipal para o JAbastecer para que possa ser add certa quantidade em p1, p2...
              ab1.setState(JAbastecer.NORMAL);
          }else{
              ab1.setVisible(true);
              ab1.recebe_JPricipal(p1, p2, p3, p4,p5,p6,p7,p8,p9);// manda os valores de JPrincipal para o JAbastecer para que possa ser add certa quantidade em p1, p2...
              ab1.setState(JAbastecer.NORMAL);
              
          }
          
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jB2RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2RActionPerformed
        trocoL.setText("R$ 0,00");
        if(noCartao==true){
            jLabelAvisos.setText("Opção de Cartão ATIVADA");
        }else{
            noDinheiro=true;
            dinheiroCliente=dinheiroCliente+2.00f;
            jLCliente.setText(Float.toString(dinheiroCliente));
        }
    }//GEN-LAST:event_jB2RActionPerformed

    private void jB10RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB10RActionPerformed
        trocoL.setText("R$ 0,00");
        if(noCartao==true){
            jLabelAvisos.setText("Opção de Cartão ATIVADA");
        }else{
            noDinheiro=true;
            dinheiroCliente=dinheiroCliente+10.00f;
            jLCliente.setText(Float.toString(dinheiroCliente));
        }
    }//GEN-LAST:event_jB10RActionPerformed

    private void jB50RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB50RActionPerformed
        trocoL.setText("R$ 0,00");
        if(noCartao==true){
            jLabelAvisos.setText("Opção de Cartão ATIVADA");
        }else{
            noDinheiro=true;
            dinheiroCliente=dinheiroCliente+50.00f;
            jLCliente.setText(Float.toString(dinheiroCliente));
        }
    }//GEN-LAST:event_jB50RActionPerformed

    private void jB100RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB100RActionPerformed
        trocoL.setText("R$ 0,00");
        if(noCartao==true){
            jLabelAvisos.setText("Opção de Cartão ATIVADA");
        }else{
            noDinheiro=true;
            dinheiroCliente=dinheiroCliente+100.00f;
            jLCliente.setText(Float.toString(dinheiroCliente));
        }
    }//GEN-LAST:event_jB100RActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        noDinheiro=false;
        noCartao=false;
        dinheiroCliente=0;
        jLCliente.setText("        ********");
        jLabelAvisos.setText("                                 ********");
        txtCampo.setText("0");
        erroProduto.setText("*       ");
        
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void txtCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampoActionPerformed

    private void jBokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBokActionPerformed
        float valorProduto;
        float troco;
        String trocoTxt;
        int i=Integer.parseInt(txtCampo.getText());
        int x=i==0?1:0;
        int testador;
        if(noCartao==true)
        {
            if(i==1)
            { 
                testador=(p1==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                if(getP1()>0){
                     setP1(getP1()-1);
                     bemSu.setText("Operação Bem Sucedida");
                }else 
                    erroProduto.setText("Produto Indisponível");
                
            }
            else if(i==2)
            {
                testador=(p2==0)?1:0;
                if(testador==2)
                    erroProduto.setText("Produto Indisponível");
                
                if(getP2()>0){
                     setP2(getP2()-1);
                     bemSu.setText("Operação Bem Sucedida");
                }   
            }
            else if(i==3)
            {  
                testador=(p1==3)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                if(getP3()>0){
                     setP3(getP3()-1);
                     bemSu.setText("Operação Bem Sucedida");
                }   
            }
            else if(i==4)
            {  
                testador=(p4==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                if(getP4()>0){
                     setP4(getP4()-1);
                     bemSu.setText("Operação Bem Sucedida");
                }   
            }
           else if(i==5)
            {  
                testador=(p1==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
               if(getP5()>0){
                     setP5(getP5()-1);
                     bemSu.setText("Operação Bem Sucedida");
                }   
            }
            else if(i==6)
            {  
                testador=(p6==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                
                if(getP6()>0){
                     setP6(getP6()-1);
                     bemSu.setText("Operação Bem Sucedida");
                }   
            }
            else if(i==7)
            {  
                testador=(p7==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                if(getP7()>0){
                     setP7(getP7()-1);
                     bemSu.setText("Operação Bem Sucedida");
                }   
                
                
                          
            }
            else if(i==8)
            {  
                testador=(p1==8)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                if(getP8()>0){
                     setP8(getP8()-1);
                     bemSu.setText("Operação Bem Sucedida");
                }   
            }
            else if(i==9)
            {  
                testador=(p9==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                if(getP9()>0){
                     setP9(getP9()-1);
                     bemSu.setText("Operação Bem Sucedida");
                }   
            }
            else
            {
                erroProduto.setText("Produto Invalido");
            }
            if(x==1)
            {
                erroProduto.setText("Informe o produto");
            }
            
            
                
             noCartao=false;
             jLCliente.setText("        ********");
             jLabelAvisos.setText("                                 ********");
             
        }
        else{
            erroProduto.setText("Insira o Cartão ou Cédulas " );
        } 
            
        if(noDinheiro==true)
        {
            if(i==1)
            {   
                valorProduto=3.00f;
                testador=(p1==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                
                if(getP1()>0){
                    if(dinheiroCliente>=valorProduto){
                       setP1(getP1()-1);
                       if(dinheiroCliente>valorProduto){
                        troco=dinheiroCliente-valorProduto;
                        trocoTxt=Float.toString(troco);
                        trocoL.setText("R$ "+trocoTxt);
                        bemSu.setText("Operação Bem Sucedida");
                    }
                }else
                   erroProduto.setText("Valor Não Suficiente");
                if(getP1()==0)
                    erroProduto.setText("Produto Indisponível");
                        
             }
          } 
            else if(i==2){
                valorProduto=4.00f;
                testador=(p2==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                if(getP2()>0){
                    if(dinheiroCliente>=valorProduto){
                       setP1(getP2()-1);
                       if(dinheiroCliente>valorProduto){
                        troco=dinheiroCliente-valorProduto;
                        trocoTxt=Float.toString(troco);
                        trocoL.setText("R$ "+trocoTxt);
                        bemSu.setText("Operação Bem Sucedida");
                    }
                }
             }
            }
            else if(i==3){
                valorProduto=4.50f;
                testador=(p3==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                if(getP3()>0){
                    if(dinheiroCliente>=valorProduto){
                       setP3(getP3()-1);
                       if(dinheiroCliente>valorProduto){
                        troco=dinheiroCliente-valorProduto;
                        trocoTxt=Float.toString(troco);
                        trocoL.setText("R$ "+trocoTxt);
                        bemSu.setText("Operação Bem Sucedida");
                    }
                }
             } 
                
            }
            else if(i==4){
                valorProduto=2.00f;
                testador=(p4==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                
                if(getP4()>0){
                    if(dinheiroCliente>=valorProduto){
                       setP4(getP4()-1);
                       if(dinheiroCliente>valorProduto){
                        troco=dinheiroCliente-valorProduto;
                        trocoTxt=Float.toString(troco);
                        trocoL.setText("R$ "+trocoTxt);
                        bemSu.setText("Operação Bem Sucedida");
                    }
                }
             }
            }
            else if(i==5){
                valorProduto=3.50f;
                testador=(p5==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                if(dinheiroCliente>=valorProduto)
                {
                    setP5(getP5()-1);
                    if(dinheiroCliente>valorProduto){
                        troco=dinheiroCliente-valorProduto;
                        trocoTxt=Float.toString(troco);
                        trocoL.setText("R$ "+trocoTxt);
                        bemSu.setText("Operação Bem Sucedida");
                    }
                    
                } 
            }
            else if(i==6){
                valorProduto=3.65f;
                testador=(p6==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                if(getP6()>0){
                    if(dinheiroCliente>=valorProduto){
                       setP6(getP6()-1);
                       if(dinheiroCliente>valorProduto){
                        troco=dinheiroCliente-valorProduto;
                        trocoTxt=Float.toString(troco);
                        trocoL.setText("R$ "+trocoTxt);
                        bemSu.setText("Operação Bem Sucedida");
                    }
                }
             } 
            }
            
            else if(i==7){
                valorProduto=4.00f;
                testador=(p7==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                if(getP7()>0){
                    if(dinheiroCliente>=valorProduto){
                       setP7(getP7()-1);
                       if(dinheiroCliente>valorProduto){
                        troco=dinheiroCliente-valorProduto;
                        trocoTxt=Float.toString(troco);
                        trocoL.setText("R$ "+trocoTxt);
                        bemSu.setText("Operação Bem Sucedida");
                    }
                }
             } 
            }
            else if(i==8){
                valorProduto=4.00f;
                testador=(p6==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                if(getP8()>0){
                    if(dinheiroCliente>=valorProduto){
                       setP8(getP8()-1);
                       if(dinheiroCliente>valorProduto){
                        troco=dinheiroCliente-valorProduto;
                        trocoTxt=Float.toString(troco);
                        trocoL.setText("R$ "+trocoTxt);
                        bemSu.setText("Operação Bem Sucedida");
                    }
                }
             } 
            }
            else if(i==9){
                valorProduto=3.25f;
                testador=(p9==0)?1:0;
                if(testador==1)
                    erroProduto.setText("Produto Indisponível");
                if(getP9()>0){
                    if(dinheiroCliente>=valorProduto){
                       setP9(getP9()-1);
                       if(dinheiroCliente>valorProduto){
                        troco=dinheiroCliente-valorProduto;
                        trocoTxt=Float.toString(troco);
                        trocoL.setText("R$ "+trocoTxt);
                        bemSu.setText("Operação Bem Sucedida");
                    }
                }
             } 
            }
            else
            {
                erroProduto.setText("Produto Invalido");
            }
            
            noDinheiro=false;
            dinheiroCliente=0;
            jLCliente.setText("        ********");
            jLabelAvisos.setText("                                 ********");
            txtCampo.setText("0");
            
        }else{
            erroProduto.setText("Insira o Cartão ou Cédulas " );
        }
        

    }//GEN-LAST:event_jBokActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemSu;
    private javax.swing.JLabel erroProduto;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB100R;
    private javax.swing.JButton jB10R;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB2R;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB50R;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBCartao;
    private javax.swing.JButton jBok;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAvisos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel trocoL;
    private javax.swing.JTextField txtCampo;
    // End of variables declaration//GEN-END:variables
}
