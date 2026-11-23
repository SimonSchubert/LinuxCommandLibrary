# TAGLINE

Track and budget Claude Code token spending from the command line

# TLDR

Create a **task with a budget cap** (and make it the active task)

```tkst -t "[Issue-243]" -b [5]```

**Switch** the active task

```tkst -t "[Add unit tests]"```

Launch **Claude Code with cost tracking** and per-prompt summaries

```tkst claude```

**List all tasks** with budget, spend and remaining balance

```tkst -l```

**Update** a task's budget or rename it

```tkst -u "[Issue-243]" -b [10] -n "[Issue-243-v2]"```

**Delete** a task

```tkst -d "[Issue-243]"```

**Reallocate spend** from one task to another

```tkst -ra "[old-task]" "[new-task]"```

Toggle tracking **on or off**

```tkst --disable```

# SYNOPSIS

**tkst** _command_ [_arguments_]

**tkst** **claude** [_claude-args_]

# DESCRIPTION

**tkst** (Tokenyst) is a small Node.js CLI that tracks token usage, computed dollar cost, and budget consumption per task for **Claude Code** sessions. It installs a Claude Code **Stop hook**; after each turn the hook parses the session transcript under **~/.claude/projects/**, prices the tokens (including prompt-cache multipliers) and allocates the cost to the active task. Running Claude through **tkst claude** additionally prints a per-turn delta and a budget summary when the session ends; plain **claude** is still tracked, just without the summaries.

Tasks are user-defined buckets, typically one per ticket, feature, or experiment, that hold a budget and a list of spend allocations. All state is stored locally under **~/.tokenyst** with no cloud sync.

# PARAMETERS

**claude**, **-c** [_args_]
> Launch Claude Code under tracking. Arguments are forwarded verbatim.

**task**, **-t** _name_ [**-b** _amount_] [**-n** _new-name_]
> Create a task (with an optional USD budget) or switch to it; it becomes the active task.

**list**, **-l**
> List every task with its budget, spend, and remaining balance.

**update**, **-u** _name_ [**-b** _amount_] [**-n** _new-name_] [**-a** _amount_]
> Change the budget cap, rename the task, or manually add an allocation.

**delete**, **-d** _name_ [**--all**] [**--yes**]
> Delete a task and its history, or all tasks.

**allocations**, **-a** [_task_] [**--all**] [**--delete**]
> View allocations for the current task, all tasks, or delete an allocation.

**reallocate**, **-ra** _from_ _to_ [**--yes**]
> Move recorded spend from one task to another (useful after misattributed sessions).

**reset**, **-r** _name_ [**--yes**]
> Wipe spending history for a task.

**--enable**
> Re-enable tracking and reinstall the Stop hook.

**--disable**
> Disable tracking and remove the Stop hook.

# CONFIGURATION

**~/.tokenyst/config.json**
> All tasks, budgets, and spend allocations.

**~/.tokenyst/recorded-turns.json**
> Internal deduplication of already-recorded turns.

**~/.tokenyst/hook.log**
> Debug log of the Stop hook integration.

# CAVEATS

The **tokenyst** npm package was unpublished in May 2026 and the original **jher7/tokenyst** repository is no longer available; the author has since moved to a VS Code extension for GitHub Copilot spend under the same name. Cost figures depend on the bundled price list and are estimates if pricing changes. Tracking relies on the Claude Code transcript format and hook interface, so changes there can break it. Requires Node.js 18+.

# HISTORY

**Tokenyst** was published by **Joshua Herrera** (jher7) in **May 2026** as an npm package providing the **tkst** command, aimed at making per-task Claude Code spend visible before end-of-month billing.

# SEE ALSO

[claude](/man/claude)(1), [npm](/man/npm)(1)
