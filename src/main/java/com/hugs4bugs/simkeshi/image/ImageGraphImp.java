package com.hugs4bugs.simkeshi.image;

import com.hugs4bugs.simkeshi.core.*;

public class ImageGraphImp {

    /*
    Amin aa Farzaneh, axs haye 10, 15, 16 da graph tashkil tapmirdi ona gora olari bixial oldum,
    axs haye kamili da ham GitLab goyoram ham da telegram nan yollaram, omid ast ke mofid vagee shavad.
     */

    static void image_1() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB1, 435);
        powerSource.addAdjacent(JB2, 360);
        JB2.addAdjacent(JB3, 330);
        JB2.addAdjacent(JB5, 360);
        JB3.addAdjacent(JB4, 95);
        JB5.addAdjacent(SW2, 230);
        SW2.addAdjacent(JB7, 85);
        JB7.addAdjacent(JB6, 140);
        JB7.addAdjacent(JB8, 360);
        JB8.addAdjacent(JB9, 120);
        JB8.addAdjacent(JB14, 290);
        JB14.addAdjacent(JB15, 280);
        JB15.addAdjacent(SW3, 250);
        SW3.addAdjacent(JB11, 30);
        JB11.addAdjacent(JB10, 20);
        JB11.addAdjacent(SW1, 280);
        SW1.addAdjacent(JB12, 115);
        JB12.addAdjacent(JB13, 115);
    }

    static void image_2() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB1, 325);
        powerSource.addAdjacent(JB14, 930);
        JB1.addAdjacent(JB2, 185);
        JB1.addAdjacent(JB8, 650);
        JB14.addAdjacent(JB13, 100);
        JB2.addAdjacent(SW1, 60);
        JB2.addAdjacent(SW2, 260);
        SW2.addAdjacent(JB6, 125);
        SW1.addAdjacent(JB3, 40);
        JB8.addAdjacent(JB10, 500);
        JB10.addAdjacent(JB9, 260);
        JB9.addAdjacent(SW3, 100);
        SW3.addAdjacent(JB7, 75);
        JB9.addAdjacent(JB5, 380);
        JB5.addAdjacent(JB4, 60);
        JB5.addAdjacent(JB11, 430);
        JB11.addAdjacent(JB12, 80);
    }

    static void image_3() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB1, 475);
        powerSource.addAdjacent(JB15, 350);
        JB15.addAdjacent(JB13, 370);
        JB13.addAdjacent(JB10, 90);
        JB15.addAdjacent(JB14, 390);
        JB14.addAdjacent(JB12, 370);
        JB12.addAdjacent(SW1, 60);
        SW1.addAdjacent(JB11, 75);
        JB12.addAdjacent(JB9, 365);
        JB9.addAdjacent(JB8, 125);
        JB9.addAdjacent(JB7, 280);
        JB7.addAdjacent(JB6, 270);
        JB6.addAdjacent(SW3, 175);
        SW3.addAdjacent(JB4, 100);
        JB4.addAdjacent(JB5, 30);
        JB4.addAdjacent(SW2, 300);
        SW2.addAdjacent(JB3, 130);
        JB3.addAdjacent(JB2, 120);
    }

    static void image_4() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);
        GraphNode JB16 = new GraphNode("JB16", GraphNodeType.JUNCTION_BOX);
        GraphNode JB17 = new GraphNode("JB17", GraphNodeType.JUNCTION_BOX);
        GraphNode JB18 = new GraphNode("JB18", GraphNodeType.JUNCTION_BOX);
        GraphNode JB19 = new GraphNode("JB19", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);

        powerSource.addAdjacent(SW1, 935);
        powerSource.addAdjacent(JB8, 330);
        SW1.addAdjacent(JB1, 115);
        JB8.addAdjacent(JB7, 180);
        JB7.addAdjacent(JB6, 125);
        JB7.addAdjacent(SW2, 280);
        SW2.addAdjacent(JB10, 90);
        JB8.addAdjacent(JB9, 655);
        JB9.addAdjacent(JB12, 500);
        JB12.addAdjacent(JB13, 265);
        JB13.addAdjacent(SW3, 100);
        SW3.addAdjacent(JB11, 85);
        JB13.addAdjacent(JB4, 380);
        JB4.addAdjacent(JB5, 55);
        JB4.addAdjacent(JB3, 415);
        JB3.addAdjacent(JB2, 80);
    }

    static void image_5() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);
        GraphNode JB16 = new GraphNode("JB16", GraphNodeType.JUNCTION_BOX);
        GraphNode JB17 = new GraphNode("JB17", GraphNodeType.JUNCTION_BOX);
        GraphNode JB18 = new GraphNode("JB18", GraphNodeType.JUNCTION_BOX);
        GraphNode JB19 = new GraphNode("JB19", GraphNodeType.JUNCTION_BOX);
        GraphNode JB20 = new GraphNode("JB20", GraphNodeType.JUNCTION_BOX);
        GraphNode JB21 = new GraphNode("JB21", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);
        GraphNode SW4 = new GraphNode("SW4", GraphNodeType.SWITCH);
        GraphNode SW5 = new GraphNode("SW5", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB1, 470);
        powerSource.addAdjacent(JB2, 360);
        JB2.addAdjacent(SW1, 80);
        SW1.addAdjacent(JB3, 65);
        JB2.addAdjacent(JB8, 450);
        JB8.addAdjacent(JB7, 450);
        JB7.addAdjacent(JB21, 345);
        JB21.addAdjacent(JB6, 180);
        JB1.addAdjacent(JB5, 350);
        JB5.addAdjacent(SW2, 90);
        SW2.addAdjacent(JB4, 90);
        JB1.addAdjacent(JB9, 470);
        JB9.addAdjacent(SW3, 180);
        SW3.addAdjacent(JB11, 130);
        JB11.addAdjacent(JB12, 145);
        JB9.addAdjacent(JB10, 470);
        JB10.addAdjacent(JB14, 310);
        JB14.addAdjacent(SW4, 90);
        SW4.addAdjacent(JB13, 90);
        JB14.addAdjacent(SW5, 60);
        SW5.addAdjacent(JB15, 415);
        JB15.addAdjacent(JB16, 175);
        JB17.addAdjacent(JB18, 170);
        JB18.addAdjacent(JB19, 350);
        JB19.addAdjacent(JB20, 155);
    }

    static void image_6() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB1, 170);
        powerSource.addAdjacent(JB3, 820);
        JB3.addAdjacent(JB6, 460);
        JB6.addAdjacent(JB4, 460);
        JB4.addAdjacent(SW2, 80);
        SW2.addAdjacent(JB15, 80);
        JB4.addAdjacent(JB5, 350);
        JB5.addAdjacent(SW1, 90);
        SW1.addAdjacent(JB2, 60);
        JB6.addAdjacent(JB7, 465);
        JB7.addAdjacent(JB8, 240);
        JB7.addAdjacent(JB9, 470);
        JB9.addAdjacent(JB10, 820);
        JB10.addAdjacent(JB11, 470);
        JB11.addAdjacent(SW3, 290);
        SW3.addAdjacent(JB12, 75);
        JB12.addAdjacent(JB13, 90);
        JB12.addAdjacent(JB14, 160);
    }

    static void image_7() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);
        GraphNode JB16 = new GraphNode("JB16", GraphNodeType.JUNCTION_BOX);


        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);
        GraphNode SW4 = new GraphNode("SW4", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB1, 790);
        powerSource.addAdjacent(JB16, 1395);
        JB1.addAdjacent(SW1, 110);
        SW1.addAdjacent(JB15, 40);
        JB16.addAdjacent(SW4, 350);
        SW4.addAdjacent(JB12, 100);
        JB12.addAdjacent(JB13, 130);
        JB12.addAdjacent(JB11, 340);
        JB11.addAdjacent(JB10, 450);
        JB10.addAdjacent(JB9, 110);
        JB9.addAdjacent(JB8, 200);
        JB8.addAdjacent(SW3, 90);
        SW3.addAdjacent(JB14, 80);
        JB8.addAdjacent(JB7, 145);
        JB9.addAdjacent(JB4, 490);
        JB4.addAdjacent(JB5, 210);
        JB5.addAdjacent(SW2, 150);
        SW2.addAdjacent(JB6, 50);
        JB4.addAdjacent(JB3, 125);
        JB3.addAdjacent(JB2, 170);
    }

    static void image_8() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);
        GraphNode JB16 = new GraphNode("JB16", GraphNodeType.JUNCTION_BOX);
        GraphNode JB17 = new GraphNode("JB17", GraphNodeType.JUNCTION_BOX);
        GraphNode JB18 = new GraphNode("JB18", GraphNodeType.JUNCTION_BOX);
        GraphNode JB19 = new GraphNode("JB19", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);
        GraphNode SW4 = new GraphNode("SW4", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB8, 380);
        JB8.addAdjacent(JB7, 300);
        JB7.addAdjacent(JB6, 450);
        JB6.addAdjacent(SW1, 70);
        SW1.addAdjacent(JB5, 45);
        JB6.addAdjacent(JB3, 300);
        JB3.addAdjacent(JB4, 375);
        JB4.addAdjacent(JB2, 300);
        JB2.addAdjacent(JB1, 110);
        JB2.addAdjacent(SW2, 500);
        SW2.addAdjacent(JB19, 60);
        JB19.addAdjacent(JB13, 100);
        powerSource.addAdjacent(SW4, 300);
        SW4.addAdjacent(JB18, 250);
        JB18.addAdjacent(JB9, 140);
        JB18.addAdjacent(JB17, 260);
        JB17.addAdjacent(JB16, 370);
        JB16.addAdjacent(JB11, 260);
        JB11.addAdjacent(SW3, 25);
        SW3.addAdjacent(JB10, 50);
        JB11.addAdjacent(JB12, 290);
        JB12.addAdjacent(JB15, 260);
        JB15.addAdjacent(JB14, 160);
    }

    static void image_9() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB12, 765);
        JB12.addAdjacent(JB13, 270);
        JB12.addAdjacent(JB11, 130);
        powerSource.addAdjacent(JB1, 45);
        powerSource.addAdjacent(SW1, 65);
        SW1.addAdjacent(JB2, 290);
        JB2.addAdjacent(JB3, 220);
        JB3.addAdjacent(SW2, 100);
        SW2.addAdjacent(JB4, 80);
        JB3.addAdjacent(JB7, 255);
        JB7.addAdjacent(JB8, 360);
        JB8.addAdjacent(JB6, 240);
        JB6.addAdjacent(JB5, 60);
        JB8.addAdjacent(JB9, 55);
        JB9.addAdjacent(SW3, 190);
        SW3.addAdjacent(JB14, 80);
        JB9.addAdjacent(JB10, 500);
    }

    static void image_11() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);
        GraphNode JB16 = new GraphNode("JB16", GraphNodeType.JUNCTION_BOX);
        GraphNode JB17 = new GraphNode("JB17", GraphNodeType.JUNCTION_BOX);
        GraphNode JB18 = new GraphNode("JB18", GraphNodeType.JUNCTION_BOX);
        GraphNode JB19 = new GraphNode("JB19", GraphNodeType.JUNCTION_BOX);
        GraphNode JB20 = new GraphNode("JB20", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);
        GraphNode SW4 = new GraphNode("SW4", GraphNodeType.SWITCH);
        GraphNode SW5 = new GraphNode("SW5", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB1, 340);
        powerSource.addAdjacent(JB6, 700);
        JB6.addAdjacent(JB7, 60);
        JB6.addAdjacent(JB20, 530);
        JB20.addAdjacent(SW4, 160);
        SW4.addAdjacent(JB13, 100);
        JB13.addAdjacent(JB12, 190);
        JB13.addAdjacent(JB15, 260);
        JB15.addAdjacent(JB14, 220);
        JB15.addAdjacent(SW5, 230);
        SW5.addAdjacent(JB17, 240);
        JB17.addAdjacent(JB19, 530);
        JB19.addAdjacent(JB18, 480);
        JB18.addAdjacent(JB16, 170);
        JB18.addAdjacent(JB9, 255);
        JB9.addAdjacent(JB8, 45);
        JB9.addAdjacent(SW3, 115);
        SW3.addAdjacent(JB11, 80);
        JB18.addAdjacent(SW2, 140);
        SW2.addAdjacent(JB5, 200);
        JB5.addAdjacent(JB4, 480);
        JB4.addAdjacent(JB3, 345);
        JB3.addAdjacent(SW1, 475);
        SW1.addAdjacent(JB2, 40);
    }

    static void image_12() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);
        GraphNode JB16 = new GraphNode("JB16", GraphNodeType.JUNCTION_BOX);
        GraphNode JB17 = new GraphNode("JB17", GraphNodeType.JUNCTION_BOX);
        GraphNode JB18 = new GraphNode("JB18", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);
        GraphNode SW4 = new GraphNode("SW4", GraphNodeType.SWITCH);
        GraphNode SW5 = new GraphNode("SW5", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB1, 490);
        powerSource.addAdjacent(JB3, 450);
        JB3.addAdjacent(JB4, 55);
        JB3.addAdjacent(SW4, 215);
        SW4.addAdjacent(JB8, 240);
        JB8.addAdjacent(JB9, 230);
        JB9.addAdjacent(JB6, 440);
        JB6.addAdjacent(JB7, 70);
        JB6.addAdjacent(JB5, 40);
        JB9.addAdjacent(JB12, 260);
        JB12.addAdjacent(SW3, 300);
        SW3.addAdjacent(JB11, 130);
        JB11.addAdjacent(JB10, 55);
        JB11.addAdjacent(JB13, 280);
        JB13.addAdjacent(JB14, 35);
        JB13.addAdjacent(JB15, 450);
        JB15.addAdjacent(JB18, 260);
        JB18.addAdjacent(SW2, 380);
        SW2.addAdjacent(JB17, 60);
        JB17.addAdjacent(JB16, 80);
        JB17.addAdjacent(JB4, 450);
        JB4.addAdjacent(SW1, 330);
        SW1.addAdjacent(JB2, 70);
    }

    static void image_13() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);
        GraphNode JB16 = new GraphNode("JB16", GraphNodeType.JUNCTION_BOX);
        GraphNode JB17 = new GraphNode("JB17", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);
        GraphNode SW4 = new GraphNode("SW4", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB2, 630);
        JB2.addAdjacent(JB5, 630);
        JB5.addAdjacent(SW1, 120);
        SW1.addAdjacent(JB3, 80);
        JB5.addAdjacent(JB6, 530);
        JB6.addAdjacent(JB7, 540);
        powerSource.addAdjacent(JB1, 315);
        JB1.addAdjacent(JB13, 80);
        JB1.addAdjacent(JB12, 315);
        JB12.addAdjacent(JB4, 320);
        JB12.addAdjacent(SW3, 200);
        SW3.addAdjacent(JB11, 80);
        powerSource.addAdjacent(JB15, 510);
        JB15.addAdjacent(JB14, 310);
        JB14.addAdjacent(SW2, 215);
        SW2.addAdjacent(JB16, 60);
        JB14.addAdjacent(JB10, 450);
        JB10.addAdjacent(JB17, 105);
        JB10.addAdjacent(JB9, 520);
        JB9.addAdjacent(SW4, 35);
        SW4.addAdjacent(JB8, 60);
    }

    static void image_14() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);
        GraphNode JB16 = new GraphNode("JB16", GraphNodeType.JUNCTION_BOX);
        GraphNode JB17 = new GraphNode("JB17", GraphNodeType.JUNCTION_BOX);
        GraphNode JB18 = new GraphNode("JB18", GraphNodeType.JUNCTION_BOX);
        GraphNode JB19 = new GraphNode("JB19", GraphNodeType.JUNCTION_BOX);
        GraphNode JB20 = new GraphNode("JB20", GraphNodeType.JUNCTION_BOX);
        GraphNode JB21 = new GraphNode("JB21", GraphNodeType.JUNCTION_BOX);
        GraphNode JB22 = new GraphNode("JB22", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);
        GraphNode SW4 = new GraphNode("SW4", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB1, 470);
        powerSource.addAdjacent(JB9, 500);
        JB9.addAdjacent(JB10, 45);
        JB9.addAdjacent(SW3, 120);
        SW3.addAdjacent(JB8, 190);
        JB8.addAdjacent(JB13, 580);
        JB13.addAdjacent(JB14, 630);
        JB14.addAdjacent(JB15, 590);
        JB15.addAdjacent(JB12, 80);
        JB12.addAdjacent(JB11, 40);
        JB12.addAdjacent(JB7, 280);
        JB7.addAdjacent(JB6, 140);
        JB15.addAdjacent(JB17, 430);
        JB17.addAdjacent(JB18, 240);
        JB17.addAdjacent(JB16, 590);
        JB16.addAdjacent(JB21, 630);
        JB21.addAdjacent(JB20, 590);
        JB20.addAdjacent(SW4, 140);
        SW4.addAdjacent(JB22, 65);
        JB22.addAdjacent(JB19, 35);
        JB22.addAdjacent(JB4, 280);
        JB4.addAdjacent(SW2, 580);
        SW2.addAdjacent(JB5, 70);
        JB4.addAdjacent(JB3, 230);
        JB3.addAdjacent(SW1, 450);
        SW1.addAdjacent(JB2, 85);
    }

    static void image_17() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);
        GraphNode JB16 = new GraphNode("JB16", GraphNodeType.JUNCTION_BOX);
        GraphNode JB17 = new GraphNode("JB17", GraphNodeType.JUNCTION_BOX);
        GraphNode JB18 = new GraphNode("JB18", GraphNodeType.JUNCTION_BOX);
        GraphNode JB19 = new GraphNode("JB19", GraphNodeType.JUNCTION_BOX);
        GraphNode JB20 = new GraphNode("JB20", GraphNodeType.JUNCTION_BOX);
        GraphNode JB21 = new GraphNode("JB21", GraphNodeType.JUNCTION_BOX);
        GraphNode JB22 = new GraphNode("JB22", GraphNodeType.JUNCTION_BOX);
        GraphNode JB23 = new GraphNode("JB23", GraphNodeType.JUNCTION_BOX);
        GraphNode JB24 = new GraphNode("JB24", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);
        GraphNode SW4 = new GraphNode("SW4", GraphNodeType.SWITCH);
        GraphNode SW5 = new GraphNode("SW5", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB1, 310);
        powerSource.addAdjacent(JB9, 480);
        JB9.addAdjacent(SW2, 140);
        SW2.addAdjacent(JB10, 300);
        JB10.addAdjacent(JB11, 200);
        JB11.addAdjacent(JB12, 700);
        JB12.addAdjacent(JB13, 35);
        JB12.addAdjacent(SW3, 60);
        SW3.addAdjacent(JB14, 80);
        JB14.addAdjacent(JB15, 190);
        JB14.addAdjacent(JB21, 50);
        JB21.addAdjacent(JB20, 115);
        JB21.addAdjacent(SW5, 150);
        SW5.addAdjacent(JB22, 500);
        JB22.addAdjacent(JB4, 430);
        JB4.addAdjacent(JB5, 310);
        JB6.addAdjacent(JB8, 180);
        JB8.addAdjacent(JB7, 30);
        JB4.addAdjacent(JB3, 480);
        JB3.addAdjacent(SW1, 360);
        SW1.addAdjacent(JB2, 80);
        JB22.addAdjacent(JB23, 360);
        JB23.addAdjacent(JB19, 640);
        JB19.addAdjacent(JB24, 110);
        JB19.addAdjacent(JB18, 710);
        JB18.addAdjacent(JB17, 430);
        JB17.addAdjacent(SW4, 310);
        SW4.addAdjacent(JB16, 60);
    }

    static void image_18() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);
        GraphNode JB16 = new GraphNode("JB16", GraphNodeType.JUNCTION_BOX);
        GraphNode JB17 = new GraphNode("JB17", GraphNodeType.JUNCTION_BOX);
        GraphNode JB18 = new GraphNode("JB18", GraphNodeType.JUNCTION_BOX);
        GraphNode JB19 = new GraphNode("JB19", GraphNodeType.JUNCTION_BOX);
        GraphNode JB20 = new GraphNode("JB20", GraphNodeType.JUNCTION_BOX);
        GraphNode JB21 = new GraphNode("JB21", GraphNodeType.JUNCTION_BOX);
        GraphNode JB22 = new GraphNode("JB22", GraphNodeType.JUNCTION_BOX);
        GraphNode JB23 = new GraphNode("JB23", GraphNodeType.JUNCTION_BOX);
        GraphNode JB24 = new GraphNode("JB24", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);
        GraphNode SW4 = new GraphNode("SW4", GraphNodeType.SWITCH);
        GraphNode SW5 = new GraphNode("SW5", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB22, 1270);
        JB22.addAdjacent(JB21, 180);
        JB22.addAdjacent(JB23, 340);
        JB23.addAdjacent(JB24, 590);
        JB24.addAdjacent(JB18, 870);
        JB18.addAdjacent(JB19, 590);
        JB19.addAdjacent(SW5, 120);
        SW5.addAdjacent(JB20, 100);
        JB19.addAdjacent(JB17, 430);
        JB18.addAdjacent(JB16, 880);
        JB16.addAdjacent(JB14, 590);
        JB14.addAdjacent(SW4, 190);
        SW4.addAdjacent(JB15, 110);
        JB14.addAdjacent(JB13, 135);
        powerSource.addAdjacent(JB1, 390);
        JB1.addAdjacent(JB3, 530);
        JB3.addAdjacent(JB4, 250);
        JB1.addAdjacent(JB2, 330);
        JB2.addAdjacent(JB6, 520);
        JB6.addAdjacent(JB7, 150);
        JB6.addAdjacent(SW1, 120);
        SW1.addAdjacent(JB5, 110);
        JB2.addAdjacent(JB11, 980);
        JB11.addAdjacent(JB10, 510);
        JB10.addAdjacent(SW2, 320);
        SW2.addAdjacent(JB9, 275);
        JB9.addAdjacent(JB8, 90);
        JB9.addAdjacent(SW3, 370);
        SW3.addAdjacent(JB12, 110);
    }

    static void image_19() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);
        GraphNode JB16 = new GraphNode("JB16", GraphNodeType.JUNCTION_BOX);
        GraphNode JB17 = new GraphNode("JB17", GraphNodeType.JUNCTION_BOX);
        GraphNode JB18 = new GraphNode("JB18", GraphNodeType.JUNCTION_BOX);
        GraphNode JB19 = new GraphNode("JB19", GraphNodeType.JUNCTION_BOX);
        GraphNode JB20 = new GraphNode("JB20", GraphNodeType.JUNCTION_BOX);
        GraphNode JB21 = new GraphNode("JB21", GraphNodeType.JUNCTION_BOX);
        GraphNode JB22 = new GraphNode("JB22", GraphNodeType.JUNCTION_BOX);
        GraphNode JB23 = new GraphNode("JB23", GraphNodeType.JUNCTION_BOX);
        GraphNode JB24 = new GraphNode("JB24", GraphNodeType.JUNCTION_BOX);
        GraphNode JB25 = new GraphNode("JB25", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);
        GraphNode SW4 = new GraphNode("SW4", GraphNodeType.SWITCH);
        GraphNode SW5 = new GraphNode("SW5", GraphNodeType.SWITCH);
        GraphNode SW6 = new GraphNode("SW6", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB1, 300);
        JB1.addAdjacent(JB3, 220);
        JB1.addAdjacent(SW1, 150);
        JB1.addAdjacent(JB3, 220);
        SW1.addAdjacent(JB2, 665);
        JB2.addAdjacent(JB5, 620);
        JB5.addAdjacent(JB6, 650);
        JB6.addAdjacent(JB4, 275);
        JB6.addAdjacent(SW2, 110);
        SW2.addAdjacent(JB7, 120);
        JB5.addAdjacent(JB9, 630);
        JB9.addAdjacent(JB10, 650);
        JB10.addAdjacent(JB8, 260);
        JB10.addAdjacent(JB11, 335);
        JB11.addAdjacent(SW3, 140);
        SW3.addAdjacent(JB12, 70);
        powerSource.addAdjacent(JB24, 650);
        JB24.addAdjacent(JB23, 400);
        JB23.addAdjacent(SW4, 110);
        SW4.addAdjacent(JB22, 110);
        JB23.addAdjacent(SW5, 140);
        SW5.addAdjacent(JB25, 520);
        JB25.addAdjacent(JB21, 620);
        JB21.addAdjacent(JB19, 660);
        JB19.addAdjacent(JB20, 260);
        JB19.addAdjacent(JB18, 140);
        JB21.addAdjacent(JB17, 630);
        JB17.addAdjacent(JB15, 660);
        JB15.addAdjacent(SW6, 275);
        SW6.addAdjacent(JB16, 50);
        JB15.addAdjacent(JB14, 225);
        JB14.addAdjacent(JB13, 310);
    }

    static void image_20() {
        GraphNode powerSource = new GraphNode("Power Source", GraphNodeType.POWER_SOURCE);

        GraphNode JB1 = new GraphNode("JB1", GraphNodeType.JUNCTION_BOX);
        GraphNode JB2 = new GraphNode("JB2", GraphNodeType.JUNCTION_BOX);
        GraphNode JB3 = new GraphNode("JB3", GraphNodeType.JUNCTION_BOX);
        GraphNode JB4 = new GraphNode("JB4", GraphNodeType.JUNCTION_BOX);
        GraphNode JB5 = new GraphNode("JB5", GraphNodeType.JUNCTION_BOX);
        GraphNode JB6 = new GraphNode("JB6", GraphNodeType.JUNCTION_BOX);
        GraphNode JB7 = new GraphNode("JB7", GraphNodeType.JUNCTION_BOX);
        GraphNode JB8 = new GraphNode("JB8", GraphNodeType.JUNCTION_BOX);
        GraphNode JB9 = new GraphNode("JB9", GraphNodeType.JUNCTION_BOX);
        GraphNode JB10 = new GraphNode("JB10", GraphNodeType.JUNCTION_BOX);
        GraphNode JB11 = new GraphNode("JB11", GraphNodeType.JUNCTION_BOX);
        GraphNode JB12 = new GraphNode("JB12", GraphNodeType.JUNCTION_BOX);
        GraphNode JB13 = new GraphNode("JB13", GraphNodeType.JUNCTION_BOX);
        GraphNode JB14 = new GraphNode("JB14", GraphNodeType.JUNCTION_BOX);
        GraphNode JB15 = new GraphNode("JB15", GraphNodeType.JUNCTION_BOX);
        GraphNode JB16 = new GraphNode("JB16", GraphNodeType.JUNCTION_BOX);
        GraphNode JB17 = new GraphNode("JB17", GraphNodeType.JUNCTION_BOX);
        GraphNode JB18 = new GraphNode("JB18", GraphNodeType.JUNCTION_BOX);
        GraphNode JB19 = new GraphNode("JB19", GraphNodeType.JUNCTION_BOX);
        GraphNode JB20 = new GraphNode("JB20", GraphNodeType.JUNCTION_BOX);
        GraphNode JB21 = new GraphNode("JB21", GraphNodeType.JUNCTION_BOX);
        GraphNode JB22 = new GraphNode("JB22", GraphNodeType.JUNCTION_BOX);
        GraphNode JB23 = new GraphNode("JB23", GraphNodeType.JUNCTION_BOX);
        GraphNode JB24 = new GraphNode("JB24", GraphNodeType.JUNCTION_BOX);
        GraphNode JB25 = new GraphNode("JB25", GraphNodeType.JUNCTION_BOX);

        GraphNode SW1 = new GraphNode("SW1", GraphNodeType.SWITCH);
        GraphNode SW2 = new GraphNode("SW2", GraphNodeType.SWITCH);
        GraphNode SW3 = new GraphNode("SW3", GraphNodeType.SWITCH);
        GraphNode SW4 = new GraphNode("SW4", GraphNodeType.SWITCH);
        GraphNode SW5 = new GraphNode("SW5", GraphNodeType.SWITCH);
        GraphNode SW6 = new GraphNode("SW6", GraphNodeType.SWITCH);

        powerSource.addAdjacent(JB2, 515);
        JB2.addAdjacent(JB3, 650);
        JB3.addAdjacent(SW3, 250);
        SW3.addAdjacent(JB4, 100);
        JB3.addAdjacent(SW1, 400);
        SW1.addAdjacent(JB5, 175);
        JB2.addAdjacent(JB1, 190);
        JB1.addAdjacent(JB19, 1550);
        JB19.addAdjacent(SW2, 140);
        SW2.addAdjacent(JB20, 60);
        powerSource.addAdjacent(JB9, 2440);
        JB9.addAdjacent(SW2, 260);
        SW2.addAdjacent(JB8, 240);
        JB8.addAdjacent(JB7, 720);
        JB7.addAdjacent(JB6, 340);
        JB7.addAdjacent(JB10, 290);
        JB8.addAdjacent(JB18, 780);
        JB18.addAdjacent(JB17, 730);
        JB17.addAdjacent(JB16, 420);
        JB17.addAdjacent(SW5, 245);
        SW5.addAdjacent(JB12, 100);
        JB17.addAdjacent(JB23, 320);
        JB23.addAdjacent(JB22, 620);
        JB22.addAdjacent(SW6, 430);
        SW6.addAdjacent(JB14, 370);
        JB14.addAdjacent(SW4, 410);
        SW4.addAdjacent(JB15, 90);
        JB14.addAdjacent(JB11, 300);
        JB14.addAdjacent(JB13, 285);
        JB13.addAdjacent(JB23, 800);
        JB23.addAdjacent(JB21, 210);
        System.out.println(JB14.getEdges());
    }


}
