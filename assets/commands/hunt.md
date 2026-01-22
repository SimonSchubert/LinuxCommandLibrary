# TLDR

**Start hunt game**

```hunt```

**Connect to server**

```hunt -h [hostname]```

**Use specific name**

```hunt -n [playername]```

**Connect to port**

```hunt -p [port]```

# SYNOPSIS

**hunt** [_options_]

# PARAMETERS

**-h** _HOST_
> Server hostname.

**-n** _NAME_
> Player name.

**-p** _PORT_
> Server port.

**-t** _TEAM_
> Team number.

**-c**
> Auto-connect.

**--help**
> Display help information.

# DESCRIPTION

**hunt** is a multiplayer terminal game where players hunt each other in a maze. Players shoot and dodge in text-based combat.

The game connects to a huntd server where multiple players compete. It features walls, bombs, and maze navigation.

hunt is a multiplayer hunting game.

# CAVEATS

Requires huntd server. Part of BSD games. Terminal-based graphics.

# HISTORY

hunt is a classic **BSD** network game from the 1980s, providing multiplayer action in terminals.

# SEE ALSO

[huntd](/man/huntd)(6), [nethack](/man/nethack)(6), [bsdgames](/man/bsdgames)(6)
