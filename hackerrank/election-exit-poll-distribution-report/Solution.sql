-- TABELAS

-- candidatos
CREATE TABLE candidates (
    id SERIAL PRIMARY KEY,
    first_name TEXT NOT NULL,
    last_name TEXT NOT NULL
);

-- votos por estado
CREATE TABLE results (
    candidate_id INT REFERENCES candidates(id),
    state TEXT NOT NULL
);

-- DADOS

-- nomes dos candidatos
INSERT INTO candidates (id, first_name, last_name) VALUES (1, 'Christyna', 'Testro');
INSERT INTO candidates (id, first_name, last_name) VALUES (2, 'Millicent', 'Greensitt');
INSERT INTO candidates (id, first_name, last_name) VALUES (3, 'Carlie', 'Evamy');
INSERT INTO candidates (id, first_name, last_name) VALUES (4, 'Derril', 'Northam');
INSERT INTO candidates (id, first_name, last_name) VALUES (5, 'Aile', 'Cettell');
INSERT INTO candidates (id, first_name, last_name) VALUES (6, 'Brittni', 'Josefovic');
INSERT INTO candidates (id, first_name, last_name) VALUES (7, 'Amity', 'Dubble');
INSERT INTO candidates (id, first_name, last_name) VALUES (8, 'Carlyle', 'Mougenel');
INSERT INTO candidates (id, first_name, last_name) VALUES (9, 'Finley', 'De Filippo');
INSERT INTO candidates (id, first_name, last_name) VALUES (10, 'De witt', 'Monroe');
INSERT INTO candidates (id, first_name, last_name) VALUES (11, 'Millice', 'Silcock');

