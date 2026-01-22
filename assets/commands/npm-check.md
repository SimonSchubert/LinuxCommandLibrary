# TLDR

**Check for updates**

```npm-check```

**Interactive update**

```npm-check -u```

**Check globally installed**

```npm-check -g```

**Skip unused check**

```npm-check --skip-unused```

**Update all**

```npm-check -y```

**Check production only**

```npm-check --production```

# SYNOPSIS

**npm-check** [_options_]

# PARAMETERS

**-u**
> Interactive update mode.

**-g**
> Check global packages.

**--skip-unused**
> Skip unused package check.

**-y**
> Update all without prompt.

**--production**
> Production deps only.

**--help**
> Display help information.

# DESCRIPTION

**npm-check** checks for outdated and unused packages. Provides interactive updates.

The tool shows update availability. Identifies unused dependencies.

npm-check audits packages.

# CAVEATS

Third-party tool. Install with npm install -g. Interactive TUI.

# HISTORY

npm-check was created to provide **interactive package updates** and unused dependency detection.

# SEE ALSO

[npm](/man/npm)(1), [npm-outdated](/man/npm-outdated)(1), [ncu](/man/ncu)(1)

