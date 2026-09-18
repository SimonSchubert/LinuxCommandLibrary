# TAGLINE

search and install packages from OBS, Packman, and vendor repos on openSUSE

# TLDR

**Search** for a package and pick a result to install

```opi [filezilla]```

Install **media codecs** from Packman (and the official repo)

```opi codecs```

Same codecs via the **packman** plugin alias

```opi packman```

Search **without running vendor plugins** (OBS, Packman, and configured repos only)

```opi -P [package]```

Install in **non-interactive** mode (no prompts)

```opi -n [package]```

Search for **several packages** as separate queries

```opi -m [package1] [package2]```

Print the **version**

```opi -V```

# SYNOPSIS

**opi** [**-h**] [**-V**] [**-n**] [**-P**] [**-m**] [**-v**] [_query_ ...]

# PARAMETERS

_query_
> Package name or substring. Searched on the openSUSE Build Service and Packman. Several arguments are ANDed unless **-m** is given.

**-h**, **--help**
> Show help and exit.

**-V**, **--version**
> Show the program version and exit.

**-n**
> Non-interactive: do not prompt; accept the default/first matching action.

**-P**
> Do not run plugins. Only search configured repositories, OBS, and Packman.

**-m**
> Treat each query argument as its own package search instead of requiring all terms to match one result.

**-v**, **--verbose**
> More talkative output.

# DESCRIPTION

**opi** (OBS Package Installer) is a Python CLI for openSUSE and SUSE Linux Enterprise. It searches community and third-party packages that are not always in the default distribution repositories, then hands the chosen package to **zypper** (which may prompt for sudo).

Without plugins it looks at:

1. the **openSUSE Build Service**
2. **Packman**
3. repositories already configured on the system

Plugins add named queries for popular vendor software (for example **chrome**, **vscode**, **spotify**, **zoom**, **brave**) and for Packman media **codecs**. Running `opi` with no arguments prints usage, including the current plugin list.

opi is a search-and-install helper, not a full package manager. Removing or updating packages is still done with **zypper**.

# CONFIGURATION

System config is `/etc/opi.cfg` (override the path with **OPI_CONFIG**). Keys live under an `[opi]` section:

```
[opi]
use_releasever_var = true
new_repo_auto_refresh = true
list_in_reverse = false
```

**use_releasever_var**
> Use `$releasever` in repository URLs so Leap/SLE upgrades keep working.

**new_repo_auto_refresh**
> Refresh newly added repositories automatically. Set to `false` to skip that refresh.

**list_in_reverse**
> Reverse the search-result order.

# CAVEATS

Requires **openSUSE** (Tumbleweed or Leap 42.1+) or **SLE 12+**, network access to OBS/Packman, and **python3** with **requests**, **lxml**, and **termcolor**. Vendor plugins add third-party repositories; review what will be enabled before confirming. **-n** still installs software — it only skips prompts. Plugin names change as plugins are added or removed; `opi -h` is the live list.

# HISTORY

**opi** is maintained by the **openSUSE** project (originally by Dominik Heidler, Guo Yunhe, and others) under the **GPL-3.0** license. The current CLI is a Python 3 tool shipped from the distribution repositories.

# INSTALL

```zypper: sudo zypper install opi```

<!-- packages: 2026-09-18 -->

# SEE ALSO

[zypper](/man/zypper)(8), [rpm](/man/rpm)(8)

# RESOURCES

```[Source code](https://github.com/openSUSE/opi)```

```[Documentation](https://en.opensuse.org/SDB:OBS_Package_Installer)```

<!-- verified: 2026-09-18 -->
