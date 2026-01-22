# TLDR

Run a specific program inside the **wine environment**

```wine [command]```

Run a program in **background**

```wine start [command]```

**Install** an MSI package

```wine msiexec /i [path/to/package.msi]```

**Uninstall** an MSI package

```wine msiexec /x [path/to/package.msi]```

Run **File Explorer**, **Notepad**, or **WordPad**

```wine [explorer|notepad|write]```

Run **Registry Editor**, **Control Panel**, or **Task Manager**

```wine [regedit|control|taskmgr]```

Run the **configuration** tool

```wine winecfg```

# SYNOPSIS

**wine** [_options_] _program_ [_arguments_]

# PARAMETERS

**winecfg**
> Open Wine configuration dialog

**regedit**
> Open Wine Registry Editor

**control**
> Open Wine Control Panel

**explorer**
> Open Wine File Explorer

**taskmgr**
> Open Wine Task Manager

**msiexec** **/i** _package.msi_
> Install MSI package

**msiexec** **/x** _package.msi_
> Uninstall MSI package

**start** _program_
> Run program in background (detached)

**--version**
> Display Wine version

**WINEPREFIX=**_path_
> Environment variable to specify Wine prefix directory

**WINEDEBUG=**_channels_
> Environment variable for debug output

# DESCRIPTION

**wine** (Wine Is Not an Emulator) runs Windows applications on Unix-like operating systems by translating Windows API calls into POSIX calls in real-time. It implements the Windows runtime environment without requiring a Windows license or virtual machine.

Wine creates isolated "prefixes" (virtual C: drives) containing Windows directory structure, registry, and installed programs. Each prefix can be configured independently with different Windows versions and settings via winecfg.

# CAVEATS

Not all Windows software works; check the Wine Application Database (AppDB) for compatibility. Some applications require additional runtime libraries installed via **winetricks**. 32-bit support may need to be enabled separately on 64-bit systems.

# HISTORY

Development began in **1993** by Bob Amstadt and Eric Youngdale, making Wine one of the oldest continuous free software projects. The recursive backronym "Wine Is Not an Emulator" emphasizes that Wine reimplements Windows APIs rather than emulating hardware. Major milestones include Wine 1.0 in **2008** and version 9.0 in **2024**.

# SEE ALSO

[winetricks](/man/winetricks)(1), [winecfg](/man/winecfg)(1)
