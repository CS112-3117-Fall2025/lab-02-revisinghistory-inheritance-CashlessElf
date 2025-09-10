/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author Robert Sistek
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
		String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(tulsaRiot);
		
		
		String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
			tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		RevisedHistoricalEvent tulsaMassacre = new RevisedHistoricalEvent(tulsaDescription, tulsaDay, tulsaRevised, tulsaCitation);
		
		System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		tulsaMassacre.teach();

		String castlleItterDescription = "The Battle of Castle Itter is often sensationalized, with a common misconception being that it was a simple, unified effort between American and French forces against the Nazis. Some accounts mistakenly portray it as a straightforward battle where everyone was on the same side from the beginning. Another frequent misunderstanding is that it was a major, decisive turning point in the war, when in reality, it was a smaller, unique engagement that took place just a few days before the end of the war in Europe. These inaccuracies can often oversimplify the complex and chaotic nature of the final days of World War II.";

		Date castleItterDay = new Date(5, 5, 1945);

		HistoricalEvent castleItter = new HistoricalEvent(castlleItterDescription, castleItterDay);

		System.out.println("====================================================");
		System.out.println("Personal Historical Event:");
		System.out.println("====================================================");
		System.out.println(castleItter);

		String castleItterRevised = "The Battle of Castle Itter, which took place on May 5, 1945, was a unique and chaotic event involving an unlikely alliance of American soldiers from the 23rd Tank Battalion, a German Wehrmacht officer, and various anti-Nazi resistance fighters, including some French prisoners. This diverse group defended the castle, which was holding high-profile French prisoners, against an attacking force of the 17th SS Panzergrenadier Division. The defenders initially had to fight together out of necessity, with the American and German forces, along with the French resistance, cooperating to repel the SS. The battle, though small in scale, highlights the unusual and sometimes contradictory alliances that formed in the final moments of the war.";

		String castleItterCitation = "https://www.bing.com/ck/a?!&&p=9cd3b114e5042b58a57c07789b476a0bde50dbaec4e92218efa55c523ca20b8bJmltdHM9MTc1NzM3NjAwMA&ptn=3&ver=2&hsh=4&fclid=15031f85-4907-6c35-3317-0a2d48956d0d&psq=The+National+WWII+Museum+castle+itter&u=a1aHR0cHM6Ly9leHBsb3JldGhlYXJjaGl2ZS5jb20vYmF0dGxlLWNhc3RsZS1pdHRlcg&ntb=1";

		RevisedHistoricalEvent battleCastleItter = new RevisedHistoricalEvent(castlleItterDescription, castleItterDay, castleItterRevised, castleItterCitation);

		System.out.println("\n====================================================");
		System.out.println("Personal Revised Historical Event:");
		System.out.println("====================================================");
		battleCastleItter.teach();

	}
}