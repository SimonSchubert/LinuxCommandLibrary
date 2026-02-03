# TLDR

**Switch home configuration**

```nh home switch```

**Build without switching**

```nh home build```

**Switch with flake**

```nh home switch --flake [.#username]```

# SYNOPSIS

**nh home** _command_ [_options_]

# PARAMETERS

**switch**
> Build and activate home configuration.

**build**
> Build configuration only.

**--flake** _ref_
> Flake reference.

**--dry**
> Dry run.

**--ask**
> Ask before activation.

# DESCRIPTION

**nh home** manages home-manager configurations. Friendly wrapper around home-manager with better output and flake support. Part of nh (nix helper) toolkit.

# SEE ALSO

[nh](/man/nh)(1), [home-manager](/man/home-manager)(1)

