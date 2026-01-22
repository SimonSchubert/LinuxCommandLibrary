# TLDR

Print specific **Pokémon**

```pokego --name [charizard]```

Print **shiny** variant

```pokego --name [spheal] -s```

Print **alternative form**

```pokego --name [blastoise] --form mega```

Print **random** from generations 1-3

```pokego --random 1-3```

Print without **name title**

```pokego --random 1-3 --no-title```

# SYNOPSIS

**pokego** [**--name** _pokemon_] [**--random** _range_] [**-s**|**--shiny**] [**--form** _form_] [**--no-title**]

# PARAMETERS

**--name _pokemon_**
> Display specific Pokémon by name

**--random _range_**
> Display random Pokémon from generation range

**-s, --shiny**
> Display shiny color variant

**--form _form_**
> Display alternative form (mega, gmax, etc.)

**--no-title**
> Don't display Pokémon name

# DESCRIPTION

**pokego** displays Pokémon sprites as colored ASCII art in the terminal. It's a fun tool for customizing terminal prompts or adding personality to shell sessions.

The tool includes sprites for all Pokémon including regional forms, mega evolutions, and shiny variants. It's written in Go for fast performance.

# CAVEATS

Requires terminal with color support. Best viewed with dark background. Sprite quality depends on terminal font. Large sprites may not display well in small terminals.

# HISTORY

**pokego** was created by **rubiin** as a faster alternative to pokemon-colorscripts. Written in Go, it offers improved performance while maintaining the fun of displaying Pokémon in terminals.

# SEE ALSO

[neofetch](/man/neofetch)(1), [fastfetch](/man/fastfetch)(1), [cowsay](/man/cowsay)(1)
