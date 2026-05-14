# TAGLINE

Track and budget Claude Code token spending from the command line

# TLDR

Create a **task with a budget cap**

```tkst -t "[Issue-243]" -b [5]```

Launch **Claude Code with cost tracking** enabled

```tkst claude```

**List all tasks** and their current spending

```tkst -l```

**Update** a task's budget or name

```tkst -u "[Issue-243]" -b [10]```

**Delete** a task

```tkst -d "[Issue-243]"```

**Reallocate spend** from one task to another

```tkst -ra "[old-task]" "[new-task]"```

Toggle tracking **on or off**

```tkst --enable``` or ```tkst --disable```

# SYNOPSIS

**tkst** [_options_] [**claude** [_claude-args_]]

# DESCRIPTION

**tkst** (Tokenyst) is a small CLI that wraps the **claude** command and keeps a running ledger of token usage, computed dollar cost, and budget consumption per task. After each prompt during a session it prints a per-turn delta and the cumulative spend against the active budget, so you can stop before exceeding a cap. Tasks are user-defined buckets — typically one per ticket, feature, or experiment — that hold a budget, a list of recorded sessions, and an aggregated total.

All state is stored locally under **~/.tokenyst** with no cloud sync. Pricing for the supported Claude model variants is bundled with the binary and applied to the token counts reported by the **claude** CLI.

# PARAMETERS

**claude** [_args_]
> Launch the Claude CLI under tracking. Arguments after **claude** are forwarded verbatim.

**-t** _name_, **--task** _name_
> Create a new task with the given name.

**-b** _amount_, **--budget** _amount_
> Set the budget cap (USD) for the task, used with **-t** or **-u**.

**-l**, **--list**
> List every task with its budget, total spend, and recent sessions.

**-u** _name_, **--update** _name_
> Update an existing task; combine with **-b** to change the budget or **--rename** to change the name.

**-d** _name_, **--delete** _name_
> Delete the named task.

**-a**, **--allocations**
> Show per-session and per-task spend allocations.

**-ra** _from_ _to_, **--reallocate** _from_ _to_
> Move recorded spend from one task to another (useful after misattributed sessions).

**--enable**
> Re-enable tracking after it was disabled.

**--disable**
> Suspend tracking; the **claude** wrapper still passes calls through.

# CONFIGURATION

**~/.tokenyst/**
> Local data directory holding the tasks, session logs, and computed totals.

**~/.tokenyst/config.json**
> User-tunable settings such as default model pricing and currency.

# CAVEATS

Cost figures depend on the **bundled price list**; if Anthropic changes pricing the values are estimates until the binary is updated. Token counts are read from the **claude** CLI output, so changes to that interface can disrupt tracking. State lives locally and is **not synchronised** between machines — pair with version control or a synced home directory if you want shared budgets.

# HISTORY

**Tokenyst** was published by **jher7** in **2026** in response to the proliferation of multi-agent Claude Code workflows, where per-prompt spend was previously invisible until end-of-month billing. It is distributed as an **npm**/**pnpm** package installed globally and invoked as **tkst**.

# SEE ALSO

[claude](/man/claude)(1), [jq](/man/jq)(1), [npm](/man/npm)(1)
