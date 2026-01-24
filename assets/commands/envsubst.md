# TLDR

**Substitute environment variables** in a file

```envsubst < [template.txt]```

**Substitute and save** to a new file

```envsubst < [template.txt] > [output.txt]```

**Substitute only specific variables**

```envsubst '$USER $HOME' < [template.txt]```

**Substitute from piped input**

```echo 'Hello $USER' | envsubst```

**List variables in the template**

```envsubst -v < [template.txt]```

**Generate shell-format variable list**

```envsubst --variables < [template.txt]```

**Substitute in a config template**

```cat [nginx.conf.template] | envsubst '$SERVER_NAME $PORT' > [nginx.conf]```

# SYNOPSIS

**envsubst** [_-v_] [_-V_] [_--variables_] [_SHELL-FORMAT_] [_< input_]

# PARAMETERS

**-v**, **--variables**
> Output the variables occurring in SHELL-FORMAT or stdin.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

_SHELL-FORMAT_
> Space-separated list of variables to substitute. If specified, only these variables are replaced; others remain as literal text.

# DESCRIPTION

**envsubst** substitutes environment variable references in shell format strings. It reads text from stdin, replaces **$VAR** and **${VAR}** patterns with their values from the environment, and writes the result to stdout.

This tool is essential for generating configuration files from templates in deployment pipelines and containerized environments. A template might contain **${DATABASE_HOST}** which gets replaced with the actual value at deployment time.

When called without a variable list, envsubst replaces all environment variable references. To substitute only specific variables (leaving others as literal text), provide a SHELL-FORMAT argument listing the desired variables.

The tool handles both **$VAR** and **${VAR}** syntax. Missing variables are replaced with empty strings. The **${VAR:-default}** syntax for defaults is NOT supported; envsubst performs simple substitution only.

Common uses include Docker entrypoint scripts that configure services at runtime, CI/CD pipelines generating configs, and any scenario where configuration needs to adapt to the runtime environment.

# CAVEATS

Does not support shell parameter expansion features like **${VAR:-default}** or **${VAR:+value}**. All variables must exist in the environment; missing ones become empty strings. Dollar signs that should remain literal need escaping as **$$**. Part of gettext package.

# HISTORY

**envsubst** is part of GNU **gettext**, the internationalization toolkit. While gettext is primarily for software translation, envsubst became widely adopted as a general-purpose template tool, particularly in the DevOps community for configuration management. It's available on virtually all Unix-like systems as part of the gettext-base package.

# SEE ALSO

[gettext](/man/gettext)(1), [sed](/man/sed)(1), [awk](/man/awk)(1), [env](/man/env)(1), [export](/man/export)(1)
