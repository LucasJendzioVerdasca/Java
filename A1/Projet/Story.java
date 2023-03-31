public class Story {
        public static void printIntro() {               
                // Introduction à l'histoire
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Introduction");
                GameLogic.printSeparator(30);
                System.out.println("Après une journée ordinaire et être rentré(e) chez vous, vous recevez une mystérieuse lettre.");
                GameLogic.anythingToContinue();
                System.out.println("En lisant ces lignes d’encre couleur émeraude, vous apprenez que vous êtes admis(e) dans une école dont le nom vous est inconnu.");
                GameLogic.anythingToContinue();
                System.out.println("Vous le retenez néanmoins parfaitement ainsi que la manière dont il faut pour s’y rendre « Poudlard, par le Poudlard Express voie 9.3/4 gare de King’s Cross .");
                GameLogic.anythingToContinue();

                // Arrivée à King's Cross
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Arrivée à King's Cross");
                GameLogic.printSeparator(30);
                System.out.println("C’est enfin le jour de la rentrée à Poudlard. Malgré quelques difficultés, vous trouvez la voie 9.3/4 grâce à une famille aux cheveux rouge flamme qui s’y rendait également. Cette famille venait pour leur fils qui avait d’ailleurs mon âge.");
                GameLogic.anythingToContinue();

                // Arrivée à Poudlard
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Arrivée à Poudlard");
                GameLogic.printSeparator(30);
                System.out.println("Une fois arrivé(e), vous êtes comme paralysé(e). Vous trouvez devant vous un énorme et somptueux château, entouré d’un lac sombre et froid. On vous conduit à l’intérieur du bâtiment.");
                GameLogic.anythingToContinue();
                System.out.println("En haut des escaliers de l’entrée, c’est une vielle femme qui vous accueille : ");
                GameLogic.anythingToContinue();
                GameLogic.printSeparator(30);
                System.out.println("- McGonagall : Bonjour à toutes et à tous et bienvenue à Poudlard, l’une des écoles de sorcellerie des plus réputée. ");
                System.out.println("- Moi : Attendez quoi ?! Une école de sorciers ?");
                System.out.println("- McGonagall : C’est ici que vous apprendrez à manier la magie et comme chaque année, ce soir vous serez réparti dans quatre maisons : Poufsouffle, Gryffondor, Serdaigle et Serpentard. ");
                System.out.println("Entrez dans la Grande Salle pour que la cérémonie de la répartition puisse commencer.");
                GameLogic.anythingToContinue();

                // La Grande Salle
                GameLogic.clearConsole();
                GameLogic.printSeparator(30);
                GameLogic.printHeading("La Grande Salle");
                GameLogic.printSeparator(30);
                System.out.println("Vous entrez dans une salle immense avec quatre tables qui le sont tout autant. Au-dessus de chacune d’elles vous observez de grands drapeaux avec un animal représenté sur chaque : un serpent, un aigle, un lion et un blaireau.");
                GameLogic.anythingToContinue();
                System.out.println("Après un discours du directeur, un certain Albus Dumbledore, un premier élève est appelé sur l’estrade au fond de la salle, le professeur McGonagall pose alors un chapeau sur sa tête.");
                GameLogic.anythingToContinue();
                System.out.println("Moi : Quoi ? Le chapeau parle ?");
                GameLogic.anythingToContinue();
                System.out.println("En effet, après quelques secondes sur la tête de l’élève, le chapeau cria « Choixpeau : SERDAIGLE !!! ». Il fit de même avec un autre élève, puis un autre. ");
                GameLogic.anythingToContinue();
                System.out.println("C’est maintenant à votre tour de vous asseoir sur le tabouret. On vous dépose à peine le couvre-chef magique que vous entendez au fond de vous une petite voix : ");
                GameLogic.anythingToContinue();
                System.out.println("Choixpeau : - Mmmmh … Intéressant … Vous êtes un cas complexe… J’ai du mal à vous cerner. Pour vous attribuer à une maison, j’aurai besoin de vous connaître un peu plus.");
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
                System.out.println("Après que tout le monde fut installé à leur tables respectives, le directeur reprit la parole.");
                GameLogic.anythingToContinue();
                System.out.println("Pr. Dumbledore : Bien ! Maintenant que vous êtes répartis dans vos différentes maisons, laissez-moi vous décrire le déroulé de votre scolarité. Les études de sorcellerie à Poudlard se déroulent en 7 ans. Au bout de votre 5ème année, vous aurez à passer vos B.U.S.E. : Brevets Universels de Sorcellerie Élémentaire.");
                GameLogic.anythingToContinue();
                System.out.println("Vous apprendrez au fil de ces années différents sortilèges, potions, créatures magiques et bien d’autres encore.");
                GameLogic.anythingToContinue();
                System.out.println("Je vous rappelle que la forêt située à côté de l’école est strictement interdite aux élèves et que le Quidditch ne sera pas praticable en raison des malheureux évènements qui se sont passés l’année dernière.");
                GameLogic.anythingToContinue();
                System.out.println("Je vous souhaite une bonne rentrée et vous invite à vous installer à votre table.");
                GameLogic.anythingToContinue();
                GameLogic.clearConsole();

                //Lettre dans la chambre
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Quelques semaines plus tard ...");
                GameLogic.printSeparator(30);
                System.out.println("Moi : - Cher parents.");
                GameLogic.anythingToContinue();
                System.out.println("Je vous informe que vous avez reçu cette lettre par hibou ! Eh oui c’est comme ça que communiquent les sorciers. Depuis la rentrée, nous avons appris tant de chose. Et aujourd’hui est un jour spécial car nous avons appris un vrai sortilège : « Wingardium Leviosa ». J’ai réussi à soulever une plume ! Un résultat très satisfaisant sachant qu’un élève a fait exploser la sienne...");
                GameLogic.anythingToContinue();
                System.out.println("Je continuerai à vous envoyer des lettres régulièrement pour vous donner des nouvelles.\n Je pense fort à vous et vous embrasse.\n");
                GameLogic.clearConsole();

                // Halloween
                GameLogic.printSeparator(30);
                GameLogic.printHeading("Halloween");
                GameLogic.printSeparator(30);
                System.out.println("Moi : Je passe mon premier Halloween à Poudlard. A l’occasion le château entier à été décoré, c’est vraiment magnifi….");
                GameLogic.anythingToContinue();
                GameLogic.clearConsole();

                // L'apparition du troll
                GameLogic.printSeparator(30);
                GameLogic.printHeading(" BRRRAOUUUMMM !!!!");
                GameLogic.printSeparator(30);
                System.out.println("Pr. Quirell : UN TROOOOOLLLL !!!! DANS LES CACHOTTS !! UN TROLL DANS LES CACHOTS !!!!");
                GameLogic.anythingToContinue();
                System.out.println("Je voulais vous prévenir ! (S'évanouit)");
                GameLogic.anythingToContinue();
                System.out.println("Après le brouhaha des élèves en panique et les instructions du directeur nous ordonnant de rejoindre nos salles communes, j’ai suivi le préfet de ma maison. Quand du coin de l’œil j’ai observé deux élèves dont un élève à lunettes et l’enfant aux cheveux roux de la gare se diriger à l'opposé de nous. Intrigué(e), je les ai suivis jusque dans les toilettes des filles. Ils étaient face à face avec … LE TROLL !");
                GameLogic.anythingToContinue();
                System.out.println("Il avait déjà détruit les toilettes et avait le deuxième garçon sur ses épaules lorsque j’ai aperçu une jeune fille sous les lavabos. Pour aider ses camarades en détresse, l’enfant de la gare tenta d’utiliser « Wingardium Leviosa » sur le troll pour l’immobiliser mais il était bien trop lourd. J’ai alors eu l’idée de soulever des objets autour pour l’assommer.");
                GameLogic.anythingToContinue();
                GameLogic.clearConsole();
                GameLogic.anythingToContinue();
                GameLogic.clearConsole();
        }

        public static void FirstActOutro() {

        }

        public static void SecondActIntro() {

        }

        public static void SecondActOutro() {

        }

        public static void ThirdActIntro() {

        }

        public static void ThirdActOutro() {

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