package src;

/*
 * Uma classe que recebe os parametros para construir 
 * o gráfico de pizza 
 * @author Igor M. Padua e Adriel L. V. Mori
 */

import java.util.ArrayList;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Grafico extends JFrame{

	public Grafico(String nomeEmpresa,int[] emEstoque, String[] produtos
			, int total) {
		super("Ocupação do Estoque");
			
		//armazena o que quer mostrar no gráfico
		DefaultPieDataset pieDataset = new DefaultPieDataset();
			
		//Adicionando no gráfico por relação a %
		for(int i=0; i<total; i++) {
			pieDataset.setValue(produtos[i], new Integer(emEstoque[i]));
		}
			
		//Cria o objeto 
		JFreeChart grafico = ChartFactory.createPieChart(//gráfico de pizza da biblioteca
				"Ocupação do Estoque: " + nomeEmpresa,
				pieDataset,
				true, //para mostrar legendas
				true, //para mostrar tooltips
				false);
					
		this.add(new ChartPanel (grafico)); //adicinando no frama
			
		this.pack();//ajusta/cria o tamanho de acordo com os componentes no Frame
	}

}
