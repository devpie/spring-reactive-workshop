# Spring Reactive Workshop 

## Agenda

* Intro in Reactive
    * Step Verifyer
    * Übungen mit Mono und Flux

* R2DBC and Flyway
* Spring Webflux
* Spring Security

* Weitere Themen
    * OAuth mit JWT
    * Webflux (Validierung)
    * ResponseEntity -> ServerResponse


## Setup

### Docker Desktop
* Stelle sicher, dass [Docker Desktop](https://www.docker.com/products/docker-desktop) installiert ist.

### Postgresql

* Docker Image runterladen mit `docker pull postgres:13`
* Postgresql starten mit  `docker run -–name postgres-cycling -e POSTGRES_DB=cycling -e POSTGRES_USER=docker -e POSTGRES_PASSWORD=docker -d -p 5432:5432 postgres:13`