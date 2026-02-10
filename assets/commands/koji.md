# TAGLINE

command-line client for Koji, the build system used by Fedora, CentOS

# TLDR

Execute a **subcommand**

```koji [subcommand]```

Test **connectivity** with kojihub

```koji moshimoshi```

Display **global help**

```koji -h```

Display **all commands**

```koji help```

Display help for a **specific subcommand**

```koji [subcommand] -h```

Display **version**

```koji version```

# SYNOPSIS

**koji** [_options_] _subcommand_ [_arguments_]

# PARAMETERS

**moshimoshi**
> Test connectivity with the koji hub

**help**
> Display all available commands

**build**
> Submit a build task

**tag-build**
> Tag a build

**download-build**
> Download build artifacts

**buildinfo**
> Display build information

**call**
> Execute an arbitrary XML-RPC call

**version**
> Display version information

# DESCRIPTION

**koji** is the command-line client for Koji, the build system used by Fedora, CentOS, and other RPM-based distributions. It interfaces with the Koji hub to submit builds, manage tags, and download packages.

Koji handles the entire build process including package building, testing, and distribution. Developers use it to submit source packages for compilation across multiple architectures.

# CAVEATS

Requires proper authentication configuration. Some operations require specific permissions. Network access to the Koji hub is required.

# HISTORY

Koji was developed by Red Hat and released in **2007** as the build system for Fedora. The name "Koji" comes from the Japanese word for yeast or mold used in brewing, reflecting its role in "brewing" packages.

# SEE ALSO

[mock](/man/mock)(1), [rpmbuild](/man/rpmbuild)(8), [fedpkg](/man/fedpkg)(1)
