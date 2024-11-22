# ChatOuss - Application de Chat en Temps Réel

**ChatOuss** est une application de messagerie en temps réel développée en **Java Spring Boot** pour le backend et intégrant un frontend en **HTML, CSS, et JavaScript** directement dans le même projet. Cette application permet aux utilisateurs de se connecter, de discuter en temps réel et d'avoir une expérience fluide grâce à l'intégration complète frontend-backend.

## Fonctionnalités

- 💬 **Chat en Temps Réel** : Échange instantané de messages entre utilisateurs connectés.  
- 👥 **Liste des Utilisateurs Actifs** : Affiche les utilisateurs actuellement en ligne.  
- 📱 **Interface Responsive** : Conçue pour être fonctionnelle sur tout type de support (mobile, tablette, desktop).  
- 🛠️ **Fullstack Intégré** : Le backend et le frontend sont gérés dans un seul projet pour une meilleure cohérence.  

## Technologies Utilisées

### Backend  
- **Java Spring Boot** : Framework backend pour la gestion des données et la logique métier.  
- **WebSocket** : Pour la communication en temps réel.  
- **PostgreSQL** : Base de données pour stocker les utilisateurs et leurs messages.  

### Frontend  
- **HTML5** : Construit les pages interactives de l'application.  
- **CSS3** : Fournit un style moderne et responsive.  
- **JavaScript (ES6)** : Assure le dynamisme du frontend, y compris la gestion des WebSockets.  

## Architecture

L'application suit une architecture **Fullstack Monolithique**, avec :  
- **Spring Boot** servant les fichiers HTML et gérant le backend.  
- Une intégration directe des fichiers statiques (`HTML`, `CSS`, `JS`) dans le dossier `resources/static`.

## Installation et Exécution

### Prérequis  
- **Java 17+**  
- **Maven**  
- **PostgreSQL**  

