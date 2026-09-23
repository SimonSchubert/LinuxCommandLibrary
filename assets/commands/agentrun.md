# TAGLINE

Inspect, validate, and run AgentRun workflow files

# TLDR

**Run the scripted triage demo** (no API key)

```agentrun demo```

**Run the demo** that escalates

```agentrun demo --scenario [ambiguous]```

**Write the bundled triage workflow**

```agentrun example [workflow.json]```

**Show structure** without executing code

```agentrun inspect [workflow.json]```

**Validate** a workflow and an input file

```agentrun validate [workflow.json] [input.json] --trusted```

**Dry-run** with synthesized input

```agentrun dry-run [workflow.json] --trusted```

**Run a deterministic workflow**

```agentrun run [workflow.json] [input.json] --trusted```

# SYNOPSIS

**agentrun** _command_ [_args_]

# SUBCOMMANDS

**demo** [**--scenario** _name_] [**--json**]
> Run the bundled triage workflow with scripted judgments. Makes no network calls. The scenario is **billing** (default), **technical**, or **ambiguous**.

**example** [_file.json_]
> Write that triage workflow as JSON. The default path is **workflow.json**. An existing file is left unchanged and the command fails.

**inspect** _workflow.json_ [**--json**]
> Print the workflow structure. Does not execute workflow code and does not require **--trusted**.

**validate** _workflow.json_ [_input.json_] **--trusted**
> Check the workflow. When an input file is given, also check it against the input contract. Exits 1 when the result is not ok.

**dry-run** _workflow.json_ [_input.json_] **--trusted**
> Execute with the given input object, or with input synthesized from the declared input schema. With no input schema, the input starts as **{}**. Exits 1 when the result is not ok.

**run** _workflow.json_ _input.json_ **--trusted**
> Run the workflow with no host adapters. Agent steps, Jev judgments, and tool effects need the JavaScript API. Exits 2 when the status is not **complete**.

# PARAMETERS

**--trusted**
> Required by **validate**, **dry-run**, and **run**. Confirms that JavaScript stored in the workflow may run, including during validation.

**--json**
> On **demo** and **inspect**, print JSON instead of the text report.

**--scenario** _NAME_
> On **demo**, select **billing**, **technical**, or **ambiguous**.

**-h**, **--help**
> Print the command summary. **agentrun help** does the same.

# DESCRIPTION

**agentrun** is the command installed by the npm package **@parcha/agentrun-dsl**. It needs Node.js 22.19 or newer. **npx agentrun** runs the same binary without a global install.

The tool reads AgentRun workflow documents: JSON descriptions of steps that can call tools, code, typed judgments, and agents. **demo** uses scripted judgments. **inspect** only reads structure. **validate**, **dry-run**, and **run** can execute JavaScript from the file, and they refuse to start until **--trusted** is passed.

**run** calls the interpreter with an empty adapter set, so a workflow that needs an agent, a Jev decision, or a host effect cannot be completed from this command. Supply those functions through the package's JavaScript API. A finished run prints JSON. Status **complete** exits 0. Any other status exits 2. Usage errors and thrown failures exit 1.

Slash commands such as **/agentrun** inside the Pi editor come from the separate **@parcha/agentrun-pi** extension. They are not this binary.

# CAVEATS

A different project, Serverless-Devs **agentrun-cli**, also installs a command named **agentrun** (alias **ar**) for Alibaba Cloud AgentRun. That binary reads **~/.agentrun/config.json** and manages sandboxes and hosted agents. Whichever **agentrun** appears first on **PATH** is the one the shell runs. **agentrun --help** from **@parcha/agentrun-dsl** lists **demo**, **example**, **inspect**, **validate**, **dry-run**, and **run**. The cloud CLI lists groups such as **sandbox** and **super-agent**.

**--trusted** records that workflow JavaScript may run in this process. It does not isolate that code. Run untrusted workflows only inside a sandbox you control.

**example** creates the target with an exclusive write. If the file already exists, it is not replaced.

The package is published as a beta, and the command set can change between releases.

# HISTORY

AgentRun is published by Parcha Labs under the Apache-2.0 license. The **agentrun** binary ships with **@parcha/agentrun-dsl**.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [npx](/man/npx)(1)

# RESOURCES

```[Source code](https://github.com/Parcha-ai/agentrun)```

```[Homepage](https://agentrun.ai)```

```[Documentation](https://agentrun.ai/docs/guide)```

<!-- verified: 2026-09-23 -->
