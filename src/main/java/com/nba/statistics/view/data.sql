create database nba_stat;

create table saison(
    idsaison varchar(100) primary key not null,
    anneeDebut int,
    anneeFin int
);

insert into saison values('S1', 2022, 2023);
insert into saison values('S2', 2023, 2024);

-- ---------------------------------------------------------------------
create table team(
    idteam varchar(100) primary key not null,
    nameTeam varchar(100),
    arena varchar(100),
    conference int
);

insert into team values('T1', 'Boston Celtics', 'AT Center', 1);
insert into team values('T2', 'Detroit Pistons', 'Square Garden', 0);

-- ---------------------------------------------------------------------

create table player(
    idplayer varchar(100) primary key not null,
    namePlayer varchar(100),
    numberPlayer int,
    idteam varchar(100),
    foreign key(idteam) references team(idteam)
);

insert into player values('P1', 'Jayson Tatum', 0, 'T1');
insert into player values('P2', 'Jaylen Brown', 7, 'T1');
insert into player values('P3', 'Bogdan Bogdanovic', 12, 'T2');
insert into player values('P4', 'Brandon Jennins', 4, 'T2');

-- ------------------------------------------------------------------------

CREATE SEQUENCE game_seq START 1 INCREMENT BY 1;

create table game(
    idgame varchar(100) primary key not null default 'GA_'||nextval('game_seq'),
    idteam1 varchar(100),
    idteam2 varchar(100),
    dateGame timestamp,
    typeGame int,
    idsaison varchar(100),
    foreign key(idteam1) references team(idteam),
    foreign key(idteam2) references team(idteam),
    foreign key(idsaison) references saison(idsaison)
);

-- ---------------------------------------------------------------------------

create table shoot(
    idshoot varchar(100) primary key not null,
    nameShoot varchar(50),
    valueShoot int
);

insert into shoot values('SH1', 'Free Throw', 1);
insert into shoot values('SH2', 'Layup', 2);
insert into shoot values('SH3', 'Three pts', 3);

-- ------------------------------------------------------------------------------

CREATE SEQUENCE rebond_seq START 1 INCREMENT BY 1;

create table rebond(
    idrebond varchar(100) primary key not null default 'RE_'||nextval('rebond_seq'),
    idplayer varchar(100),
    idgame varchar(100),
    dateRebond timestamp,
    typeRebond int,
    foreign key(idplayer) references player(idplayer),
    foreign key(idgame) references game(idgame)
);

-- -----------------------------------------------------------------------------

CREATE SEQUENCE passe_seq START 1 INCREMENT BY 1;

create table passe(
    idpasse varchar(100) primary key not null default 'PAS_'||nextval('passe_seq'),
    idplayer varchar(100),
    idgame varchar(100),
    datePasse timestamp,
    foreign key(idplayer) references player(idplayer),
    foreign key(idgame) references game(idgame)
);

-- -------------------------------------------------------------------------

CREATE SEQUENCE shoot_seq START 1 INCREMENT BY 1;

create table tirjoueur(
    idtirjoueur varchar(100) primary key not null default 'SH_'||nextval('shoot_seq'),
    idplayer varchar(100),
    idgame varchar(100),
    idshoot varchar(100),
    ismade int,
    dateShoot timestamp,
    foreign key(idplayer) references player(idplayer),
    foreign key(idgame) references game(idgame),
    foreign key(idshoot) references shoot(idshoot)
);

-- -------------------------------------------------------------------------------


-- drop table tirjoueur;
-- drop table passe;
-- drop table rebond;
-- drop table shoot;
-- drop table game;
-- drop table player;
-- drop table team;
-- drop table saison;

