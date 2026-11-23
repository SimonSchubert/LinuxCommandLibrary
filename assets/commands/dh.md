# TAGLINE

debhelper sequence executor for Debian packaging

# TLDR

**Minimal debian/rules** using dh for every target

```printf '#!/usr/bin/make -f\n%%:\n\tdh $@\n' > debian/rules```

**Run a build sequence**

```dh [binary]```

**Clean build artifacts**

```dh clean```

**List the commands** a sequence would run, without running them

```dh [binary-arch] --no-act```

**Enable an addon**

```dh [binary] --with [python3]```

**Pass verbose mode** to every dh_* command

```dh [binary] -v```

**List all available addons**

```dh --list```

# SYNOPSIS

**dh** _sequence_ [**--with** _addon_[,_addon_...]] [**--list**] [_debhelper-options_]

# PARAMETERS

_SEQUENCE_
> Sequence to run: **build**, **build-arch**, **build-indep**, **install**, **install-arch**, **install-indep**, **binary**, **binary-arch**, **binary-indep**, or **clean**.

**--with** _ADDON_[,_ADDON_...]
> Add the commands of the given addon(s) to the sequence. A Build-Depends on **dh-sequence-**_addon_ has the same effect.

**--without** _ADDON_
> Disable the given addon.

**-l**, **--list**
> List all available addons.

**--no-act**
> Print the commands that would run for the sequence, without running them.

**-v**, **--verbose**
> Common debhelper option, passed on to each command: show every command that modifies files.

# DESCRIPTION

**dh** is the debhelper sequence executor that runs a series of dh_* commands in the correct order for building Debian packages. It simplifies debian/rules files by automatically determining which commands to run.

Maintainers customize individual steps with hook targets in debian/rules: **override_dh_**_command_ replaces a command, while **execute_before_dh_**_command_ and **execute_after_dh_**_command_ (compat 10 and later, debhelper 12.8+) run extra steps around it. Addons extend the sequence for specific ecosystems (python3, nodejs, etc.). Options not understood by dh itself are passed on to every command it runs.

# CAVEATS

Behavior depends on the debhelper compatibility level, now normally declared as **Build-Depends: debhelper-compat (= 13)** in debian/control instead of the older debian/compat file. The old manual sequence control options (**--until**, **--before**, **--after**, **--remaining**) were dropped in compat 10 and are rejected at every compat level since debhelper 12.4; use override or hook targets instead. dh skips commands it knows will do nothing, so **--no-act** shows the full list. Use **dh_assistant** to inspect detected hook targets on newer debhelper.

# HISTORY

dh was introduced in **debhelper 7** (2008) by **Joey Hess** to simplify Debian packaging. It enabled the "dh short form" rules files that dramatically reduced packaging complexity. debhelper is now maintained by **Niels Thykier** and the Debian community.

# SEE ALSO

[debhelper](/man/debhelper)(7), [dpkg-buildpackage](/man/dpkg-buildpackage)(1), [debuild](/man/debuild)(1), [lintian](/man/lintian)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/debian/debhelper)```

```[Documentation](https://manpages.debian.org/unstable/debhelper/dh.1.en.html)```

<!-- verified: 2026-11-23 -->
