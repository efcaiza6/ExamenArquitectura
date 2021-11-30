--
-- PostgreSQL database dump
--

-- Dumped from database version 13.3
-- Dumped by pg_dump version 13.3

-- Started on 2021-09-16 08:55:58

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 200 (class 1259 OID 16580)
-- Name: tarjeta_cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tarjeta_cliente (
    cod_tarjeta_cliente character varying(10) NOT NULL,
    cod_tarjeta_credito character varying(4) NOT NULL,
    cod_cliente character varying(24) NOT NULL,
    tarjeta_nro character varying(16) NOT NULL,
    nombre_titular character varying(64) NOT NULL,
    estado character varying(3) NOT NULL,
    cupo_disponible numeric(18,2) NOT NULL,
    pin character varying(4) NOT NULL,
    cod_verificador character varying(7) NOT NULL,
    fecha_expedicion timestamp without time zone NOT NULL,
    fecha_expiracion date NOT NULL,
    cupo_total numeric(18,2),
    CONSTRAINT ckc_estado_tarjeta_ CHECK (((estado)::text = ANY (ARRAY[('ACT'::character varying)::text, ('INA'::character varying)::text])))
);


ALTER TABLE public.tarjeta_cliente OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 16584)
-- Name: tarjeta_credito; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tarjeta_credito (
    cod_tarjeta_credito character varying(4) NOT NULL,
    nombre character varying(64) NOT NULL,
    tipo character varying(3) NOT NULL,
    cupo_inicial numeric(18,2) NOT NULL,
    fecha_corte numeric(2,0) NOT NULL,
    tasa numeric(5,2) NOT NULL,
    emisor character varying(3) NOT NULL,
    CONSTRAINT ckc_emisor_tarjeta_ CHECK (((emisor)::text = ANY (ARRAY[('VIS'::character varying)::text, ('AME'::character varying)::text, ('MAS'::character varying)::text, ('DIN'::character varying)::text]))),
    CONSTRAINT ckc_tipo_tarjeta_ CHECK (((tipo)::text = ANY (ARRAY[('INT'::character varying)::text, ('NAC'::character varying)::text])))
);


ALTER TABLE public.tarjeta_credito OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 16589)
-- Name: transaccion; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.transaccion (
    cod_transaccion integer NOT NULL,
    cod_tarjeta_cliente character varying(10) NOT NULL,
    descripcion character varying(100) NOT NULL,
    tipo character varying(3),
    meses numeric(3,0),
    monto numeric(18,2) NOT NULL,
    interes numeric(5,2),
    fecha timestamp without time zone NOT NULL,
    CONSTRAINT ckc_tipo_transacc CHECK (((tipo IS NULL) OR ((tipo)::text = ANY (ARRAY[('CON'::character varying)::text, ('DIF'::character varying)::text, ('PAG'::character varying)::text]))))
);


ALTER TABLE public.transaccion OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 16593)
-- Name: transaccion_cod_transaccion_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.transaccion_cod_transaccion_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.transaccion_cod_transaccion_seq OWNER TO postgres;

--
-- TOC entry 3610 (class 0 OID 0)
-- Dependencies: 203
-- Name: transaccion_cod_transaccion_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.transaccion_cod_transaccion_seq OWNED BY public.transaccion.cod_transaccion;


--
-- TOC entry 3460 (class 2604 OID 16595)
-- Name: transaccion cod_transaccion; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transaccion ALTER COLUMN cod_transaccion SET DEFAULT nextval('public.transaccion_cod_transaccion_seq'::regclass);


