package daniellopes.t.listadeprodutos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import daniellopes.t.listadeprodutos.Model.Produto;

public class MainActivity extends AppCompatActivity {

    private ListView listaProdutos;
    private List<Produto> produtos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bind();
        produtos = todosOsProdutos();
        criaAdapter();

    }

    private void bind() {
        listaProdutos = findViewById(R.id.lista_de_produtos_activity);
    }

    private List<Produto> todosOsProdutos(){
        return new ArrayList<>(Arrays.asList(
                new Produto("Maça", 1.99),
                new Produto("Banana",2.98),
                new Produto("Abacate",5.99),
                new Produto("Melancia",10.98)
        ));
    }

    private void criaAdapter() {
        ArrayAdapter<Produto> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, produtos);
        listaProdutos.setAdapter(adapter);
    }
}
