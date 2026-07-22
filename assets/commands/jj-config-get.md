# TAGLINE

retrieves configuration values from Jujutsu config files

# TLDR

**Get a configuration value**

```jj config get [user.name]```

**Get the user's email**

```jj config get [user.email]```

# SYNOPSIS

**jj** **config** **get** _name_

# DESCRIPTION

**jj config get** retrieves a single configuration value from Jujutsu config files. The output is printed without extra formatting, making it suitable for use in scripts. Repo config takes precedence over user config when both define the same key.

Unlike `jj config list`, this command outputs only the raw value without labels or quotes.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-config-set](/man/jj-config-set)(1), [jj-config-list](/man/jj-config-list)(1)

