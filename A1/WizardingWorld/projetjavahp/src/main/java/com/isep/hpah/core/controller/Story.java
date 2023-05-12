package com.isep.hpah.core.controller;

public class Story {
        public static void printIntro() {
                // Introduction à l'histoire
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Introduction");
                GameLogic.printSeparator(30);
                System.out.println(
                                "Après une journée ordinaire et être rentré(e) chez vous, vous recevez une mystérieuse lettre.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "En lisant ces lignes d\'encre couleur émeraude, vous apprenez que vous êtes admis(e) dans une école dont le nom vous est inconnu.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Vous le retenez néanmoins parfaitement ainsi que la manière dont il faut pour s\'y rendre « Poudlard, par le Poudlard Express voie 9.3/4 gare de King\'s\' Cross .");
                GameLogic.anythingToContinue();

                // Arrivée à King's Cross
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Arrivée à King's Cross");
                GameLogic.printSeparator(30);
                System.out.println(
                                "C'est enfin le jour de la rentrée à Poudlard. Malgré quelques difficultés, vous trouvez la voie 9.3/4 grâce à une famille aux cheveux rouge flamme qui s'y rendait également. Cette famille venait pour leur fils qui avait d'ailleurs mon âge.");
                GameLogic.anythingToContinue();

                // Arrivée à Poudlard
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Arrivée à Poudlard");
                GameLogic.printSeparator(30);
                System.out.println(
                                "Une fois arrivé(e), vous êtes comme paralysé(e). Vous trouvez devant vous un énorme et somptueux château, entouré d'un lac sombre et froid. On vous conduit à l'intérieur du bâtiment.");
                GameLogic.anythingToContinue();
                System.out.println("En haut des escaliers de l'entrée, c'est une vielle femme qui vous accueille : ");
                GameLogic.anythingToContinue();
                GameLogic.printSeparator(30);
                System.out.println(
                                "- McGonagall : Bonjour à toutes et à tous et bienvenue à Poudlard, l'une des écoles de sorcellerie des plus réputée. ");
                System.out.println("- Moi : Attendez quoi ?! Une école de sorciers ?");
                System.out.println(
                                "- McGonagall : C'est ici que vous apprendrez à manier la magie et comme chaque année, ce soir vous serez réparti dans quatre maisons : Poufsouffle, Gryffondor, Serdaigle et Serpentard. ");
                System.out.println(
                                "Entrez dans la Grande Salle pour que la cérémonie de la répartition puisse commencer.");
                GameLogic.anythingToContinue();

                // La Grande Salle
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("La Grande Salle");
                GameLogic.printSeparator(30);
                System.out.println(
                                "Vous entrez dans une salle immense avec quatre tables qui le sont tout autant. Au-dessus de chacune d'elles vous observez de grands drapeaux avec un animal représenté sur chaque : un serpent, un aigle, un lion et un blaireau.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Après un discours du directeur, un certain Albus Dumbledore, un premier élève est appelé sur l'estrade au fond de la salle, le professeur McGonagall pose alors un chapeau sur sa tête.");
                GameLogic.anythingToContinue();
                System.out.println("Moi : Quoi ? Le chapeau parle ?");
                GameLogic.anythingToContinue();
                System.out.println(
                                "En effet, après quelques secondes sur la tête de l'élève, le chapeau cria « Choixpeau : SERDAIGLE !!! ». Il fit de même avec un autre élève, puis un autre. ");
                GameLogic.anythingToContinue();
                System.out.println(
                                "C'est maintenant à votre tour de vous asseoir sur le tabouret. On vous dépose à peine le couvre-chef magique que vous entendez au fond de vous une petite voix : ");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Choixpeau : - Mmmmh … Intéressant … Vous êtes un cas complexe… J'ai du mal à vous cerner. Pour vous attribuer à une maison, j'aurai besoin de vous connaître un peu plus.");
                GameLogic.anythingToContinue();
                GameLogic.printSeparator(30);
                GameLogic.clearConsole();
        }

        public static void FirstActIntro() {
                // La Grande Salle
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("La grande salle");
                GameLogic.printSeparator(30);
                System.out.println(
                                "Après que tout le monde fut installé à leur tables respectives, le directeur reprit la parole.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Pr. Dumbledore : Bien ! Maintenant que vous êtes répartis dans vos différentes maisons, laissez-moi vous décrire le déroulé de votre scolarité. Les études de sorcellerie à Poudlard se déroulent en 7 ans. Au bout de votre 5ème année, vous aurez à passer vos B.U.S.E. : Brevets Universels de Sorcellerie Élémentaire.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Vous apprendrez au fil de ces années différents sortilèges, potions, créatures magiques et bien d'autres encore.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Je vous rappelle que la forêt située à côté de l'école est strictement interdite aux élèves et que le Quidditch ne sera pas praticable en raison des malheureux évènements qui se sont passés l'année dernière.");
                GameLogic.anythingToContinue();
                System.out.println("Je vous souhaite une bonne rentrée et vous invite à vous installer à votre table.");
                GameLogic.anythingToContinue();
                GameLogic.clearConsole();

                // Lettre dans la chambre
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Quelques semaines plus tard ...");
                GameLogic.printSeparator(30);
                System.out.println("Moi : - Cher parents.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Je vous informe que vous avez reçu cette lettre par hibou ! Eh oui c'est comme ça que communiquent les sorciers. Depuis la rentrée, nous avons appris tant de chose. Et aujourd'hui est un jour spécial car nous avons appris un vrai sortilège : « Wingardium Leviosa ». J'ai réussi à soulever une plume ! Un résultat très satisfaisant sachant qu'un élève a fait exploser la sienne...");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Je continuerai à vous envoyer des lettres régulièrement pour vous donner des nouvelles.\n Je pense fort à vous et vous embrasse.\n");
                GameLogic.clearConsole();

                // Halloween
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Halloween");
                GameLogic.printSeparator(30);
                System.out.println(
                                "Moi : Je passe mon premier Halloween à Poudlard. A l'occasion le château entier à été décoré, c'est vraiment magnifi….");
                GameLogic.anythingToContinue();
                GameLogic.clearConsole();

                // L'apparition du troll
                GameLogic.printSeparator(30);
                GameLogic.printHeading(" BRRRAOUUUMMM !!!!");
                GameLogic.printSeparator(30);
                System.out.println(
                                "Pr. Quirell : UN TROOOOOLLLL !!!! DANS LES CACHOTTS !! UN TROLL DANS LES CACHOTS !!!!");
                GameLogic.anythingToContinue();
                System.out.println("Je voulais vous prévenir ! (S'évanouit)");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Après le brouhaha des élèves en panique et les instructions du directeur nous ordonnant de rejoindre nos salles communes, j'ai suivi le préfet de ma maison. Quand du coin de l'œil, j'ai observé deux élèves dont un élève à lunettes et l'enfant aux cheveux roux de la gare se diriger à l'opposé de nous. Intrigué(e), je les ai suivis jusque dans les toilettes des filles. Ils étaient face à face avec … LE TROLL !");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Il avait déjà détruit les toilettes et avait le deuxième garçon sur ses épaules lorsque j'ai aperçu une jeune fille sous les lavabos. Pour aider ses camarades en détresse, l'enfant de la gare tenta d'utiliser « Wingardium Leviosa » sur le troll pour l'immobiliser mais il était bien trop lourd. J'ai alors eu l'idée de soulever des objets autour pour l'assommer.");
                GameLogic.anythingToContinue();
                GameLogic.clearConsole();
        }

        public static void FirstActOutro() {
                // Après le combat
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Toilettes des filles");
                GameLogic.printSeparator(30);
                System.out.println(
                                "Moi : J'ai réussi !! C'était moins une, le troll a bien failli écraser le garçon aux lunettes.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Harry Potter : Merci énormément ! Tu nous as sauvé la vie ! Moi c'est Harry Potter, lui c'est Ron Weasley et elle c'est Hermione Granger. Nous te devons une fière chandelle alors n'hésite pas si tu as besoin d'aide un jour !");
                GameLogic.anythingToContinue();
                GameLogic.clearConsole();
                System.out.println(
                                "A la suite de cette brève discussion, je suis reparti vers ma salle commune. Au même moment, à l'angle du couloir, je commençais à entendre des bruits de pas et la voix des professeurs. Ces trois-là vont passer un sale quart d'heure !");
                GameLogic.anythingToContinue();
                GameLogic.clearConsole();

                // Lettre
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Lettre aux parents");
                GameLogic.printSeparator(30);
                System.out.println("Moi : - Cher parents.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "L'année est bientôt terminée et j'ai hâte de vous retrouver pour tout vous raconter en détail. Nous avons nos examens de fin d'année dans deux semaines et grâce à mes révisions à la bibliothèque avec Hermione Granger, la fille dont je vous avais parlé dans ma lettre de Novembre, je me sens prêt.");
                GameLogic.anythingToContinue();
                System.out.println("Alors Souhaitez-moi bonne chance !");
                GameLogic.anythingToContinue();
                System.out.println("Je vous aime.");
        }

        public static void SecondActIntro() {
                // Lettre
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Lettre aux parents");
                GameLogic.printSeparator(30);
                System.out.println("Moi : - Cher parents.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Voilà seulement quelques mois que nous sommes de retour à Poudlard et d'étranges évènements se produisent. Ils ont commencé avec Miss Teigne, la chatte de Rusard le concierge de l'école. On l'a retrouvée pétrifiée et pendue dans les couloirs de l'école. ");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Ca a ensuite continué avec Colin Crivey, un élève de Gryffondor. Toute cette histoire me rend inquiet… Qui sera le prochain ?");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Je vous promets de vous écrire plus souvent pour vous donner de mes nouvelles. \n \n Je vous embrasse.");

                // La narration
                GameLogic.clearConsole();
                System.out.println(
                                "L'année avançait au fil des victimes du monstre de Poudlard. Les professeurs parlaient même de devoir fermer l'école.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Les victimes sont maintenant au nombre de 5 : Miss Teigne, Colin Crivey, Pénélope Deauclaire, Nick Quasi-Sans-Tête (un fantôme) et Justin Finch-Fletchey. J'ai peur, ça sera peut-être moi le prochain… ");
                GameLogic.anythingToContinue();
                System.out.println(
                                "En continuant à réviser mes examens avec Hermione Granger, je me suis un peu rapproché du trio qu'elle forme avec Harry et Ron. ");
                GameLogic.anythingToContinue();

                // Lettre bis
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Lettre aux parents");
                GameLogic.printSeparator(30);
                System.out.println("Moi : - Cher parents.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Aujourd'hui, le monstre a encore frappé mais plus proche de moi cette fois-ci. Il s'en est pris à Hermione.\n Je commence à avoir peur ");
                GameLogic.anythingToContinue();

                // Narration bis
                GameLogic.clearConsole();
                System.out.println(
                                "Peu de temps après avoir écrit cette lettre, Harry et Ron se sont un peu mis à l'écart. Un soir, inquiet pour eux, j'ai essayé d'aller les voir mais impossible de les trouver. C'est alors qu'en passant dans un couloir,  j'ai entendu des voix sortir de la salle de défense contre les forces du mal. Je me suis donc caché et j'ai vu le nouveau professeur, le célèbre Gilderoy Lockhart, sortir de la pièce et… Harry et Ron qui le menaçaient avec leur baguette ? ");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Avaient-ils perdu la tête ? J'avais remarqué leur comportement étrange depuis l'accident d'Hermione mais à en menacer des professeurs… Je les ai discrètement suivis pour savoir ce qu'ils manigançaient.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Ce n'est que devant les toilettes des Serpentard qu'il se sont arrêtés. Après quelques secondes, Harry à commencé à siffler. Je ne sais pas ce que c'était mais ce bruit semblable à celui d'un serpent à	fait bouger le lavabo. Surpris(e), je me suis cogné(e) contre la porte des toilettes. J'étais alors découvert mais Harry et Ron ne m'ont pas paru si étonnés.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Le lavabo ressemblait maintenant à l'entrée d'une grotte et ils avaient l'air déterminés à savoir ce qu'elle cachait. Après un saut à l'intérieur, nous avions quelques couloirs à parcourir. C'est en marchant que j'ai appris que la sœur de Ron, Ginny Weasley, avait été capturée par une bête dans cette grotte.");
                GameLogic.anythingToContinue();
                System.out.println("Moi : Pétrifié ? Mais alors toutes ses victimes c'est à cause de lui ? ");
                GameLogic.anythingToContinue();
                System.out.println("C'est un peu effrayé mais curieux que j'ai continué à les suivre. ");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Pendant notre route, le plafond s'est effondré et nous a séparé en deux groupes : Ron et Lockhart qui avaient maintenant pour but de faire marche arrière et d'appeler des secours et Harry et moi qui devions continuer à chercher Ginny. ");
                GameLogic.anythingToContinue();
                System.out.println(
                                "On s'est retrouvés devant une porte étrange et pour l'ouvrir Harry avait recommencé à siffler à la manière d'un serpent. Une fois passée, nous étions devant une énorme salle avec au fond une tête sculptée dans la pierre et un corps… Un corps ??? \n On s'est précipité vers celui-ci. C'était Ginny ! ");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Voulant dire à Harry qu'on avait réussi, je me suis retourné et je l'ai vu, debout, dans un état second. Il discutait seul et après avoir entendu le nom de Tom Jedusor, la bouche de la tête sculptée se mit à s'ouvrir puis on entendit quelque chose d'énorme ramper. ");
                GameLogic.anythingToContinue();
                System.out.println(
                                "On s'est tous les deux mis à courir vers la porte sachant ce que c'était. Le basilic était bien là, derrière nous prêt à nous dévorer.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Il n'était plus qu'à quelques mètres de nous quand, d'un trou au plafond donnant vers l'extérieur, un oiseau d'un rouge magnifique fonça sur la bête et lui déchira ses yeux à l'aide de ses serres tranchantes ne lui laissant que son ouïe pour se déplacer. Cela nous laissa juste le temps de nous cacher Harry et moi.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Alors que le basilic se rapprochait dangereusement de la cachette de Harry, je me mis à crier pour attirer le serpent loin de lui.");
                GameLogic.anythingToContinue();
                System.out.println("Je n’ai maintenant plus de choix, je dois le combattre.");
        }

        public static void SecondActOutro() {
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("La victoire");
                GameLogic.printSeparator(30);
                System.out.println(
                                "Le basilic est vaincu ! Pendant ce temps, Harry avait pris un croc de la bête et avait réussi à réveiller Ginny. Il m'expliqua alors que le journal que tenait Ginny dans les mains etait celui d'un mage noir appelé Tom Jédusor, le seigneur des ténèbres.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Moi : “Chers parents, \n Cette fin d'année a connu plein d'événements incroyables ! A commencer par la guérison des élèves pétrifiés. J'ai aussi battu un immense serpent ! Rassurez-vous, je vais bien. \n Je rentrerai bientôt à la maison. \n J'ai hâte de vous revoir.");
                GameLogic.anythingToContinue();
        }

        public static void ThirdActIntro() {
                // La lettre

                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("La lettre");
                GameLogic.printSeparator(30);
                System.out.println("Moi : “Chers parents, ");
                GameLogic.anythingToContinue();
                System.out.println("Encore une fois, l'année démarre sur les chapeaux de roues.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "En effet, avant même d'arriver à Poudlard, le train s'est arrêté et l'air s'est refroidi très vite. En regardant par la fenêtre, j'ai pu voir des hommes volants, vêtus de lambeaux noirs. ");
                GameLogic.anythingToContinue();
                System.out.println(
                                "On a appris plus tard par le directeur qu'il s'agissait de détraqueurs, les gardiens d'une prison dont un criminel s'est échappé. \n Ils sont donc à Poudlard pour nous protéger.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "On a aussi un nouveau professeur de défense contre les forces du mal. Il s'appelle Rémus Lupin et il est effrayant à cause des ses nombreuses et larges cicatrices qui couvrent son visage.  \n Je vous embrasse fort, \n A bientôt.");
                GameLogic.anythingToContinue();

                // Narration
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Cours de magie");
                GameLogic.printSeparator(30);
                System.out.println(
                                "Quelques semaines suivirent et nous avons eu notre premier enseignement en cours de défense contre les forces du mal. Le professeur Lupin a décidé de nous apprendre un sort pour éloigner les détraqueurs s' ils venaient à être agressifs envers nous. Ce sort s'appelle Expect… Expecta… Ah oui ! Expecto Patronum ! Selon lui, c'est un sort très compliqué qui ne s'apprend pas à notre niveau. Pour le réussir, il suffit de penser au moment de bonheur le plus intense de notre vie et de prononcer la formule.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Après quelques séances d'essais, je suis enfin parvenu à faire jaillir de ma baguette une lueur de lumière bleutée. Harry aussi avait abouti au même résultat ! Et il ne fallait pas beaucoup plus de séances pour achever notre maîtrise du sort. On pouvait maintenant lui et moi faire sortir une boule lumineuse et la déplacer comme bon nous semblait.");
                GameLogic.anythingToContinue();

                // Noël à Poudlard
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Noël à Poudlard");
                GameLogic.printSeparator(30);
                System.out.println(
                                "A la période de Noël était organisée une sortie dans un village à côté de Poudlard : Pré-au-Lard. J'ai eu la chance d'y aller et entre deux ruelles, j'ai cru entendre la voix d'une femme à l'agonie. Je me suis alors empressé(e) d'aller voir ce qu'il se passait et à peine m'étais-je  écarté(e) du chemin que j'ai senti toute la joie au fond de moi s'échapper. Je me fais attaquer par un détraqueur ! ");
                GameLogic.anythingToContinue();
        }

        public static void ThirdAct() {
                System.out.println(
                                "Après sa fuite, il ne me fallu pas plus de trois secondes pour rentrer au village et rejoindre Ron et Hermione dans la taverne des Trois-balais.");
                GameLogic.anythingToContinue();
                GameLogic.clearConsole();
                System.out.println(
                                "Je ne revis ces détraqueurs que quelques mois plus tard quand avec Harry Ron et Hermione, nous étions parti voir Hagrid le gardien des clés de Poudlard. L'arrivée soudaine du ministre de la magie et du directeur chez le demi-géant nous força à nous cacher derrière la maison. C'est alors que le rat de Ron s'enfuit à la vue d'une chien noir poursuivi par un détraqueur.");
                GameLogic.anythingToContinue();
                System.out.println(
                                "Le trio sans regarder derrière l'animal coururent à la poursuite du rat. Pour leur laisser du temps je pris la décision de combattre le détraqueur. Ils auront déjà bien des soucis avec le chien.");
        }

        public static void ThirdActOutro() {
                GameLogic.clearConsole();
                System.out.println(
                                "Moi : “Chers Parents, \n Les hommes du train sont en fait à la recherche d'un criminel nommé Sirius Black. J'ai dû en affronter quelques-uns grâce à un sortilège que notre nouveau professeur nous a appris. \n C'était encore une année mouvementée ! \n Je vous aime.”");
                GameLogic.anythingToContinue();
                GameLogic.clearConsole();
        }

        public static void FourthActIntro() {

        }

        public static void FourthActOutro() {

        }

        public static void FifthActIntro() {

        }

        public static void FifthActOutro() {

        }

        public static void SixthActIntro() {

        }

        public static void SixthActOutro() {

        }

        public static void SeventhActIntro() {

        }

        public static void SeventhActOutro() {

        }

}