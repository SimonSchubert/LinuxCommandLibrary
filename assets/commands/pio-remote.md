# TLDR

**Start remote agent**

```pio remote agent start```

**List remote devices**

```pio remote device list```

**Build and upload remotely**

```pio remote run --target upload```

**Open remote serial monitor**

```pio remote device monitor```

# SYNOPSIS

**pio remote** _command_ [_options_]

# PARAMETERS

**agent** _action_
> Manage remote agent (start, list).

**device** _action_
> Remote device operations.

**run**
> Run remote build/upload.

**test**
> Run remote tests.

**-a**, **--agent** _name_
> Target specific agent.

# DESCRIPTION

**pio remote** enables remote development with PlatformIO. Run builds and uploads on remote machines with connected hardware. Requires PlatformIO account and running remote agent.

# SEE ALSO

[pio-run](/man/pio-run)(1), [pio-device](/man/pio-device)(1)

