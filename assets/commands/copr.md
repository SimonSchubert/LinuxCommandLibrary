# TLDR

**Enable a COPR repository**

```sudo dnf copr enable [owner]/[project]```

**Disable a COPR repository**

```sudo dnf copr disable [owner]/[project]```

**List enabled COPR repositories**

```dnf copr list```

**Search for COPR projects**

```dnf copr search [keyword]```

**Remove a COPR repository** and its packages

```sudo dnf copr remove [owner]/[project]```

**Enable a specific release** of a COPR repository

```sudo dnf copr enable [owner]/[project] [fedora-39-x86_64]```

# SYNOPSIS

**dnf copr** _command_ [_options_] [_project_]

# PARAMETERS

**enable** _OWNER/PROJECT_
> Enable a COPR repository for package installation.

**disable** _OWNER/PROJECT_
> Disable a COPR repository without removing it.

**remove** _OWNER/PROJECT_
> Remove a COPR repository configuration.

**list**
> List all enabled COPR repositories.

**search** _KEYWORD_
> Search for COPR projects by name or description.

**--hub** _URL_
> Use an alternative Copr instance.

**-y**
> Assume yes to all prompts.

# DESCRIPTION

**COPR** (Cool Other Package Repo) is Fedora's community build system that allows users to create and share custom RPM repositories. The **dnf copr** plugin provides easy management of COPR repositories through the DNF package manager.

COPR enables developers to build and distribute packages that aren't in official Fedora repositories, including newer versions of software, experimental packages, or software with licensing that prevents inclusion in official repos. Users can enable these repositories with a single command.

The system automatically handles GPG key import and repository configuration. Projects are identified by owner/project format, such as **user/myproject**. Each project can build for multiple Fedora and EPEL versions.

# CAVEATS

COPR packages are community-maintained and not officially supported by Fedora. Enable only repositories you trust, as they can contain any software. Packages may conflict with official repository versions. The repository owner is responsible for security and updates.

# HISTORY

COPR was created by the Fedora Project as a community build service, similar to Ubuntu's PPAs. It launched around **2013** to provide a way for Fedora users to share packages outside the official distribution. The DNF plugin simplified repository management compared to manual configuration.

# SEE ALSO

[dnf](/man/dnf)(1), [copr-cli](/man/copr-cli)(1), [rpm](/man/rpm)(1)
