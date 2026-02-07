# TAGLINE

Replay aptitude state from a bundle

# TLDR

**Run** aptitude with state bundle

```aptitude-run-state-bundle [bundle.tar.bz2]```

Run with **specific aptitude args**

```aptitude-run-state-bundle [bundle.tar.bz2] -- search [pattern]```

# SYNOPSIS

**aptitude-run-state-bundle** _bundle_ [_-- aptitude-args_]

# DESCRIPTION

**aptitude-run-state-bundle** runs aptitude using state from a previously created bundle. This allows reproducing exact package states for debugging or testing dependency resolution.

The tool extracts the bundle, configures aptitude to use the extracted state, and runs aptitude with any provided arguments.

# PARAMETERS

**bundle**
> State bundle file (.tar.bz2)

**-- args**
> Arguments to pass to aptitude

# CAVEATS

Used for debugging purposes. The bundle's state may not match current repository state. Primarily useful for aptitude developers.

# HISTORY

**aptitude-run-state-bundle** complements aptitude-create-state-bundle, enabling developers to reproduce reported issues.

# SEE ALSO

[aptitude](/man/aptitude)(8), [aptitude-create-state-bundle](/man/aptitude-create-state-bundle)(1)
