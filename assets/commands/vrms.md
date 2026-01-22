# TLDR

**List** non-free packages

```vrms```

Output **names** only

```vrms --sparse```

# SYNOPSIS

**vrms** [_OPTIONS_]

# PARAMETERS

**--sparse**
> Output only package names without descriptions

**--explain**
> Show why packages are considered non-free

# DESCRIPTION

**vrms** (Virtual Richard M. Stallman) reports non-free and contrib packages installed on Debian-based systems. It helps identify software that doesn't meet the Debian Free Software Guidelines.

The tool lists packages from non-free and contrib repositories along with their descriptions.

# CAVEATS

Debian-based systems only. Package classification depends on repository metadata. Some packages may be misclassified.

# HISTORY

**vrms** is named after Richard M. Stallman, founder of the Free Software Foundation, who advocates for software freedom.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1)
