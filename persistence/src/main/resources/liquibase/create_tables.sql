--liquibase formatted sql
--changeset nikita:release_1.create_tables.sql
 

CREATE TABLE userroles
(
    role_id INTEGER PRIMARY KEY,
    role_name VARCHAR(255)
);

CREATE TABLE users
(
    username VARCHAR(255) PRIMARY KEY,
    passwd VARCHAR(255),
    first_name VARCHAR(255),
    middle_name VARCHAR(255), 
    user_role INTEGER,
    constraint fk_userrole FOREIGN KEY (user_role) references userroles(role_id) on update cascade
);

CREATE TABLE pavilion
(
    pavilion_id INTEGER PRIMARY KEY,
    address VARCHAR(255)
);

CREATE TABLE orders
(
    order_id INTEGER PRIMARY KEY,
    photographer VARCHAR(255),
    client VARCHAR(255),
    pavilion_id INTEGER,
    accepted BOOLEAN,
    order_date Date,
    order_delivery Date,
    constraint fk_photographer_username FOREIGN KEY (photographer) references users(username),
    constraint fk_client_username FOREIGN KEY (client) references users(username),
    constraint fk_pavilion FOREIGN KEY (pavilion_id) references pavilion(pavilion_id)
);

CREATE TABLE photolab
(
    photolab_id INTEGER PRIMARY KEY,
    pavilion_id INTEGER,
    constraint fk_pavilion_id FOREIGN KEY (pavilion_id) references pavilion(pavilion_id)
);

CREATE TABLE photo
(
    photo_id INTEGER PRIMARY KEY,
    photo_type VARCHAR(255),
    order_id INTEGER,
    photolab_id INTEGER,
    constraint fk_order_id FOREIGN KEY (order_id) references orders(order_id)
);

CREATE TABLE photolab_photo
(
    photolab_id INTEGER,
    photo_id INTEGER, 
    constraint PK_Photolab_photo PRIMARY KEY (photolab_id, photo_id),
    constraint  FK_photolab_id FOREIGN KEY (photolab_id) references photolab(photolab_id),
    constraint FK_photo_id FOREIGN KEY (photo_id) references photo(photo_id)
);

--rollback DROP TABLE users;