# TAGLINE

Command line for PhreshOS programs and the local System

# TLDR

**Install the CLI** from npm (Node.js 20.10 or newer)

```npm install --global @phreshos/cli```

**Install the System** as a user service and print the Desktop address

```phresh system install```

**Create** a Program project with a chosen package manager

```phresh create [my-program] --package-manager [bun]```

**Initialize** an existing project that already has a server and a client

```phresh init --server --client```

**Run** the development Program attached to this terminal

```phresh dev```

**Install** this project's Program into the running System

```phresh install```

**Install** an official Program and launch one Process

```phresh install [terminal] --run```

**List** Programs on the running System

```phresh program list --installed-only```

**Read** a Program's agent documentation

```phresh program agent --program [terminal]```

**Show** the running System at a glance

```phresh fetch```

**Ask** a Server service

```phresh service ask --program [tilo] --process [board] --endpoint server --event [board.list] --json```

**Print** the full command contract as JSON

```phresh describe --all --json```

# SYNOPSIS

**phresh** [**-v** | **--version**] _command_ [_subcommand_] [_options_]

# DESCRIPTION

**phresh** is the command-line interface for **PhreshOS**, a local system that runs programs built with web technology and serves a Desktop in the browser. The owner uses those Programs from the Desktop. This command reaches the same System at the same time, with the owner's authority.

The binary comes from the npm package **@phreshos/cli** (`phresh` maps to `dist/cli.js`). It owns command parsing, terminal output, release download, and native service management. Runtime calls go through **@phreshos/node**. The CLI does not invent a second System protocol: **phresh execute** sends one JSON Execute request and prints the JSON result.

With no arguments, **phresh** prints help. **phresh** _command_ **--help** describes one command. **phresh describe** prints the machine-readable contract without contacting the System. **phresh skill** prints a short briefing meant for an agent before its first command.

Project commands work on a Program directory: **create**, **init**, **pack**, **install**, **uninstall**, **dev**, and **start**. **system** installs and manages the local System service, and also queries a System that is already running. The other groups (**program**, **process**, **endpoint**, **service**, **window**, **connection**, **session**, **operation**, **fetch**) require a running System.

Human-readable output is the default for runtime commands. **--json** writes the whole result as one JSON value.

# PARAMETERS

**-v**, **--version**
> Print the CLI version.

**--json**
> On runtime commands, write the result as one JSON value on stdout.

**create** [_directory_]
> Create a Program project from the starter bundled with the CLI. Optional **--name** _name_, **--package-manager** `bun`|`npm`|`pnpm`|`yarn`, and **--no-install** (write files without installing dependencies). Omitted values are prompted in a terminal.

**init**
> Write **phresh.config.ts** for the project in the current directory, reading identity, version, and description from **package.json**. Declare endpoints with **--server** and **--client**, plus location, command, and dev-command options. **--force** replaces an existing config file.

**pack**
> Run the project's optional build command, then package the production files declared for each endpoint.

**install** [_name_]
> With no name, build and install the Program in the current project. A name installs that official Program's verified release. **--run** launches one default Process afterward. **--purge** deletes existing storage for that Program. Requires a running System.

**uninstall** [_name_]
> Remove an installed Program. With no name, uses the Program declared by this project. **--purge** also removes Processes, data, and runtime state. Requires a running System.

**dev** [_run-options..._]
> Run the development Program attached to this terminal. Ending the command stops the Program. The Client URL must respond within 15 seconds. Program options are only **--run-option-**_name_**=**_value_.

**start** [_run-options..._]
> Same attached lifecycle as **dev**, using the production declarations. An optional build command runs first. The Program's exit status becomes this command's status.

**system install**
> Download the official stable System release, register the user service, start it, and print the Desktop address. **--purge** deletes **PHRESHOS_HOME** before the new System starts. The first install also provisions the welcome Program **sprout**.

**system uninstall**
> Stop and remove the System service and installation. **--purge** also deletes **PHRESHOS_HOME**. Without it, persistent data is kept.

**system status**
> Show version, Desktop address, service state, and whether automatic startup is enabled.

**system version**
> Print the installed System version.

**system start**, **system stop**, **system enable**, **system disable**
> Start or stop the background service, or turn automatic startup on or off.

**system about**
> Name, version, and release of the running System. **--json** is available.

