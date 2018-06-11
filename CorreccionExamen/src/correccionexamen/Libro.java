package correccionexamen;
/**
 *
 * @author Oswaldo
 */
public class Libro {
    
    private String titulo;
    private Autor [] autor;
    private int año;
    private boolean favorito;

    public Libro(String titulo, Autor [] autor, int año, boolean favorito) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.favorito = favorito;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor[] getAutor() {
        return autor;
    }

    public void setAutor(Autor[] autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
    
    @Override
    public String toString() {
        return "Titulo: " + this.titulo + "\nNombre de autor: " + this.autor + "\nAño: "+this.año;
        
    }
}
