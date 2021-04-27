package com.example.lingo.activities;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lingo.R;

public class PresentSimpleActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_present_simple);

        textView = findViewById(R.id.tv_text);

        String text = "\nСтверджувальне речення\n" +
                "Граматичний час Present Continuous (Present Progressive) утворюється за допомогою допоміжного дієслова be у формах am, is або are та форми Present Participle (першої форми смислового дієслова з закінченням -ing).\n" +
                "\n" +
                "Вибір необхідної форми допоміжного дієслова залежить від підмета.\n" +
                "\n" +
                "I → am (про себе)\n" +
                "He, she, it → is (підмет виражений іменником або займенником в однині)\n" +
                "You, we, they → are (підмет виражений іменником або займенником в множині або займенником you)\n" +
                "I am speaking over the telephone. – Я розмовляю по телефону.\n" +
                "She is watching TV now. – Вона зараз дивиться телевізор.\n" +
                "They are walking down the street. – Вони прогулюються вниз вулицею.\n" +
                "She’s working now. – Вона зараз працює.\n" +
                "We’re cleaning the house. – Ми прибираємось у будинку.\n" +
                "Скорочення з дієсловом to be\n" +
                "\n" +
                "I am = I’m\n" +
                "He is = He’s\n" +
                "She is = She’s\n" +
                "It is = It’s\n" +
                "You are= You’re\n" +
                "We are = We’re\n" +
                "They are = They’re\n" +
                "Всі правила додавання закінчення -ing детально розглянуті в окремій статті.\n" +
                "\n" +
                "to enter → entering\n" +
                "to lie → lying\n" +
                "to take → taking\n" +
                "to agree → agreeing\n" +
                "to say → saying\n" +
                "to relax → relaxing\n" +
                "to run → running\n" +
                "to travel → travelling / traveling" +
                "\n\n\nЗаперечне речення\n" +
                "Заперечне речення в Present Continuous утворюється за допомогою заперечної частки not, що ставиться після допоміжного дієслова am, is або are. Загальний порядок слів при цьому не змінюється.\n" +
                "\n" +
                "I am not playing the guitar now. – Я зараз не граю на гітарі.\n" +
                "She is not watching TV now. – Вона зараз не дивиться телевізор.\n" +
                "is not = isn’t\n" +
                "Kate isn’t studying at the moment. – Кейт не вчиться в цей момент.\n" +
                "are not = aren’t\n" +
                "They aren’t talking about it. – Вони не розмовляють про це.\n" +
                "\n\n\nПитальне речення\n" +
                "Загальне питання в Present Continuous утворюється шляхом винесення допоміжного дієслова am, is або are на початок речення перед підметом.\n" +
                "\n" +
                "Am I speaking over the telephone? – Я розмовляю по телефону (зараз)?\n" +
                "Is she watching TV now? – Вона дивиться зараз телевізор?\n" +
                "Are they walking down the street? – Вони йдуть вниз вулицею?\n" +
                "Спеціальне питання в Present Continuous утворюється за допомогою питального слова або фрази, що ставиться на початок речення перед допоміжним дієсловом. Подальший порядок слів такий самий, як і в загальному питанні для Present Continuous.\n" +
                "\n" +
                "What am I doing now? – Що я зараз роблю?\n" +
                "What is she watching now? – Що вона зараз дивиться?\n" +
                "Where are they walking? – Де вони прогулюються?\n" +
                "\n\n\nВикористання Present Continuous\n" +
                "\nДії, що відбуваються зараз\n" +
                "Present Continuous використовується для вираження певної дії, що відбувається прямо зараз, в момент говоріння. Також Present Continuous вказує на одночасні дії, що відбуваються саме в цей момент.\n" +
                "\n" +
                "He’s playing the piano now. – Він зараз грає на піаніно.\n" +
                "I’m washing my clothes at the moment. – Я перу свій одяг в цей момент.\n" +
                "They’re repairing the car right now. – Вони ремонтують машину прямо зараз.\n" +
                "I’m working and Ann is cooking now. – Я працюю зараз, а Енн займається приготуванням їжі.\n" +
                "\n\n\nДії around now\n" +
                "Present Continuous використовується для вираження тимчасової дії, що відбувається не в даний момент часу, а загалом в найближчий часовий проміжок – «around now» (приблизно в цей час).\n" +
                "\n" +
                "She’s preparing for her next week exam. – Вона готується до екзамену, що буде на наступному тижні. (Вона, можливо, не готується до нього прямо зараз, але готувалася та буде до нього готуватися скоро, найближчим часом)\n" +
                "My brother is looking for a job these days. – Мій брат зараз шукає роботу. (Не факт, що він зайнятий пошуками прямо зараз, але загалом, він шукає роботу)\n" +
                "I’m waiting for the parcel coming soon. – Я чекаю на пакунок, що скоро прийде. (Я чекаю на нього загалом, не в цей конкретний момент)\n" +
                "\n\n\nПлани на найближче майбутнє\n" +
                "За допомогою Present Continuous виражаються дії, що були заплановані на найближче майбутнє, особливо якщо час та місце виконання дії заздалегідь відомі та сплановані.\n" +
                "\n" +
                "They’re moving to Kyiv next Monday. – Вони переїжджають до Києва наступного понеділка.\n" +
                "I’m going to the seaside this evening. – Я їду на море сьогодні ввечері.\n" +
                "Kate and I are playing our new concert tonight. – Сьогодні ввечері ми з Кейт граємо наш новий концерт.\n" +
                "\n\n\nОбставини, що змінюються\n" +
                "Present Continuous використовується для вираження ситуацій, що розвиваються або змінюються, тобто для вираження певних тенденцій.\n" +
                "\n" +
                "More men are taking paternity leave nowadays. – В наш час все більше чоловіків беруть декретну відпустку.\n" +
                "This tree is growing so fast. – Це дерево росте так швидко.\n" +
                "The weather is changing so unexpectedly these days. – Останнім часом погода змінюється так неочікувано.\n" +
                "\n\n\nНегативние ставлення до дій\n" +
                "Ми можемо використовувати Present Continuous для вираження свого ставлення до дій, що відбуваються постійно, або характеру певної людини, коли вони визивають в нас гнів (anger), роздратування (irritation) або вони нам докучають (annoy). Часто в таких реченнях використовуються слова always (завжди), constantly (постійно, без упину), continually (безперервно).\n" +
                "\n" +
                "You’re always interrupting me when I’m trying to tell this story. – Ти постійно мене перебиваєш, коли я намагаюсь розповісти цю історію.\n" +
                "He’s constantly losing our keys on the vacation. – На відпочинку він постійно губить наші ключі.\n" +
                "I’m always getting ill after this ice-cream. – Я постійно хворію після цього морозива.\n" +
                "\n\n\nМаркери часу\n" +
                "Present Continuous використовується з певними словами та виразами, що вказують на певний відомий момент або проміжок часу, в який відбувається дія.\n" +
                "\n" +
                "now – зараз\n" +
                "right now – прямо зараз\n" +
                "still – все ще\n" +
                "currently – тепер, в цей час\n" +
                "at the moment – в цей момент\n" +
                "at present – в теперішній час\n" +
                "this morning – цього ранку, цим ранком\n" +
                "this evening – цього вечора\n" +
                "this afternoon – сьогодні після обіду\n" +
                "today – сьогодні (удень)\n" +
                "tonight – сьогодні (ввечері)\n" +
                "these days – на днях\n" +
                "nowadays – в наші дні";

        textView.setText(text);

        textView.setMovementMethod(new ScrollingMovementMethod());

    }
}