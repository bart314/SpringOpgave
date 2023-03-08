# Opgave JPA voor de minor Application Design van bioinf

Als het goed is, wordt deze repo zelf gebouwd door `gradle`. Run na het bouwen de applicatie door de klasse `src/main/DemoApplication` te runnen. Hierdoor worden de endpoints die in de twee controllers worden gedefinieerd opengesteld.

Vul de database door gebruik te maken van een aantal `curl`-calls; er is een bestandje bijgevoegd (`fill-database.sh`) dat je kunt gebruiken om in één keer een aantal studenten en cursussen aan een nieuwe database toe te voegen:

```
less fill-database.sh | zsh
```

Bestudeer de code en maak vervolgens de volgende opgaven.

## Opgave 1
Maak een route in `Course` die een overzicht geeft van alle studenten (`name` en `id`) die die course volgen

## Opgave 2
Maak een route in `Course` waarmee je een student uit een course kunt verwijderen

## Opgave 3
Maak een nieuw model dat de cijfers bijhoudt. Een cijfer is een beoordeling die een student voor een course krijgt. 
Maak een controller voor dit model waarmee je cijfers kunt invoeren, alle cijfers voor een course en alle cijfers voor een student kunt krijgen.

## Opgave 4 (als er nog tijd is)
Maak thymeleaf templates voor al deze functionaliteit.
