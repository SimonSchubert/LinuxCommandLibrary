# TAGLINE

manages NixOS system configurations

# TLDR

**Switch to new configuration**

```nh os switch```

**Build without switching**

```nh os build```

**Test configuration**

```nh os test```

**Boot into new configuration**

```nh os boot```

# SYNOPSIS

**nh os** _command_ [_options_]

# PARAMETERS

**switch**
> Build and activate configuration.

**build**
> Build configuration only.

**test**
> Build and activate temporarily.

**boot**
> Build and set as boot default.

**--flake** _ref_
> Flake reference.

**--dry**
> Dry run.

**--ask**
> Ask before activation.

# DESCRIPTION

**nh os** manages NixOS system configurations. Friendly wrapper around nixos-rebuild with better output and flake support. Part of nh (nix helper) toolkit.

# SEE ALSO

[nh](/man/nh)(1), [nixos-rebuild](/man/nixos-rebuild)(1)

