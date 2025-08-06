## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

SPECS TAROT 

Une erreur technique m’a empêché de générer le fichier Word pour toi, mais je peux te fournir immédiatement **le contenu complet prêt à copier-coller dans Word**, Google Docs ou ton éditeur préféré.

---

## 📄 **Spécifications Fonctionnelles — Jeu de Tarot**

---

### ⚙️ 1. Initialisation

#### 1.1 Saisie des joueurs

L'utilisateur saisit entre 3 et 5 noms de joueurs. L'ordre d'entrée détermine :

* 1er joueur : **coupeur**
* 2e joueur : **donneur**
* 3e joueur : **premier à parler**

#### 1.2 Rotation des rôles

À chaque nouvelle partie :

* Le coupeur, le donneur et le premier à parler changent.
* L'ordre tourne de manière circulaire (**round-robin**).

Cela nécessite une gestion d’un **index d’incrémentation** (`roundIndex`).

#### 1.3 Classe dédiée : `GameSetup`

* Stocke les joueurs
* Calcule automatiquement les rôles à partir du compteur de manche
* Gère la distribution initiale et crée une instance de `GameLogic`

---

### 🃏 2. Distribution des cartes

#### 2.1 Règles selon le nombre de joueurs

| Joueurs | Cartes/joueur | Cartes au chien |
| ------- | ------------- | --------------- |
| 3       | 24            | 6               |
| 4       | 18            | 6               |
| 5       | 15            | 3               |

#### 2.2 Déroulement

* Le donneur distribue les cartes selon les règles ci-dessus.
* Les cartes restantes vont dans le **chien**, face cachée.
* (Optionnel) La distribution peut se faire par **lots de 3 cartes**.

---

### 🎭 3. Prise / Enchères

#### 3.1 Tour d'appel

Chaque joueur, dans l’ordre déterminé par `GameSetup`, peut :

* **Passer**
* Ou faire une **enchère** :

  * Petite
  * Garde
  * Garde Sans
  * Garde Contre

Les enchères sont **irréversibles** : on ne peut pas surenchérir après avoir passé.

Le premier joueur à faire une enchère devient **preneur**.

#### 3.2 Gestion des prises

Le back-end doit :

* Enregistrer chaque décision (`PASS`, `GARDE`, etc.)
* Déterminer le **preneur final**
* Stocker le **contrat choisi**

Si personne ne prend → la partie est annulée ou relancée (à définir).

---

### 🧺 4. Le Chien

#### 4.1 Règles

* Si la prise est **Petite** ou **Garde** :

  * Le preneur **intègre le chien à sa main**
  * Puis **écarte 6 cartes** (ou 3 si 5 joueurs)
  * Les cartes écartées **ne doivent pas contenir de bouts ni de rois**

* Si la prise est **Garde Sans** ou **Garde Contre** :

  * Le preneur **n’intègre pas le chien**
  * Les points du chien :

    * Garde Sans → vont au preneur
    * Garde Contre → vont aux défenseurs

#### 4.2 Gestion

* Les cartes du chien sont transférées dans la main du preneur (si applicable)
* Le preneur choisit manuellement les cartes à écarter

---

### 👑 5. Appel du Roi (uniquement à 5 joueurs)

#### 5.1 Règle

* Le preneur appelle un **roi** qu’il **ne possède pas**
* Le joueur qui détient ce roi devient l’**appelé** (son partenaire)
* Cas particuliers :

  * Roi appelé dans le chien → il joue seul
  * Il a les 4 rois → appelle une **dame**
  * Il a les 4 dames → appelle un **cavalier**
  * Il a tout → il joue seul par défaut

#### 5.2 Gestion

* Le preneur choisit la **couleur du roi/dame/cavalier**
* Le système identifie **l’appelé** (si la carte n’est pas dans le chien)

---

### 🔄 6. Enchaînement des parties

#### 6.1 Objectif

Permettre de jouer plusieurs manches :

* Rotation automatique des rôles
* Reset de l’état du jeu
* Conservation du score (si activé)

#### 6.2 Implémentation

* `GameSetup` garde un compteur de manches (`roundIndex`)
* `GameLogic` est instanciée via `GameSetup.startNewGame()`

---

### 🎮 7. Interaction UI (console ou graphique)

#### 7.1 Demandes utilisateur

* Saisie des noms
* Choix entre **passer ou annoncer un contrat**
* Sélection du **roi à appeler**
* Sélection des **cartes à écarter**
* (Plus tard) Sélection des **cartes à jouer**

---

### 📊 8. Score (facultatif pour l’instant)

* Système de points basé sur le contrat et les bouts
* Score cumulé par joueur
* Stockage dans une classe `ScoreBoard`


