# TAGLINE

displays Linux Standard Base and distribution-specific information

# TLDR

Print **all information**

```lsb_release --all```

Print **description**

```lsb_release --description```

Print **OS ID** in short format

```lsb_release -is```

Print **release and codename**

```lsb_release -rcs```

# SYNOPSIS

**lsb_release** [_options_]

# DESCRIPTION

**lsb_release** displays Linux Standard Base (LSB) and distribution-specific information about the installed Linux distribution, including distributor ID, description, release number, and codename.

# PARAMETERS

**-a, --all**
> Print all available information

**-d, --description**
> Print distribution description

**-i, --id**
> Print distributor ID

**-r, --release**
> Print release number

**-c, --codename**
> Print codename

**-s, --short**
> Short output format (omit field names)

**-v, --version**
> Print LSB version

# CAVEATS

Not available on all distributions. Some distributions provide this via /etc/os-release file instead.

# SEE ALSO

[hostnamectl](/man/hostnamectl)(1), [uname](/man/uname)(1)
