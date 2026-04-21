# TAGLINE

Uses the right package manager automatically

# TLDR

**Install** all dependencies for the current project

```ni```

**Add a package** (dev dependency)

```ni [package-name] -D```

**Add a package globally**

```ni -g [package-name]```

**Clean install** from lockfile (equivalent to npm ci / pnpm install --frozen-lockfile)

```nci```

**Run a script**, passing arguments through

```nr [script] [args...]```

**Execute a package** without installing (npx / pnpm dlx equivalent)

```nlx [package] [args...]```

**Uninstall** a package

```nun [package-name]```

**Upgrade** dependencies interactively

```nup -i```

# SYNOPSIS

**ni** [_options_] [_packages..._]

**nr** [_script_] [_args..._]

**nlx** _package_ [_args..._]

**nun** _package..._

**nup** [_options_]

**nci**

**na** _args..._

# DESCRIPTION

**ni** is a small command-line utility by **Anthony Fu** that dispatches package-manager commands to whichever package manager the current project uses: **npm**, **yarn**, **pnpm**, **bun**, or **deno**. The package manager is detected by looking at the lockfile in the project root (_package-lock.json_, _yarn.lock_, _pnpm-lock.yaml_, _bun.lock_, _bun.lockb_, _deno.json_) or the **packageManager** field of _package.json_.

Users type the same short commands regardless of project. **ni** installs dependencies, **nr** runs scripts, **nlx** executes a one-off package, **nun** removes packages, **nup** upgrades them, **nci** performs a clean install, and **na** passes arbitrary arguments straight through to the detected agent.

Interactive menus are available when _fzf_ is on the PATH: **nr** without arguments lists scripts, **ni -i** picks packages, and **nr -** reruns the previous script.

# PARAMETERS

**-D**
> Add as a development dependency (maps to --save-dev / -D).

**-P**
> Production-only install (prunes dev dependencies).

**-g**
> Operate on globally installed packages.

**-i**
> Interactive mode (select packages or scripts via fzf).

**--frozen**
> Install with a frozen lockfile (no updates).

**-C** _DIR_
> Run as if invoked from directory _DIR_.

**?**
> Show the translated command for the detected agent without running it.

**-v**, **--version**
> Print the **ni** version.

**-h**, **--help**
> Display help.

# CONFIGURATION

User configuration lives in **~/.nirc**:

```
defaultAgent=npm
globalAgent=npm
```

- **defaultAgent** selects the package manager when no lockfile is detected (set to _prompt_ to be asked interactively).
- **globalAgent** selects the manager used for global installs.

Environment variables **NI_DEFAULT_AGENT**, **NI_GLOBAL_AGENT**, **NI_CONFIG_FILE**, and **NI_AUTO_INSTALL** override these settings per shell.

# CAVEATS

On Windows **PowerShell**, the built-in _ni_ alias for New-Item collides with this tool; remove it with **Remove-Item Alias:ni -Force** before using. A few legacy aliases have been renamed to avoid conflicts with other tools: _nx_/_nix_ are now **nlx**, and _nu_ is now **nup**. Because **ni** relies on lockfile detection, projects without any lockfile fall back to the **defaultAgent**.

# HISTORY

Created by **Anthony Fu** (antfu) and first published to npm in **2021** under **@antfu/ni**. It was moved to the **antfu-collective** organization on GitHub and is distributed through npm (_@antfu/ni_) and **Homebrew** (_brew install ni_). The project is written in TypeScript.

# SEE ALSO

[npm](/man/npm)(1), [yarn](/man/yarn)(1), [pnpm](/man/pnpm)(1), [bun](/man/bun)(1), [deno](/man/deno)(1)
