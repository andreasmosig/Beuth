#Expos� zum Softwaretechnik-Projekt
Beuth Hochschule f�r Technik Berlin, Wirtschaftsinformatik, 4. Semester, Sommersemester 2016

--------------------------------------------------

1) Projektname: #peat

--------------------------------------------------

2) Stammdaten

a) Gruppenmitglieder
- Thomas Ricklinkat (s58372@beuth-hochschule.de, Matr.-Nr. 821644)
- Andreas Mosig (s58395@beuth-hochschule.de, Matr.-Nr. 817272)
- Steven Pawellek (s45848@beuth-hochschule.de, Matr.-Nr. 776340)

b) Projektdauer
- Die Dauer des Projektes betr�gt 3,5 Monate und endet demnach in der ersten Monatsh�lfte im Juli.

c) Projektmanagement-Werkzeuge
- F�r den allgemeinen Austauch und f�r die Projekt- sowie interne Kommunikation mit dem Auftraggeber (Business Angel, im Nachfolgenden BA genannt) und allen Kommilitonen, wurde eine allgemein zug�ngliche Slack-Gruppe zu http://beuthswtprojekt.slack.com vom BA eingerichtet. Dar�ber hinaus verf�gt jede Projektgruppe ihren eigenen, prorjektinternen Slack-Kanal. F�r unser Projekt ist es der Kanal "peat".

- Das Projektmanagement findet via asana.com statt (https://app.asana.com/0/105766113985042/105766113985043), welches synchron mit unserem Slack-Kanal verbunden ist. Jegliche asana-Kommunikation ist im Slack-Kanal nachvollziehbar.

- F�r die agile Software-Entwicklung mit Scrum arbeiten wir mit easyBacklog.

- Das Versionsmanagement erfolgt via GitHub (Master-Branch: https://github.com/andreasmosig/peat). Analog zu asana laufen alle Aktivit�ten im privaten Slack-Kanal zusammen und sind f�r den BA einsehbar.
	
--------------------------------------------------

3) Kurzbeschreibung

Lernapp #peat (Android App)

Erlerntes spielend wiederholen und nie wieder vergessen! #peat hilft dir, dein erworbenes Wissen durch intelligente Wiederholung zu verfestigen und damit ins Langzeitged�chtnis zu �berf�hren. Und das funktioniert so: hinterlege in deinem Account offene oder geschlossene Fragen zu verschiedenen Themenbereichen sowie deren Antwortm�glichkeiten und sage #peat, wann bzw. wie h�ufig dich #peat abfragen soll. Fertig. #peat fragt dich ab sofort bequem per Push-Notification auf deinem Smartphone ab und du kannst die Frage direkt beantworten oder ignorieren. Am Ende des Tages kannst du dir deinen Lernerfolg darstellen lassen. Re #peat!

--------------------------------------------------

4) Projektziel & detaillierte Projektbeschreibung

Ausgehend von unserer Implementierungsidee einer Lernapp ergeben sich folgende Fragen hinsichtlich der L�sung und Umsetzung:

a) Inhaltliche Fragen (Ist-Analyse)
- Das Projektziel ist das Entwickeln einer Implementierungsidee f�r ein (virtuelles) Start-UP, hin zu einem lauff�higen Prototypen. Dieses soll dem BA, welcher sich als Business Angel versteht, pr�sentiert werden, um seine finanzielle Beteiligung an dem Projekt in H�he von 300.000 EUR zu erwirken. W�hrend des Entwicklungsprozesses ist des Weiteren eine ausf�hrliche Dokumentation zu erstellen (Vorgabe: ca. 20 Seiten inkl. Diagramme und ggf. Bildschirmfotografien). Neben der Projektdokumentation liegt der Fokus auf dem Kodieren (Applikation, Interfaces) und einer gesunden Gruppendynamik.

