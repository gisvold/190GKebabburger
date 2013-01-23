package no.aleksikon.bedpres_bingo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum BingoWord 
{
	
	KVINNEANDEL, SOSIALT, INTERNKURSING, INTERNASJONALT, UNGT_MILJ�, INTERNSHIP, SOMMERJOBB, ABAKUS, DATATEKNIKK, IND�K, JAVA, DOTNET, FLAT_STRUKTUR, INNOVATIVT, SKREDDERSYDDE_L�SNINGER, SKYTJENESTER, FAGDAG, PROGRAMMERING, OFFENTLIGE_KUNDER, NAV, OMSETNING, R�DGIVNING, TEKNOLOGI;
	
	private static final List<BingoWord> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();
	
	public static String randomBingoWord()
	{
		return VALUES.get(RANDOM.nextInt(SIZE)).toString();
	}
}
