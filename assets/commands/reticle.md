# TAGLINE

Verify a running app from the shell

# TLDR

**Wire** the app in this directory and prove a browser session connected

```reticle init```

Show that plan and **write nothing**

```reticle init --dry-run```

**Diagnose** Node, Chromium, the daemon and the bridge port

```reticle doctor```

See whether the daemon is up and which page connected

```reticle status```

**Replay** saved flows against a running app. Exit 0 means pass

```reticle verify [http://localhost:5173]```

List the saved flows a set of edits must re-check

```reticle affected --since [HEAD~1]```

**Fail** unless passing artifacts cover those flows

```reticle gate --since [HEAD~1]```

Turn **anonymous telemetry** off on this machine

```reticle telemetry disable```

Run the same command **without a global install**

```npx @reticlehq/server doctor```

# SYNOPSIS

**reticle** [_command_] [_options_]

# DESCRIPTION

**reticle** is the command-line interface of Reticle, a development-time checker for a web or desktop app you are running locally. It reads network traffic, framework state, the console and the DOM from inside that app and returns a verdict of yes, no or unknown. Only yes is a pass. Coding agents usually talk to it over MCP. The CLI is what a person uses to install it, see why nothing connected, replay saved flows and gate a change.

The binary is the **reticle** entry point of the npm package **@reticlehq/server**. Install it with `npm install -g @reticlehq/server`, or with the shell installer published in the repository at `install/install.sh`. The same subcommands run as `npx @reticlehq/server`. The published install docs require Node.js 20.11 or newer.

A bare **reticle** with no arguments starts the local daemon. It does not print help. Help is **reticle help**, **reticle --help**, or **reticle** _command_ **--help**. **reticle help all** lists every subcommand, including ones the short list omits.

The daemon listens on **127.0.0.1** port **4400** by default. The app under test must dial that bridge port, not its own dev-server port. **reticle doctor** prints the port in use.

# COMMANDS

**init**
> Wire Reticle into the project in the current directory, register its MCP server, boot the app and require a connected session. Exits non-zero if nothing connected. Does not itself drive a user journey.

**connect** [**--project** _name_]
> Sign in through a browser and link this folder to a Reticle Cloud project, creating the project when it does not exist. **--url** selects a self-hosted cloud. **reticle init** is the local-only path.

**try** _url_
> After sign-in, drive a URL once in a window you can watch and report which journeys work.

**verify** _url_
> Drive the URL once and replay saved flows, or answer one **--expect** predicate. Exits 0 only on a real pass. Starts its own browser when no daemon is running.

**gate** [**--since** _ref_]
> Exit non-zero unless passing verification artifacts cover every saved flow the changed files affect. This is the CI check. **--hook** is the agent stop-hook form.

**affected** [**--since** _ref_]
> Print which saved flows must be re-verified for the changed files, including flows whose source mapping is unknown.

**status** [**--json**]
> Report whether the daemon is up, which pages connected, who is signed in and whether this folder is linked.

**doctor**
> Check Node, Chromium, the daemon, the bridge port, agent registration and project wiring.

**serve**
> Start the daemon and wait until it has bound the bridge port. **--headless**, **--headed** and **--http** select how it runs.

**stop** [**--force**]
> Stop the daemon this install started. **--force** frees the port by its listener and does not kill the agent's MCP proxy.

**restart**
> Free the bridge port, start a daemon and wait until it is listening.

**open** [_url_]
> Reuse a browser tab that is already connected, or open one.

**drive** _url_
> Run in the foreground against a URL, with the browser visible, for debugging.

**mcp**
> MCP stdio proxy. Agents run this. It starts a daemon when one is not already up.

**setup mcp**
> Register the MCP server with coding agents found on this machine.

**telemetry** [**status** | **enable** | **disable**]
> Show or change anonymous usage metrics for this machine.

**update**
> Install the latest **@reticlehq/server** and restart the daemon.

**rollback**
> Reinstall the previously installed server version and restart.

**sync**, **runs**, **config**, **hook**, **report**, **context**, **license**, **version**, **feedback**, **logout**, **help**
> Cloud sync and run history, prompt-hook install, the latest session report, enterprise license status, the running version, a maintainer report, sign-out, and usage.

