# TAGLINE

manages PlatformIO libraries (deprecated, use pio pkg)

# TLDR

**Search for libraries**

```pio lib search [mqtt]```

**Install library**

```pio lib install [PubSubClient]```

**Install specific version**

```pio lib install "[email protected]"```

**List installed libraries**

```pio lib list```

**Uninstall library**

```pio lib uninstall [PubSubClient]```

**Update all installed libraries**

```pio lib update```

# SYNOPSIS

**pio lib** _command_ [_options_]

# PARAMETERS

**search** _query_
> Search library registry.

**install** _library_
> Install library.

**uninstall** _library_
> Remove library.

**list**
> List installed libraries.

**update**
> Update installed libraries.

**show** _library_
> Show library details.

**builtin**
> Show built-in libraries.

**register**
> Register a library in the PlatformIO registry.

**stats**
> Show library statistics.

**-d**, **--storage-dir** _dir_
> Manage custom library storage directory.

**-g**, **--global**
> Work with global PlatformIO library storage.

**-e**, **--environment** _name_
> Target a specific project build environment.

# DESCRIPTION

**pio lib** manages PlatformIO libraries. Search, install, and update libraries from the PlatformIO registry. Handles dependencies automatically for embedded projects. This command is deprecated since PlatformIO 6.0; use **pio pkg** instead.

# SEE ALSO

[pio-pkg](/man/pio-pkg)(1), [pio-init](/man/pio-init)(1), [pio-run](/man/pio-run)(1), [pio](/man/pio)(1)

