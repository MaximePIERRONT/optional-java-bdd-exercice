# Problème des Huit Dames

## Préambule

La moyenne de votre classe concernant mon module sont très mauvaises **(7 de moyenne)**. Je vous propose donc un exercice optionnel qui a pour **date limite de rendu le 28 juin**. **Il sera coefficient 0.75** (le projet était coefficient 1).

## La méthode d'évaluation est la suivante :

* La qualité de code (7 points)
* Vérification par le lancement des tests :
   * les tests unitaires (7 points)
   * les tests Cucumber (6 points)

## Description

Le problème des huit dames est un puzzle classique qui consiste à placer huit reines sur un échiquier de 8x8 de manière à ce qu'aucune reine ne puisse en attaquer une autre. Les règles sont les suivantes :
- Une reine peut attaquer toute pièce se trouvant sur la même ligne, colonne ou diagonale qu'elle.
- Aucune des huit reines ne doit être en position d'attaquer une autre reine.

## Objectif

L'objectif de cet exercice est de trouver une solution au problème des huit dames en utilisant des tests unitaires et des tests de comportement dirigé par le développement (BDD) avec Cucumber.

## Installation

0. Installation maven :
* Windows simple : https://community.chocolatey.org/packages/maven
* Mac simple : https://mkyong.com/maven/install-maven-on-mac-osx/
* Installation normal (Mac, Windows, Linux) : https://www.baeldung.com/install-maven-on-windows-linux-mac

1. Clonez ce dépôt :
    ```bash
    git clone <URL_du_dépôt>
    cd <nom_du_dépôt>
    ```

2. Construisez le projet avec Maven :
    ```bash
    mvn clean install
    ```

## Exécution des tests

Pour exécuter les tests unitaires et les tests Cucumber, utilisez la commande suivante :
```bash
mvn test
```


