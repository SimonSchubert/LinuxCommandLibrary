# TAGLINE

Display Pokemon ANSI art in terminal

# TLDR

**Display random Pokemon**

```pokemon-colorscripts -r```

**Display specific Pokemon**

```pokemon-colorscripts -n [pikachu]```

**Display with name**

```pokemon-colorscripts -r --no-title```

**Shiny variant**

```pokemon-colorscripts -n [charizard] -s```

**List all Pokemon**

```pokemon-colorscripts -l```

# SYNOPSIS

**pokemon-colorscripts** [_options_]

# PARAMETERS

**-n**, **--name** _name_
> Display specific Pokemon.

**-r**, **--random**
> Display random Pokemon.

**-l**, **--list**
> List all Pokemon.

**-s**, **--shiny**
> Show shiny variant.

**--no-title**
> Hide Pokemon name.

**-f**, **--form** _form_
> Specific form.

# DESCRIPTION

**pokemon-colorscripts** displays Pokemon as ASCII/ANSI art in the terminal. It can show random Pokemon, specific ones by name, and shiny variants.

Popular for shell startup decoration.

# EXAMPLES

```bash
# Random Pokemon
pokemon-colorscripts -r

# Specific Pokemon
pokemon-colorscripts -n pikachu

# Shiny Mewtwo
pokemon-colorscripts -n mewtwo -s

# Random without name
pokemon-colorscripts -r --no-title

# In .bashrc or .zshrc
pokemon-colorscripts -r
```

# SHELL INTEGRATION

```bash
# Add to ~/.bashrc or ~/.zshrc
pokemon-colorscripts -r

# Or with specific Pokemon
pokemon-colorscripts -n eevee
```

# CAVEATS

Requires Unicode/ANSI terminal support. Color accuracy depends on terminal. Generation 1-8 coverage varies.

# HISTORY

pokemon-colorscripts was created by **phoney badger** as a fun terminal decoration tool, inspired by ASCII art traditions.

# SEE ALSO

[neofetch](/man/neofetch)(1), [cowsay](/man/cowsay)(1), [lolcat](/man/lolcat)(1)