--
-- TOC entry 3600 (class 0 OID 16580)
-- Dependencies: 200
-- Data for Name: tarjeta_cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.tarjeta_cliente VALUES ('HXG9KNEF7B', 'AMEX', '614257b166346914942c2d96', '341406712538933', 'DORIS PALOMO', 'ACT', 350.00, '7586', '9716830', '2021-09-15 15:29:38', '2026-09-15', 85.81);
INSERT INTO public.tarjeta_cliente VALUES ('13EJY1GEEP', 'AMEX', '614257b366346914942c2d97', '371838077620496', 'MAXIMILIANO RAMOS', 'ACT', 350.00, '0530', '0791547', '2021-09-15 15:29:40', '2026-09-15', 16.72);
INSERT INTO public.tarjeta_cliente VALUES ('0JQ1JUO4GQ', 'AMEX', '614257b566346914942c2d98', '347159715503410', 'NOEMI LOPEZ', 'ACT', 350.00, '1786', '1571794', '2021-09-15 15:29:42', '2026-09-15', 4.85);
INSERT INTO public.tarjeta_cliente VALUES ('PCZQXINDYS', 'AMEX', '614257b766346914942c2d99', '362505976821601', 'MIA CHICAIZA', 'ACT', 350.00, '9197', '2311239', '2021-09-15 15:29:44', '2026-09-15', 0.48);
INSERT INTO public.tarjeta_cliente VALUES ('54CQBLYHVX', 'AMEX', '614257b966346914942c2d9a', '353456366602205', 'RUTH CALDERON', 'ACT', 350.00, '1946', '3361415', '2021-09-15 15:29:45', '2026-09-15', 5.81);
INSERT INTO public.tarjeta_cliente VALUES ('YGIGP8JRP3', 'AMEX', '614257aa66346914942c2d92', '352022839226581', 'FABRICIO CALVO', 'ACT', 350.00, '4543', '3365886', '2021-09-15 15:29:31', '2026-09-15', 111.78);
INSERT INTO public.tarjeta_cliente VALUES ('9XG8XRIZCX', 'AMEX', '614257ac66346914942c2d93', '370276571647007', 'MAURO GONZALEZ', 'ACT', 350.00, '4925', '8428736', '2021-09-15 15:29:32', '2026-09-15', 36.70);
INSERT INTO public.tarjeta_cliente VALUES ('VFK3QC8FX8', 'AMEX', '614257ae66346914942c2d94', '354334118494657', 'AMERICA ZAPATA', 'ACT', 350.00, '0599', '8289182', '2021-09-15 15:29:34', '2026-09-15', 204.80);
INSERT INTO public.tarjeta_cliente VALUES ('5XZK7GM517', 'AMEX', '614257b066346914942c2d95', '364339234111622', 'CESAR VANEGAS', 'ACT', 350.00, '6822', '9348321', '2021-09-15 15:29:36', '2026-09-15', 154.41);
INSERT INTO public.tarjeta_cliente VALUES ('O6XH01CGZI', 'AMEX', '614257a766346914942c2d91', '371651328386037', 'JOYCE GUZMAN', 'ACT', 350.00, '7168', '2858691', '2021-09-15 15:29:28', '2026-09-15', 2384.95);
INSERT INTO public.tarjeta_cliente VALUES ('49159YFZ9L', 'AMEX', '6142a1f666346914942c2dc3', '342677555185273', 'CARMEN CONCEPCION PALOMO LLANOS', 'ACT', 350.00, '0629', '5665851', '2021-09-15 21:06:28', '2026-09-15', 218.09);


--
-- TOC entry 3601 (class 0 OID 16584)
-- Dependencies: 201
-- Data for Name: tarjeta_credito; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.tarjeta_credito VALUES ('AMEX', 'AMERICAN EXPRESS', 'NAC', 350.00, 18, 12.00, 'AME');


