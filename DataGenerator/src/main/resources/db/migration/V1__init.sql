CREATE TABLE IF NOT EXISTS race_times (
    id integer generated always as identity,
    race_name varchar(255),
    racer varchar(255),
    time NUMERIC
    );

INSERT INTO race_times (race_name, racer, time) VALUES ('Tour de France', 'Pogocar', 12312312);
