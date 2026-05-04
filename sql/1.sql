create table com_party_activities_syllabus.`tianjin university school of civil engineering`
(
    id          int auto_increment
        primary key,
    title       varchar(100)  null,
    result      varchar(1000) null,
    error_times int           null,
    error_place varchar(100)  null
);

