# TAGLINE

random quotation and fortune display

# TLDR

**Display random fortune**

```fortune```

**Show short fortunes**

```fortune -s```

**Show offensive fortunes**

```fortune -o```

**Use specific database**

```fortune [literature]```

**Show fortune source**

```fortune -c```

# SYNOPSIS

**fortune** [_options_] [_databases_...]

# PARAMETERS

_DATABASES_
> Fortune cookie files to use.

**-s**
> Short fortunes only (< 160 chars).

**-l**
> Long fortunes only.

**-c**
> Show the fortune file source.

**-o**
> Include offensive fortunes.

**-a**
> Include all fortune files.

**-f**
> List available fortune files.

**-m** _PATTERN_
> Match pattern in fortunes.

**--help**
> Display help information.

# DESCRIPTION

**fortune** displays a random quotation, joke, or saying from its database files. It's the classic Unix program for adding whimsy to terminals and login sessions.

Multiple fortune databases cover categories like literature, riddles, definitions, and jokes. Custom database files can be created with the strfile utility.

fortune is commonly added to shell startup files for daily motivation or amusement.

# CAVEATS

Offensive fortunes disabled by default. Database availability varies by installation. Some content may be dated.

# HISTORY

fortune originated in **Unix Version 7** (1979), inspired by fortune cookies. It became a standard part of Unix systems, providing entertainment and occasionally wisdom at the command line.

# SEE ALSO

[cowsay](/man/cowsay)(1), [figlet](/man/figlet)(1)
