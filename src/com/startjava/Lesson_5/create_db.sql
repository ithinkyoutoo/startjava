\! chcp 1251

CREATE DATABASE pacific_rim;

\c pacific_rim

DROP TABLE IF EXISTS jaegers;

CREATE TABLE jaegers (
    PRIMARY KEY (id),
    id         SERIAL   NOT NULL,
    model_name TEXT     NOT NULL,
    mark       TEXT     NOT NULL,
    height     FLOAT(5) NOT NULL,
    weight     FLOAT(5) NOT NULL,
    status     TEXT     NOT NULL,
    origin     TEXT     NOT NULL,
    launch     DATE     NOT NULL,
    kaiju_kill INT      NOT NULL
);

\ir init_db.sql

\ir queries.sql