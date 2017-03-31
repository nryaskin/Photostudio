--liquibase formatted sql
--changeset nikita:release_1.create_tables.sql
 
CREATE TABLE users
(
    username VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255),
    first_name VARCHAR(255),
    middle_name VARCHAR(255)
);

CREATE TABLE userroles
(
    username VARCHAR(255) PRIMARY KEY,
    userrole VARCHAR(255),
    constraint fk_users_username FOREIGN KEY (username) references users(username)
)

CREATE TABLE pavilion
(
    pavilion_id INTEGER PRIMARY KEY,
    address VARCHAR(255)
)

CREATE TABLE orders
(
    order_id INTEGER PRIMARY KEY,
    photographer VARCHAR(255),
    client VARCHAR(255),
    pavilion_id INTEGER,
    order_date Date,
    order_delivery Date,
    constraint fk_photographer_username FOREIGN KEY (photographer) references users(username),
    constraint fk_client_username FOREIGN KEY (client) references users(username)
)

CREATE TABLE photo
(
    photo_id INTEGER PRIMARY KEY,
    photo_type VARCHAR(255),
    order_id INTEGER,
    constraint fk_order_id FOREIGN KEY (order_id) references orders(order_id)
)

CREATE TABLE photolab
(
    photolab_id INTEGER PRIMARY KEY,
    pavilion_id INTEGER,
    constraint fk_pavilion_id FOREIGN KEY (pavilion_id) references pavilion(pavilion_id)
)


--rollback DROP TABLE users;