- Fachwissen aneignen: Es ist zu kl�ren, welche Arten von Fragen es gibt, welchen Einfluss diese wiederum auf das zu programmierende System haben k�nnen und welche wir schlussendlich abbilden wollen. Weiterhin muss analysiert werden, wie sich erworbenes Wissen durch eine intelligente Reihenfolge der Fragestellung, eine optimale Wiederholungsrate und ein automatisches Steuern der Zeitpunkte (Push-Notification, Wiederholungslogik) verfestigen und damit ins Langzeitged�chtnis �berf�hren l�sst. Hierbei geht es um die F�rderung des deklarativen Ged�chtnisses (Wissen und Fakten). Stetes Wiederholen hilft dabei, Informationen vernetzter zu speichern und sein Wissen zu festigen.

- Da der Projektfokus auf dem Programmieren liegt, ist die Grundlage der �berlegung diese Lernapp zu entwickeln, dass es auf dem Markt kein vergleichbares Produkt gibt und davon auszugehen ist, dass #peat seine Zielgruppe erreichen wird. Gedanken zur Marktanalyse sowie zur Durchf�hrbarkeit und Risikoanalyse werden hier daher nicht betrachtet, aber in der Enddokumentation kurz erl�utert. 

- Es muss sich mit den Stakeholdern und der Zielgruppe auseinandergesetzt werden, um zu verstehen, welche Interessengruppen hinsichtlich der Umsetzung und u.a. auch rechtlicher Belange zu ber�cksichtigen sind.

b) Technische Fragen (Soll-Konzept)
- Auf der Systemidee aufbauend, werden Anwendungsf�lle und Use Cases analysiert und modelliert (UML) und daraus wiederum R�ckschl�sse auf Systemanforderungen und -aufbau gezogen. Die modellierten Use Cases bilden anschlie�end die Basis f�r die vom System zu erf�llenden Funktionalit�ten (Bsp. benutzerseitige Konfiguration, Push-Notification):
![use-case](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-use-case.png)

- Es gilt herauszufinden, aus welchen Komponenten das System besteht und welche funktionalen Anforderungen die Komponenten erf�llen sollen. Daraus ergeben sich notwendige Schnittstellen, welche es in der Folge zu analysieren und umzusetzen gilt (Mensch-Maschine, Maschine-Maschine). Per heute ist davon auszugehen, dass es zwei Benutzeroberfl�chen geben wird (Web, App), die auf eine gemeinsame, auf einem Webserver installierte Datenbank (LAMP) zugreifen. Dabei dient die Web-GUI zum Erfassen und Lesen von Daten (Schreib-, Lesezugriff per Benutzerkonto), wohingegen die App-GUI das Lesen der Daten sowie das Konfigurieren der Wiederholungslogik zul�sst.

- Das entwickelte theoretische Konzept m�ndet schlussendlich im Design respektive in der Entwicklung eines explorativen Prototyps.

c) Projektbezogene Belange: siehe Punkt 6).

--------------------------------------------------

5) L�sungsweg und Entwicklung

a) Werkzeuge
- F�r die verschiedenen Komponenten und Schnittstellen sind unterschiedliche Technologien und Werkzeuge notwendig. Zum Entwickeln der Android-App in Java m�chten wir Eclipse sowie daf�r notwendige Plugins (Android Suite oder alternativ SDK/AVD, JUnit, etc.) verwenden. F�r die Weboberfl�che wird ein Webframework ben�tigt. Aktuell tendieren wir zu Bootstrap, ein auf CSS/LESS und JavaScript basierendes UI-Framework. F�r diverse Funktionaltit�ten, wie Bentnutzerkontensteuerung und Authentifizierung sind gegebenfalls andere Frameworks und zus�tlich ein Content Management System notwendig, deren Notwendigkeit uns aber Stand heute noch unbekannt ist (Ruby on Rails, Silverstripe). F�r die Erstellung des konzeptuellen und logischen Datenbankschemas werden wir DBDesignerFork verwenden und erzeugen daraus das entsprechende MySQL-DDL-Skript. Offen ist noch, wo wir mittels dieses Skripts die Datenbank aufsetzen. M�glich sind die Bereitstellung von Ressourcen seitens der Beuth Hochschule (Frage an Sie), die Anschaffung eines eigenen Webservers (SAAS - Frage Kosten?), oder die lokale Einrichtung eines Webservers (LAMP/XAMPP, Zugriff per DynDNS). Eine Anbindung an externe Webservices ist f�r unseren Prototypen nicht notwendig.

