DROP DATABASE IF EXISTS `jobber`;
CREATE DATABASE `jobber`;

CREATE TABLE IF NOT EXISTS `jobber`.`job_area` (
  `area_id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`area_id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `jobber`.`status` (
  `status_id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`status_id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `jobber`.`employer` (
  `employer_id` INT NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NULL,
  `description` VARCHAR(255) NULL,
  `location` VARCHAR(45) NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`employer_id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `jobber`.`user` (
  `user_id` INT NOT NULL,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NULL,
  `location` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `jobber`.`task` (
  `task_id` INT NOT NULL,
  `employer_id` INT NOT NULL,
  `status_id` INT NOT NULL,
  `area_id` INT NOT NULL,
  `title` VARCHAR(255) NOT NULL,
  `description` LONGTEXT NULL,
  PRIMARY KEY (`task_id`, `employer_id`, `status_id`, `area_id`),
  INDEX `task_status_fk_idx` (`status_id` ASC) VISIBLE,
  INDEX `task_area_fk_idx` (`area_id` ASC) VISIBLE,
  INDEX `task_empl_fk_idx` (`employer_id` ASC) VISIBLE,
  CONSTRAINT `task_status_fk`
    FOREIGN KEY (`status_id`)
    REFERENCES `jobber`.`status` (`status_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `task_area_fk`
    FOREIGN KEY (`area_id`)
    REFERENCES `jobber`.`job_area` (`area_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `task_empl_fk`
    FOREIGN KEY (`employer_id`)
    REFERENCES `jobber`.`employer` (`employer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `jobber`.`user_area` (
  `user_id` INT NOT NULL,
  `area_id` INT NOT NULL,
  PRIMARY KEY (`user_id`, `area_id`),
  INDEX `area_ua_fk_idx` (`area_id` ASC) VISIBLE,
  CONSTRAINT `user_ua_fk`
    FOREIGN KEY (`user_id`)
    REFERENCES `jobber`.`user` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `area_ua_fk`
    FOREIGN KEY (`area_id`)
    REFERENCES `jobber`.`job_area` (`area_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `jobber`.`user_task` (
  `user_id` INT NOT NULL,
  `task_id` INT NOT NULL,
  PRIMARY KEY (`user_id`, `task_id`),
  INDEX `task_ut_fk_idx` (`task_id` ASC) VISIBLE,
  CONSTRAINT `user_ut_fk`
    FOREIGN KEY (`user_id`)
    REFERENCES `jobber`.`user` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `task_ut_fk`
    FOREIGN KEY (`task_id`)
    REFERENCES `jobber`.`task` (`task_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