# OPTIONS

**--dry-run**
> With **init**, print the plan and write nothing.

**--files-only**
> With **init**, write the project files and stop before booting the app.

**--app** _dir_
> With **init**, choose one app directory in a monorepo.

**--env** _KEY=VALUE_
> With **init**, pass a variable the app needs in order to boot. Repeatable.

**--json**
> With **init** or **status**, print one machine-readable object.

**--since** _ref_
> With **affected** and **gate**, diff against this git revision.

**--expect** _json_
> With **verify**, check one predicate instead of replaying saved flows. Exits 0 only when the verdict is yes. **--expect-file** reads the predicate from a file.

**--headed**
> With **verify**, show the browser. Refused while a daemon is already running on the bridge port. Point this run at a free port with **--port** instead of stopping that daemon.

**--timeout** _ms_
> How long **verify** waits. The default wait for **--expect** is 4000 ms.

**--port** _n_
> Bridge port for this invocation.

**--storage-state** _file_
> With **verify**, reuse a saved login instead of scripting it.

**--force**
> With **stop**, free the port by whoever is listening on it.

# CONFIGURATION

Per-project settings live in **.reticle.json** in the app directory. Runs, flows and the pairing token live under **.reticle/** in the project and under **~/.reticle/** for daemon state. **RETICLE_STATE_DIR** and **RETICLE_PAIRING_TOKEN_DIR** move those directories. On the default port the daemon log is **~/.reticle/daemon-4400.log**.

**RETICLE_PORT**
> Bridge port. Default 4400. A **port** field in **.reticle.json** sets it per project; this variable overrides that field.

**RETICLE_HOST**
> Address the bridge binds. Loopback unless you set it.

**RETICLE_TELEMETRY**
> `0`, `false` or `off` disables anonymous usage metrics. **DO_NOT_TRACK** is honoured as well. **reticle telemetry disable** persists the off switch.

**RETICLE_NO_VERSION_MATCH**
> Set to `1` to stop the CLI from re-running a command under the major version of **@reticlehq/server** installed in the project.

**RETICLE_API_KEY**
> Platform key used by **connect** and by CI. **RETICLE_CLOUD_KEY** is the older name and is still read.

**RETICLE_TRACE**
> Verbose tracing in the daemon log. Off by default.

**RETICLE_CHROMIUM_PATH**
> Chromium executable to launch when Playwright's build and a system Chrome or Edge are not usable.

A daemon keeps the environment it was started with. After changing a daemon variable, run **reticle restart**.

# CAVEATS

`npx reticle` is a different npm package, published by someone else. Use the **reticle** bin from **@reticlehq/server**, or `npx @reticlehq/server`.

The bridge port is not the dev-server port. Mixing the two up is the usual reason a page never connects.

Do not free port 4400 by killing every process that has a socket on it. The MCP proxy holds a client socket there, and killing it drops the agent's connection. Use **reticle stop**.

When the project SDK and the CLI differ by a major version, most commands are re-run under the matching **@reticlehq/server** version. **init**, **update**, **rollback**, **setup install**, **version** and **help** always run as typed.

The page SDK is Apache-2.0. The server and this CLI are source-available under the Functional Source License (FSL-1.1-ALv2) and convert to Apache-2.0 after two years. DOM, network bodies, console output, state and source stay on the machine unless you link a project with **reticle connect** or set **RETICLE_API_KEY**.

**hunt**, **watch**, **capsules**, **tutorial** and **identify** have been removed. Each prints a replacement and exits 1. **kill**, **login**, **link**, **whoami** and **push** still run for one release and name the command that replaced them.

# SEE ALSO

[playwright](/man/playwright)(1), [node](/man/node)(1), [npm](/man/npm)(1), [npx](/man/npx)(1)

# RESOURCES

```[Source code](https://github.com/reticlehq/reticle)```

```[Homepage](https://www.reticle.sh/)```

```[Documentation](https://docs.reticle.sh/cli)```

<!-- verified: 2026-10-20 -->
