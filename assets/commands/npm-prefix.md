# TLDR

**Show local prefix**

```npm prefix```

**Show global prefix**

```npm prefix -g```

# SYNOPSIS

**npm** **prefix** [_options_]

# PARAMETERS

**-g**
> Global prefix.

**--help**
> Display help information.

# DESCRIPTION

**npm prefix** prints the local or global prefix path. Shows where packages are installed.

The command displays installation directory. Useful for scripting.

npm prefix shows install path.

# CAVEATS

Local shows closest package.json dir. Global shows npm global path.

# HISTORY

npm prefix helps locate **package installation directories** for scripts and debugging.

# SEE ALSO

[npm](/man/npm)(1), [npm-root](/man/npm-root)(1), [npm-bin](/man/npm-bin)(1)

