# TAGLINE

PHAR Installation and Verification

# TLDR

**Install phar tool**

```phive install [tool]```

**Install globally**

```phive install --global [tool]```

**Update tools**

```phive update```

**List installed**

```phive status```

**Remove tool**

```phive remove [tool]```

# SYNOPSIS

**phive** [_command_] [_options_]

# PARAMETERS

**install** _TOOL_
> Install phar tool.

**update**
> Update installed tools.

**status**
> List installed tools.

**remove** _TOOL_
> Remove tool.

**--global**
> Global installation.

**--help**
> Display help.

# DESCRIPTION

**phive** is PHAR Installation and Verification. Manages PHP phar tools.

The tool handles phar distribution. GPG signature verification.

# CAVEATS

Requires PHP. GPG for verification. Tools must be published.

# HISTORY

Phive was created for **secure phar distribution** with signature verification.

# SEE ALSO

[composer](/man/composer)(1), [php](/man/php)(1)

