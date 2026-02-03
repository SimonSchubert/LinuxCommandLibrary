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

# DESCRIPTION

**pio lib** manages PlatformIO libraries. Search, install, and update libraries from the PlatformIO registry. Handles dependencies automatically for embedded projects.

# SEE ALSO

[pio-init](/man/pio-init)(1), [pio-run](/man/pio-run)(1), [pio-pkg](/man/pio-pkg)(1)

