# TLDR

Print **basic information** about builds

```koji buildinfo [BuildID_or_NVR]```

Print information with **changelog**

```koji buildinfo [BuildID_or_NVR] --changelog```

Display **help**

```koji buildinfo -h```

# SYNOPSIS

**koji buildinfo** [_options_] _build_...

# PARAMETERS

_BuildID_or_NVR_
> Build ID number or Name-Version-Release string

**--changelog**
> Include changelog information in output

**-h**, **--help**
> Display help message

# DESCRIPTION

**koji buildinfo** displays information about builds in the Koji build system. It shows details like build state, owner, tags, source, and timestamps.

Builds can be specified by their numeric ID or by NVR (Name-Version-Release) format like "python-3.9.1-1.fc34".

# CAVEATS

Requires network access to the Koji hub. Some builds may have restricted visibility based on access controls.

# HISTORY

koji buildinfo is part of the Koji build system used by Fedora, CentOS, and other RPM-based distributions for package building and management.

# SEE ALSO

[koji](/man/koji)(1), [koji-download-build](/man/koji-download-build)(1), [koji-tag-build](/man/koji-tag-build)(1)
