# TAGLINE

Display Pokemon sprites in terminal

# TLDR

**Display Pokemon sprite**

```pokeget [pokemon_name]```

**Display by number**

```pokeget [number]```

**Display shiny version**

```pokeget [pokemon] --shiny```

**Display specific form**

```pokeget [pokemon] --form [form]```

# SYNOPSIS

**pokeget** [_options_] _pokemon_

# PARAMETERS

_POKEMON_
> Pokemon name or number.

**--shiny**
> Show shiny variant.

**--form** _FORM_
> Specific form name.

**--big**
> Large sprite.

# DESCRIPTION

**pokeget** displays Pokemon sprites as colored ASCII art in the terminal. Pokemon can be specified by name or Pokedex number. Sprites are fetched from PokeAPI.

The **--shiny** flag shows the shiny color variant, **--form** displays alternate forms (mega evolutions, regional forms), and **--big** renders a larger sprite. Popular for customizing terminal startup screens.

# CAVEATS

Requires terminal with color support. Internet access for sprites.

# HISTORY

pokeget was created for **displaying Pokemon** sprites in the terminal.

# SEE ALSO

[pokemon-colorscripts](/man/pokemon-colorscripts)(1)