**system open --type** _media-type_ **--uri** _uri_
> Ask the System to open a resource, for example an image file URI.

**system logs --statement** _sql_
> Run a read-only SQL statement against System logs. **--values** is a JSON array of bound parameters.

**fetch**
> Print a summary of the running System: version, Desktop address, Program and Process counts, connections, and appearance. **--json** prints the same data as one JSON value.

**program** _subcommand_
> Discover Programs. **list** (optional **--installed-only**, **--search**, **--limit**, **--offset**), **inspect --program** _identity_, **agent --program** _identity_ (agent documentation), **definition**, startup commands (**get-startup**, **set-startup**, **remove-startup**), pin commands (**pinned**, **pin**, **unpin**), permission commands (**get-permission**, **list-permissions**, **allows-permission**, **allow-permission**, **deny-permission**), **logs**, and **wait**.

**process** _subcommand_
> Live Program executions. **list**, **inspect**, **create**, **find-or-create** (also **findOrCreate**), **exit**, and **wait**. **--process** is the Process identity or Program-local name. **--program** selects the owning Program when a name is used.

**endpoint** _subcommand_
> One Process endpoint. **inspect**, **start**, **stop**, **wait-ready**, **wait-lifecycle**, **ask**, **publish**, and **wait**. **--endpoint** is `server` or `client`. **endpoint memory** reads and changes a running Client's memory (**get**, **set**, **delete**, **entries**).

**service** _subcommand_
> Named endpoint services. **list**, **inspect**, **wait-ready**, **ask**, **publish**, **wait**, **wait-lifecycle**, and **wait-discovery**. **ask** requires **--program**, **--process**, **--endpoint server**, and **--event**. Optional **--payload** is JSON.

**window** _subcommand_
> The Client window of one Process. **inspect**, **move**, **resize**, **set-geometry**, **minimize**, **maximize**, **set-title**, **set-header**, **raise**, and **wait**. Positions and sizes accept pixels or workspace-relative expressions such as `50%`.

**execute** _request_
> Send one Execute request encoded as JSON. Discover operations with **operation list** and **operation describe**.

**describe** [_path..._]
> Print the CLI contract. **--all** includes every command under the path. **--json** emits the contract as data. Does not contact the System.

**skill**
> Print what PhreshOS is and which commands to run first. Does not contact the System.

CamelCase command names also accept a kebab-case alias when one is registered, including **find-or-create**, **wait-ready**, **wait-lifecycle**, **wait-discovery**, **sign-in**, **sign-out**, **get-startup**, **set-startup**, **remove-startup**, **set-geometry**, **set-title**, and **set-header**.

# CONFIGURATION

**PHRESHOS_HOME**
> Absolute directory for the System's persistent state. The default is **~/.phreshos**. The service log is **service.log** in that directory. The Desktop URL is the contents of the **desktop** file there when it matches `http://localhost:` plus a port. Otherwise the CLI reports `http://localhost:4300`.

**PHRESHOS_PORT**
> Port request passed to the service the next time it starts.

**XDG_DATA_HOME**
> On Linux the installation root is **$XDG_DATA_HOME/phreshos/system**, or **~/.local/share/phreshos/system** when the variable is unset. A set value must be an absolute path.

**phresh.config.ts**
> Program project file written by **phresh init**. **--force** replaces an existing file.

On Linux, **phresh system install** uses a systemd user unit when `systemctl --user show-environment` succeeds. The unit file is **~/.config/systemd/user/phreshos.service** (`phreshos.service`, managed with **systemctl --user**). If that check fails, the CLI runs a background process instead.

# CAVEATS

The npm package declares **Node.js >= 20.10**. The System repository's install instructions ask for **Node.js 24.15** or newer before **phresh system install**.

Commands that talk to a running System fail until **phresh system install** has completed and the service is up. **phresh** is not a reduced agent account: it acts as the owner.

**dev** and **start** stay in the foreground. Stopping the command stops the Program. **dev** and **start** reject ordinary flags other than **--run-option-**_name_**=**_value_.

**system install** downloads a release and changes the user service. **--purge** on **system install** or **system uninstall** deletes **PHRESHOS_HOME**.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1), [bun](/man/bun)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/PhreshOS/cli)```

```[Homepage](https://phreshos.com)```

```[Documentation](https://phreshos.com/docs/sdks/cli)```

<!-- verified: 2026-10-02 -->
