# TAGLINE

Manage Copr repositories with DNF5

# TLDR

**Enable** a Copr repository

```sudo dnf5 copr enable [owner]/[project]```

Enable a Copr repository for a specific **chroot**

```sudo dnf5 copr enable [owner]/[project] [fedora-rawhide-ppc64le]```

Enable a Copr repository from a specific **hub**

```sudo dnf5 copr enable [hub]/[owner]/[project]```

**Disable** a Copr repository

```sudo dnf5 copr disable [owner]/[project]```

**Remove** a Copr repository

```sudo dnf5 copr remove [owner]/[project]```

**List** configured Copr repositories

```dnf5 copr list```

Print **debug** information about the system

```dnf5 copr debug```

# SYNOPSIS

**dnf5 copr** {_list_|_enable_|_disable_|_remove_|_debug_} [_options_] [_project-spec_] [_chroot_]

# PARAMETERS

**list**
> List Copr repositories configured on the system

**enable** _project-spec_ [_chroot_]
> Download repository info from a Copr server and install it as a `/etc/yum.repos.d/*.repo` file

**disable** _project-spec_
> Disable the specified Copr repository (sets `enabled=0`; keeps the `.repo` file)

**remove** _project-spec_
> Remove the specified Copr repository and its `/etc/yum.repos.d/*.repo` file

**debug**
> Print system information useful for debugging

**--hub** _hostname_
> Copr hub (web-UI/API server) hostname; default is `copr.fedorainfracloud.org`

**project-spec**
> Project ID as `OWNER/PROJECT` or `HUB/OWNER/PROJECT` (owner may be a username or `@@groupname`)

**chroot**
> Chroot in `NAME-RELEASE-ARCH` form (e.g. `fedora-rawhide-ppc64le`); auto-detected when omitted

# DESCRIPTION

**dnf5 copr** manages Copr repositories on Fedora-based systems. Copr (Cool Other Package Repo) hosts community and third-party package repositories that can be enabled with a single command.

Enabling a project installs a repository definition under `/etc/yum.repos.d/`. Disabling keeps the definition but turns it off; removing deletes the definition entirely.

# CAVEATS

Copr projects are user-maintained and are not official Fedora packages. Review project pages before enabling. Incorrect chroots may install packages built for the wrong distribution or architecture.

# HISTORY

**copr** is a DNF5 plugin for Fedora's Copr build service, replacing the older `dnf copr` plugin from DNF4.

# SEE ALSO

[dnf5](/man/dnf5)(8), [dnf](/man/dnf)(8)

# RESOURCES

```[Source code](https://github.com/rpm-software-management/dnf5)```

```[Documentation](https://dnf5.readthedocs.io/en/latest/dnf5_plugins/copr.8.html)```

<!-- verified: 2026-07-28 -->
