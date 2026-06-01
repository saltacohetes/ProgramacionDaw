package GestorLibros;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class GestorLibros extends JFrame {

    private ArrayList<Libro> listaLibros;
    private final String ARCHIVO_CSV = "libros.csv";

    public GestorLibros() {
        listaLibros = new ArrayList<>();
        cargarLibrosDesdeCSV();

        setTitle("Gestión de Libros");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuOpciones = new JMenu("Opciones");

        JMenuItem menuAnadir = new JMenuItem("Añadir Libro");
        JMenuItem menuMostrar = new JMenuItem("Mostrar Libros");

        menuAnadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFormularioAnadir();
            }
        });

        menuMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentanaMostrar();
            }
        });

        menuOpciones.add(menuAnadir);
        menuOpciones.add(menuMostrar);
        menuBar.add(menuOpciones);
        setJMenuBar(menuBar);

        JLabel lblBienvenida = new JLabel("Bienvenido al Gestor de Libros", SwingConstants.CENTER);
        lblBienvenida.setFont(new Font("Arial", Font.BOLD, 10));
        add(lblBienvenida, BorderLayout.CENTER);
    }

    private void abrirFormularioAnadir() {
        JDialog dialog = new JDialog(this, "Añadir Nuevo Libro", true);
        dialog.setSize(300, 200);
        dialog.setLayout(new GridLayout(4, 2, 10, 10));
        dialog.setLocationRelativeTo(this);

        JLabel lblTitulo = new JLabel("Título:");
        JTextField txtTitulo = new JTextField();

        JLabel lblAutor = new JLabel("Autor:");
        JTextField txtAutor = new JTextField();

        JLabel lblAnio = new JLabel("Año de publicación:");
        JTextField txtAnio = new JTextField();

        JButton btnGuardar = new JButton("Guardar");

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titulo = txtTitulo.getText().trim();
                String autor = txtAutor.getText().trim();
                String anioStr = txtAnio.getText().trim();

                if (titulo.isEmpty() || autor.isEmpty() || anioStr.isEmpty()) {
                    JOptionPane.showMessageDialog(dialog, "No se permiten campos vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    int anio = Integer.parseInt(anioStr);

                    Libro nuevoLibro = new Libro(titulo, autor, anio);
                    listaLibros.add(nuevoLibro);
                    guardarLibrosEnCSV();

                    JOptionPane.showMessageDialog(dialog, "Libro agregado correctamente.");
                    dialog.dispose();

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(dialog, "El campo 'Año de publicación' debe ser numérico.", "Error de formato", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        dialog.add(lblTitulo);
        dialog.add(txtTitulo);
        dialog.add(lblAutor);
        dialog.add(txtAutor);
        dialog.add(lblAnio);
        dialog.add(txtAnio);
        dialog.add(new JLabel(""));
        dialog.add(btnGuardar);

        dialog.setVisible(true);
    }

    private void abrirVentanaMostrar() {
        JDialog dialog = new JDialog(this, "Lista de Libros", true);
        dialog.setSize(500, 300);
        dialog.setLocationRelativeTo(this);

        String[] columnas = {"Título", "Autor", "Año"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (Libro libro : listaLibros) {
            Object[] fila = {libro.getTitulo(), libro.getAutor(), libro.getAnioPublicacion()};
            modelo.addRow(fila);
        }

        JTable tabla = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabla);
        dialog.add(scrollPane, BorderLayout.CENTER);

        JButton btnEliminar = new JButton("Eliminar libro seleccionado");
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tabla.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    listaLibros.remove(filaSeleccionada);
                    modelo.removeRow(filaSeleccionada);
                    guardarLibrosEnCSV();
                    JOptionPane.showMessageDialog(dialog, "Libro eliminado.");
                } else {
                    JOptionPane.showMessageDialog(dialog, "Seleccione un libro para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        JPanel panelBoton = new JPanel();
        panelBoton.add(btnEliminar);
        dialog.add(panelBoton, BorderLayout.SOUTH);

        dialog.setVisible(true);
    }

    private void guardarLibrosEnCSV() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_CSV))) {
            for (Libro libro : listaLibros) {
                writer.println(libro.getTitulo() + "," + libro.getAutor() + "," + libro.getAnioPublicacion());
            }
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    private void cargarLibrosDesdeCSV() {
        File archivo = new File(ARCHIVO_CSV);
        if (!archivo.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 3) {
                    listaLibros.add(new Libro(datos[0], datos[1], Integer.parseInt(datos[2])));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al cargar el archivo: " + e.getMessage());
        }
    }
}