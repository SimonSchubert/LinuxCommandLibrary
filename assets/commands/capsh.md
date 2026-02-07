# TAGLINE

Explore and constrain Linux capabilities

# TLDR

**Display current capability state**

```capsh --print```

**Show what a capability does**

```capsh --explain=[cap_net_admin]```

**Decode capability hex value**

```capsh --decode=[0x20]```

**Drop all capabilities and run shell**

```capsh --drop=all -- -c "[command]"```

**Run command with specific capabilities**

```capsh --caps="[cap_net_raw+ep]" -- -c "[command]"```

**Check if capability is supported**

```capsh --supports=[cap_sys_admin]```

**Chroot and run command**

```capsh --chroot=[/path] -- -c "[command]"```

# SYNOPSIS

**capsh** [_options_]

# DESCRIPTION

**capsh** is a capability shell wrapper for exploring and constraining Linux capability support. It provides testing, debugging, and environment creation for Linux process capabilities. Part of the libcap package.

# PARAMETERS

**--print**
> Display prevailing capability and related state

**--current**
> Display capability state with 1e capabilities and IAB vector

**--explain**=_cap_xxx_
> Describe what privileges a capability provides

**--decode**=_N_
> Decode hex capability vector (as in /proc/1/status)

**--supports**=_cap_xxx_
> Verify capability exists on system

**--drop**=_cap_xxx_
> Remove capability from bounding set

**--caps**=_cap-set_
> Set capabilities to specified text value

**--inh**=_cap-set_
> Set inheritable capabilities

**--chroot**=_path_
> Change root directory (requires CAP_SYS_CHROOT)

**--uid**=_id_
> Set real and effective user ID

**--gid**=_id_
> Set real and effective group ID

**--**
> Execute /bin/bash with trailing arguments

# EXIT STATUS

Returns 0 on success, 1 on error.

# CAVEATS

Many operations require specific capabilities to perform. Understanding Linux capabilities is essential for effective use.

# SEE ALSO

[getcap](/man/getcap)(8), [setcap](/man/setcap)(8), [getpcaps](/man/getpcaps)(8)
