# TLDR

**Execute debhelper commands** sequentially

```dh [sequence]```

**Build package** with debhelper

```dh build```

**Clean build artifacts**

```dh clean```

**Run with verbose output**

```dh [sequence] --verbose```

**List all commands** in sequence

```dh [sequence] --no-act```

**Skip specific commands**

```dh [sequence] --until [dh_auto_configure]```

# SYNOPSIS

**dh** _sequence_ [_options_] [_debhelper-options_]

# PARAMETERS

_SEQUENCE_
> Build sequence: build, clean, install, binary, etc.

**--verbose**
> Enable verbose mode for all commands.

**--no-act**, **-n**
> Show what would be done without executing.

**--with** _ADDON_
> Use specified addon (e.g., python3, systemd).

**--without** _ADDON_
> Disable specified addon.

**--until** _CMD_
> Run until specified command.

**--after** _CMD_
> Start after specified command.

**--help**
> Display help information.

# DESCRIPTION

**dh** is the debhelper sequence executor that runs a series of dh_* commands in the correct order for building Debian packages. It simplifies debian/rules files by automatically determining which commands to run.

The tool reads debian/rules overrides to customize behavior. Override targets (override_dh_*) in debian/rules let maintainers modify specific steps. Addon support extends functionality for specific packaging scenarios.

dh significantly reduces boilerplate in debian/rules, replacing explicit command lists with simple sequence invocations that automatically handle most packaging tasks.

# CAVEATS

Behavior depends on debhelper compatibility level (set in debian/compat or Build-Depends). Override syntax varies between compat levels. Some packages require explicit command sequences.

# HISTORY

dh was introduced in **debhelper v7** (2008) by **Joey Hess** to simplify Debian packaging. It enabled the "dh short form" rules files that dramatically reduced packaging complexity.

# SEE ALSO

[debhelper](/man/debhelper)(7), [dpkg-buildpackage](/man/dpkg-buildpackage)(1), [dh_make](/man/dh_make)(8)
