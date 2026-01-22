# TLDR

**Start fish shell**

```fish```

**Execute command**

```fish -c "[echo hello]"```

**Run script**

```fish [script.fish]```

**Start without config**

```fish --no-config```

**Check syntax**

```fish -n [script.fish]```

# SYNOPSIS

**fish** [_options_] [_file_] [_arguments_...]

# PARAMETERS

_FILE_
> Script file to execute.

**-c** _COMMAND_
> Execute command and exit.

**-n**, **--no-execute**
> Syntax check only.

**--no-config**
> Skip configuration files.

**-i**, **--interactive**
> Force interactive mode.

**-l**, **--login**
> Act as login shell.

**-p**, **--profile** _FILE_
> Output profiling data.

**--help**
> Display help information.

# DESCRIPTION

**fish** (Friendly Interactive Shell) is a smart, user-friendly shell with syntax highlighting, autosuggestions, and tab completions that work out of the box.

Unlike bash or zsh, fish doesn't require extensive configuration to be useful. It features web-based configuration, informative error messages, and discoverable features.

fish uses a cleaner scripting syntax that differs from POSIX shells, prioritizing usability over compatibility.

# CAVEATS

Not POSIX-compatible. Scripts need fish-specific syntax. Some commands differ from bash/zsh.

# HISTORY

fish was created by **Axel Liljencrantz** in 2005 to address shell usability issues. It prioritizes interactive use and discoverability, embracing incompatibility with POSIX to improve user experience.

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [fisher](/man/fisher)(1)
