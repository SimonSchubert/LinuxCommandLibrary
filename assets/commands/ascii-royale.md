# TAGLINE

Peer-to-peer battle royale in the terminal

# TLDR

**Drop straight** into the public arena

```ascii-royale play```

**Browse open games** and pick one

```ascii-royale browse```

**Play offline** against bots

```ascii-royale solo --bots [9]```

**Host a match** for others to join

```ascii-royale host```

**Join a specific** match by ticket

```ascii-royale join [ticket]```

# SYNOPSIS

**ascii-royale** _command_ [_options_]

# PREVIEW

```
 ~~~~~~~~~~~~~
 ~ . @ . o . ~
 ~ . ### . . ~
 ~ x . . . o ~
 ~~~ storm ~~~
```

# DESCRIPTION

**ascii-royale** is a battle royale game played entirely in the terminal. Up to 16 combatants fight on a procedurally generated ASCII island, with a shrinking storm that forces players together until one is left standing. Bots fill any empty slots, so solo play works without other people.

Matches are peer-to-peer over the iroh networking library, with no central game server and no accounts: the whole game is a single binary. Players can drop into the public arena, browse and join open games, host their own match, or run a headless arena server. The same game is also playable in a browser.

# COMMANDS

**play**
> Drop straight into the public arena.

**browse**
> List open games and select one to join.

**join** _ticket_
> Join a specific match using its ticket.

**host**
> Host a match. Accepts **--bots** _N_ and **--name** _NAME_.

**solo --bots** _N_
> Play offline against the given number of AI opponents.

**serve**
> Run a headless arena server.

# PARAMETERS

**--bots** _N_
> Number of bot players to add.

**--http-port** _PORT_
> Serve the web interface on the given port.

**--ticket-file** _PATH_
> Write the join ticket to a file.

**--stats-file** _PATH_
> Persist leaderboard data to a file.

# CONTROLS

**w a s d** / **arrows**
> Move and set aim direction.

**f** / **space**
> Fire weapon (auto-aims at lined-up enemies).

**e** / **g**
> Pick up items.

**h** / **m**
> Use a medkit.

**t**
> Throw a grenade.

**M**
> Mute or unmute sound.

**q** / **Esc**
> Quit.

# CAVEATS

Networking is peer-to-peer over iroh, so matches depend on direct connectivity between players. The project is built in Rust and is installed from source with a recent toolchain.

# HISTORY

**ascii-royale** is written in **Rust** and distributed under the MIT license. It models the battle-royale genre in pure text, using iroh for serverless peer-to-peer play and 8-bit synthesized sound effects.

# SEE ALSO

[ninvaders](/man/ninvaders)(1), [hunt](/man/hunt)(1), [nethack-console](/man/nethack-console)(1)

# RESOURCES

```[Source code](https://github.com/chad/ascii-royale)```

<!-- verified: 2026-06-14 -->
