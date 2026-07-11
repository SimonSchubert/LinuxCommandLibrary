# TAGLINE

Invoke a program with GameMode optimizations for better game performance

# TLDR

**Run a program** with GameMode CPU and system optimizations enabled

```gamemoderun ./mygame```

**Run a game from Steam** by setting launch options

```gamemoderun %command%```

**Run with a custom wrapper** that receives the original command

```GAMEMODERUNEXEC="env __GL_SYNC_TO_VBLANK=1" gamemoderun ./game```

**Use a hybrid-GPU launcher** via the same variable

```GAMEMODERUNEXEC=optirun gamemoderun ./game```

# SYNOPSIS

**gamemoderun** _program_ [_args_...]

# DESCRIPTION

**gamemoderun** is a helper that launches the given program under GameMode. GameMode is a daemon and library combination for Linux that requests temporary system optimizations (such as CPU governor changes, I/O priority, process niceness, screensaver inhibiting, GPU performance modes, and optional custom scripts) while a game or other performance-sensitive application is running.

It works by preloading `libgamemodeauto.so.0`, which communicates with the `gamemoded` daemon. The design cleanly separates the client from the daemon so games can safely request mode without hard dependencies.

gamemoderun is the recommended way to launch games that do not integrate the GameMode client library directly. It is commonly used in Steam launch options and desktop launchers.

# PARAMETERS

gamemoderun itself takes no flags; it executes its arguments under GameMode via `LD_PRELOAD`.

**GAMEMODERUNEXEC**
> Environment variable. If set, gamemoderun runs this command (or command prefix) and passes the original program and arguments to it. Useful for hybrid-GPU wrappers (`optirun`, `env DRI_PRIME=1`, NVIDIA prime offload env) or other launch helpers. GameMode is injected into the final game process, not into the wrapper itself. May be set globally (e.g. in `/etc/environment`).

# CAVEATS

GameMode optimizations are best-effort and depend on the host configuration and privileges. On some systems the CPU governor changes may be restricted. The daemon must be installed and running (or activatable via user service) for optimizations to apply; missing daemon still allows the game to start.

# RESOURCES

```[Source code](https://github.com/FeralInteractive/gamemode)```

```[Documentation](https://github.com/FeralInteractive/gamemode#requesting-gamemode)```

<!-- verified: 2026-07-11 -->
