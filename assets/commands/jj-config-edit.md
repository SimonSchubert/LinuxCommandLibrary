# TAGLINE

opens the Jujutsu configuration file in your default editor

# TLDR

**Edit user config in editor**

```jj config edit --user```

**Edit repository config**

```jj config edit --repo```

# SYNOPSIS

**jj** **config** **edit** [_options_]

# PARAMETERS

**--user**
> Edit user-level configuration.

**--repo**
> Edit repository-level configuration.

# DESCRIPTION

**jj config edit** opens the Jujutsu configuration file in your default editor. User config applies globally while repo config applies only to the current repository. Configuration uses TOML format.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-config-get](/man/jj-config-get)(1), [jj-config-set](/man/jj-config-set)(1)

