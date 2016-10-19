/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao.XmlDao;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.Edge;
import model.Graphml;
import model.PupulaTabela;

/**
 *
 * @author ricardo
 */
public class Main extends javax.swing.JFrame {

    RenderGraph render;
    Graphml graph;

    // Graphml graph;
    public Main() {
        graph = null;

        initComponents();



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaGrafo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaGrafoEdge = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuNovo = new javax.swing.JMenuItem();
        menuAbrir = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuNode = new javax.swing.JMenuItem();
        menuNovoEdge = new javax.swing.JMenuItem();
        menuShow = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Grafos");
        setResizable(false);

        tabelaGrafo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaGrafo);

        tabelaGrafoEdge.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabelaGrafoEdge);

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addGap(21, 21, 21))
        );

        jMenu1.setText("Arquivo");

        menuNovo.setText("Novo Grafo");
        menuNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovoActionPerformed(evt);
            }
        });
        jMenu1.add(menuNovo);

        menuAbrir.setText("Abrir Grafo");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(menuAbrir);

        jMenuItem1.setText("Salvar Grafo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu1.add(menuSair);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Opções");

        menuNode.setText("Inserir Vértice");
        menuNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNodeActionPerformed(evt);
            }
        });
        jMenu3.add(menuNode);

        menuNovoEdge.setText("Inserir Aresta");
        menuNovoEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovoEdgeActionPerformed(evt);
            }
        });
        jMenu3.add(menuNovoEdge);

        menuShow.setText("Visualizar Grafo");
        menuShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuShowActionPerformed(evt);
            }
        });
        jMenu3.add(menuShow);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Informações");

        jMenuItem2.setText("Grau do Grafo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos xml", "xml");
        String dirBase = System.getProperty("user.home", "/home/ricardo/NetBeansProjects/GrafosDefinicoes");
        File dir = new File(dirBase);
        JFileChooser arq = new JFileChooser();
        arq.setCurrentDirectory(dir);
        arq.setAcceptAllFileFilterUsed(false);
        arq.addChoosableFileFilter(filtro);

        int retorno = arq.showOpenDialog(null);

        if (graph != null) {
            graph = null;
        }
        if (retorno == JFileChooser.APPROVE_OPTION) {
            graph = XmlDao.leGrafo(arq.getSelectedFile().getAbsolutePath());
            //menuAbrir.setEnabled(false);
            populaTableNodes();
            populaTableEdges();

        }


    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuShowActionPerformed
        render = new RenderGraph(graph.getGraph().getNode(), graph.getGraph().getEdge());
        render.setVisible(true);
    }//GEN-LAST:event_menuShowActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovoActionPerformed
        if (graph == null) {
            graph = null;
            graph = new Graphml();
        }
        if (graph != null) {
            //inserir mensamem para salvar o grafo caso esteja aberto.
            graph = new Graphml();
            populaTableNodes();
            populaTableEdges();

            
            
        }
    }//GEN-LAST:event_menuNovoActionPerformed

    private void menuNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNodeActionPerformed
        Vertice v = new Vertice(this, true);
        v.setVisible(true);
        graph.getGraph().getNode().add(v.getN());
        populaTableNodes();
        populaTableEdges();
    }//GEN-LAST:event_menuNodeActionPerformed

    private void menuNovoEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovoEdgeActionPerformed

        Arestas a = new Arestas(this, true);
        a.preencheCBOX(graph.getGraph().getNode());
        a.setVisible(true);
        Edge e = new Edge(a.origem, a.destino);
        graph.getGraph().getEdge().add(e);
        populaTableNodes();
        populaTableEdges();

    }//GEN-LAST:event_menuNovoEdgeActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(null, "O grafo possui ordem "+graph.getGraph().getNode().size(), "Grau do Grafo", WIDTH);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos xml", "xml");
        String dirBase = System.getProperty("user.home", "/home/ricardo/NetBeansProjects/GrafosDefinicoes");
        File dir = new File(dirBase);
        JFileChooser arq = new JFileChooser();
        arq.setCurrentDirectory(dir);
        arq.setAcceptAllFileFilterUsed(false);
        arq.addChoosableFileFilter(filtro);

        int retorno = arq.showSaveDialog(null);

String texto = arq.getSelectedFile().getAbsolutePath();
            File f = new File(arq.getSelectedFile().getAbsolutePath());
        if (retorno == JFileChooser.APPROVE_OPTION) {
            
            if(!f.exists())
               // System.out.println(f.getAbsolutePath());
                XmlDao.salvaXML(graph,texto+".xml");
            else{
                f.delete();
                XmlDao.salvaXML(graph, texto);
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void populaTableNodes() {
        int maior;
        ArrayList dados = new ArrayList();
        String[] colunas = new String[1];
        colunas[0] = "Vértices";

        maior = graph.getGraph().getNode().size();
        String nodeName;
        for (int i = 0; i < maior; i++) {
            nodeName = graph.getGraph().getNode().get(i).getId();
            dados.add(new Object[]{nodeName});
        }

        PupulaTabela modelo = new PupulaTabela(dados, colunas);
        tabelaGrafo.setModel(modelo);
        tabelaGrafo.getColumnModel().getColumn(0).setPreferredWidth(187);
        tabelaGrafo.getColumnModel().getColumn(0).setResizable(false);
        tabelaGrafo.getTableHeader().setReorderingAllowed(false);
        tabelaGrafo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelaGrafo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private void populaTableEdges() {
        int maior;
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Aresta - Origem", "Aresta - Destino"};
        maior = graph.getGraph().getEdge().size();
        String target, source;

        for (int i = 0; i < maior; i++) {
            source = graph.getGraph().getEdge().get(i).getSourceName();
            target = graph.getGraph().getEdge().get(i).getTargetName();
            dados.add(new Object[]{source, target});

        }

        PupulaTabela modelo = new PupulaTabela(dados, Colunas);
        tabelaGrafoEdge.setModel(modelo);
        tabelaGrafoEdge.getColumnModel().getColumn(0).setPreferredWidth(182);
        tabelaGrafoEdge.getColumnModel().getColumn(0).setResizable(false);
        tabelaGrafoEdge.getColumnModel().getColumn(1).setPreferredWidth(182);
        tabelaGrafoEdge.getColumnModel().getColumn(1).setResizable(false);
        tabelaGrafoEdge.getTableHeader().setReorderingAllowed(false);
        tabelaGrafoEdge.setAutoResizeMode(tabelaGrafo.AUTO_RESIZE_OFF);

        tabelaGrafoEdge.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuItem menuNode;
    private javax.swing.JMenuItem menuNovo;
    private javax.swing.JMenuItem menuNovoEdge;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuShow;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTable tabelaGrafo;
    private javax.swing.JTable tabelaGrafoEdge;
    // End of variables declaration//GEN-END:variables
}