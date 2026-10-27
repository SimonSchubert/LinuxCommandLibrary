# TAGLINE

Manage Node.js and package manager runtimes for Vite+

# TLDR

Create **shims** for Node.js and package managers

```vp env setup```

Show the **resolved** environment

```vp env current```

**Pin** Node.js for this project

```vp env pin [lts]```

Pin Node.js **and** a package manager

```vp env pin [lts] [pnpm@10]```

Use a Node.js version in **this shell**

```vp env use [22]```

Run **diagnostics**

```vp env doctor```

Install the **resolved** runtimes

```vp env install```

Run a command with an **explicit** Node.js version

```vp env exec --node [lts] [node -v]```

Remove **unused** managed versions

```vp env clean```

# SYNOPSIS

**vp env** [_command_] [_options_] [_arguments_]

# PARAMETERS

**setup** [**--refresh**] [**--env-only**]
> Create or update `node`, `npm`, `pnpm`, `yarn`, `bun` (and alias) shims, and write shell setup scripts. **--refresh** recreates shims from saved preferences. **--env-only** writes env files without shims or install instructions.

**on** [_scope_]
> Enable managed mode so shims resolve through Vite+. With no _scope_, both Node.js and all package managers. _scope_ is **node**, **pm**, **npm**, **pnpm**, **yarn**, or **bun**.

**off** [_scope_]
> Prefer system tools, falling back to managed installs. Same _scope_ values as **on**.

**print** [_scope_]
> Print PATH setup for the resolved environment.

**default** [_specs_...] [**--unset**]
> Show or set global fallbacks. A bare version selects Node.js; `pnpm@10` sets only that family's default. **lts** and **latest** (and package-manager dist-tags) re-resolve on each use. **--unset** clears defaults unless scoped.

**pin** [_specs_...] [**--unpin**] [**--no-install**] [**--force**] [**--target** _source_]
> Write project pins. Bare versions are Node.js; `name@version` is a package manager. Updates an existing `.node-version` or effective `.nvmrc`, otherwise `devEngines`. **--target** is **node-version**, **nvmrc**, **dev-engines**, or **package-manager**. **--unpin** removes pins (same as **unpin**).

**unpin** [_scope_] [**--target** _source_]
> Remove effective project pins. Does not delete lower-priority declarations.

**use** [_specs_...] [**--unset**] [**--no-install**] [**--silent-if-unchanged**]
> Override versions for this shell (`VP_NODE_VERSION`, `VP_PNPM_VERSION`, and the other family variables). Does not set `VP_PACKAGE_MANAGER`. **--unset** clears session overrides.

**install**, **i** [_specs_...]
> Download the resolved environment, a selected component, or explicit specs.

**uninstall**, **uni** _specs_...
> Remove installed versions. Bare versions and tags such as **lts** select Node.js. Package managers need a qualified exact version (`pnpm@10.18.0`).

**clean** [_scope_]
> Remove unused managed installs. Current and configured-default versions are kept.

**exec**, **run** [**--node** _version_] [**--package-manager** _spec_] [**--npm** _version_] _command_...
> Run a command in the resolved or overridden environment. **--npm** is an alias for **--package-manager npm@**_version_.

**current** [_scope_] [**--json**]
> Show the resolved Node.js and package-manager environment.

**doctor** [_scope_]
> Diagnose resolution, shims, PATH, and conflicting version sources.

**which** _tool_
> Print the path of the shim-resolved binary (**node**, **npx**, **pnpm**, …).

**list**, **ls** [_scope_] [**--json**]
> List locally installed Node.js, npm, pnpm, Yarn, and Bun versions.

**list-remote**, **ls-remote** [_values_...] [**--lts**] [**--all**] [**--json**] [**--sort** _asc_|_desc_]
> List versions available from registries. **--lts** implies Node.js.

# DESCRIPTION

**vp env** manages the JavaScript environment used by **vp**: one Node.js runtime and one selected package manager (npm, pnpm, Yarn, or Bun as peer families). It is a **vp** subcommand on the **global CLI**, not a separate binary, and it is not included in the project-local `vite-plus` package.

