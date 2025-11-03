
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cuestionario {
    private List<Pregunta> categoriaCiencia;
    private List<Pregunta> categoriaHistoria;


    public Cuestionario() {
        categoriaCiencia = new ArrayList<>();
        categoriaHistoria = new ArrayList<>();

        
        agregarPreguntasCategoriaCiencia();
        agregarPreguntasCategoriaHistoria();
    }

    private void agregarPreguntasCategoriaCiencia() {
        categoriaCiencia.add(new Pregunta("¿Cuál es la sustancia química que las plantas utilizan para la fotosíntesis?", new String[]{"Oxígeno", "Dióxido de carbono", "Clorofila", "Glucosa"}, 2));
        categoriaCiencia.add(new Pregunta("¿Cuál es el planeta más grande del sistema solar?", new String[]{"Tierra", "Marte", "Júpiter", "Saturno"}, 2));
        categoriaCiencia.add(new Pregunta("¿Cómo se llama la capa externa de la Tierra?", new String[]{"Núcleo", "Manto", "Corteza", "Litosfera"}, 2));
        categoriaCiencia.add(new Pregunta("¿Qué tipo de sangre es el donante universal?", new String[]{"Tipo A", "Tipo B", "Tipo AB", "Tipo O"}, 3));
        categoriaCiencia.add(new Pregunta("¿Cuál es el elemento químico con símbolo 'Fe'?", new String[]{"Fósforo", "Hierro", "Flúor", "Francio"}, 1));
        categoriaCiencia.add(new Pregunta("¿Qué es un año luz?", new String[]{"La distancia que la luz recorre en un año", "El tiempo que tarda la luz en llegar al sol", "La velocidad de la luz en un año", "La energía generada por el sol en un año"}, 0));
        categoriaCiencia.add(new Pregunta("¿Qué órgano del cuerpo humano produce insulina?", new String[]{"Estómago", "Hígado", "Páncreas", "Riñón"}, 2));
        categoriaCiencia.add(new Pregunta("¿Qué gas es el principal responsable del cambio climático?", new String[]{"Oxígeno", "Dióxido de carbono", "Nitrógeno", "Metano"}, 1));
        categoriaCiencia.add(new Pregunta("¿Qué planeta es conocido como el 'planeta rojo'?", new String[]{"Venus", "Marte", "Saturno", "Júpiter"}, 1));
        categoriaCiencia.add(new Pregunta("¿Cuál es el órgano más grande del cuerpo humano?", new String[]{"Corazón", "Hígado", "Piel", "Pulmones"}, 2));
        categoriaCiencia.add(new Pregunta("¿Cómo se llama el proceso mediante el cual las células obtienen energía de los alimentos?", new String[]{"Fotosíntesis", "Respiración celular", "Reproducción celular", "Digestión"}, 1));
        categoriaCiencia.add(new Pregunta("¿Qué tipo de energía produce el Sol?", new String[]{"Energía eléctrica", "Energía térmica", "Energía mecánica", "Energía luminosa"}, 1));
        categoriaCiencia.add(new Pregunta("¿Qué tipo de onda es la luz visible?", new String[]{"Onda electromagnética", "Onda sonora", "Onda gravitacional", "Onda acústica"}, 0));
        categoriaCiencia.add(new Pregunta("¿Qué descubrimiento científico hizo Marie Curie?", new String[]{"Teoría de la relatividad", "Ley de la gravedad", "Radiación y radiactividad", "Ley de la conservación de la masa"}, 2));
        categoriaCiencia.add(new Pregunta("¿Qué partícula subatómica tiene una carga negativa?", new String[]{"Protones", "Neutrones", "Electrones", "Quarks"}, 2));
        categoriaCiencia.add(new Pregunta("¿Cuál es el proceso por el cual las células se dividen para formar dos células hijas?", new String[]{"Mitósis", "Meiosis", "Fagocitosis", "Fisión binaria"}, 0));
        categoriaCiencia.add(new Pregunta("¿Qué elemento tiene el número atómico 79?", new String[]{"Plata", "Oro", "Plomo", "Cobre"}, 1));
        categoriaCiencia.add(new Pregunta("¿Quién desarrolló la teoría de la relatividad general?", new String[]{"Isaac Newton", "Albert Einstein", "Niels Bohr", "Erwin Schrödinger"}, 1));
        categoriaCiencia.add(new Pregunta("¿Cuál es la distancia aproximada de la Tierra al Sol?", new String[]{"150 millones de kilómetros", "200 millones de kilómetros", "100 millones de kilómetros", "50 millones de kilómetros"}, 0));
        categoriaCiencia.add(new Pregunta("¿En qué capa de la atmósfera ocurre el fenómeno de la aurora boreal?", new String[]{"Estratósfera", "Troposfera", "Mesósfera", "Termósfera"}, 3));
        categoriaCiencia.add(new Pregunta("¿Qué es el Bosón de Higgs?", new String[]{"Una partícula elemental", "Una estrella de neutrones", "Un agujero negro", "Una teoría de cuerdas"}, 0));
        categoriaCiencia.add(new Pregunta("¿En qué parte del cuerpo humano se encuentra la glándula pineal?", new String[]{"Cerebro", "Corazón", "Riñones", "Hígado"}, 0));
        categoriaCiencia.add(new Pregunta("¿Qué teoría explica la formación del universo desde su origen hasta la actualidad?", new String[]{"Teoría cuántica", "Teoría de la relatividad", "Teoría del Big Bang", "Teoría de cuerdas"}, 2));
        categoriaCiencia.add(new Pregunta("¿Qué tipo de células son responsables de la respuesta inmune en el cuerpo humano?", new String[]{"Glóbulos rojos", "Plaquetas", "Glóbulos blancos", "Células madre"}, 2));
   
    }

    private void agregarPreguntasCategoriaHistoria() {
        categoriaHistoria.add(new Pregunta("¿Quién fue el primer presidente de los Estados Unidos?", new String[]{"George Washington", "Abraham Lincoln", "Thomas Jefferson", "John Adams"}, 0));
        categoriaHistoria.add(new Pregunta("¿En qué año llegó Cristóbal Colón a América?", new String[]{"1490", "1492", "1500", "1512"}, 1));
        categoriaHistoria.add(new Pregunta("¿Quién pintó la Mona Lisa?", new String[]{"Miguel Ángel", "Leonardo da Vinci", "Rafael", "Donatello"}, 1));
        categoriaHistoria.add(new Pregunta("¿En qué año terminó la Segunda Guerra Mundial?", new String[]{"1943", "1944", "1945", "1946"}, 2));
        categoriaHistoria.add(new Pregunta("¿Qué civilización construyó las pirámides de Egipto?", new String[]{"Romanos", "Mayas", "Aztecas", "Egipcios"}, 3));
        categoriaHistoria.add(new Pregunta("¿Cuál es el nombre de la famosa ruta comercial que conectaba Asia con Europa?", new String[]{"Ruta de las Especias", "Ruta del Oro", "Ruta de la Seda", "Ruta de los Caballos"}, 2));
        categoriaHistoria.add(new Pregunta("¿En qué país se originaron los Juegos Olímpicos?", new String[]{"Roma", "Egipto", "China", "Grecia"}, 3));
        categoriaHistoria.add(new Pregunta("¿Quién fue el emperador romano en el momento de la caída del Imperio Romano de Occidente?", new String[]{"Julio César", "Nerón", "Rómulo Augústulo", "César Augusto"}, 2));
        categoriaHistoria.add(new Pregunta("¿En qué año comenzó la Revolución Francesa?", new String[]{"1789", "1776", "1800", "1799"}, 0));
        categoriaHistoria.add(new Pregunta("¿Qué imperio fue derrotado en la batalla de Lepanto en 1571?", new String[]{"Imperio Romano", "Imperio Bizantino", "Imperio Otomano", "Imperio Persa"}, 2));
        categoriaHistoria.add(new Pregunta("¿Qué país fue la cuna de la democracia en la antigua Grecia?", new String[]{"Roma", "Esparta", "Atenas", "Tebas"}, 2));
        categoriaHistoria.add(new Pregunta("¿Qué tratado puso fin a la Primera Guerra Mundial?", new String[]{"Tratado de París", "Tratado de Versalles", "Tratado de Tordesillas", "Tratado de Utrecht"}, 1));
        categoriaHistoria.add(new Pregunta("¿Qué civilización antigua es conocida por la creación del alfabeto?", new String[]{"Egipcios", "Fenicios", "Sumerios", "Mayas"}, 1));
        categoriaHistoria.add(new Pregunta("¿Qué rey francés construyó el Palacio de Versalles?", new String[]{"Luis XIV", "Luis XVI", "Enrique IV", "Carlos X"}, 0));
        categoriaHistoria.add(new Pregunta("¿En qué año se firmó el Tratado de Westfalia, que puso fin a la Guerra de los Treinta Años?", new String[]{"1648", "1639", "1651", "1625"}, 0));
        categoriaHistoria.add(new Pregunta("¿Qué imperio fue derrotado en la Batalla de Waterloo?", new String[]{"Imperio Romano", "Imperio Napoleónico", "Imperio Austrohúngaro", "Imperio Otomano"}, 1));
        categoriaHistoria.add(new Pregunta("¿Qué faraón egipcio mandó construir la Gran Pirámide de Giza?", new String[]{"Ramsés II", "Tutankamón", "Keops", "Amenofis IV"}, 2));
        categoriaHistoria.add(new Pregunta("¿Quién fue el principal arquitecto de la Revolución Industrial?", new String[]{"Adam Smith", "Karl Marx", "James Watt", "Henry Ford"}, 2));
        categoriaHistoria.add(new Pregunta("¿Qué país fue el primero en otorgar el voto a las mujeres?", new String[]{"Estados Unidos", "Nueva Zelanda", "Reino Unido", "Francia"}, 1));
        categoriaHistoria.add(new Pregunta("¿Qué tratado puso fin a la Primera Guerra Mundial?", new String[]{"Tratado de París", "Tratado de Tordesillas", "Tratado de Versalles", "Tratado de Utrecht"}, 2));
        categoriaHistoria.add(new Pregunta("¿En qué fecha comenzó la Revolución Rusa?", new String[]{"1917", "1905", "1914", "1922"}, 0));
        categoriaHistoria.add(new Pregunta("¿Qué presidente de los Estados Unidos fue responsable de la compra de Louisiana?", new String[]{"George Washington", "Thomas Jefferson", "Abraham Lincoln", "James Madison"}, 1));
        categoriaHistoria.add(new Pregunta("¿En qué guerra lucharon las fuerzas aliadas contra la Alemania nazi durante la Segunda Guerra Mundial?", new String[]{"Guerra de Corea", "Guerra del Pacífico", "Guerra Fría", "Campaña de Europa Occidental"}, 3));
        categoriaHistoria.add(new Pregunta("¿Qué imperio fue conocido por sus logros en ingeniería civil y construcción de carreteras?", new String[]{"Imperio Romano", "Imperio Persa", "Imperio Azteca", "Imperio Mongol"}, 0));
    }
    

    public List<Pregunta> obtenerPreguntasAleatorias(String categoria) {
        List<Pregunta> seleccion;

        if (categoria.equals("Ciencia")) {
            seleccion = new ArrayList<>(categoriaCiencia);
        } else {
            seleccion = new ArrayList<>(categoriaHistoria);
        }

        Collections.shuffle(seleccion);

        // Validar que la lista tenga al menos 7 elementos
        int cantidadPreguntas = Math.min(seleccion.size(), 7);
        return seleccion.subList(0, cantidadPreguntas);
    }

}