- Sonstige Tools sind Modellierungsprogramme, wie ArgoUML und UMLet, welche der theoretischen Konzeption der UML-Diagramme dienen (u.a. Use Cases, Paket-, Klassen-, Deployment- und Komponentendiagramm). Die Versionierung erfolgt �ber git, wie z.B. Github (siehe 3)).

b) Vorgehensweise
- Die Entwicklung findet agil statt (SCRUM) und soll umfassende und regelm��ige Refactorings und Tests (Android JUnit) sowie ein automatisiertes Deployment (Build XML) und beinhalten. Das Projekt soll zeitnah einen lauff�higen, explorativen (Schnittelstellen-) Prototyp (SPIKE, Durchschnitt) zur Folge haben.

c) Architekturbild (Vision)
- Bei unserem System handelt es sich um eine Client-Server-Architektur, mit Thin Client (Webbrowser) und einem Rich Client (Android App). Um die Systemarchitektur abzubilden, wurden sowohl ein Komponenten- als auch ein Deploymentdiagramm erstellt:
- Deployment-Diagramm:

![deployment](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-deployment.png)
- Paket-Diagramm:

![package](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-package.png)
- Komponenten-Diagramm:

![component](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-component.png)
- Daraus ergibt sich eine typische Mehrschichtenarchitektur (N-Tier) mit UI, Logiken, Persistenz/Datenbank.

d) Mockups
- App:

![Push] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/pushnotification.png)
![FrageJaNein] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/janeinfrage.png)
![Multiple] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/multiplechoice.png)
![Antwort] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/antwort.png)
![Einstellungen] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/einstellungen.png)
- Web:

![Landing] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/landing.png)
![Konfiguration] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/konfiguration.png)
	
--------------------------------------------------

6) Projektablauf

a) Milestone-Plan
- Sprint 0) Semesterstart (29.03.2016)
- Sprint 1) Projekt-KickOff E-Mail durch den BA (07.04.2016)
- Sprint 2) UML-Diagramme, Architekturbild, GUI-Entwurf (18.04.2016)
- Sprint 3) Expos� (18.04.2016)
- Sprint 4) Freigabe des Expos�s/Projekts durch den BA (23.04.2016)
- Sprint 5) Erstellung des Datenbankschemas
- Sprint 6) Einrichten des Webservers inkl. Datenbank
- Sprint 7) Erzeugung des Prototypen (App)
- Sprint 8) Erzeugung des Prototypen (Web)
- Sprint 9) Programmierung und Tests der Komponenten
- Sprint 10) Fertigstellung der Enddokumentation
- Sprint 11) Abgabe und Pr�sentation
- Sprint 12) Entgegenahme des Preisgeldes :)

b) Projektkommunikation
- Es gibt regelm��ig Austausch mit dem BA: Minimum alle zwei Wochen. Dank der direkten Anbindung mittels zweier	Werkzeuge (Github, Slack) ist es m�glich, ohne viel Aufwand und Wartezeit mit den Projektmitarbeitern und dem BA zu kommunizieren und eventuelle Anpassungen hinsichtlich der Terminabsprachen und Anforderungen an die Software vorzunehmen.

c) Statusberichte werden alle ein bis zwei Wochen per E-Mail an Herrn Prof. Dr. Edlich samt der Verlinkungen zu den bereits angesprochenen Tools geschickt.
