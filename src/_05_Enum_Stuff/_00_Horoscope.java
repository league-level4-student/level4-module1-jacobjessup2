package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	static void start(Zodiac z) {
		switch (z) {
		case ARIES:{
			JOptionPane.showMessageDialog(null, "You'll find little comfort in your emotions today, Aries. You may want to simply stick to business. Concentrate on getting things done in your regular routine. Create a plan and stick to it.\nThis isn't a day to deviate from the norm, nor is it a time in which you'll find sympathy from others. Stick close to home and take care of your personal business. Time is precious - don't waste it.");
			break;
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "Maintain your psychic shield today, Aquarius, because you'll need it. People's comments may seem harsh even if they mean well.\nYour best defense against the critical tone of the day is to use other people's criticisms as constructively as you can in order to build a stronger foundation from which to work. \nProcess this energy in a positive frame of mind and use it to get things done.");
			break;
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "It could be hard for you to feel connected to anyone today, Cancer. You're probably better off keeping to yourself. If you're feeling sad or depressed, it's best to work through these feelings on your own. \nOther people aren't apt to be too sympathetic to your situation. You're better off sticking to your work in order to keep the demons out of your head.");
			break;
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "People may be a bit critical of you today, Capricorn, and you would do well to hear what they have to say. Be receptive of feedback from others so that you may establish a healthy ego. It's important to keep your sense of humility in check. \nYou might find that you're feeling rather critical as you see people moving like sloths compared to your lightning quick mind. Be patient with others.");
			break;
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "There's a damper on your emotions today that could leave you feeling like a pot of simmering water, Gemini. Just by knowing there's a lid on things you're likely to heat up more quickly than usual. Try to hold your temper. \nA furious rage will get you nowhere. Concentrate your energy on getting your material affairs in order. Deal with finances, investments, and long-term security planning.");
			break;
		}
		case LEO:{
			JOptionPane.showMessageDialog(null, "You may feel a sense of restriction to the day, but in truth, this is for your own good, Leo. You'll find that your acute sense of discipline comes in handy today as you tackle work with incredible enthusiasm. \nYour goals aren't far from your grasp. Stay focused, and don't let the ticking clock pressure you. Hastiness will lead to careless mistakes. If you're going to do a job, do it right.");
			break;
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "Get your head out of the clouds, Libra. You'll find out that nitpicky details you failed to attend to earlier are now coming back to haunt you. Don't postpone your work any further. The time to take care of the job is now. \nBalance your checkbook and do your laundry. Clean your bathtub and go grocery shopping. The more you accomplish today, the better you'll feel about yourself tomorrow.");
			break;
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "Unfortunately, this isn't a day for fun and games, Pisces. In fact, you might feel an annoying emotional weightiness, making you feel less energetic than usual. \nThere's a sober tone that's asking you to take a hard-nosed look at reality and make some decisions regarding goals and plans. \nYou could feel like the timer buzzer is about to go off. The minute hand is ticking away and there are many more adventures in store.");
			break;
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "Put aside frivolity for a day, Sagittarius. This is an important time to prepare for the future. Don't take another step forward before you know you're on solid ground. This is a good time to secure your goals on a piece of paper. \nWriting them down in ink will help you manifest them in your life. Think about the long-term harvest. Security and grounding are key themes of the day.");
			break;
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "Today you need to finish whatever you didn't get done yesterday, Scorpio. Themes of the journey include discipline and paying attention to the sand slipping through the hourglass. \nThe more you're able to accomplish, the better you'll feel about yourself. Stagnant energy in your life signals that it's time to get things moving. Don't waste another moment waiting for someone else to find the solution for you. Take the initiative.");
			break;
		}
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "Try not to be smothering today, Taurus. You may want to seek comfort in conversations with others but find that this only produces grouchiness on the part of all involved. Curb your tendency to find fault in loved ones. \nYour best bet is to focus your energy on tasks you've had on the back burner for some time. Tackle projects that need special attention and the most discipline.");
			break;
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "Find comfort in your work today, Virgo. Although it may sound ridiculous, you'll find that getting things checked off your list is the most rewarding activity of the day. Try not to be too critical of others. \nFocus on your own tasks at hand. Mountains that seem too daunting will continue to grow bigger until you take the first step. Your perseverance will be an inspiration to others.");
			break;
		}
		
		}
	}
	// 3. Make a main method to test your method
	
	public static void main(String[] args) {
		String[] options = {"ARIES", "TAURUS", "GEMINI", "CANCER", "LEO", "VIRGO", "LIBRA", "SCORPIO", "SAGITTARIUS", "CAPRICORN", "AQUARIUS", "PISCES"};
		int input = JOptionPane.showOptionDialog(null, "What is your Zodiac Sign?", "Zodiac Horoscope", 0, -1, null, options, 0);
		String choice = options[input];
		switch(choice){
		case "ARIES":
			start(Zodiac.ARIES);
			break;
		
		case "AQUARIUS":
			start(Zodiac.AQUARIUS);
			break;
		
		case "CANCER":
			start(Zodiac.CANCER);
			break;
		
		case "CAPRICORN":
			start(Zodiac.CAPRICORN);
			break;
		
		case "GEMINI":
			start(Zodiac.GEMINI);
			break;
		
		case "LEO":
			start(Zodiac.LEO);
			break;
		
		case "LIBRA":
			start(Zodiac.LIBRA);
			break;
		
		case "PISCES":
			start(Zodiac.PISCES);
			break;
		
		case "SAGITTARIUS":
			start(Zodiac.SAGITTARIUS);
			break;
		
		case "SCORPIO":
			start(Zodiac.SCORPIO);
			break;
		
		case "TAURUS":
			start(Zodiac.TAURUS);
			break;
		
		case "VIRGO":
			start(Zodiac.VIRGO);
			break;
		
		}
		
	}
}

