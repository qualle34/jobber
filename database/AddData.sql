INSERT INTO jobber.status(name) values('NEW');
INSERT INTO jobber.status(name) values('DURING');
INSERT INTO jobber.status(name) values('COMPLETE');

INSERT INTO jobber.role(value) values('USER');
INSERT INTO jobber.role(value) values('EMPLOYER');
INSERT INTO jobber.role(value) values('ADMIN');

INSERT INTO jobber.area(name) values('Строительство');
INSERT INTO jobber.area(name) values('Программирование');
INSERT INTO jobber.area(name) values('Электроника');
INSERT INTO jobber.area(name) values('Менеджмент');
INSERT INTO jobber.area(name) values('Архитектура');
INSERT INTO jobber.area(name) values('Машиностроение');

INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Андрей', 'Андреев', 'Гродно', '+375112223344', 'andrey@gmail.com', 1);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Дима', 'Димов', 'Минск', '+375112223344', 'dima@gmail.com', 1);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Маша', 'Димов', 'Брест', '+375112223344', 'max.makasin@gmail.com', 1);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Коля', 'Димов', 'Гомель', '+375112223344', 'vova@gmail.com', 1);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Дима', 'Димов', 'Лида', '+375112223344', 'anna@mail.ru', 1);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Аня', 'Димов', 'Минск', '+375112223344', 'kola@gmail.com', 1);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Петя', 'Димов', 'Брест', '+375112223344', 'svet34@tut.by', 1);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Вася', 'Димов', 'Лида', '+375112223344', 'tanya8@gmail.com', 1);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Коля', 'Димов', 'Гомель', '+375112223344', 'error@gmail.com', 1);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Дима', 'Димов', 'Минск', '+375112223344', 'kater@mail.ru', 1);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Александр', 'Ерошин', 'Минск', '+375112223344', 'dsfgsdf@mail.ru', 2);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Евгений', 'Ерошин', 'Брест', '+375112223344', 'sdfgsdf@mail.ru', 2);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Андрей', 'Ерошин', 'Лида', '+375112223344', 'sdfgsdfg@mail.ru', 2);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Олег', 'Ерошин', 'Минск', '+375112223344', 'wertwer@mail.ru', 2);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Анна', 'Ерошин', 'Лида', '+375112223344', 'sdfgsd@mail.ru', 2);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Евгений', 'Ерошин', 'Гомель', '+375112223344', 'rethdfg@mail.ru', 2);
INSERT INTO jobber.user(firstname, lastname, location, phone, email, role_id) values('Admin', 'Admin', 'Admin', '+123', '123@mail.ru', 3);

INSERT INTO jobber.employer(title, description, user_id) values('Александр Ерошин', 'Текст', 11);
INSERT INTO jobber.employer(title, description, user_id) values('ОАО "Пинскдрев"', 'Текст', 12);
INSERT INTO jobber.employer(title, description, user_id) values('IT-Start', 'Текст', 13);
INSERT INTO jobber.employer(title, description, user_id) values('UP Technologies', 'Текст', 14);
INSERT INTO jobber.employer(title, description, user_id) values('Виталий Андреев', 'Текст', 15);
INSERT INTO jobber.employer(title, description, user_id) values('Ерат', 'Текст', 16);

