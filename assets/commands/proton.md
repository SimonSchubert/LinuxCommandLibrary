# TAGLINE

Valve's Windows game compatibility layer for Linux

# TLDR

**Run a Windows executable via Proton**

```proton run [game.exe]```

**Run using a specific Proton version directly**

```~/.steam/steam/steamapps/common/Proton\ [7.0]/proton run [game.exe]```

**Enable Proton log to $HOME/steam-$APPID.log**

```PROTON_LOG=1 proton run [game.exe]```

**Force OpenGL instead of Vulkan for DirectX translation**

```PROTON_USE_WINED3D=1 proton run [game.exe]```

**Disable esync and fsync (for kernels that do not support them)**

```PROTON_NO_ESYNC=1 PROTON_NO_FSYNC=1 proton run [game.exe]```

**Wait for a previous process to exit, then run**

```proton waitforexitandrun [game.exe]```

# SYNOPSIS

**proton** _verb_ [_arguments_...]

# VERBS

**run**
> Run a Windows executable under Proton.

**waitforexitandrun**
> Wait for any lingering Wine server to exit, then run the executable. Used by Steam when switching prefixes.

**runinprefix**
> Run a program inside the currently configured Proton prefix without spawning a new one.

**destroyprefix**
> Delete the current Proton prefix, forcing Steam to recreate it.

**getcompatpath**
> Print the pfx compatdata path for the game.

**getnativepath**
> Print the native (Linux) path that corresponds to a Windows path.

# ENVIRONMENT VARIABLES

**STEAM_COMPAT_CLIENT_INSTALL_PATH**
> Required. Path to the Steam client install (usually **~/.steam/steam**).

**STEAM_COMPAT_DATA_PATH**
> Required. Directory where Proton stores the pfx, configuration, and caches.

**PROTON_LOG**
> Enable user-friendly logging to **$HOME/steam-$APPID.log**.

**PROTON_USE_WINED3D**
> Use WineD3D (OpenGL) instead of DXVK/VKD3D for DirectX.

**PROTON_NO_ESYNC**, **PROTON_NO_FSYNC**
> Disable the esync or fsync synchronization primitives.

**PROTON_ENABLE_NVAPI**
> Enable NVIDIA NVAPI so DLSS and Reflex work with supported GPUs.

**PROTON_FORCE_LARGE_ADDRESS_AWARE**
> Mark 32-bit executables as large-address-aware.

**PROTON_DUMP_DEBUG_COMMANDS**
> Dump helper scripts for re-running the game with winedbg, strace, etc.

# DESCRIPTION

**Proton** is Valve's compatibility layer for running Windows games on Linux through the Steam client. It bundles a patched **Wine**, the **DXVK** Direct3D 9/10/11 → Vulkan translator, **VKD3D-Proton** for Direct3D 12, **FAudio** for XAudio2, and various runtime libraries. Steam normally invokes proton automatically via the "Steam Play" setting; direct invocation is rare and primarily useful for troubleshooting.

Each game has its own Wine prefix under **$STEAM_COMPAT_DATA_PATH/pfx**. The **proton** script can be called directly with a verb such as **run** once the required environment variables are set.

# CAVEATS

Running proton outside Steam requires setting **STEAM_COMPAT_CLIENT_INSTALL_PATH** and **STEAM_COMPAT_DATA_PATH**. Not all Windows software runs successfully — consult ProtonDB for compatibility reports. Games with kernel-level anti-cheat frequently refuse to run under Proton.

# HISTORY

Proton was announced by **Valve** in **August 2018** as part of the Steam Play initiative, in collaboration with **CodeWeavers** and the DXVK author **Philip Rebohle**. Proton Experimental and Proton-GE (community fork) continue to receive frequent updates.

# SEE ALSO

[wine](/man/wine)(1), [steam](/man/steam)(1), [lutris](/man/lutris)(1), [winetricks](/man/winetricks)(1)
