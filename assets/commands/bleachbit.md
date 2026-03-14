# TAGLINE

Clean disk space and maintain privacy

# TLDR

Launch **GUI**

```bleachbit --gui```

**Shred** a file

```bleachbit -s path/to/file```

List **cleaners**

```bleachbit -l```

**Preview** cleanup for specific cleaners

```bleachbit -p [system.cache] [system.tmp]```

**Perform** cleanup for specific cleaners

```bleachbit -c [system.cache] [system.tmp]```

**Clean all** presets configured in the GUI

```bleachbit -c --preset```

**Wipe free disk space** on a partition

```bleachbit --wipe-free-space [path/to/mount_point]```

# SYNOPSIS

**bleachbit** [_OPTIONS_] [_cleaner.option_...]

# DESCRIPTION

**bleachbit** frees disk space and maintains privacy by cleaning cache, cookies, temporary files, logs, and other junk. It supports hundreds of applications through its cleaner system, which identifies and removes unnecessary files specific to each program.

The tool can also securely shred individual files to prevent recovery. It provides both a graphical interface and command-line mode for scripted or scheduled cleanups.

# PARAMETERS

**--gui**
> Start graphical user interface

**-s, --shred** _file_
> Securely delete file

**-l, --list-cleaners**
> List available cleaner options

**-p, --preview**
> Preview files that would be deleted

**-c, --clean**
> Perform cleanup operation

**--preset**
> Use cleaner options configured in the graphical interface

**-o, --overwrite**
> Overwrite files to hide contents

**--wipe-free-space** _path_
> Wipe free disk space in the given path's partition

**--sysinfo**
> Show system information

**--all-but-warning**
> Enable all cleaners except those with warnings

# CAVEATS

Preview before cleaning to avoid deleting important data. Shredding files is slow but more secure than regular deletion. Some cleaners may affect application settings.

# HISTORY

**bleachbit** was created by **Andrew Ziem** and first released in **2008**. It is an open-source disk cleanup tool, often compared to CCleaner on Windows. Written in Python, it runs on Linux and Windows.

# SEE ALSO

[rm](/man/rm)(1), [shred](/man/shred)(1)
