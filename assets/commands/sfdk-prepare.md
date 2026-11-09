# TAGLINE

Prepare sources for Sailfish OS builds

# TLDR

**Prepare sources for build**

```sfdk prepare```

**Prepare for a specific target**

```sfdk config target=[target_name] && sfdk prepare```

**Prepare without recording changes** in version control

```sfdk -c no-vcs-apply prepare```

# SYNOPSIS

**sfdk prepare**

# DESCRIPTION

**sfdk prepare** runs rpmbuild and executes just the `%prep` section of the RPM spec file, which typically involves unpacking source archives, applying patches, and generating any auto-configured files. This is usually done before actual compilation.

When the source tree is managed with Git, the only supported version control system, changes made by `%prep` are recorded as new commits: one for each applied patch and a final one for other changes. This keeps them separate from your own changes. Patch changes can be propagated back with the **scrape** command. The **no-vcs-apply** configuration option suppresses this behavior.

Part of the **Sailfish SDK** (`sfdk`) toolchain for developing Sailfish OS applications and packages.

# CAVEATS

Requires a properly configured Sailfish SDK build environment and a valid RPM spec file in the project. Must be run within an sfdk-managed project directory.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-build-init](/man/sfdk-build-init)(1), [sfdk-apply](/man/sfdk-apply)(1), [sfdk-make](/man/sfdk-make)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Homepage](https://sailfishos.org/)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-09 -->
