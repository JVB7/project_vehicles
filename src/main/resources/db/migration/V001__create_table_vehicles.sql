CREATE TABLE veiculos(
	id BIGINT NOT NULL AUTO_INCREMENT,
    modelo VARCHAR(60) NOT NULL,
    placa VARCHAR(10) NOT NULL,
    cor VARCHAR(50) NOT NULL,
    ano INT NOT NULL,
    combustivel VARCHAR(30) NOT NULL,
    
    PRIMARY KEY (id)
)ENGINE=InnoDB default charset=utf8;