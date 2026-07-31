# TAGLINE

Play game ROMs in the terminal via libretro

# TLDR

**Play** a ROM (first launch may offer to fetch the core)

```rom [path/to/game.sfc]```

**Resume** a recently played game from its newest save state

```rom --resume```

**Use** a specific libretro core

```rom --core [path/to/core.so] [path/to/game.gb]```

**Fullscreen** in the terminal window

```rom --fullscreen [path/to/game.gba]```

**Integer scale** (inline mode) and **recolor** to the terminal theme

```rom --scale [3] --recolor [hue] [path/to/game.nes]```

**Print** key bindings for a ROM

```rom --keys [path/to/game.sfc]```

**Disable** audio

```rom --no-audio [path/to/game.md]```

# SYNOPSIS

**rom** [_options_] _rom-file_

**rom** **--resume**

# PARAMETERS

**--resume**
> Pick from recently played games and load the newest save state.

**--core** _path_
> Use a specific libretro core (.so on Linux, .dylib on macOS).

**--fullscreen**
> Fill the terminal window.

**--scale** _n_
> Integer zoom in inline mode, 1–8 (default 2); change live with **[** / **]**.

**--slot** _n_
> Initial save-state slot, 0–9.

**--no-audio**
> Disable audio.

**--recolor** _mode_
> Terminal-theme recoloring: **off**, **hue**, **nearest**, **duotone**, **tint**, or **dither**.

**--recolor-strength** _0..1_
> Blend recoloring with the original palette.

**--keys**
> Print current key bindings (optionally with a ROM path for effective settings).

**--selftest** _n_
> Run _n_ frames without a terminal (for testing).

**--shot** _file_
> Save the final self-test frame as BMP.

**--force**
> Skip terminal graphics detection.

# DESCRIPTION

**rom** is a small **libretro** frontend for **macOS** and **Linux** that plays console and classic PC game ROMs **inline in the terminal**. It renders native pixels with the **kitty graphics protocol** (works in **Ghostty** or **kitty**, including under **tmux** with passthrough enabled), supports real key-release events, save states, audio, fast-forward, and live terminal-theme recoloring.

The tool does **not** ship games, BIOS files, or emulator cores. Opening a ROM for a platform without a core installed prompts to shallow-clone and build the matching libretro core into **~/.config/rom/cores/** (requires git, make, and a C/C++ toolchain). Cores are also searched under **./cores/** and next to the executable.

Supported extensions map to common cores, including SNES (**.sfc**/**.smc**), NES (**.nes**), Game Boy/Color (**.gb**/**.gbc**), GBA (**.gba**), Genesis (**.md**/**.gen**), PC Engine (**.pce**), N64 (**.n64**/**.z64**), Doom-family WADs (**.wad**), and Wolfenstein data (**.wl6**, etc.). Only run software you are legally entitled to use.

# CONFIGURATION

**~/.config/rom/config**
> Main settings: scale, terminal scaling, recolor mode, audio/focus behavior, key bindings, and optional per-system (**snes**, **nes**, **gb**, **gba**, **genesis**, **pce**, **n64**, **doom**, **wolf3d**) and **[core.**_system_**]** libretro option sections.

**~/.config/rom/cores/**
> Installed libretro core libraries.

**~/.config/rom/saves/** / **~/.config/rom/states/**
> Battery saves and save states.

**~/.config/rom/games/** / **~/.config/rom/recent**
> Per-ROM volume/scale memory and the resume list.

**tmux**: enable graphics passthrough once with **tmux set -g allow-passthrough all** (or set it in **~/.tmux.conf**).

# CAVEATS

Requires a terminal that supports the **kitty graphics protocol** (Ghostty or kitty). Audio uses CoreAudio on macOS and ALSA on Linux. OpenGL cores are supported on macOS via offscreen CGL; Linux is software-rendered until an EGL backend lands. No Vulkan cores. Player 1 keyboard only. ROMs, BIOS, and cores are not redistributed—obtain them legally yourself.

# HISTORY

**rom** is an open-source libretro frontend by **jhickner** that targets terminal-native play: kitty-protocol frame output, save states, and optional palette recoloring to match the host terminal theme.

# SEE ALSO

[retroarch](/man/retroarch)(1), [emulationstation](/man/emulationstation)(1), [kitty](/man/kitty)(1)

# RESOURCES

```[Source code](https://github.com/jhickner/rom)```

<!-- verified: 2026-07-31 -->
