package org.wecancodeit.FullStackReviewSite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.FullStackReviewSite.Review;

@Service
public class ReviewPopulator implements CommandLineRunner{
	
	@Autowired
	ReviewRepository reviewRepo;
	
	@Autowired 
	CategoryRepository categoryRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Category comedy = categoryRepo.save(new Category ("Comedy", "Funny movies that make you laugh"));
		Category action = categoryRepo.save(new Category ("Action", "Fast paced movies with lots of explosions"));
		Category horror = categoryRepo.save(new Category ("Horror", "Scary movies that are filled with horrific things or people that haunt your dreams"));
		Category drama = categoryRepo.save(new Category ("Drama", "Movies filled with emotion and touch a cord with everyone"));
		
		Review weddingcrashers = reviewRepo.save(new Review("Wedding Crashers", "Jeremy (Vince Vaughn) and John (Owen Wilson) are divorce mediators who spend their free time crashing wedding receptions. For the irrepressible duo, there are few better ways to drink for free and bed vulnerable women." , "/img/wedding.jpg", comedy));
		
		Review terminator = reviewRepo.save(new Review("Terminator", "The Terminator is a 1984 American science-fiction action film directed by James Cameron. It stars Arnold Schwarzenegger as the Terminator, a cyborg assassin sent back in time from 2029 to 1984 to kill Sarah Connor (Linda Hamilton), whose son will one day become a savior against machines in a post-apocalyptic future." , "/img/TerminatorPoster.JPG", action));
		
		Review ghostbusters = reviewRepo.save(new Review("Ghost Busters","Parapsychologists Peter Venkman, Raymond Stantz, and Egon Spengler are scientists working for Columbia University. After they lose their jobs, they establish the Ghostbusters, a paranormal investigation and elimination service.", "/img/GhostbustersPoster.jpg", comedy));
		
		Review back2future = reviewRepo.save(new Review("Back To The Future", "After being accidentally sent 30 years into the past in a time-travelling DeLorean invented by mad scientist Dr. Emmett Brown, teenager Marty McFly has to find a way to return to the future safely.", "/img/back.jpg", comedy));
		
		Review capnAmerica = reviewRepo.save(new Review("Captian America", "Set predominantly during World War II, Captain America: The First Avenger tells the story of Steve Rogers, a sickly man from Brooklyn who is transformed into super-soldier Captain America and must stop the Red Skull.", "/img/captain.jpg", action));
		
		Review newIt = reviewRepo.save(new Review("Stephen King's IT","It (novel) ... It is a 1986 horror novel by American author Stephen King. It was his 22nd book, and his 18th novel written under his own name. The story follows the experiences of seven children as they are terrorized by an entity that exploits the fears and phobias of its victims to disguise itself while hunting its prey.", "/img/it.jpg", horror));
		
		Review shawShank = reviewRepo.save(new Review("Shawshank Redemption","Adapted from the Stephen King novella Rita Hayworth and Shawshank Redemption, the film tells the story of Andy Dufresne, a banker who spends 19 years in Shawshank State Prison for the murder of his wife and her lover despite his claims of innocence.", "/img/shawshank.jpg", drama));
		
		Review JurassicPark = reviewRepo.save(new Review("Jurassic Park", "Industrialist John Hammond and his bioengineering company, InGen, have created a theme park called Jurassic Park on Isla Nublar, a Costa Rican island, populated with cloned dinosaurs.", "/img/jurassicParkPoster.JPG", action));
		
	}
	
	
	
	

}
