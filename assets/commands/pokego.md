# TAGLINE

Display Pokemon ASCII art in terminal

# TLDR

Print specific **Pokémon**

```pokego --name [charizard]```

Print **shiny** variant

```pokego --name [spheal] --shiny```

Print **alternative form**

```pokego --name [charizard] --form [mega-y]```

Print **random** from generations 1-3

```pokego --random 1-3```

Print **random** from specific generations

```pokego --random 1,3,6```

Print without **name title**

```pokego --random 1-3 --no-title```

**List** all Pokémon names

```pokego --list```

# SYNOPSIS

**pokego** [**-n** _pokemon_ [**-f** _form_]] [**-r** _generations_] [**-s**] [**--no-title**]

**pokego** **completion** _shell_

# PARAMETERS

**-n**, **--name** _pokemon_
> Display a specific Pokémon by name.

**-r**, **--random** _generations_
> Display a random Pokémon, optionally limited to generations 1 to 8, given as a range (**1-3**) or a comma-separated list (**1,3,6**).

**-s**, **--shiny**
> Display the shiny color variant.

**-f**, **--form** _form_
> Display an alternative form (e.g. mega, mega-x, gmax, alola, galar). Used with **--name**.

**--no-title**
> Don't print the Pokémon name above the sprite.

**-l**, **--list**
> List the base names of all Pokémon (alternate forms are not listed).

**-v**, **--version**
> Show version.

**completion** _bash_|_zsh_|_fish_|_powershell_
> Generate a shell completion script.

# DESCRIPTION

**pokego** displays Pokémon sprites as colored ASCII art in the terminal. It's a fun tool for customizing terminal prompts or adding personality to shell sessions.

It includes all 905 Pokémon from generations 1 to 8, with shiny, mega, Gigantamax and regional variants. Random Pokémon have a 1/128 chance of being shiny, as in the games. All sprites are embedded in the single Go binary, so no external assets are needed at runtime.

# CAVEATS

Requires terminal with color support. Best viewed with dark background. Sprite quality depends on terminal font. Large sprites may not display well in small terminals.

# HISTORY

**pokego** was created by **rubiin** as a Go rewrite of **pokemon-colorscripts** by phoneybadger, offering faster startup while keeping the same sprites and options.

# SEE ALSO

[pokemon-colorscripts](/man/pokemon-colorscripts)(1), [neofetch](/man/neofetch)(1), [fastfetch](/man/fastfetch)(1), [cowsay](/man/cowsay)(1)

# RESOURCES

```[Source code](https://github.com/rubiin/pokego)```

<!-- verified: 2026-11-23 -->
