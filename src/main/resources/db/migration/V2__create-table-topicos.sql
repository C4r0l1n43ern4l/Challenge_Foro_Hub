create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100) not null unique,
    mensaje varchar(200) not null,
    fecha datetime not null,
    status varchar(100) not null,
    autor_id bigint not null,
    curso varchar(100) not null,

    primary key(id),
    constraint fk_topicos_autor_id foreign key(autor_id) references usuarios(id)

);