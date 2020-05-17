package aula09;

public class Livro implements Publicacao {
	//  Variáveis
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	//  Métodos públicos
	public String detalhes() {
		return "Livro{titulo=" + this.getTitulo() + ", autor=" + this.getAutor() + ", totPaginas=" + this.getTotPaginas() + ", pagAtual=" + this.getPagAtual() + ", aberto=" + this.isAberto() + ", leitor=" + this.getLeitor().getNome() + "}";
	}
	//  Métodos sobrepostos
	@Override
	public void abrir() {this.setAberto(true);}
	@Override
	public void fechar() {this.setAberto(false);}
	@Override
	public void folhear(int pagina) {this.setPagAtual(pagina);}
	@Override
	public void avancarPag() {this.setPagAtual(this.getPagAtual() + 1);}
	@Override
	public void voltarPag() {this.setPagAtual(this.getPagAtual() - 1);}
	//  Métodos especias
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setTotPaginas(totPaginas);
		this.setPagAtual(0);
		this.setAberto(false);
		this.setLeitor(leitor);
	}
	public String getTitulo() {return this.titulo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public String getAutor() {return this.autor;}
	public void setAutor(String autor) {this.autor = autor;}
	public int getTotPaginas() {return this.totPaginas;}
	public void setTotPaginas(int totPaginas) {this.totPaginas = totPaginas;}
	public int getPagAtual() {return this.pagAtual;}
	public void setPagAtual(int pagAtual) {this.pagAtual = pagAtual;}
	public boolean isAberto() {return this.aberto;}
	public void setAberto(boolean aberto) {this.aberto = aberto;}
	public Pessoa getLeitor() {return this.leitor;}
	public void setLeitor(Pessoa leitor) {this.leitor = leitor;}
}
