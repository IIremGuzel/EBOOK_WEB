
-- Oluşturulan veritabanı üzerinde işlem yapma
USE ebookdb;

-- Kategori tablosu oluşturma
CREATE TABLE IF NOT EXISTS `ebookdb`.`ebook_category` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `category_name` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;

-- Kitap tablosu oluşturma
CREATE TABLE IF NOT EXISTS `ebookdb`.`ebook` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(255) DEFAULT NULL,
  `author` VARCHAR(255) DEFAULT NULL,
  `description` TEXT,
  `content` TEXT,
  `cover_image_url` VARCHAR(255) DEFAULT NULL,
  `category_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_ebook_category` (`category_id`),
  CONSTRAINT `fk_ebook_category` FOREIGN KEY (`category_id`) REFERENCES `ebook_category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;

-- Örnek kategori ekleme
INSERT INTO ebook_category (category_name) VALUES ('Fiction');
INSERT INTO ebook_category (category_name) VALUES ('Non-Fiction');
INSERT INTO ebook_category (category_name) VALUES ('Science Fiction');
INSERT INTO ebook_category (category_name) VALUES ('Mystery');
INSERT INTO ebook_category (category_name) VALUES ('Biography');

-- Örnek kitap ekleme
INSERT INTO ebook (title, author, description, content, cover_image_url, category_id)
VALUES ('The Great Gatsby', 'iREM gÜ<EL', 'A story about the American Dream.', 'Harper Lee', 'cover_images/great_gatsby.jpg', 1);

INSERT INTO ebook (title, author, description, content, cover_image_url, category_id)
VALUES ('To Kill a Mockingbird', 'sUNAY gÜZEL', 'A story of racial injustice and moral growth.', 'Harper Lee', 'cover_images/to_kill_a_mockingbird.jpg', 2);

-- Diğer örnek kitap ekleme işlemleri...

