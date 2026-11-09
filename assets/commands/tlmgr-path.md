# TAGLINE

Link TeX Live programs into system directories

# TLDR

**Add symlinks to system directories**

```sudo tlmgr path add```

**Remove symlinks from system directories**

```sudo tlmgr path remove```

**Show the directory used for executables**

```tlmgr option sys_bin```

**Change the directory used for executables**

```tlmgr option sys_bin [/usr/local/bin]```

# SYNOPSIS

**tlmgr path** [**--windowsmode**=user|admin] add|remove

# PARAMETERS

**add**
> Add symlinks for executables, man pages and Info pages.

**remove**
> Remove those symlinks.

**--windowsmode**=user|admin
> Windows only: choose whether the user or system PATH is changed.

# DESCRIPTION

**tlmgr path** manages system integration for TeX Live. On Unix it creates or removes symlinks in the directories set by the **sys_bin**, **sys_man** and **sys_info** options. On Windows it changes the registry entry for PATH. Part of TeX Live Manager.

# CAVEATS

Writing to system directories usually requires root privileges. May conflict with system TeX packages. Shell initialization files are not changed. Executables added or removed by later updates are not handled automatically, so rerun this command as needed.

# SEE ALSO

[tlmgr](/man/tlmgr)(1), [tlmgr-option](/man/tlmgr-option)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->
