# Time Tracker Application

Ce référentiel contient le code source de l'application backend développée en utilisant Java et Spring Boot sous forme de microservices avec des modules. L'application de gestion du temps de travail des employés fournit une API pour gérer les fonctionnalités liées aux horaires, aux congés et aux rapports.

## Architecture

L'application backend est conçue avec une architecture basée sur les microservices et comprend les modules suivants :

- Module d'authentification : Gère l'authentification et l'autorisation des utilisateurs.
- Module d'horaires : Gère les enregistrements des heures de travail des employés et le calcul des heures travaillées.
- Module de congés : Gère la gestion des congés des employés, y compris les demandes de congés et les soldes de congés disponibles.
- Module de gestion des employés : Gère les profils des employés, y compris les compétences et les formations suivies.

Chaque module est un microservice indépendant qui peut être déployé et exécuté séparément, permettant une évolutivité et une maintenabilité accrues.

## Technologies utilisées

- Java 17
- Spring boot 3

## Configuration du projet
#### Cloner le referentiel

```
git clone https://github.com/marshall-dieme/time-tracker-app.git
```

#### Compiler et executer les modules

```
cd [nom du module]
mvn spring-boot:run
```

Assurez-vous d'adapter les instructions de configuration et d'exécution en fonction des spécificités de votre application et de votre environnement de développement.

## Contributions
Les contributions à ce projet sont les bienvenues ! Si vous souhaitez contribuer, veuillez suivre les étapes suivantes :

1. Fork du référentiel.
2. Créez une nouvelle branche pour votre fonctionnalité ou votre correction de bogue.
3. Effectuez vos modifications.
4. Soumettez une demande d'extraction (Pull Request).
