# TLDR

**List all shell options** with their status

```shopt```

**Enable a shell option**

```shopt -s [optname]```

**Disable a shell option**

```shopt -u [optname]```

**Check if an option is set** (quiet mode)

```shopt -q [optname] && echo "enabled"```

**Enable extended globbing**

```shopt -s extglob```

**Enable case-insensitive globbing**

```shopt -s nocaseglob```

**Include dotfiles in glob patterns**

```shopt -s dotglob```

**Print options in reusable format**

```shopt -p```

# SYNOPSIS

**shopt** [_-pqsu_] [_-o_] [_optname ..._]

# PARAMETERS

**-p**
> Print shell options in a format reusable as input

**-q**
> Quiet mode; suppress output, return status only

**-s**
> Set (enable) the specified options

**-u**
> Unset (disable) the specified options

**-o**
> Restrict to options also settable with set -o

# COMMON OPTIONS

**cdspell**
> Auto-correct minor spelling errors in cd arguments

**dotglob**
> Include files starting with . in glob patterns

**extglob**
> Enable extended pattern matching operators

**globstar**
> Enable ** recursive directory matching

**histappend**
> Append to history file instead of overwriting

**nocaseglob**
> Case-insensitive filename globbing

**nullglob**
> Empty glob patterns expand to nothing instead of themselves

**expand_aliases**
> Enable alias expansion (default in interactive shells)

# DESCRIPTION

**shopt** is a Bash builtin that enables or disables shell options for the current session. These options modify shell behavior including globbing, history handling, directory navigation, and command completion.

Without arguments, shopt lists all options and their current status. Use **-s** to enable and **-u** to disable specific options. The **-q** flag tests options silently, setting exit status 0 if enabled, 1 if disabled.

Options set with shopt persist only for the current session. Add shopt commands to **~/.bashrc** for permanent configuration.

# CAVEATS

shopt is Bash-specific and not available in other shells like zsh, dash, or ksh, which have their own option mechanisms. The **-o** flag provides compatibility with options from the set builtin.

# HISTORY

shopt is a Bash builtin introduced in **Bash 2.0** (1996) to provide a cleaner interface for shell options compared to the set builtin. It continues to be the primary method for configuring Bash behavior.

# SEE ALSO

[set](/man/set)(1), [bash](/man/bash)(1)
