INSERT INTO tb_students (id, name, email, phone_number, cell_phone_number, cpf, birth_date)
SELECT * FROM (
    SELECT UUID_TO_BIN(UUID()) AS id, 'Alisson' AS name, 'aliemail@email.com' AS email,
           '(93) 0265-4500' AS phone_number, '(93) 98113-0500' AS cell_phone_number, '542.508.360-29' AS cpf, '1999-12-12' AS birth_date
    UNION ALL
    SELECT UUID_TO_BIN(UUID()), 'Beatriz Silva', 'beatriz.silva@email.com',
           '(93) 3265-4501', '(93) 98114-0501', '123.456.789-09', '2000-01-15'
    UNION ALL
    SELECT UUID_TO_BIN(UUID()), 'Carlos Souza', 'carlos.souza@email.com',
           '(93) 3265-4502', '(93) 98115-0502', '987.654.321-00', '1998-05-22'
    UNION ALL
    SELECT UUID_TO_BIN(UUID()), 'Daniela Lima', 'daniela.lima@email.com',
           '(93) 3265-4503', '(93) 98116-0503', '456.789.123-65', '2001-07-30'
    UNION ALL
    SELECT UUID_TO_BIN(UUID()), 'Eduardo Pereira', 'eduardo.pereira@email.com',
           '(93) 3265-4504', '(93) 98117-0504', '321.654.987-45', '1997-09-10'
    UNION ALL
    SELECT UUID_TO_BIN(UUID()), 'Fernanda Costa', 'fernanda.costa@email.com',
           '(93) 3265-4505', '(93) 98118-0505', '654.321.789-12', '1999-11-25'
    UNION ALL
    SELECT UUID_TO_BIN(UUID()), 'Gustavo Almeida', 'gustavo.almeida@email.com',
           '(93) 3265-4506', '(93) 98119-0506', '789.123.456-78', '2002-03-05'
    UNION ALL
    SELECT UUID_TO_BIN(UUID()), 'Helena Martins', 'helena.martins@email.com',
           '(93) 3265-4507', '(93) 98120-0507', '159.753.486-20', '1996-12-20'
    UNION ALL
    SELECT UUID_TO_BIN(UUID()), 'Igor Fernandes', 'igor.fernandes@email.com',
           '(93) 3265-4508', '(93) 98121-0508', '753.159.852-96', '2000-06-18'
    UNION ALL
    SELECT UUID_TO_BIN(UUID()), 'Juliana Rocha', 'juliana.rocha@email.com',
           '(93) 3265-4509', '(93) 98122-0509', '852.456.123-30', '1998-08-14'
    UNION ALL
    SELECT UUID_TO_BIN(UUID()), 'Kleber Mendes', 'kleber.mendes@email.com',
           '(93) 3265-4510', '(93) 98123-0510', '951.357.258-41', '1997-10-29'
    UNION ALL
    SELECT UUID_TO_BIN(UUID()), 'Larissa Oliveira', 'larissa.oliveira@email.com',
           '(93) 3265-4511', '(93) 98124-0511', '357.951.654-82', '2001-04-12'
    UNION ALL
    SELECT UUID_TO_BIN(UUID()), 'Marcos Vinícius', 'marcos.vinicius@email.com',
           '(93) 3265-4512', '(93) 98125-0512', '258.654.753-09', '1999-02-27'
    UNION ALL
    SELECT UUID_TO_BIN(UUID()), 'Natália Ribeiro', 'natalia.ribeiro@email.com',
           '(93) 3265-4513', '(93) 98126-0513', '654.987.321-34', '2002-07-08'
    UNION ALL
    SELECT UUID_TO_BIN(UUID()), 'Otávio Nunes', 'otavio.nunes@email.com',
           '(93) 3265-4514', '(93) 98127-0514', '789.654.123-56', '1996-11-03'
) AS tmp
WHERE NOT EXISTS (SELECT 1 FROM tb_students);
