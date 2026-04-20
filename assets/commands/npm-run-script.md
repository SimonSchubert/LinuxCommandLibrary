# TAGLINE

runs scripts defined in package

# TLDR

**Run an npm script** defined in package.json

```npm run [script-name]```

**Pass arguments** to the script (after `--`)

```npm run [script] -- [--flag] [value]```

**List available scripts**

```npm run```

**Run a script in every workspace**

```npm run [script] --workspaces```

**Run a script in one workspace**

```npm run [script] -w [package-name]```

**Skip missing scripts** silently

```npm run [script] --if-present```

**Run quietly**

```npm run [script] --silent```

# SYNOPSIS

**npm run-script** _script_ [_-- args_] [_options_]

Aliases: **npm run**, **npm rum**, **npm urn**.

# PARAMETERS

**--silent**
> Suppress non-error output.

**--if-present**
> Exit successfully (no error) when the named script is not defined.

**--ignore-scripts**
> Do not run pre- and post-hook scripts (e.g. **prestart**, **poststart**).

**--foreground-scripts**
> Stream script stdout/stderr directly instead of capturing it.

**--script-shell** _SHELL_
> Use a specific shell to execute the script (default **/bin/sh** on Unix, **cmd.exe** on Windows).

**-w**, **--workspace** _NAME_
> Run the script in the given workspace. May be repeated.

**--workspaces**
> Run the script in every configured workspace.

**--include-workspace-root**
> In combination with **--workspaces**, also run the script in the repository root.

**--**
> Everything after **--** is passed as arguments to the script itself.

# DESCRIPTION

**npm run-script** runs scripts defined in the **scripts** field of **package.json**. **npm run** is the common alias. Without arguments it lists the available scripts along with their commands.

Any executable installed into **node_modules/.bin** is added to **$PATH** for the duration of the script, so dependency-provided binaries can be invoked by bare name. Arguments after **--** are appended to the script command but are not forwarded to **pre**/**post** lifecycle scripts.

# SEE ALSO

[npm](/man/npm)(1), [npm-start](/man/npm-start)(1)

