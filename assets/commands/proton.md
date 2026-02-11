# TAGLINE

Valve's Windows game compatibility layer for Linux

# TLDR

**Run Windows game via Proton**

```proton run [game.exe]```

**Run with specific Proton version**

```PROTON_VERSION=[7.0] proton run [game.exe]```

**Enable logging**

```PROTON_LOG=1 proton run [game.exe]```

**List installed Protons**

```ls ~/.steam/steam/steamapps/common/ | grep -i proton```

# SYNOPSIS

**proton** _command_ [_options_] [_executable_]

# PARAMETERS

**run**
> Run Windows executable.

**waitforexitandrun**
> Wait for process then run.

# DESCRIPTION

**Proton** is Valve's compatibility layer for running Windows games on Linux through Steam. It's based on Wine with additional patches, DXVK, and VKD3D for DirectX support.

Usually invoked automatically by Steam rather than directly.

# EXAMPLES

```bash
# Direct invocation (rare)
~/.steam/steam/steamapps/common/Proton\ 7.0/proton run game.exe

# With environment variables
PROTON_USE_WINED3D=1 proton run game.exe

# Enable NVIDIA DLSS
PROTON_ENABLE_NVAPI=1 proton run game.exe

# Debug output
PROTON_LOG=1 PROTON_DUMP_DEBUG_COMMANDS=1 proton run game.exe
```

# ENVIRONMENT VARIABLES

```bash
PROTON_LOG=1              # Enable logging
PROTON_USE_WINED3D=1      # Use OpenGL instead of Vulkan
PROTON_NO_ESYNC=1         # Disable esync
PROTON_NO_FSYNC=1         # Disable fsync
PROTON_ENABLE_NVAPI=1     # Enable NVIDIA features
```

# CAVEATS

Primarily managed by Steam. Not all games compatible. Check ProtonDB for compatibility reports.

# HISTORY

Proton was developed by **Valve** in collaboration with **CodeWeavers**, released in 2018 for Steam Play on Linux.

# SEE ALSO

[wine](/man/wine)(1), [steam](/man/steam)(1), [lutris](/man/lutris)(1)
