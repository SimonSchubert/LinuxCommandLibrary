# TAGLINE

formats mathematical equations for nroff

# TLDR

**Format equations for nroff**

```neqn [input.eqn] | nroff```

**Process with groff**

```neqn [file] | groff -Tascii```

**Check syntax only**

```neqn -C [file]```

# SYNOPSIS

**neqn** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input files with equations.

**-C**
> Enable compatibility mode.

**-N**
> Don't allow newlines in delimiters.

**--help**
> Display help information.

# DESCRIPTION

**neqn** formats mathematical equations for nroff. It's the ASCII version of eqn.

The tool processes equation markup. Outputs text-based math formatting.

# CAVEATS

Part of groff. ASCII output only. Use eqn for typeset output.

# HISTORY

neqn is part of **troff/nroff** system, derived from the original Unix equation formatter.

# SEE ALSO

[eqn](/man/eqn)(1), [nroff](/man/nroff)(1), [groff](/man/groff)(1)

