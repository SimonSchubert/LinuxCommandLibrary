# TAGLINE

Clean disk space and maintain privacy

# TLDR

Launch **GUI**

```bleachbit --gui```

**Shred** a file

```bleachbit -s path/to/file```

List **cleaners**

```bleachbit -l```

**Preview** cleanup

```bleachbit -p --preset cleaner.option```

**Perform** cleanup

```bleachbit -c --preset cleaner.option```

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
> Use specified cleaner presets

# CAVEATS

Preview before cleaning to avoid deleting important data. Shredding files is slow but more secure than regular deletion. Some cleaners may affect application settings.

# HISTORY

**bleachbit** is an open-source disk cleanup tool, similar to CCleaner on Windows.

# SEE ALSO

[rm](/man/rm)(1), [shred](/man/shred)(1)
