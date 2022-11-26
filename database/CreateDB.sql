-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema jobber
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema jobber
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `jobber` DEFAULT CHARACTER SET utf8 ;
USE `jobber` ;

-- -----------------------------------------------------
-- Table `jobber`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jobber`.`role` (
  `value` VARCHAR(45) NOT NULL,
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jobber`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jobber`.`user` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NULL,
  `location` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `email` VARCHAR(45) NOT NULL,
  `role_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_user_role1_idx` (`role_id` ASC) VISIBLE,
  CONSTRAINT `fk_user_role1`
    FOREIGN KEY (`role_id`)
    REFERENCES `jobber`.`role` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jobber`.`status`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jobber`.`status` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jobber`.`area`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jobber`.`area` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jobber`.`employer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jobber`.`employer` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NULL,
  `user_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_employer_user1_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `fk_employer_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `jobber`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jobber`.`image`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jobber`.`image` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `link` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jobber`.`task`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jobber`.`task` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `employer_id` BIGINT NOT NULL,
  `status_id` BIGINT NOT NULL,
  `area_id` BIGINT NOT NULL,
  `title` VARCHAR(500) NOT NULL,
  `description` LONGTEXT NULL,
  `image_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `task_status_fk_idx` (`status_id` ASC) VISIBLE,
  INDEX `task_area_fk_idx` (`area_id` ASC) VISIBLE,
  INDEX `task_empl_fk_idx` (`employer_id` ASC) VISIBLE,
  INDEX `fk_task_image1_idx` (`image_id` ASC) VISIBLE,
  CONSTRAINT `task_status_fk`
    FOREIGN KEY (`status_id`)
    REFERENCES `jobber`.`status` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `task_area_fk`
    FOREIGN KEY (`area_id`)
    REFERENCES `jobber`.`area` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `task_empl_fk`
    FOREIGN KEY (`employer_id`)
    REFERENCES `jobber`.`employer` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_task_image1`
    FOREIGN KEY (`image_id`)
    REFERENCES `jobber`.`image` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jobber`.`user_task`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jobber`.`user_task` (
  `user_id` BIGINT NOT NULL,
  `task_id` BIGINT NOT NULL,
  PRIMARY KEY (`user_id`, `task_id`),
  INDEX `task_ut_fk_idx` (`task_id` ASC) VISIBLE,
  CONSTRAINT `user_ut_fk`
    FOREIGN KEY (`user_id`)
    REFERENCES `jobber`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `task_ut_fk`
    FOREIGN KEY (`task_id`)
    REFERENCES `jobber`.`task` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jobber`.`user_area`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jobber`.`user_area` (
  `user_id` BIGINT NOT NULL,
  `area_id` BIGINT NOT NULL,
  PRIMARY KEY (`user_id`, `area_id`),
  INDEX `area_ua_fk_idx` (`area_id` ASC) VISIBLE,
  CONSTRAINT `user_ua_fk`
    FOREIGN KEY (`user_id`)
    REFERENCES `jobber`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `area_ua_fk`
    FOREIGN KEY (`area_id`)
    REFERENCES `jobber`.`area` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jobber`.`credentials`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jobber`.`credentials` (
  `user_id` BIGINT NOT NULL,
  `login` VARCHAR(100) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `fk_credentials_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `jobber`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
