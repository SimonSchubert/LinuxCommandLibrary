# TLDR

**Compile installer script**

```makensis [script.nsi]```

**Verbose output**

```makensis -V[4] [script.nsi]```

**Define symbol**

```makensis -D[NAME=value] [script.nsi]```

**Include path**

```makensis -I[/path/to/includes] [script.nsi]```

**Output file**

```makensis -O[installer.exe] [script.nsi]```

**Show help**

```makensis -HELP```

# SYNOPSIS

**makensis** [_options_] _script_

# PARAMETERS

_SCRIPT_
> NSIS script file (.nsi).

**-V** _LEVEL_
> Verbosity level (0-4).

**-D** _NAME=VALUE_
> Define symbol.

**-I** _DIR_
> Add include path.

**-O** _FILE_
> Output file name.

**-HELP**
> Show help.

# DESCRIPTION

**makensis** compiles NSIS installer scripts. NSIS creates Windows installers.

The tool generates executable installers from script definitions. Used for Windows software distribution.

makensis creates Windows installers.

# CAVEATS

Windows installer format. Can run on Linux via Wine. NSIS script syntax required.

# HISTORY

NSIS (Nullsoft Scriptable Install System) was created by **Nullsoft**, makers of Winamp.

# SEE ALSO

[wine](/man/wine)(1), [innosetup](/man/innosetup)(1)

