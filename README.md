The purpose of the application is to help a fictitious company called Bills sandwitchs to manage
        their process of selling sandwitchs.

   Our application will help Bill to select types of sanwitchs, some of the additional items (additions) to
        be added to the sanwitchs and pricing.
         We want to create a base sandwitch, but also two other types of sandwitchs that are popular ones in Bills store.
        The basic sandwitch should have the following items.
        Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
        the customer can select to be added to the sandwitch.
        Each one of these items gets charged an additional price so you need some way to track how many items got added
        and to calculate the final price (base sandwitch with all the additions).
        This sandwitch has a base price and the additions are all separately priced (up to 4 additions, see above).
        Create a sandwitch class to deal with all the above.
        The constructor should only include the roll type, meat and price, can also include name of sandwitch or you
        can use a setter.
        Also create two extra varieties of sandwitchs (subclasses) to cater for

a) Healthy sandwitch (on a brown rye bread roll), plus two addition items that can be added.
The healthy sandwitch can have 6 items (Additions) in total.
 hint: you probably want to process the two additional items in this new class (subclass of sandwitch),
not the base class (sandwitch), since the two additions are only appropriate for this new class
        (in other words new sandwitch type).

b) Deluxe sandwitch - comes with chips and drinks as additions, but no extra additions are allowed.

 hint:  You have to find a way to automatically add these new additions at the time the deluxe sandwitch
object is created, and then prevent other additions being made.
All 3 classes should have a method that can be called anytime to show the base price of the sandwitch
plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
sandwitch (base price + all additions)
For the two additional classes this may require you to be looking at the base class for pricing and then
adding totals to final price.
