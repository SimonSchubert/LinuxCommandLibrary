# TAGLINE

updates the IBM Cloud CLI to the latest version

# TLDR

**Update** the CLI, asking for confirmation

```ibmcloud update```

**Update** without confirmation

```sudo ibmcloud update -f```

**Show** the installed version

```ibmcloud version```

**Update** the installed plugins as well

```ibmcloud plugin update --all```

# SYNOPSIS

**ibmcloud** **update** [**-f**]

# PARAMETERS

**-f**
> Force the update without confirmation. Root privileges are required.

# DESCRIPTION

**ibmcloud update** downloads and installs the most recent release of the IBM Cloud CLI over the current installation. Without **-f** it reports the available version and prompts before replacing the binary.

The command updates only the core CLI. Plugins are versioned separately and are refreshed with **ibmcloud plugin update**.

# ENVIRONMENT

**IBMCLOUD_VERSION_CHECK**
> Set to `false` to stop the CLI from checking for new releases on every invocation. Equivalent to `ibmcloud config --check-version false`.

# CAVEATS

The update writes to the installation directory, so it usually needs root privileges; run it with `sudo` or as an administrator.

When the CLI was installed through a package manager or Homebrew, update it with that tool instead so the package database stays consistent.

# HISTORY

**ibmcloud update** is part of the IBM Cloud CLI, which replaced the earlier `bluemix` (`bx`) CLI when Bluemix was rebranded to IBM Cloud around **2018**.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-version](/man/ibmcloud-version)(1), [ibmcloud-config](/man/ibmcloud-config)(1)

# RESOURCES

```[Homepage](https://cloud.ibm.com/docs/cli)```

```[Documentation](https://cloud.ibm.com/docs/cli?topic=cli-ibmcloud_cli)```

<!-- verified: 2026-08-30 -->
