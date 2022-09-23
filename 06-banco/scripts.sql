create table tdss_tb_filme (
    cd_filme number(10,0) primary key,
    nm_filme varchar2(100),
    nr_minutos number(10,0),
    dt_lancamento date,
    ds_genero varchar2(40)
);

create sequence sq_tdss_tb_filme 
start with 1 
increment by 1;