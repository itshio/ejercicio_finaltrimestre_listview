package com.example.ejercicio_finaltrimestre_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvprincipal;
    ArrayList<Perro> lista_perros= new ArrayList<Perro>();
    TextView txtcolor, txtaltura, txtpeso;
    ImageView imgperro;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtcolor=(TextView)findViewById(R.id.txt_color);
        txtpeso=(TextView)findViewById(R.id.txt_peso);
        txtaltura=(TextView)findViewById(R.id.txt_altura);
        imgperro=(ImageView)findViewById(R.id.img_principal);

        cargarperros();

        lvprincipal=(ListView)findViewById(R.id.lv_perros);
        Adaptadorperros adaptador_perretes= new Adaptadorperros(this, lista_perros);
        lvprincipal.setAdapter(adaptador_perretes);

        lvprincipal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Perro c =((Perro)parent.getItemAtPosition(position));
                String peso= c.getPeso();
                String altura= c.getAltura();
                String color=c.getColor();
                String foto=c.getFoto();






                txtaltura.setText("Altura: "+altura);
                txtpeso.setText("Peso: "+peso);
                txtcolor.setText("Color: "+color);


                int idfoto = getApplicationContext().getResources().getIdentifier(foto,"drawable",getApplicationContext().getPackageName());


                imgperro.setImageResource(idfoto);



            }





        });

        lvprincipal.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Perro c= ((Perro)parent.getItemAtPosition(position));
                String Nombre=c.getNombre();


                toast(Nombre);










                return true;
            }
        });











    }//ON CREATE

    private void cargarperros (){


        lista_perros.add(new Perro("Negro, Chocolate, Amarillo", " Macho: 29–36 kg, Hembra: 25–32 kg","Macho: 57–62 cm, Hembra: 55–60 cm","Labrador retriever","labrador"));

        lista_perros.add(new Perro("Negro, Bronceado, Caoba", "Hembra: 35–48 kg, Macho: 50–60 kg","Hembra: 56–63 cm, Macho: 61–69 cm","Rottweiler","rotweiller"));

        lista_perros.add(new Perro("Limón y blanco, Tricolor, Blanco y tostado, Rojo y blanco, Marrón y blanco, Chocolate tricolor, Blanco y naranja",
                "Macho: 10–11 kg, Hembra: 9–10 kg","Macho: 36–41 cm, Hembra: 33–38 cm","Beagle","beagle"));

        lista_perros.add(new Perro("Blanco, Cervato, Piebald, Atigrado y blanco, Beige y blanco, Rojo, Rojo atigrado, Rojo y blanco",
                "Hembra: 18–23 kg, Macho: 23–25 kg","Hembra: 31–40 cm, Macho: 31–40 cm","Bulldog","bulldog"));

        lista_perros.add(new Perro(" Crema, Oro oscuro, Dorado claro, Dorado", "Hembra: 25–32 kg, Macho: 30–34 kg","Hembra: 51–56 cm, Macho: 56–61 cm","Golden retriever","golden"));

        lista_perros.add(new Perro("Pelaje atigrado, Cervato, Negro, Azul, Manto, Arlequín",
                "Hembra: 45–59 kg, Macho: 54–90 kg","Hembra: 71–81 cm, Macho: 76–86 cm","Gran danés","danes"));

        lista_perros.add(new Perro("Blanco, Negro, Cervato, Azul, Rojo, Negro y fuego, Fawn & Rust, Red & Rust, Blue & Rust",
                "Macho: 40–45 kg, Hembra: 32–35 kg","Macho: 66–72 cm, Hembra: 61–68 cm","Dóberman","doberman"));

        lista_perros.add(new Perro("Agutí, Blanco, Negro, Piebald, Negro y canela, Blanco con manto, Negro y blanco, Rojo, Plateado, Cobre, Café, Gris",
                "Hembra: 16–23 kg, Macho: 20–27 kg","Hembra: 50–56 cm, Macho: 54–60 cm","Husky siberiano","husky"));

        lista_perros.add(new Perro("Pelaje atigrado, Cervato, Albaricoque (color)", "Hembra: 54–77 kg, Macho: 73–100 kg","Hembra: 70–91 cm, Macho: 70–91 cm","Mastín inglés","mastin"));

        lista_perros.add(new Perro("Negro, Cervato, Azul, Crema, Rojo", "Macho: 25–32 kg, Hembra: 20–27 kg","Macho: 48–56 cm, Hembra: 46–51 cm","Chow Chow","chow"));

        lista_perros.add(new Perro("Golden Rust, Dorado, Red Golden", "Macho: 20–29 kg, Hembra: 18–25 kg","Macho: 56–64 cm, Hembra: 53–61 cm","Vizsla","vizsla"));

        lista_perros.add(new Perro("Azul, Lila, Negro, Blanco, Pelaje atigrado, Rojo mirlo, Sable merle, Chocolate, Sable, Hígado, Azul mirlo, Rojo, Dorado",
                "Macho: 14–20 kg, Hembra: 12–19 kg","Macho: 48–56 cm, Hembra: 46–53 cm","Border collie","border"));

        lista_perros.add(new Perro("Dilución merlé, Negro, Rojo mirlo, Rojo tricolor, Negro tricolor, Azul mirlo, Rojo", "Macho: 25–32 kg, Hembra: 16–25 kg","Macho: 51–58 cm, Hembra: 46–54 cm","Pastor ovejero australiano","pastor"));

        lista_perros.add(new Perro("Negro, Pelaje atigrado, Blanco, Cervato, Azul, Rojo", "Macho: 27–40 kg, Hembra: 26–34 kg","Macho: 71–76 cm, Hembra: 68–71 cm","Galgo inglés","galgo"));

        lista_perros.add(new Perro("Negro, Hígado, Limón y blanco, Negro y blanco, Hígado y blanco, Blanco y naranja",
                "Hembra: 16–30 kg, Macho: 18–34 kg","Hembra: 53–66 cm, Macho: 56–70 cm","Pointer inglés","pointer"));


    }


    private void toast (String mensaje){

        Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_LONG).show();


    }



}//NO BORRAR
