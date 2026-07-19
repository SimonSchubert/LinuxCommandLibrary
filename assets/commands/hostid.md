# TAGLINE

displays the current host's unique identifier as a 32-bit hexadecimal value

# TLDR

**Display the host ID**

```hostid```

**Show version**

```hostid --version```

**Show help**

```hostid --help```

# SYNOPSIS

**hostid** [_option_]

# PARAMETERS

**--help**
> Display help and exit.

**--version**
> Display version and exit.

# DESCRIPTION

**hostid** displays the current host's unique identifier as a 32-bit hexadecimal value. If **/etc/hostid** exists, the value stored there is printed; otherwise it is derived from the machine's hostname and IP address via the **gethostid**(3) function. The identifier was historically used by software licensing schemes and is largely a legacy feature on modern Linux systems.

# CAVEATS

The value is **not guaranteed to be unique** across machines, particularly when derived from a hostname rather than a fixed **/etc/hostid** file. It has no security value and should not be relied on as a hardware fingerprint.

# SEE ALSO

[hostname](/man/hostname)(1), [uname](/man/uname)(1)

# RESOURCES

```[Source code](https://git.savannah.gnu.org/cgit/coreutils.git)```

```[Documentation](https://www.gnu.org/software/coreutils/manual/coreutils.html)```

<!-- verified: 2026-07-19 -->

