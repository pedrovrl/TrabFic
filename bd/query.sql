--
-- Database: `sistema_alunos`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `dtc_aluno`
--

CREATE TABLE IF NOT EXISTS dtc_aluno (
    "alun_id" serial NOT NULL,
    "alun_nome" varchar(100) NOT NULL
);

-- --------------------------------------------------------

--
-- Estrutura da tabela `dtc_aluno_atividade`
--

CREATE TABLE IF NOT EXISTS dtc_aluno_atividade (
  "nota" float NOT NULL,
  "alun_fk_id" integer NOT NULL,
  "ativ_fk_id" integer NOT NULL
);

-- --------------------------------------------------------

--
-- Estrutura da tabela `dtc_atividade`
--

CREATE TABLE IF NOT EXISTS dtc_atividade (
  "ativ_id" serial NOT NULL,
  "ativ_nome" integer NOT NULL,
  "ativ_tipo" integer NOT NULL,
  "ativ_valor" integer NOT NULL,
  "professor_fk_id" integer NOT NULL
);

-- --------------------------------------------------------

--
-- Estrutura da tabela `dtc_atividade`
--

CREATE TABLE IF NOT EXISTS dtc_professor (
	"professor_id" serial NOT NULL,
	"nome" varchar(100) NOT NULL,
	"senha" varchar(100)
);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dtc_aluno`
--
ALTER TABLE dtc_aluno
 ADD PRIMARY KEY ("alun_id");

--
-- Indexes for table `dtc_professor`
--
ALTER TABLE dtc_professor
 ADD PRIMARY KEY ("professor_id");

--
-- Indexes for table `dtc_atividade`
--
ALTER TABLE dtc_atividade
 ADD PRIMARY KEY ("ativ_id"),
 ADD CONSTRAINT "professor_fk_id" FOREIGN KEY ("professor_fk_id") REFERENCES dtc_professor ("professor_id");

--
-- Limitadores para a tabela `dtc_aluno_atividade`
--
ALTER TABLE dtc_aluno_atividade
ADD CONSTRAINT "alun_fk_id" FOREIGN KEY ("alun_fk_id") REFERENCES dtc_aluno ("alun_id"),
ADD CONSTRAINT "ativ_fk_id" FOREIGN KEY ("ativ_fk_id") REFERENCES dtc_atividade ("ativ_id");