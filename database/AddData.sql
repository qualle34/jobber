INSERT INTO jobber.status values(1, 'NEW');
INSERT INTO jobber.status values(2, 'DURING');
INSERT INTO jobber.status values(3, 'COMPLETE');

INSERT INTO jobber.job_area values(1, 'Строительство');
INSERT INTO jobber.job_area values(2, 'Программирование');
INSERT INTO jobber.job_area values(3, 'Электроника');

INSERT INTO jobber.user values(1, 'Андрей', 'Андреев', 'Гродно', '+375112223344', 'andrey@gmail.com', 'qwerty1');
INSERT INTO jobber.user values(2, 'Дима', 'Димов', 'Минск', '+375112223344', 'dima@gmail.com', 'qwerty2');
INSERT INTO jobber.user values(3, 'Маша', 'Димов', 'Минск', '+375112223344', 'max.makasin@gmail.com', 'qwerty3');
INSERT INTO jobber.user values(4, 'Коля', 'Димов', 'Минск', '+375112223344', 'vova@gmail.com', 'qwerty4');
INSERT INTO jobber.user values(5, 'Дима', 'Димов', 'Минск', '+375112223344', 'anna@mail.ru', 'qwerty5');
INSERT INTO jobber.user values(6, 'Аня', 'Димов', 'Минск', '+375112223344', 'kola@gmail.com', 'qwerty6');
INSERT INTO jobber.user values(7, 'Петя', 'Димов', 'Минск', '+375112223344', 'svet34@tut.by', 'qwerty7');
INSERT INTO jobber.user values(8, 'Вася', 'Димов', 'Минск', '+375112223344', 'tanya8@gmail.com', 'qwerty8');
INSERT INTO jobber.user values(9, 'Коля', 'Димов', 'Минск', '+375112223344', 'error@gmail.com', 'qwerty9');
INSERT INTO jobber.user values(10, 'Дима', 'Димов', 'Минск', '+375112223344', 'kater@mail.ru', 'qwerty10');

INSERT INTO jobber.user_area values(1, 1);
INSERT INTO jobber.user_area values(4, 1);
INSERT INTO jobber.user_area values(2, 2);
INSERT INTO jobber.user_area values(3, 2);
  
INSERT INTO jobber.employer values(1, 'Александр Ерошин', '+375112223344', 'Текст', 'Гродно', 'anna@mail.ru', 'qwerty5');
INSERT INTO jobber.employer values(2, 'ОАО "Пинскдрев"', '+375112223344', 'Текст', 'Гомель', 'anna@mail.ru', 'qwerty5');
INSERT INTO jobber.employer values(3, 'IT-Start', '+375112223344', 'Текст', 'Минск', 'tanya8@gmail.com', 'qwerty8');
INSERT INTO jobber.employer values(4, 'UP Technologies', '+375112223344', 'Текст', 'Брест', 'error@gmail.com', 'qwerty9');
INSERT INTO jobber.employer values(5, 'Виталий Андреев', '+375112223344', 'Текст', 'Лида', 'kater@mail.ru', 'qwerty10');
INSERT INTO jobber.employer values(6, 'Ерат', '+375112223344', 'Текст', 'Лида', 'kater@mail.ru', 'qwerty10');


INSERT INTO jobber.task values(1, 5, 2, 2, 'Вульф решает проблемы', 'Мы все так или иначе сталкиваемся с проблемами в социальной сфере и экологии, решение которых не всегда зависит от нас и затягивается на долгое время. На это есть понятные причины - чтобы разобраться с большей частью задач нужны финансовые и интеллектуальные ресурсы. А что если есть возможность убрать из уравнения финансовую переменную и найти решение в виде “свободных интеллектуальных активов”?');
INSERT INTO jobber.task values(2, 5, 2, 2, 'Дом построил, дерево посадили даже яму в дороге починил', 'Как часто мы злимся и жалуемся на ямы на дороге, попадая в них на машине? Или годами мечтаем, чтобы крыши гаражей, что видны из окна сменили свой унылый серый цвет яркими красками? Как бы нам хотелось, чтобы велосипедная дорожка не обрывалась посреди чудесного парка. Одними мыслями ситуацию не изменишь, но ведь можно написать..кому?');
INSERT INTO jobber.task values(3, 5, 2, 2, 'Кто? Где? Когда?', 'Направо пойдешь – молодежь найдешь, налево пойдешь – офисных работников встретишь! Когда ресторатор выбирает место для открытия кафе, или банк принимает решение о размещении билборда для рекламы нового кредита, а городское управление планирует установку детской площадки – возникает вопрос: как выбрать “точку скопления” нужной аудитории?');
INSERT INTO jobber.task values(4, 5, 2, 2, 'Куда это деть? (Стекло, бумага, пластик)', 'Совершенно очевидно, что вопрос экологии с каждым годом становится все более злободневным и находит отклик в средцах миллионов людей. Забота об окружающей среде, участие в улучшении экологической ситуации в городе/стране – сегодгя это не просто things to do, а must-have. Термин “Eco-friendly” по популярности пришел на смену “Хипстеру” и “Пичальке”.');
INSERT INTO jobber.task values(5, 5, 2, 2, 'И швец, и жнец, и на дуде игрец', 'Каждый университет предлагает студентам массу внеучебных активностей и занятий по интересам. Но не каждый студент об этом знает. Увлекаешься робототехникой, интересно “прокачаться” в 3-D моделировании? А может быть ты талантливый баскетболист, но молчишь об этом?Учеба – свет, но не менее важно качество организации своего личного времени. Хобби – отличный вариант для свободного вечера, и почему бы не сделать это внутри своего же кампуса?');
INSERT INTO jobber.task values(6, 4, 2, 2, 'Виртуальное кадровое агентство', 'Необходимость в web-приложении, позволяющем эффективно “сводить” студента и работодателя для временной или постоянной работы сейчас актуальна как никогда. Возьмем, к примеру, Гродненский государственный университет: сейчас на дневной форме учатся 7000 студентов, и 6000 – на заочной. Каждый год 3000 выпускников ищут работу, и более 1000 компаний ждут к себе в команду молодых и талантливых специалистов.');
INSERT INTO jobber.task values(7, 1, 1, 1, 'Покрасить дом', 'Покрасить старое здание по адресу ул. Ожешко 34');
INSERT INTO jobber.task values(8, 2, 1, 2, 'Сайт приюта для собак', 'Удобный cайт приюта для собак...');
INSERT INTO jobber.task values(9, 3, 3, 2, 'Приложение Андроид', 'Ямы на дорогах...');

INSERT INTO jobber.user_task values(1, 1);
INSERT INTO jobber.user_task values(2, 1);
INSERT INTO jobber.user_task values(2, 2);
INSERT INTO jobber.user_task values(3, 3);
INSERT INTO jobber.user_task values(5, 4);
INSERT INTO jobber.user_task values(8, 4);