-- votos (1 linha = 1 voto)
INSERT INTO results (candidate_id, state) VALUES (1, 'Alabama');
INSERT INTO results (candidate_id, state) VALUES (1, 'Alabama');
INSERT INTO results (candidate_id, state) VALUES (1, 'Alabama');
INSERT INTO results (candidate_id, state) VALUES (2, 'Alabama');
INSERT INTO results (candidate_id, state) VALUES (2, 'Alabama');
INSERT INTO results (candidate_id, state) VALUES (3, 'Alabama');
INSERT INTO results (candidate_id, state) VALUES (4, 'Alabama');
INSERT INTO results (candidate_id, state) VALUES (5, 'Alaska');
INSERT INTO results (candidate_id, state) VALUES (5, 'Alaska');
INSERT INTO results (candidate_id, state) VALUES (6, 'Alaska');
INSERT INTO results (candidate_id, state) VALUES (6, 'Alaska');
INSERT INTO results (candidate_id, state) VALUES (4, 'Alaska');
INSERT INTO results (candidate_id, state) VALUES (4, 'Alaska');
INSERT INTO results (candidate_id, state) VALUES (7, 'Alaska');
INSERT INTO results (candidate_id, state) VALUES (8, 'Alaska');
INSERT INTO results (candidate_id, state) VALUES (9, 'Alaska');
INSERT INTO results (candidate_id, state) VALUES (7, 'Arizona');
INSERT INTO results (candidate_id, state) VALUES (7, 'Arizona');
INSERT INTO results (candidate_id, state) VALUES (7, 'Arizona');
INSERT INTO results (candidate_id, state) VALUES (3, 'Arizona');
INSERT INTO results (candidate_id, state) VALUES (3, 'Arizona');
INSERT INTO results (candidate_id, state) VALUES (3, 'Arizona');
INSERT INTO results (candidate_id, state) VALUES (5, 'Arizona');
INSERT INTO results (candidate_id, state) VALUES (8, 'Arizona');
INSERT INTO results (candidate_id, state) VALUES (1, 'Arizona');
INSERT INTO results (candidate_id, state) VALUES (4, 'Arizona');
INSERT INTO results (candidate_id, state) VALUES (10, 'Arkansas');
INSERT INTO results (candidate_id, state) VALUES (10, 'Arkansas');
INSERT INTO results (candidate_id, state) VALUES (3, 'California');
INSERT INTO results (candidate_id, state) VALUES (3, 'California');
INSERT INTO results (candidate_id, state) VALUES (3, 'California');
INSERT INTO results (candidate_id, state) VALUES (3, 'California');
INSERT INTO results (candidate_id, state) VALUES (3, 'California');
INSERT INTO results (candidate_id, state) VALUES (3, 'California');
INSERT INTO results (candidate_id, state) VALUES (3, 'California');
INSERT INTO results (candidate_id, state) VALUES (3, 'California');
INSERT INTO results (candidate_id, state) VALUES (3, 'California');
INSERT INTO results (candidate_id, state) VALUES (10, 'California');
INSERT INTO results (candidate_id, state) VALUES (10, 'California');
INSERT INTO results (candidate_id, state) VALUES (10, 'California');
INSERT INTO results (candidate_id, state) VALUES (10, 'California');
INSERT INTO results (candidate_id, state) VALUES (10, 'California');
INSERT INTO results (candidate_id, state) VALUES (10, 'California');
INSERT INTO results (candidate_id, state) VALUES (10, 'California');
INSERT INTO results (candidate_id, state) VALUES (10, 'California');
INSERT INTO results (candidate_id, state) VALUES (4, 'California');
INSERT INTO results (candidate_id, state) VALUES (4, 'California');
INSERT INTO results (candidate_id, state) VALUES (4, 'California');
INSERT INTO results (candidate_id, state) VALUES (4, 'California');
INSERT INTO results (candidate_id, state) VALUES (4, 'California');
INSERT INTO results (candidate_id, state) VALUES (4, 'California');
INSERT INTO results (candidate_id, state) VALUES (4, 'California');
INSERT INTO results (candidate_id, state) VALUES (4, 'California');
INSERT INTO results (candidate_id, state) VALUES (7, 'California');
INSERT INTO results (candidate_id, state) VALUES (7, 'California');
INSERT INTO results (candidate_id, state) VALUES (7, 'California');
INSERT INTO results (candidate_id, state) VALUES (7, 'California');
INSERT INTO results (candidate_id, state) VALUES (7, 'California');
INSERT INTO results (candidate_id, state) VALUES (7, 'California');
INSERT INTO results (candidate_id, state) VALUES (7, 'California');
INSERT INTO results (candidate_id, state) VALUES (5, 'California');
INSERT INTO results (candidate_id, state) VALUES (5, 'California');
INSERT INTO results (candidate_id, state) VALUES (5, 'California');
INSERT INTO results (candidate_id, state) VALUES (5, 'California');
INSERT INTO results (candidate_id, state) VALUES (5, 'California');
INSERT INTO results (candidate_id, state) VALUES (5, 'California');
INSERT INTO results (candidate_id, state) VALUES (2, 'California');
INSERT INTO results (candidate_id, state) VALUES (2, 'California');
INSERT INTO results (candidate_id, state) VALUES (2, 'California');
INSERT INTO results (candidate_id, state) VALUES (2, 'California');
INSERT INTO results (candidate_id, state) VALUES (2, 'California');
INSERT INTO results (candidate_id, state) VALUES (2, 'California');
INSERT INTO results (candidate_id, state) VALUES (1, 'California');
INSERT INTO results (candidate_id, state) VALUES (1, 'California');
INSERT INTO results (candidate_id, state) VALUES (1, 'California');
INSERT INTO results (candidate_id, state) VALUES (1, 'California');
INSERT INTO results (candidate_id, state) VALUES (1, 'California');
INSERT INTO results (candidate_id, state) VALUES (6, 'California');
INSERT INTO results (candidate_id, state) VALUES (6, 'California');
INSERT INTO results (candidate_id, state) VALUES (6, 'California');
INSERT INTO results (candidate_id, state) VALUES (6, 'California');
INSERT INTO results (candidate_id, state) VALUES (8, 'California');
INSERT INTO results (candidate_id, state) VALUES (8, 'California');
INSERT INTO results (candidate_id, state) VALUES (8, 'California');
INSERT INTO results (candidate_id, state) VALUES (8, 'California');
INSERT INTO results (candidate_id, state) VALUES (9, 'California');
INSERT INTO results (candidate_id, state) VALUES (9, 'California');
INSERT INTO results (candidate_id, state) VALUES (10, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (10, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (10, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (10, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (10, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (1, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (1, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (1, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (3, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (3, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (9, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (9, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (5, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (6, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (8, 'Colorado');
INSERT INTO results (candidate_id, state) VALUES (3, 'Connecticut');
INSERT INTO results (candidate_id, state) VALUES (3, 'Connecticut');
INSERT INTO results (candidate_id, state) VALUES (3, 'Connecticut');
INSERT INTO results (candidate_id, state) VALUES (4, 'Connecticut');
INSERT INTO results (candidate_id, state) VALUES (4, 'Connecticut');
INSERT INTO results (candidate_id, state) VALUES (4, 'Connecticut');
INSERT INTO results (candidate_id, state) VALUES (6, 'Connecticut');
INSERT INTO results (candidate_id, state) VALUES (4, 'Delaware');
INSERT INTO results (candidate_id, state) VALUES (2, 'Delaware');
INSERT INTO results (candidate_id, state) VALUES (1, 'District of Columbi');
INSERT INTO results (candidate_id, state) VALUES (1, 'District of Columbi');
INSERT INTO results (candidate_id, state) VALUES (1, 'District of Columbi');
INSERT INTO results (candidate_id, state) VALUES (1, 'District of Columbi');
INSERT INTO results (candidate_id, state) VALUES (3, 'District of Columbi');
INSERT INTO results (candidate_id, state) VALUES (3, 'District of Columbi');
INSERT INTO results (candidate_id, state) VALUES (9, 'District of Columbi');
INSERT INTO results (candidate_id, state) VALUES (9, 'District of Columbi');
INSERT INTO results (candidate_id, state) VALUES (5, 'District of Columbi');
INSERT INTO results (candidate_id, state) VALUES (7, 'District of Columbi');
INSERT INTO results (candidate_id, state) VALUES (6, 'District of Columbi');
INSERT INTO results (candidate_id, state) VALUES (8, 'District of Columbi');
INSERT INTO results (candidate_id, state) VALUES (4, 'District of Columbi');
INSERT INTO results (candidate_id, state) VALUES (11, 'District of Columbi');


-- RELATORIO

-- tabela temporaria pra contar votos por candidato em cada estado
WITH vote_counts AS (
    SELECT
        r.state,
        c.first_name,
        c.last_name,
        COUNT(*) AS votes
    FROM results r
    JOIN candidates c ON r.candidate_id = c.id
    GROUP BY r.state, c.first_name, c.last_name
)
-- melhorar a saída no terminal (psql) remove cabecalho e bordas
\pset tuples_only ON \pset format unaligned \pset fieldsep '\t'

-- consulta final
SELECT
    state,
    STRING_AGG(
        -- formata em "nome sobrenome x votos"
        first_name || ' ' || last_name || ' x ' || votes,
        
        -- separa cada um por virgula
        ','
        
        -- cria a ordenacao
        ORDER BY
            votes DESC, -- quem tem mais voto vem primeiro
            -- ordena pelo nome, usando o COLLATE "POSIX" pra nao ter erro 
            -- com espacos ou caracteres especiais
            first_name COLLATE "POSIX",
            last_name COLLATE "POSIX"
    ) AS votes
FROM vote_counts
GROUP BY state
ORDER BY state;
