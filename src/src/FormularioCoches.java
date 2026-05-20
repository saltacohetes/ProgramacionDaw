import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormularioCoches extends JFrame {
    private ArrayList<Coche> listaCoches;
    private JPanel panelPrincipal;
    private CardLayout cardLayout;
    private DefaultTableModel modeloTabla;
    private JTable tablaCoches;
    private JTextField txtMarca, txtAnio, txtColor;

    public FormularioCoches() {
        listaCoches = new ArrayList<>();

        setTitle("Gestión de Coches - Java Swing");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        panelPrincipal = new JPanel(cardLayout);

        crearMenu();
        configurarPanelFormulario();
        configurarPanelTabla();

        add(panelPrincipal);
    }

    private void crearMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuOpciones = new JMenu("Opciones");

        JMenuItem itemAñadir = new JMenuItem("Añadir Coche");
        JMenuItem itemMostrar = new JMenuItem("Mostrar Coches");

        itemAñadir.addActionListener(e -> cardLayout.show(panelPrincipal, "Formulario"));
        itemMostrar.addActionListener(e -> {
            actualizarTabla();
            cardLayout.show(panelPrincipal, "Tabla");
        });

        menuOpciones.add(itemAñadir);
        menuOpciones.add(itemMostrar);
        menuBar.add(menuOpciones);
        setJMenuBar(menuBar);
    }

    private void configurarPanelFormulario() {
        JPanel panelForm = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblMarca = new JLabel("Marca:");
        txtMarca = new JTextField(15);
        JLabel lblAnio = new JLabel("Año:");
        txtAnio = new JTextField(15);
        JLabel lblColor = new JLabel("Color:");
        txtColor = new JTextField(15);

        JButton btnGuardar = new JButton("Guardar Coche");

        gbc.gridx = 0; gbc.gridy = 0; panelForm.add(lblMarca, gbc);
        gbc.gridx = 1; panelForm.add(txtMarca, gbc);
        gbc.gridx = 0; gbc.gridy = 1; panelForm.add(lblAnio, gbc);
        gbc.gridx = 1; panelForm.add(txtAnio, gbc);
        gbc.gridx = 0; gbc.gridy = 2; panelForm.add(lblColor, gbc);
        gbc.gridx = 1; panelForm.add(txtColor, gbc);
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        panelForm.add(btnGuardar, gbc);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marca = txtMarca.getText().trim();
                String anioStr = txtAnio.getText().trim();
                String color = txtColor.getText().trim();

                if (marca.isEmpty() || anioStr.isEmpty() || color.isEmpty()) {
                    JOptionPane.showMessageDialog(FormularioCoches.this,
                            "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int anio;
                try {
                    anio = Integer.parseInt(anioStr);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(FormularioCoches.this,
                            "El campo 'Año' debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Coche nuevoCoche = new Coche(marca, anio, color);
                listaCoches.add(nuevoCoche);

                JOptionPane.showMessageDialog(FormularioCoches.this,
                        "¡Coche añadido con éxito!", "Confirmación", JOptionPane.INFORMATION_MESSAGE);

                txtMarca.setText("");
                txtAnio.setText("");
                txtColor.setText("");
            }
        });

        panelPrincipal.add(panelForm, "Formulario");
    }

    private void configurarPanelTabla() {
        JPanel panelTablaLayout = new JPanel(new BorderLayout());
        String[] columnas = {"Marca", "Año", "Color"};

        modeloTabla = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };

        tablaCoches = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaCoches);
        panelTablaLayout.add(scrollPane, BorderLayout.CENTER);

        JButton btnEliminar = new JButton("Eliminar Coche Seleccionado");
        btnEliminar.addActionListener(e -> {
            int filaSeleccionada = tablaCoches.getSelectedRow();
            if (filaSeleccionada >= 0) {
                listaCoches.remove(filaSeleccionada);
                actualizarTabla();
                JOptionPane.showMessageDialog(this, "Coche eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, selecciona un coche.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        });

        panelTablaLayout.add(btnEliminar, BorderLayout.SOUTH);
        panelPrincipal.add(panelTablaLayout, "Tabla");
    }

    private void actualizarTabla() {
        modeloTabla.setRowCount(0);
        for (Coche coche : listaCoches) {
            Object[] fila = {coche.getMarca(), coche.getAnio(), coche.getColor()};
            modeloTabla.addRow(fila);
        }
    }
}