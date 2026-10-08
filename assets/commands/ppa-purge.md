# TAGLINE

disable a Launchpad PPA and revert its packages to official versions

# TLDR

Disable a PPA and **downgrade** its packages to the archive versions

```sudo ppa-purge ppa:[owner]/[ppa_name]```

Disable a PPA given only its **owner** (the PPA name defaults to `ppa`)

```sudo ppa-purge -o [owner]```

Disable a PPA given its **owner and name** as separate flags

```sudo ppa-purge -o [owner] -p [ppa_name]```

Answer **yes** to all package manager prompts

```sudo ppa-purge -y ppa:[owner]/[ppa_name]```

Use a specific **distribution** instead of the detected one

```sudo ppa-purge -d [noble] ppa:[owner]/[ppa_name]```

Display **help**

```ppa-purge -h```

# SYNOPSIS

**ppa-purge** [**-h**] [**-d** _distribution_] [**-s** _host_] [**-p** _ppaname_] [**-o** _ppaowner_] [**-y**] [**-i**] [_ppa:_ _ppaowner_[/_ppaname_]]

# PARAMETERS

**-p** _ppaname_
> PPA name to disable (default: **ppa**)

**-o** _ppaowner_
> Launchpad PPA owner. If omitted, the owner is taken from the `ppa:owner[/name]` argument

**-s** _host_
> Repository server (default: **ppa.launchpad.net**)

**-d** _distribution_
> Override the detected Ubuntu distribution (for example **noble** or **jammy**)

**-y**
> Pass **-y --force-yes** to **apt-get**, or **-y** to **aptitude**

**-i**
> Prefer **aptitude** over **apt-get** (the default prefers apt-get)

**-h**
> Display usage help and exit

# DESCRIPTION

**ppa-purge** is a bash script that disables a Launchpad Personal Package Archive (PPA) and downgrades packages that came from that PPA back to the versions in the official Ubuntu archive. Packages that exist only in the PPA are uninstalled. Removing a PPA with **add-apt-repository --remove** leaves the installed versions in place; **ppa-purge** is the rollback for that case.

The PPA may be given as `ppa:owner/name`, as a bare `owner/name`, or as **--o** / **-p** flags. When the name is omitted it defaults to **ppa**, matching Launchpad's default archive name.

The script must run as root because it calls the package manager. It comments out the matching source list entries, generates a revert list, and installs the archive versions.

# CAVEATS

**ppa-purge** is Ubuntu-specific (package in the **universe** pocket). It does not delete the source list file; it disables the PPA. If a run fails (for example because another package manager is holding the lock), uncomment the PPA, run **apt-get update**, and try again. Packages with no counterpart in the official archive may remain installed and have to be removed by hand. Using **-y** skips the review of the proposed downgrade list.

# HISTORY

**ppa-purge** was written for Ubuntu to undo PPA upgrades. The man page is dated 2010 (Lorenzo De Liso). Ubuntu later switched the default Launchpad host in packaging notes to **ppa.launchpadcontent.net**; the script's **-s** default remains **ppa.launchpad.net**.

# INSTALL

```apt: sudo apt install ppa-purge```

<!-- packages: 2026-10-08 -->

# SEE ALSO

[add-apt-repository](/man/add-apt-repository)(1), [apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [apt-cache](/man/apt-cache)(8)

# RESOURCES

```[Homepage](https://launchpad.net/ppa-purge)```

```[Documentation](https://manpages.ubuntu.com/manpages/noble/man1/ppa-purge.1.html)```

<!-- verified: 2026-10-08 -->
