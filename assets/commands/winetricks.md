# TLDR

Start a **graphical setup** at the default Wine location

```winetricks```

Specify a **custom Wine directory**

```WINEPREFIX=[path/to/wine_directory] winetricks```

Install a Windows **DLL or component**

```winetricks [package]```

# SYNOPSIS

**winetricks** [_options_] [_verb_...]

# PARAMETERS

_verb_
> Package, font, or setting to install/configure

**--gui**
> Start graphical interface

**--force**
> Force installation even if already installed

**--unattended**
> Don't show prompts during installation

**--no-isolate**
> Don't install in isolated environment

**--verify**
> Verify installation after completion

**list**
> List available verbs

**list-download**
> List packages that can be downloaded

**apps** / **benchmarks** / **dlls** / **fonts** / **games** / **settings**
> List verbs in specific category

**WINEPREFIX=**_path_
> Environment variable to specify Wine prefix

# DESCRIPTION

**winetricks** is a helper script to download and install various redistributable runtime libraries and settings needed to run Windows programs under Wine. It automates the installation of components like DirectX, Visual C++ runtimes, fonts, and .NET Framework.

The tool provides both a graphical interface and command-line operation. It can install multiple components at once and handles dependencies automatically. Each installation can be done in a specific Wine prefix.

# CAVEATS

Some components require accepting license agreements even in unattended mode. Downloaded files are cached in ~/.cache/winetricks. Some verbs require an internet connection to download components from Microsoft or other sources.

# HISTORY

Created by **Dan Kegel** and released in **2007** as a shell script to automate common Wine setup tasks. Became an essential companion tool for Wine users, reducing the complexity of configuring Windows applications. Now maintained by the Wine community.

# SEE ALSO

[wine](/man/wine)(1), [winecfg](/man/winecfg)(1)
