CREATE TABLE `am`.`am_product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(50) NOT NULL,
  `description` VARCHAR(500) NULL,
  `id_type` INT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `code_unique` (`code` ASC),
  INDEX `fk_id_type_idx` (`id_type` ASC),
  CONSTRAINT `fk_id_type`
    FOREIGN KEY (`id_type`)
    REFERENCES `am`.`am_product_type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
