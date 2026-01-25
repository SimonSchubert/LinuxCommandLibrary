# TLDR

**Basic option parsing** in a script

```while getopts "ab:c" opt; do case $opt in a) echo "Option a";; b) echo "Option b with arg: $OPTARG";; c) echo "Option c";; esac; done```

**Parse options with arguments** (colon after letter)

```getopts "f:o:v" opt```

**Silent error mode** (colon at start)

```getopts ":ab:c" opt```

**Shift processed arguments** after parsing

```shift $((OPTIND - 1))```

**Handle unknown options**

```case $opt in \?) echo "Invalid option: -$OPTARG";; esac```

# SYNOPSIS

**getopts** _OPTSTRING_ _NAME_ [_ARGS_]

# PARAMETERS

_OPTSTRING_
> String of option characters. A colon after a character indicates it requires an argument. A leading colon enables silent error mode.

_NAME_
> Variable name to store the current option character.

_ARGS_
> Optional arguments to parse instead of positional parameters.

# VARIABLES

**OPTIND**
> Index of the next argument to be processed. Initialized to 1.

**OPTARG**
> Contains the argument for options that require one, or the invalid option character in silent mode.

**OPTERR**
> Set to 0 to suppress error messages.

# DESCRIPTION

**getopts** is a POSIX shell builtin for parsing short command-line options in scripts. It processes options one at a time, typically used in a while loop with a case statement to handle each option.

Options are single characters preceded by a dash (e.g., -a, -b). Options can be combined (-abc). Options requiring arguments can have the argument immediately following (-ffile) or as the next argument (-f file).

When all options are processed, getopts returns a non-zero exit status. After parsing, use **shift $((OPTIND - 1))** to remove processed options, leaving remaining arguments in $@.

# CAVEATS

getopts only handles short options (single character). For long options (--verbose), use the external **getopt** command instead. The OPTIND variable must be reset to 1 if parsing multiple argument sets. Option processing stops at the first non-option argument or at --.

# HISTORY

getopts is defined by the POSIX standard and available in all POSIX-compliant shells including bash, dash, ksh, and zsh. It was introduced as a more portable alternative to the external getopt utility, which varies between systems. The builtin ensures consistent behavior across different Unix-like platforms.

# SEE ALSO

[getopt](/man/getopt)(1), [bash](/man/bash)(1), [shift](/man/shift)(1)
