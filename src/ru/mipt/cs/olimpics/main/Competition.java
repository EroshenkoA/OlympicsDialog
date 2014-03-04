package ru.mipt.cs.olimpics.main;


import ru.mipt.cs.olimpics.discipline.shortrack.ShortTrack;
import ru.mipt.cs.olimpics.human.jury.Jury;
import ru.mipt.cs.olimpics.human.sportsman.sub.SportsmanShortTrack;
/**
 * Created by 1 on 22.02.14.
 */
public class Competition { //Short-track
    public static void main (String args[]){
        SportsmanShortTrack S[]={new SportsmanShortTrack("Victor An"),new SportsmanShortTrack("Vladimir Grigoriev"),
                new SportsmanShortTrack("Shinke Knegt"), new SportsmanShortTrack("Dazin U"),
                new SportsmanShortTrack("Davun Sin"),new SportsmanShortTrack("Tyanu Han"), new SportsmanShortTrack("Semen Elistratov")};
        S[0].SetForces(1.24102);
        S[1].SetForces(1.24868);
        S[2].SetForces(1.25611);
        S[3].SetForces(1.24239);
        S[5].SetForces(1.24490);
        S[6].SetForces(1.24239);
        S[4].SetForces(1.24215);
        Jury J=new Jury("Peter Worte");
        ShortTrack ST=new ShortTrack(1000,"final");
        ST.SetWorldRecord(1.25);
        for (int i=0; i<S.length; i++){
            ST.AddSportsmen(S[i]);
        }
        J.SetDiscipline(ST);

        J.StartCompetition();
        J.TotalCompetition();
    }
}
