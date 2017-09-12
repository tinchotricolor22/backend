CREATE TABLE `am`.`am_subtype_product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(50) NULL,
  `id_type_product` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fkid_type_product_idx` (`id_type_product` ASC),
  CONSTRAINT `fk_id_type_product`
    FOREIGN KEY (`id_type_product`)
    REFERENCES `am`.`am_product_type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
