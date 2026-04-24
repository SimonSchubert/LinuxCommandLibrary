# TAGLINE

Manage AgentBox cloud sandboxes and templates from the terminal

# TLDR

**Install** the CLI globally via npm

```npm install -g agentbox-cli```

**Authenticate** with AgentBox cloud

```agentbox auth login```

**List** active and paused sandboxes

```agentbox sandbox list```

**List running sandboxes** with a result limit

```agentbox sandbox list --state running --limit [25]```

**Filter sandboxes** by metadata key/value pairs

```agentbox sandbox list --metadata [env=prod,team=ml]```

**Terminate a specific sandbox** by ID

```agentbox sandbox kill [sandbox_id]```

**Terminate every running sandbox**

```agentbox sandbox kill --all```

**Scaffold and build** a custom sandbox template

```agentbox template create [my-template]; agentbox template build```

# SYNOPSIS

**agentbox** _command_ [_subcommand_] [_flags_]

# PARAMETERS

**auth login**
> Authenticate the CLI against AgentBox cloud and persist credentials locally.

**auth logout**
> Remove stored credentials from the local machine.

**sandbox list**
> List sandboxes visible to the authenticated account.

**sandbox kill** _id_
> Terminate the sandbox with the given _id_. Data inside the sandbox is discarded.

**sandbox kill --all**
> Terminate every sandbox the account currently has running.

**template create** _name_
> Scaffold a new custom sandbox template in the current directory.

**template build**
> Build the template defined in the current directory into a deployable image.

**--state** _states_
> Filter **sandbox list** to comma-separated states (**running**, **paused**).

**--metadata** _key=value,..._
> Filter **sandbox list** by metadata key/value pairs.

**--limit** _N_
> Limit **sandbox list** results to _N_ entries (default **10**).

# DESCRIPTION

**agentbox** is the command-line client for **AgentBox.cloud**, a managed service that runs AI agents inside isolated x86 and Android cloud sandboxes. The CLI mirrors the capabilities of the AgentBox web dashboard: it authenticates the developer, lists and terminates running sandboxes, and manages the custom template images that define how sandboxes are provisioned.

The CLI is typically used alongside the AgentBox **Python** and **JavaScript** SDKs. SDKs spawn sandboxes programmatically from application code; the CLI is the administrative companion for auditing, clean-up, and authoring reusable sandbox templates without leaving the terminal.

**agentbox template create** produces a directory containing a template manifest and a Dockerfile-like recipe. **agentbox template build** packages that directory into an image that subsequent SDK calls can reference by name, giving agent code a consistent, reproducible starting environment.

# CAVEATS

Requires a **Node.js** runtime (installed via **npm install -g agentbox-cli**) and an active **AgentBox.cloud** account; it is not distributed through **apt**, **brew**, or **pacman**. **agentbox sandbox kill** is destructive — any data inside the sandbox is permanently lost. The name **agentbox** collides with unrelated local-only Docker projects on GitHub (e.g. **rcarmo/agentbox**, **fletchgqc/agentbox**) that are not the same tool.

# HISTORY

AgentBox emerged in the **2024–2025** wave of AI-agent sandbox services alongside projects such as **E2B**, **Modal**, and **Daytona**, built on lightweight virtualization to let AI-generated code execute safely away from the user's machine. The CLI is distributed on **npm** as **agentbox-cli** with documentation at **agentbox.cloud**.

# SEE ALSO

[docker](/man/docker)(1), [e2b](/man/e2b)(1), [modal](/man/modal)(1), [npm](/man/npm)(1)
