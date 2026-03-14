# TAGLINE

Prepare sources for Sailfish OS builds

# TLDR

**Prepare sources for build**

```sfdk prepare```

**Prepare with verbose output**

```sfdk prepare --verbose```

# SYNOPSIS

**sfdk prepare** [_options_]

# PARAMETERS

**--verbose**
> Enable verbose output during preparation.

# DESCRIPTION

**sfdk prepare** prepares source files for building Sailfish OS packages. It executes the `%prep` phase of the RPM spec file, which typically involves unpacking source archives, applying patches, and generating any auto-configured files. This is the first step in the RPM build process before actual compilation.

Part of the **Sailfish SDK** (`sfdk`) toolchain for developing Sailfish OS applications and packages.

# CAVEATS

Requires a properly configured Sailfish SDK build environment and a valid RPM spec file in the project. Must be run within an sfdk-managed project directory.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-build-init](/man/sfdk-build-init)(1)

