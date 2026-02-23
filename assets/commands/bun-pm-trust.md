# TAGLINE

Manage trusted dependencies in Bun projects

# TLDR

**Run blocked lifecycle scripts** for specific packages and add them to trusted dependencies

```bun pm trust [package1] [package2]```

**Trust all** currently untrusted dependencies at once

```bun pm trust --all```

**List** all dependencies that had their lifecycle scripts blocked

```bun pm untrusted```

**Install** a package and trust it in one step

```bun add --trust [package]```

# SYNOPSIS

**bun pm trust** [**--all**] [_names..._]

# PARAMETERS

**--all**
> Trust all currently untrusted dependencies at once, running all their blocked lifecycle scripts and adding them to **trustedDependencies** in **package.json**

# DESCRIPTION

**bun pm trust** runs blocked lifecycle scripts (such as **postinstall**, **preinstall**, and **node-gyp** builds) for specified untrusted dependencies and adds those packages to the **trustedDependencies** array in **package.json**.

Unlike npm, Bun blocks arbitrary lifecycle script execution for installed dependencies by default as a security measure. When Bun blocks a script, it installs the package but silently skips its lifecycle scripts. The **bun pm trust** command is the mechanism for explicitly opting in to running those scripts for packages you have reviewed and trust.

Bun maintains a default allowlist of popular packages known to have safe postinstall scripts. This default list only applies to packages sourced from npm; packages from **file:**, **link:**, **git:**, or **github:** sources require explicit **trustedDependencies** entries.

# CAVEATS

Trusting a package only permits lifecycle scripts for that specific package, not for the dependencies of that dependency. Each package that needs to run lifecycle scripts must be listed individually. There is no **bun pm untrust** command; to revoke trust you must manually edit **trustedDependencies** in **package.json**. Because Bun blocks lifecycle scripts silently, packages that depend on postinstall steps (like **esbuild**, **sharp**, **@biomejs/biome**) may appear to install successfully but fail at runtime.

# HISTORY

The trusted dependencies workflow was introduced in **Bun v1.0.31** (March 2024) with the **bun add --trust** flag and the **bun pm trust** command. Early versions had bugs on Windows where **bun pm trust** could panic, which were fixed in **v1.1.18** (July 2024).

# SEE ALSO

[bun](/man/bun)(1), [bun-pm-cache](/man/bun-pm-cache)(1), [npm](/man/npm)(1)
