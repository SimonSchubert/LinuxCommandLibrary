# TAGLINE

Self-hosted collaborative LaTeX workspace CLI

# TLDR

**Install globally** (requires Node.js 24+) and initialize

```npm install --global texlite```

```texlite init```

**Start** the server in the background (bundled PM2)

```texlite start```

**Check** whether the managed process is running

```texlite status```

**Run in the foreground** (Docker, systemd, or debugging)

```texlite serve```

**Validate** the host, config, LaTeX engines, and administrator

```texlite doctor```

**Include the optional Git/GitHub check**

```texlite doctor --git```

**Print effective configuration** as JSON

```texlite config```

**Stream logs** from the managed process

```texlite logs```

# SYNOPSIS

**texlite** [_--config_ _PATH_] [_--git_] [_--json_] _command_

# PARAMETERS

**init**
> Create the configuration file if missing, validate the environment, initialize storage, and create the first administrator.

**serve**
> Run the HTTP server in the foreground.

**start**
> Start the server in the background under the PM2 runtime bundled with the npm package.

**stop**
> Stop the PM2-managed server.

**restart**
> Recreate the managed process (picks up a newly installed npm version).

**status**
> Show a systemctl-style status view of the managed process. Exits 2 when the process is not online.

**logs**
> Stream stdout/stderr from the PM2-managed process.

**doctor**
> Validate configuration, data paths, `latexmk`, allowed TeX engines, and that an administrator exists.

**config**
> Print the effective configuration and resolved paths as JSON without changing anything.

**help**
> Print the command list.

**version**
> Print the installed TexLite version.

**--config** _PATH_
> Use this configuration file instead of `TEXLITE_CONFIG` or the XDG default.

**--git**
> With **doctor**, also check that the configured Git binary is available.

**--json**
> With **status**, print machine-readable JSON instead of the terminal view.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Print the version.

# DESCRIPTION

**texlite** is the command-line interface for TexLite, a local-first collaborative LaTeX workspace. The process serves a browser editor that compiles documents with the host's existing TeX installation (`latexmk` plus at least one of `pdflatex`, `xelatex`, or `lualatex`). Collaboration uses Yjs for shared editing and source-anchored comments. Project files, history, and a SQLite database live in a data directory on the host.

The default deployment is a single Node.js process bound to `127.0.0.1:3000`. `start`, `stop`, `restart`, `status`, and `logs` use PM2 bundled with the npm package; a separate global PM2 install is not required. `serve` is the foreground entry point for Docker or systemd. Public registration is disabled: `init` creates the first administrator, and further accounts are added from the web UI.

`init` will not start the server. After a successful init, open the printed listen address (default `http://127.0.0.1:3000`) once `start` or `serve` is running. Uninstalling the npm package does not delete configuration or project data.

# CONFIGURATION

Configuration path, first match wins:

1. **--config** _PATH_
2. **TEXLITE_CONFIG**
3. `$XDG_CONFIG_HOME/texlite/texlite.config.json`
4. `~/.config/texlite/texlite.config.json`

Default data directory: `$XDG_DATA_HOME/texlite`, or `~/.local/share/texlite` when `XDG_DATA_HOME` is unset. Override with `storage.dataDir` in the config file or **TEXLITE_DATA_DIR**.

**texlite.config.json**
> JSON settings written by **init**. Notable keys: `server.host` / `server.port` (default `127.0.0.1` / `3000`), `storage.dataDir`, `latex.latexmk`, `latex.defaultEngine` (default `xelatex`), `latex.allowedEngines`, `latex.compileTimeoutSeconds`, `latex.maxCompileJobs`, `latex.allowProjectLatexmkrc`.

**TEXLITE_INIT_USERNAME**, **TEXLITE_INIT_DISPLAY_NAME**, **TEXLITE_INIT_PASSWORD**
> Non-interactive **init**. Password must be at least 8 characters. Interactive **init** prompts instead.

Other environment overrides include **TEXLITE_HOST**, **TEXLITE_PORT**, **TEXLITE_SITE_NAME**, **TEXLITE_ADMIN_EMAIL**, **TEXLITE_LATEXMK**, and **TEXLITE_DEFAULT_ENGINE**. `texlite config` prints the resolved values.

# CAVEATS

Requires **Node.js 24** or newer, **latexmk**, and at least one allowed TeX engine. TexLite is not a compiler sandbox: LaTeX (and an owner-enabled project `latexmkrc`) can run powerful local code. Keep the default localhost bind unless authentication, network controls, and an isolated compiler environment are in place.

`--git` only affects **doctor**. `--json` only affects **status**. Cluster mode and multiple TexLite processes sharing one data directory are unsupported. Git is optional and is checked only when Git/GitHub integration is used.

# SEE ALSO

[latexmk](/man/latexmk)(1), [xelatex](/man/xelatex)(1), [pdflatex](/man/pdflatex)(1), [lualatex](/man/lualatex)(1), [pm2](/man/pm2)(1), [node](/man/node)(1), [npm](/man/npm)(1)

# RESOURCES

```[Source code](https://github.com/SWUFE-DB-Group/TexLite)```

```[Homepage](https://swufe-db-group.github.io/TexLite/)```

```[Documentation](https://github.com/SWUFE-DB-Group/TexLite/blob/main/OPERATIONS.md)```

<!-- verified: 2026-08-26 -->
