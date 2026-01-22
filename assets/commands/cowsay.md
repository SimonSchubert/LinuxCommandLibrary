# TLDR

**Say** message

```cowsay ["Hello World"]```

**Think** message

```cowthink ["Hmm..."]```

**Different** cow

```cowsay -f [dragon] ["Message"]```

**List** available cows

```cowsay -l```

**Dead** cow

```cowsay -d ["Message"]```

# SYNOPSIS

**cowsay** [_options_] [_message_]

# DESCRIPTION

**cowsay** generates ASCII art of a cow saying a message. It's a whimsical program that displays text in a speech bubble with various animal ASCII art, commonly used for fun messages, fortune quotes, or MOTD displays.

The program has become an iconic part of Unix culture.

# PARAMETERS

**-f** _cowfile_
> Specify cow file

**-l**
> List available cows

**-e** _eyes_
> Set eye appearance

**-T** _tongue_
> Set tongue appearance

**-W** _width_
> Word wrap width

**-n**
> No word wrap

**-d**
> Dead cow mode

**-g**
> Greedy mode

**-p**
> Paranoid mode

**-s**
> Stoned mode

**-t**
> Tired mode

**-w**
> Wired mode

**-y**
> Young mode

# AVAILABLE COWS

List all: `cowsay -l`

Common ones:
- **default** - Classic cow
- **dragon** - Dragon
- **tux** - Tux the penguin
- **elephant** - Elephant
- **moose** - Moose
- **stegosaurus** - Dinosaur
- **vader** - Darth Vader

# WORKFLOW

```bash
# Basic message
cowsay "Hello World"

# Thinking cow
cowthink "What to do..."

# Different animal
cowsay -f dragon "Roar!"

# Custom eyes and tongue
cowsay -e ^^ -T "U " "Happy cow"

# Dead cow
cowsay -d "I'm not feeling well"

# Pipe input
fortune | cowsay

# With lolcat
cowsay "Rainbow!" | lolcat
```

# RELATED COMMANDS

**cowthink**
> Thinking cow (thought bubble instead of speech)

**fortune | cowsay**
> Random quote from cow

# CUSTOMIZATION

Custom cow files in: `/usr/share/cowsay/cows/`

Create your own ASCII art cow!

# CAVEATS

Pure entertainment value. Large messages may format oddly. Custom cow files need correct format. Some find it unprofessional in serious contexts. Original Perl version, various ports exist.

# HISTORY

**cowsay** was written by Tony Monroe in **1999**, becoming a beloved Unix novelty program and inspiring numerous derivatives.

# SEE ALSO

[fortune](/man/fortune)(6), [figlet](/man/figlet)(6), [lolcat](/man/lolcat)(1)