In managed mode (the default after environment setup), shims named **node**, **npm**, **pnpm**, **yarn**, and **bun** launch the versions chosen for the current project. **vp install** uses the selected package manager; invoking **pnpm** directly always runs pnpm, even in a project that selected npm.

Node.js is resolved by walking from the current directory upward. In each directory the first of `.node-version`, `package.json` `devEngines.runtime`, `engines.node`, then `.nvmrc` wins. If nothing declares a version, the global **default** is used, then the latest LTS.

Package-manager selection, in order: an explicit command override, `VP_PACKAGE_MANAGER`, top-level `packageManager`, `devEngines.packageManager`, lockfile or manager-specific config, that family's global default, then the family's latest release (Node's bundled npm for the npm shim).

Most subcommands act on both components unless given **node**, **pm**, or a family name. Unqualified versions are Node.js.

# CONFIGURATION

**.node-version**
> Exact Node.js version for this directory. Preferred write target when the file already exists.

**.nvmrc**
> nvm-compatible Node.js version file. Updated when it is the effective source in the current directory.

**package.json**
> `devEngines.runtime`, `engines.node`, `packageManager`, and `devEngines.packageManager`.

**pnpm-workspace.yaml**
> When Vite+ and pnpm both manage runtimes, set `runtimeOnFail: ignore` and `pmOnFail: ignore` (pnpm 11+) so pnpm does not download a second Node.js or switch package-manager versions. On pnpm 10 the matching setting is `managePackageManagerVersions`.

**VP_NODE_VERSION** / **VP_NPM_VERSION** / **VP_PNPM_VERSION** / **VP_YARN_VERSION** / **VP_BUN_VERSION**
> Session overrides for the matching shims. **vp env use** sets these.

**VP_PACKAGE_MANAGER**
> Selects the manager for **vp install** and related commands. Direct shims ignore it.

**VP_NODE_DIST_MIRROR**
> Alternate Node.js distribution URL (default `https://nodejs.org/dist`).

**VP_HOME**
> Single-root install layout. Otherwise data lives under XDG directories (`~/.local/share/vite-plus` and related paths).

# CAVEATS

Requires the global **vp** CLI. A project-local `vite-plus` install cannot run **vp env**.

Windows **cmd.exe** cannot apply **use** in the current session; use **vp-use.cmd**. PowerShell must dot-source the generated `env.ps1`. In CI, **use** writes session files under the state directory that later shims read.

**use** does not set or clear `VP_PACKAGE_MANAGER`. Each package-manager family has its own override.

**clean** keeps versions that are currently in use or set as defaults.

Official `nodejs.org` downloads verify the PGP-signed `SHASUMS256.txt.asc` before the archive checksum. Custom mirrors that publish only `SHASUMS256.txt` fall back to checksum-only verification.

On Alpine Linux, install `libstdc++` before using managed Node.js (unofficial musl Node builds link the GNU C++ library).

# HISTORY

**vp env** shipped with the global **vp** CLI as part of **Vite+** (VoidZero). The public beta was **2 July 2026**. **Vite+ 1.0** (**28 September 2026**) added **vp env doctor** alongside Homebrew and Docker distribution.

# INSTALL

```aur: yay -S vite-plus```

```brew: brew install vite-plus```

<!-- packages: 2026-10-21 -->

# SEE ALSO

[vp](/man/vp)(1), [vpr](/man/vpr)(1), [vpx](/man/vpx)(1), [nvm](/man/nvm)(1), [fnm](/man/fnm)(1), [volta](/man/volta)(1), [corepack](/man/corepack)(1), [node](/man/node)(1), [pnpm](/man/pnpm)(1)

# RESOURCES

```[Source code](https://github.com/voidzero-dev/vite-plus)```

```[Homepage](https://viteplus.dev)```

```[Documentation](https://viteplus.dev/guide/env)```

<!-- verified: 2026-10-21 -->
