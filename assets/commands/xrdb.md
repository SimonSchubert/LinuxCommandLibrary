# TAGLINE

Manage X server resource database

# TLDR

**Start** xrdb in interactive mode

```xrdb```

**Load** values from a resource file

```xrdb -load [~/.Xresources]```

**Query** the resource database and print current values

```xrdb -query```

# SYNOPSIS

**xrdb** [_options_] [_filename_]

# PARAMETERS

**-load**
> Load resources from file, replacing existing values

**-merge**
> Merge resources from file with existing values

**-query**
> Display current resources

**-remove**
> Remove all resources

**-symbols**
> Print preprocessor symbols

**-cpp _path_**
> Specify preprocessor to use

**-nocpp**
> Don't preprocess input

**-display _display_**
> Specify X display

# DESCRIPTION

**xrdb** (X Resource DataBase) manages the X server resource database. X resources configure the appearance and behavior of X applications, including colors, fonts, and other settings.

Resources are typically loaded from **~/.Xresources** or **~/.Xdefaults** at X session startup. The **-merge** option adds new resources without removing existing ones.

# CAVEATS

Changes only affect newly started applications. Use **-merge** to preserve existing settings when adding new ones. The file is processed by cpp by default, allowing use of #include and #define. Part of the X.Org utilities.

# SEE ALSO

[X](/man/X)(7), [Xresources](/man/Xresources)(5), [xset](/man/xset)(1)
