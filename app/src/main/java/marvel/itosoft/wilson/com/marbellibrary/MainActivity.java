package marvel.itosoft.wilson.com.marbellibrary;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
public class MainActivity extends ListActivity implements View.OnClickListener {


    protected ArrayList <HashMap<String,String>> mSuperHeroes = new ArrayList <HashMap<String, String>>();

    //HashMap de nombres
    //[{1,"Wilson"},{2,"Andres"}]


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mSuperHeroes.add(crearSuperHeroe("super_heroe","Batman"));
        mSuperHeroes.add(crearSuperHeroe("super_heroe","Iron-Man"));
        mSuperHeroes.add(crearSuperHeroe("super_heroe","Hulk"));
        mSuperHeroes.add(crearSuperHeroe("super_heroe","Spider-Man"));
        mSuperHeroes.add(crearSuperHeroe("super_heroe","Super-Man"));
        mSuperHeroes.add(crearSuperHeroe("super_heroe","Thor"));
        mSuperHeroes.add(crearSuperHeroe("super_heroe","X-Men"));
        mSuperHeroes.add(crearSuperHeroe("super_heroe","Captain America"));
        mSuperHeroes.add(crearSuperHeroe("super_heroe","Ghost-Rider"));
        mSuperHeroes.add(crearSuperHeroe("super_heroe","Black Panther"));
        mSuperHeroes.add(crearSuperHeroe("super_heroe","Daredevil"));
        mSuperHeroes.add(crearSuperHeroe("super_heroe","Star Wars"));
        mSuperHeroes.add(crearSuperHeroe("super_heroe","Gamora"));
        mSuperHeroes.add(crearSuperHeroe("super_heroe","Deadpool"));
        mSuperHeroes.add(crearSuperHeroe("super_heroe","Nova"));


        SimpleAdapter adapter = new SimpleAdapter(this,this.mSuperHeroes,android.R.layout.simple_list_item_1,
                new String[] {"super_heroe"},new int[] {android.R.id.text1});

        setListAdapter(adapter);
    }

    private HashMap<String,String> crearSuperHeroe(String clave, String valor){
        HashMap<String,String> hashMapSuperHeroe = new HashMap<String, String>();
        hashMapSuperHeroe.put(clave, valor);
        return hashMapSuperHeroe;
    }



    @Override
    public void onClick(View view) {





    }
}
    
       /* 
       Button boton = (Button) findViewById(R.id.boton);

        boton.setOnClickListener(this);
        @Override
    public void onClick(View view) {
        
       Toast toast = Toast.makeText(getApplicationContext(),"Loading...",Toast.LENGTH_LONG);
        toast.show();
    }*/

