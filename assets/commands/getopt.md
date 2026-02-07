# TAGLINE

command-line option parser for shell scripts

# TLDR

Parse optional **verbose/version flags** with shorthands

```getopt -o vV -l verbose,version -- --version --verbose```

Add a **--file option** with a required argument

```getopt -o f: -l file: -- --file=somefile```

Add a **--verbose option** with an optional argument and pass a non-option parameter

```getopt -o v:: -l verbose:: -- --verbose arg```

Parse **multiple options** with various argument requirements

```getopt -o rv::t: -l verbose,source::,target: -- -v --target target```

# SYNOPSIS

**getopt** [_options_] [**--**] _parameters_

# PARAMETERS

**-o**, **--options** _SHORT_
> Short options to recognize (single letters). Colon after letter means required argument, double colon means optional.

**-l**, **--longoptions** _LONG_
> Long options to recognize (comma-separated). Colon rules same as short options.

**-n**, **--name** _NAME_
> Name to use in error messages

**-q**, **--quiet**
> Suppress error messages

**-a**, **--alternative**
> Allow long options with single dash

**-T**, **--test**
> Test for enhanced getopt

# DESCRIPTION

**getopt** parses command-line options for shell scripts, handling both short (-v) and long (--verbose) option formats. It normalizes option order, handles bundled short options (-abc), and separates options from arguments.

The enhanced getopt (util-linux version) supports long options, optional arguments, and proper handling of arguments with spaces. Use **getopt -T** to test if the enhanced version is available.

Output is typically evaluated with **eval set --** to update the script's positional parameters with the normalized options.

# OPTION ARGUMENT SYNTAX

In the options string:
- **f** - flag with no argument
- **f:** - option with required argument
- **f::** - option with optional argument

# CAVEATS

The original BSD getopt is limited and doesn't support long options. Always test for enhanced getopt with **-T**. Optional arguments must be attached directly (--opt=arg, not --opt arg).

# HISTORY

getopt dates back to early Unix systems. The enhanced version in util-linux was developed to overcome limitations of the original, adding long option support and proper quoting for arguments with special characters.

# SEE ALSO

[getopts](/man/getopts)(1), [bash](/man/bash)(1)
