# TAGLINE

re-enable frozen pipeline stages

# TLDR

**Unfreeze a stage**

```dvc unfreeze [stage_name]```

**Unfreeze all stages in file**

```dvc unfreeze [dvc.yaml]```

# SYNOPSIS

**dvc** **unfreeze** [_options_] _targets_...

# DESCRIPTION

**dvc unfreeze** unfreezes previously frozen pipeline stages, allowing them to be executed again during dvc repro.

# INSTALL

```brew: brew install dvc```

```nix: nix profile install nixpkgs#dvc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dvc-freeze](/man/dvc-freeze)(1)

