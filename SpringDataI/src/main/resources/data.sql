-- USERS


truncate table users restart identity cascade;

INSERT INTO users (id, email, first_name, last_name, password)
VALUES (nextval('users_id_seq'), 'uinan@miu.edu', 'umur', 'inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, first_name, last_name, password)
VALUES (nextval('users_id_seq'), 'john@miu.edu', 'john', 'doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, first_name, last_name, password)
VALUES (nextval('users_id_seq'), 'muhyidean@miu.edu', 'muhyidean', 'al-tarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, first_name, last_name, password)
VALUES (nextval('users_id_seq'), 'levi@miu.edu', 'keith', 'levi', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, first_name, last_name, password)
VALUES (nextval('users_id_seq'), 'okalu@miu.edu', 'obinna', 'kalu', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, first_name, last_name, password)
VALUES (nextval('users_id_seq'), 'tina@miu.edu', 'tina', 'xing', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

-- ADDRESSES

INSERT INTO address(id, city,street, zip, user_id) VALUES(nextval('address_id_seq'),'FairField','1000 N 4th Street','52557',1);
INSERT INTO address(id, city,street, zip, user_id) VALUES(nextval('address_id_seq'),'FairField','1000 N 5th Street','52556',2);

-- PRODUCTS

truncate table product restart identity cascade;

INSERT INTO product (id, name, price)
VALUES ( nextval('product_id_seq'),'iPhone', 1200);

INSERT INTO product (id, name, price)
VALUES (nextval('product_id_seq'), 'iPad', 900);

INSERT INTO product (id, name, price)
VALUES (nextval('product_id_seq'), 'Pen', 5);

-- REVIEWS

INSERT INTO REVIEW (id,comment,user_id)
VALUES (nextval('review_id_seq'),'awesome phone',1);

INSERT INTO REVIEW (id,comment,user_id)
VALUES (nextval('review_id_seq'),'amazing phone',1);

INSERT INTO REVIEW (id,comment,user_id)
VALUES (nextval('review_id_seq'),'awesome tablet',2);