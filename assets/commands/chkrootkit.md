# TAGLINE

local rootkit detection scanner

# TLDR

**Scan system for rootkits**

```sudo chkrootkit```

**Quiet mode (show infections only)**

```sudo chkrootkit -q```

**Expert mode with more details**

```sudo chkrootkit -x```

**Use alternate root directory**

```sudo chkrootkit -r [/mnt/system]```

**Test specific check**

```sudo chkrootkit [chkwtmp]```

**List available tests**

```chkrootkit -l```

# SYNOPSIS

**chkrootkit** [_options_] [_test_...]

# DESCRIPTION

**chkrootkit** locally checks for signs of rootkits on a system. It examines system binaries for known modifications, checks for deleted log entries, detects loadable kernel module (LKM) trojans, and identifies promiscuous network interfaces.

The tool works by comparing system binaries against known signatures of rootkit modifications and by running a series of tests that look for common rootkit behaviors. It can detect over 70 known rootkits and worms. For best results, it should be run from trusted binaries on a clean system or live CD, since a compromised system's tools may hide infections.

# PARAMETERS

**-q**
> Quiet mode, show infections only

**-x**
> Expert mode, show additional info

**-r** _dir_
> Use alternate root directory

**-p** _dir1:dir2_
> Custom path for binaries

**-l**
> List available tests

**-n**
> Skip NFS mounted directories

# TESTS

**chkwtmp**
> Check wtmp deletions

**chklastlog**
> Check lastlog deletions

**ifpromisc**
> Check for promiscuous interfaces

**chkproc**
> Check for LKM trojans

**strings**
> Quick strings check

# CAVEATS

Not foolproof - advanced rootkits can hide. Use with rkhunter for comprehensive scanning. Set up cron jobs for regular scans. If infection found, isolate system and investigate.

# SEE ALSO

[rkhunter](/man/rkhunter)(1), [lynis](/man/lynis)(1), [clamav](/man/clamav)(1)
