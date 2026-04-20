# TAGLINE

PHAR Installation and Verification

# TLDR

**Install a PHAR tool** from the default repository

```phive install [phpunit]```

**Pin to a specific version** with the `@` syntax

```phive install [phpunit@^9.5]```

**Install system-wide** by copying into a shared directory

```phive install --copy --target [/usr/local/bin] [phpunit]```

**Show installed tools and available updates**

```phive status```

**Update all installed tools** to the latest pinned version

```phive update```

**List which tools are outdated**

```phive outdated```

**Remove a tool**

```phive remove [phpunit]```

**Update Phive itself**

```phive selfupdate```

# SYNOPSIS

**phive** _command_ [_options_]

# COMMANDS

**install** _TOOL_[**@**_VERSION_]
> Install a PHAR tool, optionally pinning to a version constraint (e.g. **@^9.5**).

**update** [_TOOL_...]
> Update one or more installed tools to their latest compatible versions.

**remove** _TOOL_
> Uninstall a tool and delete its PHAR.

**reset** [_TOOL_]
> Re-download a tool without changing its version pin.

**status**
> List installed tools and any drift from the pinned version.

**outdated**
> Report tools that have newer versions available.

**list**
> List tools known to the configured repository.

**purge**
> Remove unused PHARs from the local cache.

**default**
> Show or change the default repository configuration.

**selfupdate**
> Update the Phive tool itself to the latest release.

# PARAMETERS

**--copy**
> Copy the PHAR to the target location instead of symlinking it (needed for shared/system-wide installs).

**--target** _DIR_
> Install the PHAR into _DIR_. Use this together with **--copy** for a global install (there is no **--global** flag).

**--force-accept-unsigned**
> Accept PHARs that lack a valid GPG signature (not recommended).

**--trust-gpg-keys** _KEYIDS_
> Pre-trust specific GPG key IDs without prompting.

**--prefer-offline**
> Use cached metadata (useful with **update**).

**--help**
> Display help.

# DESCRIPTION

**phive** — the **PHAR Installation and Verification Environment** — manages command-line PHP tools distributed as PHAR archives. It downloads PHARs from a trusted repository, verifies their GPG signatures, and records pinned versions in a project-local **phive.xml** so they can be reproducibly reinstalled.

Typical usage is project-local: **phive install phpunit** writes the tool into **tools/** in the current project. System-wide installs are performed by combining **--copy** and **--target** with a directory on **$PATH**.

# CAVEATS

Requires PHP with the **phar** extension. GPG is used to verify PHAR signatures; missing or untrusted keys will block installation unless explicitly overridden. Tools must be published to the Phive registry (or a custom repository) to be installable by name.

# HISTORY

Phive was created for **secure phar distribution** with signature verification.

# SEE ALSO

[composer](/man/composer)(1), [php](/man/php)(1)