--
-- TOC entry 3602 (class 0 OID 16589)
-- Dependencies: 202
-- Data for Name: transaccion; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.transaccion VALUES (15, 'O6XH01CGZI', 'Compra', 'CON', 1, 264.25, 5.00, '2021-09-15 15:40:48');
INSERT INTO public.transaccion VALUES (16, 'YGIGP8JRP3', 'Compra', 'CON', 1, 193.31, 3.00, '2021-09-15 15:40:49');
INSERT INTO public.transaccion VALUES (17, '9XG8XRIZCX', 'Compra', 'CON', 1, 82.17, 3.00, '2021-09-15 15:40:50');
INSERT INTO public.transaccion VALUES (18, 'VFK3QC8FX8', 'Compra', 'CON', 1, 40.38, 2.00, '2021-09-15 15:40:51');
INSERT INTO public.transaccion VALUES (19, '5XZK7GM517', 'Compra', 'CON', 1, 16.08, 5.00, '2021-09-15 15:40:52');
INSERT INTO public.transaccion VALUES (20, 'HXG9KNEF7B', 'Compra', 'CON', 1, 245.74, 1.00, '2021-09-15 15:40:53');
INSERT INTO public.transaccion VALUES (21, '13EJY1GEEP', 'Compra', 'CON', 1, 330.24, 4.00, '2021-09-15 15:40:54');
INSERT INTO public.transaccion VALUES (22, '0JQ1JUO4GQ', 'Compra', 'CON', 1, 344.15, 5.00, '2021-09-15 15:40:55');
INSERT INTO public.transaccion VALUES (23, 'PCZQXINDYS', 'Compra', 'CON', 1, 308.81, 3.00, '2021-09-15 15:40:56');
INSERT INTO public.transaccion VALUES (24, '54CQBLYHVX', 'Compra', 'CON', 1, 300.43, 3.00, '2021-09-15 15:40:57');
INSERT INTO public.transaccion VALUES (25, 'HXG9KNEF7B', 'Compra', 'CON', 1, 18.45, 2.00, '2021-09-15 15:53:18');
INSERT INTO public.transaccion VALUES (26, '13EJY1GEEP', 'Compra', 'CON', 1, 3.04, 4.00, '2021-09-15 15:53:19');
INSERT INTO public.transaccion VALUES (27, '0JQ1JUO4GQ', 'Compra', 'CON', 1, 1.00, 2.00, '2021-09-15 15:53:19');
INSERT INTO public.transaccion VALUES (28, 'PCZQXINDYS', 'Compra', 'CON', 1, 40.71, 5.00, '2021-09-15 15:53:19');
INSERT INTO public.transaccion VALUES (29, '54CQBLYHVX', 'Compra', 'CON', 1, 43.76, 1.00, '2021-09-15 15:53:20');
INSERT INTO public.transaccion VALUES (30, 'O6XH01CGZI', 'Compra', 'CON', 1, 60.54, 2.00, '2021-09-15 15:53:20');
INSERT INTO public.transaccion VALUES (31, 'YGIGP8JRP3', 'Compra', 'CON', 1, 44.91, 2.00, '2021-09-15 15:53:20');
INSERT INTO public.transaccion VALUES (32, '9XG8XRIZCX', 'Compra', 'CON', 1, 231.13, 2.00, '2021-09-15 15:53:21');
INSERT INTO public.transaccion VALUES (33, 'VFK3QC8FX8', 'Compra', 'CON', 1, 104.82, 2.00, '2021-09-15 15:53:21');
INSERT INTO public.transaccion VALUES (34, '5XZK7GM517', 'Compra', 'CON', 1, 179.51, 1.00, '2021-09-15 15:53:21');
INSERT INTO public.transaccion VALUES (45, 'O6XH01CGZI', 'Pago de tarjeta', 'PAG', NULL, 325.97, 0.00, '2021-09-15 18:53:33');
INSERT INTO public.transaccion VALUES (46, '49159YFZ9L', 'Compra materiales', 'CON', NULL, 131.91, NULL, '2021-09-15 21:09:38');


--
-- TOC entry 3611 (class 0 OID 0)
-- Dependencies: 203
-- Name: transaccion_cod_transaccion_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.transaccion_cod_transaccion_seq', 46, true);


--
-- TOC entry 3463 (class 2606 OID 16597)
-- Name: tarjeta_cliente pk_tarjeta_cliente; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tarjeta_cliente
    ADD CONSTRAINT pk_tarjeta_cliente PRIMARY KEY (cod_tarjeta_cliente);


--
-- TOC entry 3465 (class 2606 OID 16599)
-- Name: tarjeta_credito pk_tarjeta_credito; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tarjeta_credito
    ADD CONSTRAINT pk_tarjeta_credito PRIMARY KEY (cod_tarjeta_credito);


--
-- TOC entry 3467 (class 2606 OID 16601)
-- Name: transaccion pk_transaccion; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transaccion
    ADD CONSTRAINT pk_transaccion PRIMARY KEY (cod_transaccion);


--
-- TOC entry 3468 (class 2606 OID 16602)
-- Name: tarjeta_cliente fk_tarjeta__reference_tarjeta_; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tarjeta_cliente
    ADD CONSTRAINT fk_tarjeta__reference_tarjeta_ FOREIGN KEY (cod_tarjeta_credito) REFERENCES public.tarjeta_credito(cod_tarjeta_credito) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- TOC entry 3469 (class 2606 OID 16607)
-- Name: transaccion fk_transacc_reference_tarjeta_; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.transaccion
    ADD CONSTRAINT fk_transacc_reference_tarjeta_ FOREIGN KEY (cod_tarjeta_cliente) REFERENCES public.tarjeta_cliente(cod_tarjeta_cliente) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- TOC entry 3609 (class 0 OID 0)
-- Dependencies: 3
-- Name: SCHEMA public; Type: ACL; Schema: -; Owner: cloudsqlsuperuser
--

REVOKE ALL ON SCHEMA public FROM cloudsqladmin;
REVOKE ALL ON SCHEMA public FROM PUBLIC;
GRANT ALL ON SCHEMA public TO cloudsqlsuperuser;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2021-09-16 08:56:08

--
-- PostgreSQL database dump complete
--

