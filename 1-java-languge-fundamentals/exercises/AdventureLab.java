public class AdventureLab {
/*
    START
        Welcome to the Adventure!
        >>> Prompt user to enter their name

    PAGE0
        You wake up in a dark forest. You see a crossroad ahead of you and approach.

    PAGE1
        When you arrive at the crossroads you see several possible paths.
        One path is dark and winding
        The other path is sunny and bright with lots of flowers
        In the distance you see an abandoned castle
        Where do you want to go?
        >>> prompt the user for a 1, 2, 3
        1. Dark path (GOTO PAGE2)
        2. Bright path (GOTO PAGE3)
        3. Castle (GOTO PAGE4)

    PAGE2
        Travelling the dark and winding path,
        you stumble upon a monster!
        >>> Prompt the user for a 1 or 2
        1. Run
            You choose to run... The monster is much quicker and you are defeated.
            (GOTO BADEND)

        2. Fight
            You choose to fight!
            With a valiant effort, you defeat the monster...
            And find a key!
            (GOTO PAGE1)
        RE-VISIT:
            After finding the key,
            There is nothing left to loot on the monster.
            (GOTO PAGE1)

    PAGE3
        The flowerly path smells wonderful.
        You lose track of time on your walk and barely catch yourself from running into someone. S
        he's a good witch and asks you your name!
        >>> Prompt user for their name
        1. Real name
            You tell the witch your real name.
            She uses her magic wand to produce a key and gives it to you with her blessing.
            (GOTO PAGE1)

        2. Fake name
            The witch can tell you're lying.
            She uses her magic wand to put you to sleep.
            You don't remember anything.
            (GOTO PAGE0)

        RE-VISIT:
            "Why hello {userName}, I hope you're doing well!" Says the witch.
            After a quick visit you return to the Forest
            (GOTO PAGE1)

    PAGE4
        Inside the castle you see two doors.
        >>> Prompt the user for a 1,2 or 3
        1. Blue door (GOTO PAGE5)
        2. Red door (GOTO PAGE6)
        3. Return to crossroads

    PAGE5
        You see a locked blue door with 3 keyholes.
        >>> Check if user has 3 keys
        Has 3 keys
            (GOTO GOODEND)
        Does not have 3 Keys
            The door is locked and requires 3 keys.
            You leave to find more keys
            (GOTO PAGE4)

    PAGE6
        You find the red door is unlocked.
        After searching the room you find a key!
        You leave the room and continue searching the castle
        (GOTO PAGE4)
        RE-VISIT:
            You feel like you've searched this room thoroughly.
            (GOTO PAGE4)

    BADEND
        You have failed in your quest.
        Would you like to try again?
        >>> Prompt 1 or 2
        1. Yes. (GOTO START)
        2. No. (End Game)

    GOODEND
        Inside the blue door you find endless treasure, and you are set for life!
        Congrats!
        (End Game)
*/
}
