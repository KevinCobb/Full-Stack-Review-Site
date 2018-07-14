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
	CommentRepository commentRepo;
	@Autowired
	CategoryRepository categoryRepo;
	@Autowired
	ActorTagRepository actorTagRepo;

	@Override
	public void run(String... args) throws Exception {

		Category comedy = categoryRepo.save(new Category("Comedy", "Funny movies that make you laugh"));
		Category action = categoryRepo.save(new Category("Action", "Fast paced movies with lots of explosions"));
		Category horror = categoryRepo.save(new Category("Horror",
				"Scary movies that are filled with horrific things or people that haunt your dreams"));
		Category drama = categoryRepo
				.save(new Category("Drama", "Movies filled with emotion and touch a cord with everyone"));
		Category syfi = categoryRepo.save(new Category("Science Fiction",
				"Movies that contain atleast one of these elements; speculative fiction, futurism, technology, and space travel."));
		Category romcom = categoryRepo
				.save(new Category("Romantic Comedy", "movies that contain dating and love with comedy"));
		Category fantasy = categoryRepo
				.save(new Category("Fantasy", "Fantasy movie about stuff that doesn't really exsist"));
		Category thriller = categoryRepo.save(new Category("Thriller", "Suspense filled drama style movies"));

		Review cloudAtlas = reviewRepo.save(new Review("Cloud Atlas",
				"From the makers of The Matrix comes an ambitious multi-century, multi-genre, multi-transgression story about the eternal conflict between freedom and oppression. Rating: 3.5 stars",
				"/img/CloudAtlas.jpg", syfi));

		Review dragnet = reviewRepo.save(new Review("Dragnet",
				"No-nonsense Los Angeles detective Sgt. Joe Friday (Dan Aykroyd) is partnered with the wisecracking Pep Streebeck (Tom Hanks), a hip upstart cop, and the mismatched duo is ordered to investigate a strange series of ritual killings. Rating: 3.5 stars",
				"/img/dragnet.JPG", comedy));

		Review ghostbusters = reviewRepo.save(new Review("Ghost Busters",
				"Parapsychologists Peter Venkman, Raymond Stantz, and Egon Spengler are scientists working for Columbia University. After they lose their jobs, they establish the Ghostbusters, a paranormal investigation and elimination service. Rating: 5 stars",
				"/img/GhostbustersPoster.jpg", fantasy));

		Review youveGotMail = reviewRepo.save(new Review("You've got mail",
				"Struggling boutique bookseller Kathleen Kelly (Meg Ryan) hates Joe Fox (Tom Hanks), the owner of a corporate Foxbooks chain store that just moved in across the street. When they meet online, however, they begin an intense and anonymous Internet romance,. Rating: 4.5 stars",
				"/img/gotmail.jpg", romcom));

		Review stripes = reviewRepo.save(new Review("Stripes",
				"Hard-luck cabbie John Winger (Bill Murray) -- directionless after being fired from his job and dumped by his girlfriend -- enlists in the U.S. Army with his close pal. Rating: 4 stars",
				"/img/stripes.jpg", comedy));

		Review redheat = reviewRepo.save(new Review("Red Heat",
				"A dedicated Soviet cop arrives in Chicago, where he reluctantly teams up with a foul-mouthed American detective to comb the streets of the Windy City for the Russian drug dealer who killed both their partners. Rating: 4 stars",
				"/img/redheat.jpg", action));

		Review bluesbros = reviewRepo.save(new Review("Blues Brothers",
				"After his release from prison, Jake (John Belushi) reunites with his brother, Elwood (Dan Aykroyd) -- collectively known as the \"Blues Brothers.\" Jake's first task is to save the orphanage the brothers grew up in from closing. Rating: 4.5 stars",
				"/img/blues.jpg", comedy));

		Review neighbors = reviewRepo.save(new Review("Neighbors",
				"Earl Keese (John Belushi) lives in an orderly house with his wife, Enid (Kathryn Walker), and daughter, Elaine (Lauren-Marie Taylor). His routine is disrupted when loudmouthed Vic (Dan Aykroyd) and his oversexed wife, Ramona (Cathy Moriarty), move in next door. Rating: 4.5 stars",
				"/img/Neighbors.JPG", comedy));

		Review expendables2 = reviewRepo.save(new Review("Expendables 2",
				"Mercenary leader Barney Ross (Sylvester Stallone), Lee Christmas (Jason Statham) and the rest of the Expendables team reunite when Mr. Church (Bruce Willis) hires them for a seemingly easy job. Rating: 4 stars",
				"/img/expendables.jpg", action));

		Review collateralDamage = reviewRepo.save(new Review("Collateral Damage",
				"A family man (Arnold Schwarzenegger) is plunged into the complex and dangerous world of international terrorism after he loses his wife and child in a bombing. Rating: 4.5 stars",
				"/img/collateral.jpg", horror));

		Review perfectStranger = reviewRepo.save(new Review("Perfect Stranger",
				"Thriller about a journalist who goes undercover to investigate the advertising executive whom she believes is responsible for the murder of her best friend. Rating: 4 stars",
				"/img/perfect.jpg", thriller));

		Review moonriseKingdom = reviewRepo.save(new Review("Moonrise Kingdom",
				"residents of New Penzance, an island off the coast of New England, inhabit a community that seems untouched by some of the bad things going on in the rest of the world. Rating: 4 stars",
				"/img/moonrise.jpg", drama));

		Review swordfish = reviewRepo.save(new Review("Swordfish",
				"The world's most dangerous spy is hired by the CIA to coerce a computer hacker recently released from prison to help steal $6 billion in unused government funds. Rating: 5 stars",
				"/img/sword.jpg", drama));

		Review xmen = reviewRepo.save(new Review("X-men",
				"Each was born with a unique genetic mutation, which at puberty manifested itself in extraordinary powers. In a world filled with hate and prejudice, they are feared by those who cannot accept their differences. Rating: 4 stars",
				"/img/xmen.jpg", fantasy));

		Review kateAndleopold = reviewRepo.save(new Review("Kate and Leopold",
				"Kate McKay (Meg Ryan) is a modern day executive, a 21st century woman driven to succeed in the corporate world. Leopold, the third Duke of Albany, is a charming gent and bachelor of the late 18OOs. With career and social expectations looming, each has grown cynical about the very notion of falling in love. Rating: 4 stars",
				"/img/KateLeopold.jpg", romcom));

		ActorTag arnold = actorTagRepo
				.save(new ActorTag("Arnold Schwarzenegger", collateralDamage, redheat, expendables2));
		ActorTag halle = actorTagRepo
				.save(new ActorTag("Halle Berry", cloudAtlas, xmen, perfectStranger, collateralDamage, swordfish));
		ActorTag hanks = actorTagRepo.save(new ActorTag("Tom Hanks", cloudAtlas, dragnet, youveGotMail));
		ActorTag belushi = actorTagRepo.save(new ActorTag("John Belushi", stripes, redheat, bluesbros, neighbors));
		ActorTag willis = actorTagRepo
				.save(new ActorTag("Bruce willis", expendables2, perfectStranger, moonriseKingdom));
		ActorTag jackman = actorTagRepo
				.save(new ActorTag("Hugh Jackman", collateralDamage, swordfish, xmen, kateAndleopold));
		ActorTag ackroyd = actorTagRepo.save(new ActorTag("Dan Ackroyd", ghostbusters, bluesbros, neighbors, dragnet));
		ActorTag murray = actorTagRepo.save(new ActorTag("Bill Murray", ghostbusters, stripes, moonriseKingdom));
		ActorTag megRyan = actorTagRepo.save(new ActorTag("Meg Ryan", youveGotMail, kateAndleopold));

	}

}