INSERT INTO jobber.credentials values(1, 'andrey', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(2, 'dima', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(3, 'max', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(4, 'vova', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(5, 'anna', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(6, 'kola', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(7, 'svet34', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(8, 'tanya8', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(9, 'error', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(10, 'kater', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(11, 'ae', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(12, 'pinsk', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(13, 'it', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(14, 'tech', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(15, 'vit', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(16, 'erat', '$2a$10$w9Xvn7V.w6XTMoCrLyPIX.X/gnSaSavaRhO2yVEFNwrlb4kqj4jhe');
INSERT INTO jobber.credentials values(17, 'admin', '$2a$10$dt1Jmg.w/sgjVSo2u7Vks.CD6wOGe2PqX.vB9uVPfVswyIeS99/46');

INSERT INTO jobber.user_area values(1, 1);
INSERT INTO jobber.user_area values(2, 1);
INSERT INTO jobber.user_area values(3, 2);
INSERT INTO jobber.user_area values(4, 2);
INSERT INTO jobber.user_area values(5, 3);
INSERT INTO jobber.user_area values(6, 3);
INSERT INTO jobber.user_area values(7, 4);
INSERT INTO jobber.user_area values(8, 5);
INSERT INTO jobber.user_area values(9, 6);
INSERT INTO jobber.user_area values(10, 6);

INSERT INTO jobber.image(link) values('/img/1.jpg');

INSERT INTO jobber.task(employer_id, status_id, area_id, image_id, title, description) values(5, 2, 2, 1, 'Вульф решает проблемы', 'Мы все так или иначе сталкиваемся с проблемами в социальной сфере и экологии, решение которых не всегда зависит от нас и затягивается на долгое время. На это есть понятные причины - чтобы разобраться с большей частью задач нужны финансовые и интеллектуальные ресурсы. А что если есть возможность убрать из уравнения финансовую переменную и найти решение в виде “свободных интеллектуальных активов”?');
INSERT INTO jobber.task(employer_id, status_id, area_id, image_id, title, description) values(5, 2, 2, 1, 'Дом построил, дерево посадили даже яму в дороге починил', 'Как часто мы злимся и жалуемся на ямы на дороге, попадая в них на машине? Или годами мечтаем, чтобы крыши гаражей, что видны из окна сменили свой унылый серый цвет яркими красками? Как бы нам хотелось, чтобы велосипедная дорожка не обрывалась посреди чудесного парка. Одними мыслями ситуацию не изменишь, но ведь можно написать..кому?');
INSERT INTO jobber.task(employer_id, status_id, area_id, image_id, title, description) values(5, 2, 2, 1, 'Кто? Где? Когда?', 'Направо пойдешь – молодежь найдешь, налево пойдешь – офисных работников встретишь! Когда ресторатор выбирает место для открытия кафе, или банк принимает решение о размещении билборда для рекламы нового кредита, а городское управление планирует установку детской площадки – возникает вопрос: как выбрать “точку скопления” нужной аудитории?');
INSERT INTO jobber.task(employer_id, status_id, area_id, image_id, title, description) values(5, 2, 2, 1, 'Куда это деть? (Стекло, бумага, пластик)', 'Совершенно очевидно, что вопрос экологии с каждым годом становится все более злободневным и находит отклик в средцах миллионов людей. Забота об окружающей среде, участие в улучшении экологической ситуации в городе/стране – сегодгя это не просто things to do, а must-have. Термин “Eco-friendly” по популярности пришел на смену “Хипстеру” и “Пичальке”.');
INSERT INTO jobber.task(employer_id, status_id, area_id, image_id, title, description) values(5, 2, 2, 1, 'И швец, и жнец, и на дуде игрец', 'Каждый университет предлагает студентам массу внеучебных активностей и занятий по интересам. Но не каждый студент об этом знает. Увлекаешься робототехникой, интересно “прокачаться” в 3-D моделировании? А может быть ты талантливый баскетболист, но молчишь об этом?Учеба – свет, но не менее важно качество организации своего личного времени. Хобби – отличный вариант для свободного вечера, и почему бы не сделать это внутри своего же кампуса?');
INSERT INTO jobber.task(employer_id, status_id, area_id, image_id, title, description) values(4, 2, 2, 1, 'Виртуальное кадровое агентство', 'Необходимость в web-приложении, позволяющем эффективно “сводить” студента и работодателя для временной или постоянной работы сейчас актуальна как никогда. Возьмем, к примеру, Гродненский государственный университет: сейчас на дневной форме учатся 7000 студентов, и 6000 – на заочной. Каждый год 3000 выпускников ищут работу, и более 1000 компаний ждут к себе в команду молодых и талантливых специалистов.');
INSERT INTO jobber.task(employer_id, status_id, area_id, image_id, title, description) values(1, 1, 1, 1, 'Покрасить дом', 'Покрасить старое здание по адресу ул. Ожешко 34');
INSERT INTO jobber.task(employer_id, status_id, area_id, image_id, title, description) values(2, 1, 2, 1, 'Сайт приюта для собак', 'Удобный cайт приюта для собак...');
INSERT INTO jobber.task(employer_id, status_id, area_id, image_id, title, description) values(3, 3, 2, 1, 'Приложение Андроид', 'Ямы на дорогах...');

INSERT INTO jobber.user_task values(1, 1);
INSERT INTO jobber.user_task values(2, 1);
INSERT INTO jobber.user_task values(2, 2);
INSERT INTO jobber.user_task values(3, 3);
INSERT INTO jobber.user_task values(5, 4);
INSERT INTO jobber.user_task values(8, 4);