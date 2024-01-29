package arrayListBiblioteca;

public class Libro {
	
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public int prestar() {
        if (!prestado) {
            prestado = true;
            return 0;
        } else {
            return -1;
        }
    }

    public int devolver() {
        if (prestado) {
            prestado = false;
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("Título: ");
        str.append(this.titulo);
        str.append("\n");
        str.append("Autor: ");
        str.append(this.autor);
        str.append("\n");
        str.append("Prestado: ");
        str.append(this.prestado);
        return str.toString();
    }
}
