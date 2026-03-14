# TAGLINE

Display installed Vagrant version and check for updates

# TLDR

**Show installed version** and check for latest available

```vagrant version```

**Show only the installed version** (short form)

```vagrant --version```

# SYNOPSIS

**vagrant** **version**

# DESCRIPTION

**vagrant version** displays the installed Vagrant version and checks for the latest available version by making a network call. It shows both the currently installed version and the latest release, making it easy to see if an update is available.

The short form **vagrant --version** or **vagrant -v** prints only the installed version without checking for updates.

# CAVEATS

Checking for the latest version requires network access. The update check may fail in air-gapped environments.

# SEE ALSO

[vagrant](/man/vagrant)(1)
