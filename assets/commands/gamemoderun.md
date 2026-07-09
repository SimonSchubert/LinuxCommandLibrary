# TAGLINE

Invoke a program with GameMode optimizations for better game performance

# TLDR

**Run a program** with GameMode CPU and system optimizations enabled

```gamemoderun ./mygame```

**Run a game from Steam** by setting launch options

```gamemoderun %command%```

**Run with a custom wrapper** that receives the original command

```GAMEMODERUNEXEC="env __GL_SYNC_TO_VBLANK=1" gamemoderun ./game```

# SYNOPSIS

**gamemoderun** _program_ [_args_...]

# DESCRIPTION

**gamemoderun** is a helper that launches the given program under GameMode. GameMode is a daemon and library combination for Linux that requests temporary system optimizations (such as CPU governor changes, I/O priority, and other tweaks) while a game or other performance-sensitive application is running.

It works by preloading `libgamemodeauto.so` (or manually preloading `libgamemode`) which communicates with the `gamemoded` daemon. The design cleanly separates the client from the daemon so games can safely request mode without hard dependencies.

gamemoderun is the recommended way to launch games that do not integrate the GameMode client library directly. It is commonly used in Steam launch options and desktop launchers.

# CAVEATS

GameMode optimizations are best-effort and depend on the host configuration and privileges. On some systems the CPU governor changes may be restricted. The environment variable `GAMEMODERUNEXEC` can be used to run the target program via an intermediate command (the original arguments are passed to it).

# SEE ALSO

gamemoded(8)

# RESOURCES

```[Source code](https://github.com/FeralInteractive/gamemode)```

```[Documentation](https://github.com/FeralInteractive/gamemode#requesting-gamemode)```

<!-- verified: 2026-07-09 -->
