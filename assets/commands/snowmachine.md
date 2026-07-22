# TAGLINE

Make it snow in your terminal

# TLDR

**Create a falling snow animation**

```snowmachine snow```

**Snow that stacks at the bottom in rainbow colors**

```snowmachine snow --stack=pile --color=rainbow```

**Render a Christmas tree with a classic star**

```snowmachine tree --star=classic```

**Slow down the falling snow** (lower is slower)

```snowmachine snow --speed=[20]```

**Use specific particle characters**

```snowmachine snow --particle="[*]"```

# SYNOPSIS

**snowmachine** _command_ [_options_]

# COMMANDS

**snow**
> Render falling snow.

**tree**
> Render a Christmas tree.

# PARAMETERS

**--color** _NAME_
> Particle colour: _white_, _rainbow_, etc.

**--stack** _MODE_
> Stack particles at the bottom: _pile_ keeps a growing snow drift; default has none.

**--speed** _N_
> Frame interval (lower = faster).

**--particle** _CHAR_
> Override the snowflake character.

**--star** _STYLE_
> Star atop the tree (e.g., _classic_).

# DESCRIPTION

**snowmachine** is a Python script that renders animated falling snow or a Christmas tree in your terminal. It supports customizable particle colors, snow stacking effects, speed adjustments, and star decorations for the tree mode.

# HISTORY

**snowmachine** was created by **John Anderson** (sontek) and is written in **Python**.

# INSTALL

```nix: nix profile install nixpkgs#snowmachine```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[cmatrix](/man/cmatrix)(1), [asciiquarium](/man/asciiquarium)(1), [terminaltexteffects](/man/terminaltexteffects)(1)
