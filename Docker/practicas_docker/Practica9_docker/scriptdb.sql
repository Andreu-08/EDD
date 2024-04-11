-- scriptdb.sql 
 
CREATE TABLE IF NOT EXISTS usuarios ( 
    id SERIAL PRIMARY KEY, 
    nombre VARCHAR(50), 
    email VARCHAR(100) 
); 
 
INSERT INTO usuarios (nombre, email) VALUES 
    ('Usuario1', 'usuario1@email.com'), 
    ('Usuario2', 'usuario2@email.com'); 
-- scriptdb.sql 
 
CREATE TABLE IF NOT EXISTS usuarios ( 
    id SERIAL PRIMARY KEY, 
    nombre VARCHAR(50), 
    email VARCHAR(100) 
); 
