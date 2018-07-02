package org.wecancodeit.FullStackReviewSite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.FullStackReviewSite.Review;

@Service
public class ReviewPopulator implements CommandLineRunner {

	@Autowired
	ReviewRepository reviewRepo;

	@Autowired
	CategoryRepository categoryRepo;

	@Override
	public void run(String... args) throws Exception {

		Category comedy = categoryRepo.save(new Category("Comedy", "Funny movies that make you laugh"));
		Category action = categoryRepo.save(new Category("Action", "Fast paced movies with lots of explosions"));
		Category horror = categoryRepo.save(new Category("Horror",
				"Scary movies that are filled with horrific things or people that haunt your dreams"));
		Category drama = categoryRepo
				.save(new Category("Drama", "Movies filled with emotion and touch a cord with everyone"));

		Review weddingcrashers = reviewRepo.save(new Review("Wedding Crashers",
				"Jeremy (Vince Vaughn) and John (Owen Wilson) are divorce mediators who spend their free time crashing wedding receptions. For the irrepressible duo, there are few better ways to drink for free and bed vulnerable women. Rating: 3.5 stars",
				"/img/wedding.jpg", comedy));

		Review terminator = reviewRepo.save(new Review("Terminator",
				"The Terminator is a 1984 American science-fiction action film directed by James Cameron. It stars Arnold Schwarzenegger as the Terminator, a cyborg assassin sent back in time from 2029 to 1984 to kill Sarah Connor (Linda Hamilton), whose son will one day become a savior against machines in a post-apocalyptic future. Rating: 4.5 stars",
				"/img/TerminatorPoster.JPG", action));

		Review ghostbusters = reviewRepo.save(new Review("Ghost Busters",
				"Parapsychologists Peter Venkman, Raymond Stantz, and Egon Spengler are scientists working for Columbia University. After they lose their jobs, they establish the Ghostbusters, a paranormal investigation and elimination service. Rating: 5 stars",
				"/img/GhostbustersPoster.jpg", comedy));

		Review back2future = reviewRepo.save(new Review("Back To The Future",
				"After being accidentally sent 30 years into the past in a time-travelling DeLorean invented by mad scientist Dr. Emmett Brown, teenager Marty McFly has to find a way to return to the future safely. Rating: 5 stars",
				"/img/back.jpg", comedy));

		Review capnAmerica = reviewRepo.save(new Review("Captain America",
				"Set predominantly during World War II, Captain America: The First Avenger tells the story of Steve Rogers, a sickly man from Brooklyn who is transformed into super-soldier Captain America and must stop the Red Skull. Rating: 4 stars",
				"/img/captain.jpg", action));

		Review newIt = reviewRepo.save(new Review("Stephen King's IT",
				"It (novel) ... It is a 1986 horror novel by American author Stephen King. It was his 22nd book, and his 18th novel written under his own name. The story follows the experiences of seven children as they are terrorized by an entity that exploits the fears and phobias of its victims to disguise itself while hunting its prey. Rating: 4 stars",
				"/img/it.jpg", horror));

		Review shawShank = reviewRepo.save(new Review("Shawshank Redemption",
				"Adapted from the Stephen King novella Rita Hayworth and Shawshank Redemption, the film tells the story of Andy Dufresne, a banker who spends 19 years in Shawshank State Prison for the murder of his wife and her lover despite his claims of innocence. Rating: 5 stars",
				"/img/shawshank.jpg", drama));

		Review JurassicPark = reviewRepo.save(new Review("Jurassic Park",
				"Industrialist John Hammond and his bioengineering company, InGen, have created a theme park called Jurassic Park on Isla Nublar, a Costa Rican island, populated with cloned dinosaurs. Rating: 4.5 stars",
				"/img/jurassicParkPoster.JPG", action));
		
		Review theShining = reviewRepo.save(new Review("The Shining",
				"The only thing that can save Danny and his mother is \"The Shining\". Jack Torrance becomes the caretaker of the Overlook Hotel up in the secluded mountains of Colorado. Jack, being a family man, takes his wife and son to the hotel to keep him company throughout the long and isolated nights. Rating: 4 stars",
				"/img/shining.jpg", horror));
		
		Review theRing = reviewRepo.save(new Review("the Ring",
				"The Ring (stylized as the ring) is a 2002 American supernatural horror film directed by Gore Verbinski and starring Naomi Watts, Martin Henderson, David Dorfman, Brian Cox and Daveigh Chase. It is a remake of the 1998 Japanese horror film Ring based on the novel of the same name by Koji Suzuki. Rating: 4.5 stars",
				"/img/ring.jpg", horror));
		
		Review ForrestGump = reviewRepo.save(new Review("Forrest Gump",
				"Forrest Gump is a simple man with a low I.Q. but good intentions. He is running through childhood with his best and only friend Jenny. His 'mama' teaches him the ways of life and leaves him to choose his destiny. Rating: 4 stars",
				"/img/gump.jpg", drama));
		
		Review grandTorino = reviewRepo.save(new Review("Grand Torino",
				"He is a Korean War veteran whose prize possession is a 1972 Gran Torino he keeps in mint condition. When his neighbor Thao, a young Hmong teenager under pressure from his gang member cousin, tries to steal his Gran Torino, Kowalski sets out to reform the youth. Rating: 5 stars",
				"/img/torino.jpg", drama));

	}

}
